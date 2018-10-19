/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.dao;

import java.util.List;

/**
 *
 * @author salah
 */
public interface IDao <S> {
    
    Boolean create(S o);
    Boolean delete(S o);
    Boolean update(S o);
    List<S> findAll();
    S findById(int id);
}
