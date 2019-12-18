DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `busqueda`(st_keyword varchar(200))
BEGIN
select distinct idblogentry, title, extract, description, filename,createdat  from (
   SELECT distinct b.*,1 as pos from Blogentry b INNER JOIN BLOGENTRYKEYWORD bk ON b.idblogentry=bk.idblogentry inner join keyword k on k.idkeyword=bk.idkeyword 
      where title like concat('%',st_keyword,'%')
 
      union
      
        SELECT distinct b.*,2 as pos from Blogentry b INNER JOIN BLOGENTRYKEYWORD bk ON b.idblogentry=bk.idblogentry inner join keyword k on k.idkeyword=bk.idkeyword 
      where keyword like concat('%',st_keyword,'%')

	union
    
           SELECT distinct b.*,3 as pos from Blogentry b INNER JOIN BLOGENTRYKEYWORD bk ON b.idblogentry=bk.idblogentry inner join keyword k on k.idkeyword=bk.idkeyword 
      where extract like concat('%',st_keyword,'%')
      
      union
      
       SELECT distinct b.*,4 as pos from Blogentry b INNER JOIN BLOGENTRYKEYWORD bk ON b.idblogentry=bk.idblogentry inner join keyword k on k.idkeyword=bk.idkeyword 
      where description like concat('%',st_keyword,'%')
      
      ) t order by pos, createdat desc
      ;               
    
   END$$
DELIMITER ;
