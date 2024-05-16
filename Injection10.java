String jql = "from Employee where name = '" + name + "'";
TypedQuery<Employee> q = em.createQuery(jql, Employee.class);
return q.getResultList();
