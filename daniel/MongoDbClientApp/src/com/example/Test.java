package com.example;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;


public class Test {
	
	   public static void main(String[] args) {
		   MongoClient mongo = MongoClients.create("mongodb://localhost:27017");
		 
//		MongoCredential credential; 
//		
//	      credential = MongoCredential.createCredential("nitin", "nitindb", 
//	         "password".toCharArray()); 
		   MongoDatabase database = mongo.getDatabase("hr-db");
		   MongoCollection<Document> collection = database.getCollection("employee");
		
		FindIterable<Document> iterDoc = collection.find();
		
		MongoCursor<Document> it = iterDoc.iterator();
		// System.out.println("hello");
//		Document d = new Document();
//		d.append("_id", 3);
//		d.append("name", "David");
//		d.append("salary", 11111.11);
//		collection.insertOne(d);
		
		while (it.hasNext()) {
			Document d = it.next();
			//System.out.println(d.toJson());
			String name=d.getString("name");
			int did = d.getInteger("deptId").intValue();
		    int salary = d.getInteger("salary").intValue();
		    System.out.println(did + ":" + name + ":" + salary);
				
		
		}
	}

}
