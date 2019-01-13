/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.*;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author lucas
 */
public class PessoaDAO {
    private Connection connection;
    Long id;
    String nome;
    String email;
    String tel;
    String cel;
    String cpf;
    String logradouro;
    String numero;
    String bairro;
    String cidade;
    String estado;
    String cep;    
    
    
    
    public PessoaDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Pessoa usuario, Endereco endereco){
        String sql = "INSERT INTO cadastro(nome, email, tel, cel, cpf, logradouro, numero, bairro, cidade, estado, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTel());
            stmt.setString(4, usuario.getCel());
            stmt.setString(5, usuario.getCpf());
            stmt.setString(6, endereco.getLogradouro());
            stmt.setString(7, endereco.getNumero());
            stmt.setString(8, endereco.getBairro());
            stmt.setString(9, endereco.getCidade());
            stmt.setString(10, endereco.getEstado());
            stmt.setString(11, endereco.getCep());
            
            
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u){
            throw new RuntimeException(u);
        
        }
    }
        
      public void alterar(Pessoa usuario, Endereco endereco){
      String sql = "UPDATE cadastro SET nome = ?, email = ?, tel = ?, cel = ?, cpf = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? WHERE cpf='" +usuario.getCpf()+"'";
      try{
          PreparedStatement stmt = connection.prepareStatement(sql);
          stmt.setString(1, usuario.getNome());
          stmt.setString(2, usuario.getEmail());
          stmt.setString(3, usuario.getTel());
          stmt.setString(4, usuario.getCel());
          stmt.setString(5, usuario.getCpf());
          stmt.setString(6, endereco.getLogradouro());
          stmt.setString(7, endereco.getNumero());
          stmt.setString(8, endereco.getBairro());
          stmt.setString(9, endereco.getCidade());
          stmt.setString(10, endereco.getEstado());
          stmt.setString(11, endereco.getCep());          

       
          stmt.execute();
          stmt.close();
        }
          catch (SQLException u){
            throw new RuntimeException(u);   
                  
          }
      }
      
        public void excluir(String usuario){
    
        
        String sql = "DELETE FROM cadastro WHERE nome = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.execute();
            stmt.close();   
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        }
        
        
        
        }   
    
       
    
    

