package com.emergentes.dao;

import com.emergentes.modelo.Productos;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAOimpl extends ConexionDB implements ProductosDAO {

    @Override
    public void insert(Productos producto) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into productos (descripcion,stock) values(?,?)");
            ps.setString(1, producto.getDescripcion());
            ps.setInt(2, producto.getStock());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Productos producto) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE productos set descripcion =?, stock =? where id=?");
            ps.setString(1, producto.getDescripcion());
            ps.setInt(2, producto.getStock());
            ps.setInt(3, producto.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void delete(int id) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM productos where id=?");
            ps.setInt(1, id);
            System.out.println("Registro eliminado");
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Productos getById(int id) throws Exception {
        Productos pro = new Productos();
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM productos WHERE id=? limit 1");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setStock(rs.getInt("stock"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return pro;
    }

    @Override
    public List<Productos> getAll() throws Exception {
       List<Productos> lista=null;
       try{
           this.conectar();
           PreparedStatement ps=this.conn.prepareStatement("SELECT * FROM productos");
           ResultSet rs= ps.executeQuery();
           lista=new ArrayList<Productos>();
           while(rs.next()){
               Productos pro=new Productos();
               pro.setId(rs.getInt("id"));
               pro.setDescripcion(rs.getString("descripcion"));
               pro.setStock(rs.getInt("stock"));
               lista.add(pro);
           }
           rs.close();
           ps.close();
       }catch(Exception e){
           throw e;
       }finally{
           this.desconectar();
       }
       return lista;
        
    }

}
