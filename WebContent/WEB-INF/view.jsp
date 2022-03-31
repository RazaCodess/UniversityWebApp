<html>
<body>
<h1>First spring project</h1>
<h2>${message}</h2>



<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Username</th>
      <th scope="col">Skills</th>
      <th scope="col">DOB</th>
      <th scope="col">Contact Number</th>
      <th scope="col">Attribute 1</th>
      <th scope="col">Attribute 2</th>
      <th scope="col">Attribute 3</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>${form.first_name}</td>
      <td>${form.last_name}</td>
      <td>${form.username}</td>
      <td>${form.skills}</td>
      <td>${form.DOB}</td>
      <td>${form.contact}</td>
      <td>${form.attributes.attr1}</td>
      <td>${form.attributes.attr2}</td>
      <td>${form.attributes.attr3}</td>
    </tr>
    
  </tbody>
</table>



</body>
</html>