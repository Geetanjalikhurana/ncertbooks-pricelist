fetch("/api/books")
  .then(res => res.json())
  .then(data => {
    const container = document.getElementById("books");
    container.innerHTML = "";

    data.forEach(book => {
      container.innerHTML += `
        <div class="card">
          <img src="/images/${book.image}" alt="${book.subject}">
          <h3>${book.subject}</h3>
          <p>Class: ${book.bookClass}</p>
          <p>Price: ₹${book.price}</p>
        </div>
      `;
    });
  })
  .catch(err => console.error(err));
