-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto_blog
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `ix_auth_username` (`username`,`authority`),
  CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorities`
--

LOCK TABLES `authorities` WRITE;
/*!40000 ALTER TABLE `authorities` DISABLE KEYS */;
INSERT INTO `authorities` VALUES ('edu','ROLE_USER'),('ethel','ROLE_ADMIN');
/*!40000 ALTER TABLE `authorities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blogentry`
--

DROP TABLE IF EXISTS `blogentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blogentry` (
  `idblogentry` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `extract` varchar(500) DEFAULT NULL,
  `description` varchar(5000) DEFAULT NULL,
  `filename` varchar(200) DEFAULT NULL,
  `createdat` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idblogentry`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blogentry`
--

LOCK TABLES `blogentry` WRITE;
/*!40000 ALTER TABLE `blogentry` DISABLE KEYS */;
INSERT INTO `blogentry` VALUES (1,'NIEVE','<p class=\"description\">Es mediodía. Un parque. <br>Invierno. Blancas sendas; <br>simétricos montículos <br>y ramas esqueléticas. <br>Bajo el invernadero, <br>naranjos en maceta, <br>y en su tonel, pintado <br>de verde, la palmera. <br>Un viejecillo dice, <br>para su capa vieja: <br>«¡El sol, esta hermosura <br>de sol!...» Los niños juegan. <br>El agua de la fuente <br>resbala, corre y sueña <br>lamiendo, casi muda, <br>la verdinosa piedra.</p>','<p class=\"description\">Es mediodía. Un parque. <br>Invierno. Blancas sendas; <br>simétricos montículos <br>y ramas esqueléticas. <br>Bajo el invernadero, <br>naranjos en maceta, <br>y en su tonel, pintado <br>de verde, la palmera. <br>Un viejecillo dice, <br>para su capa vieja: <br>«¡El sol, esta hermosura <br>de sol!...» Los niños juegan. <br>El agua de la fuente <br>resbala, corre y sueña <br>lamiendo, casi muda, <br>la verdinosa piedra.</p>\r ','img1.jpg','2019-12-02 09:22:11'),(2,'TUS OJOS','<p class=\"description\">Tu poesía<br>unen las manos<br>como las madonas<br>de Leonardo.<br><br>Los bosques de ocaso,<br>las frondas moradas<br>de un Renacimiento sombrío...<br><br>El rebaño del mar<br>bala a la gruta<br>del cielo, llena de ángeles.<br><br>Dios se encarna<br>en un niño que busca los juguetes<br>de tus manos.<br><br>Tus labios<br>dan el calor que niegan<br>la vaca y el asno.<br><br>Y en la penumbra,<br>tu cabellera mulle sus pajaspara Dios Niño.<br><div></div></p>','Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera, ya sea porque se le agregó humor, o palabras aleatorias que no parecen ni un poco creíbles. Si vas a utilizar un pasaje de Lorem Ipsum, necesitás estar seguro de que no hay nada avergonzante escondido en el medio del texto. Todos los generadores de Lorem Ipsum que se encuentran en Internet tienden a repetir trozos predefinidos cuando sea necesario, haciendo a este el único generador verdadero (válido) en la Internet. Usa un diccionario de mas de 200 palabras provenientes del latín, combinadas con estructuras muy útiles de sentencias, para generar texto de Lorem Ipsum que parezca razonable. Este Lorem Ipsum generado siempre estará libre de repeticiones, humor agregado o palabras no características del lenguaje, etc.','img2.jpg','2019-12-02 09:22:11'),(3,'DIVINA COMEDIA','<p class=\"description\">La gloria de quien mueve todo el mundo <br>el universo llena, y resplandece <br>en unas partes más y en otras menos. <br><br>En el cielo que más su luz recibe<br>estuve, y vi unas cosas que no puede <br>ni sabe repetir quien de allí baja; <br></p>','<p class=\"description\">La gloria de quien mueve todo el mundo <br>el universo llena, y resplandece <br>en unas partes más y en otras menos. <br><br>En el cielo que más su luz recibe<br>estuve, y vi unas cosas que no puede <br>ni sabe repetir quien de allí baja; <br></p>','img3.jpg','2019-12-02 09:22:11'),(4,'OLTRE LA SPERA','<p class=\"description\">Allende el orbe de rodar más lento<br>llega el suspiro que mi pecho exhala:<br>nuevo intelecto con que Amor escala<br>célica altura en alas del lamento.<br><br>Cuando alcanza la cima de su intento<br>ve la Mujer que otra ninguna iguala<br>por su esplendor: a quien todo señala<br>de Amor para el más alto rendimiento.<br><br>Viéndola así, con voz sutil, ardiente,<br>Amor le habla al corazón doliente<br>que lo interroga y no comprende nada.</p>','<p class=\"description\">Allende el orbe de rodar más lento<br>llega el suspiro que mi pecho exhala:<br>nuevo intelecto con que Amor escala<br>célica altura en alas del lamento.<br><br>Cuando alcanza la cima de su intento<br>ve la Mujer que otra ninguna iguala<br>por su esplendor: a quien todo señala<br>de Amor para el más alto rendimiento.<br><br>Viéndola así, con voz sutil, ardiente,<br>Amor le habla al corazón doliente<br>que lo interroga y no comprende nada.<br><br>Soy yo quien me hablo a mí y ante la bella<br>membranza de Beatriz, todo destella<br>y lo entiende mi mente iluminada.</p>','img4.jpg','2019-12-01 09:22:11'),(5,'VEDE PERFETTAMENTE...','<p class=\"description\">Bien sabe a cuál saluda y reverencia<br>el que vea entre damas a la mía;<br>todas ellas hacerle compañía<br>tienen de Dios como gentil clemencia.<br><br>De su beldad es tánta la excelencia<br>que envidias no despierta ni falsía:<br>bien antes, galanura y ufanía<br></p>','<p class=\"description\">Bien sabe a cuál saluda y reverencia<br>el que vea entre damas a la mía;<br>todas ellas hacerle compañía<br>tienen de Dios como gentil clemencia.<br><br>De su beldad es tánta la excelencia<br>que envidias no despierta ni falsía:<br>bien antes, galanura y ufanía<br>-dones de Amor- afinca su presencia.<br><br>De su redor dimana mansedumbre<br>y así vestidas de su misma lumbre,<br>cada una, sintiéndolo, se honora.<br><br>Fue siempre todo en Ella tan luciente,<br>que nadie, suspirando dulcemente,<br>podrá olvidar su gracia arrobadora.</p>','img5.jpg','2019-12-02 09:22:11'),(6,'PARÁBOLA','<p class=\"description\">Todo es como una abeja<br>sobre el florecer<br>de la eternidad, que comienza<br>y acaba en cada aparecer.<br><br>Todo es como una abeja<br>sobre el liquen o sobre el laurel:<br>aquí acude al néctar:<br>allí huye de él.<br><br>¡Alabemos a toda esencia<br>en Dios, florido y cruel!<br>¡Labre la muerte su cera!<br>¡Labre la vida su miel!</p>','<p class=\"description\">Todo es como una abeja<br>sobre el florecer<br>de la eternidad, que comienza<br>y acaba en cada aparecer.<br><br>Todo es como una abeja<br>sobre el liquen o sobre el laurel:<br>aquí acude al néctar:<br>allí huye de él.<br><br>¡Alabemos a toda esencia<br>en Dios, florido y cruel!<br>¡Labre la muerte su cera!<br>¡Labre la vida su miel!</p>','img6.jpg','2019-12-02 09:22:11'),(7,'ANTRO','<p class=\"description\">¿Cómo, Cosa, así... vacía,<br>A cima de espina y pena,<br>Como ninguna... serena:<br>Deshumana todavía?<br>¿Dónde el dios y su agonía...<br>Dónde la tumba y la esposa!...<br>Dónde la lengua gloriosa!...<br>Dónde el azar que a ti se eche!...<br>Dónde la sangre y la leche!...<br>Dónde, Capullo de Rosa?...</p>','<p class=\"description\">¿Cómo, Cosa, así... vacía,<br>A cima de espina y pena,<br>Como ninguna... serena:<br>Deshumana todavía?<br>¿Dónde el dios y su agonía...<br>Dónde la tumba y la esposa!...<br>Dónde la lengua gloriosa!...<br>Dónde el azar que a ti se eche!...<br>Dónde la sangre y la leche!...<br>Dónde, Capullo de Rosa?...</p>','img7.jpg',NULL),(8,'POESÍA, MANO VACÍA','<p class=\"description\">mano vacía...<br> mano empuñada</p>','<p class=\"description\">Poesía, mano vacía...<br>Poesía, mano empuñada<br>Por furor para con su nada<br>Ante atroz tesoro del día...<br><br>Poesía, la casa umbría<br>La defuera de mi pisada...<br>Poesía la aún no hallada<br>Casa que asaz busco en la mía...<br><br>Poesía se está defuera:<br>Poesía es una quimera...<br>¡A la vez a la voz y al dios!...<br><br>Poesía, no dice nada:<br>Poesía se está, callada,<br>escuchando su propia voz.</p>','img8.jpg','2019-12-02 09:22:11'),(9,'LA MANO DESASIDA','<p class=\"description\">Créeme tú, Machu Picchu,<br>Haz que yo crea, horrorosa flora.<br>Nada es real sino lo que supones<br>Por debajo delo que tocas.<br>Nada es real sino tu ceño<br>Y una roca<br>Y alguna mano humana que va haciendo<br>La vista, la cosa, la forma...<br>Y la divinidad de lo inmediato,<br>Y el instante del sentido, y el abismo en sombra.</p>','<p class=\"description\">Créeme tú, Machu Picchu,<br>Haz que yo crea, horrorosa flora.<br>Nada es real sino lo que supones<br>Por debajo delo que tocas.<br>Nada es real sino tu ceño<br>Y una roca<br>Y alguna mano humana que va haciendo<br>La vista, la cosa, la forma...<br>Y la divinidad de lo inmediato,<br>Y el instante del sentido, y el abismo en sombra.</p>','img9.jpg','2019-12-02 09:22:11'),(10,'AGUIJÓN','<p class=\"description\">Ella no sigue por él,<br>Sino a sí misma, virtual...<br>A la agonía infernal,<br>En la rosa de papel.<br>Y mana, amarga, la miel<br>El duro dardo de ardor;<br>Cursa entrañable labor,<br>Por restreñar el herir,<br>Y jamás para a morir<br>La abeja del sinsabor.</p>','<p class=\"description\">Ella no sigue por él,<br>Sino a sí misma, virtual...<br>A la agonía infernal,<br>En la rosa de papel.<br>Y mana, amarga, la miel<br>El duro dardo de ardor;<br>Cursa entrañable labor,<br>Por restreñar el herir,<br>Y jamás para a morir<br>La abeja del sinsabor.</p>','img10.jpg','2019-12-02 09:22:11');
/*!40000 ALTER TABLE `blogentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blogentrykeyword`
--

DROP TABLE IF EXISTS `blogentrykeyword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blogentrykeyword` (
  `idblogentrykeyword` int(11) NOT NULL AUTO_INCREMENT,
  `idblogentry` int(11) NOT NULL,
  `idkeyword` int(11) NOT NULL,
  PRIMARY KEY (`idblogentrykeyword`),
  KEY `fk_blogentry` (`idblogentry`),
  KEY `fk_keyword` (`idkeyword`),
  CONSTRAINT `blogentrykeyword_ibfk_1` FOREIGN KEY (`idblogentry`) REFERENCES `blogentry` (`idblogentry`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `blogentrykeyword_ibfk_2` FOREIGN KEY (`idkeyword`) REFERENCES `keyword` (`idkeyword`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blogentrykeyword`
--

LOCK TABLES `blogentrykeyword` WRITE;
/*!40000 ALTER TABLE `blogentrykeyword` DISABLE KEYS */;
INSERT INTO `blogentrykeyword` VALUES (5,5,2),(8,8,4),(9,9,2),(10,10,3),(14,1,4),(15,2,2),(16,1,2),(17,2,3),(18,3,1),(19,4,1),(20,4,4);
/*!40000 ALTER TABLE `blogentrykeyword` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keyword`
--

DROP TABLE IF EXISTS `keyword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `keyword` (
  `idkeyword` int(11) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(45) NOT NULL,
  PRIMARY KEY (`idkeyword`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keyword`
--

LOCK TABLES `keyword` WRITE;
/*!40000 ALTER TABLE `keyword` DISABLE KEYS */;
INSERT INTO `keyword` VALUES (1,'POESÍA'),(2,'ROMÁNTICA'),(3,'INVIERNO'),(4,'CLÁSICA');
/*!40000 ALTER TABLE `keyword` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(68) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('edu','$2y$12$jzL7f3EMIqsWahs/wPZB4.tRON6SNqVQlS8lIXC/AU61bg2ATDCS.',1),('ethel','$2y$12$jzL7f3EMIqsWahs/wPZB4.tRON6SNqVQlS8lIXC/AU61bg2ATDCS.',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-18 20:51:11
