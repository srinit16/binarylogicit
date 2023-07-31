package org.va.pojos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="emp") @Scope("prototype")
public class Employee {
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
}
