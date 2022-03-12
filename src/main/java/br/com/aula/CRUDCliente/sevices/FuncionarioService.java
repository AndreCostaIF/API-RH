package br.com.aula.CRUDCliente.sevices;


import br.com.aula.CRUDCliente.model.Funcionario;
import br.com.aula.CRUDCliente.model.Usuario;
import br.com.aula.CRUDCliente.repository.FuncionarioRepository;
import br.com.aula.CRUDCliente.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    UsuarioRepository usuarioRepository;


    //LIST ALL CLIENTS
    public List<Funcionario> findAll(){

        return funcionarioRepository.findAll();
    }

    //RETURN BY ID
    public Funcionario findById(Long id){
        if(funcionarioRepository.findById(id).isPresent()){
            Funcionario funcionario = funcionarioRepository.findById(id).get();
            funcionario.valorDevido();
            funcionario.calcularInss();
            funcionario.calcularDecimoTerceiro();
            update(funcionario);
            return funcionario;
        }else{
            return null;
        }

    }

    //UPDATE CLIENT
    public Funcionario update(Funcionario cliente){
        Usuario user = usuarioRepository.save(cliente.getUsuario());
        cliente.setUsuario(user);

        return funcionarioRepository.save(cliente);
    }

    //DELETE CLIENT
    public void  delete(Long id){

      funcionarioRepository.deleteById(id);
        usuarioRepository.deleteById(id);
    }

    //SAVE CLIENTS
    public Funcionario save(Funcionario cliente){

        Usuario user = usuarioRepository.save(cliente.getUsuario());
        cliente.setUsuario(user);

        return funcionarioRepository.save(cliente);
    }

//    public Funcionario login(Usuario user){
//
//        return funcionarioRepository.login(user.getUsername(),user.getPassword());
//    }

    public Funcionario login(String user, String pass){

        Usuario usuario = usuarioRepository.Login(user, pass);

        return funcionarioRepository.login(usuario.getId());
    }

    public  List<Funcionario> searchByName(String name){

        return funcionarioRepository.searchByName(name);
    }
}
