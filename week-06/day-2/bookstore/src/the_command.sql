select book_name, aut_name, cate_descrip,  pub_name, book_price
from book_mast join author join category join publisher
on book_mast.aut_id = author.aut_id AND book_mast.cate_id = category.cate_id AND
book_mast.pub_id = publisher.pub_id order by book_name asc;