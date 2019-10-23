package tn.esprit;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import tn.esprit.Entity.Role;

@ManagedBean
@ApplicationScoped
public class Data {

		public Role[] getRoles() {
			return Role.values();
		}
}
