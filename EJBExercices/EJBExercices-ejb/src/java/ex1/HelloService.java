/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author mpastore
 */
@Remote
public interface HelloService {
    public String sayHello(String name);
}
