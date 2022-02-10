package com.workouts.corejava;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciRecursion {

	static int fib(int n) {
		if(n == 0 || n == 1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(new InputStreamReader(System.in));
		System.out.println("Please enter the limit value for printing Fibonacci number :");
		int n = scan.nextInt();
		System.out.println(fib(n));
	}

	/*  ENTITY & TABLE DIFFERENCE
	 *  Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
	 *	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
	 *  SessionFactory sf = con.buildSessionFactory(reg);
	 * 
	 *  Session session = sf.openSession();
	 *  
	 *  Transaction tx = session.beginTransaction();
	 *  sf.save(objects);
	 *  tx.commit();
	 *  
	 *  ---------------------
	 *  Second level cache
	 *  net.sf.ehCache
	 *  hibernate-ehCache
	 *  <property name="hibernate.cache.use_second_level_cache">true</property>
	 *  which provider you are working with
	 *  before hibernate 3 or 4, we use hibernate.cache.provider_class, after hibernate 4
	 *  <property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>
	 *  class level
	 *  @Cacheable
	 *  @Cache(usage=CacheConcurrencyStrategy     (NONE, NONSTRICT_READ_WRITE, READ_ONLY, READ_WRITE, TRANSACTIONAL)
	 *   
	 *  ---------------------
	 */
	
}
