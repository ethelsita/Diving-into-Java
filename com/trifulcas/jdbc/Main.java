package com.trifulcas.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String cadConexion = "jdbc:mysql://localhost:3306/";
		String bd = "TIENDACIFO";
		String usuario = "root";
		String pass = "";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(cadConexion + bd, usuario, pass);
			Statement stmt;
			PreparedStatement pstmt;
			ResultSet rs;
			Scanner entrada = new Scanner(System.in);
			int res, res0, id, idproveedor,codigo;
			String nombre,NIF,direccion;
			Double precioUni;
			
			do {
				System.out.println("Escoja opción:");
				System.out.println("1.- Deseo tratar con productos");
				System.out.println("2.- Deseo tratar con proveedores");
				System.out.println("0- Deseo Salir");
				res0 = Integer.parseInt(entrada.nextLine());
				
				if (res0==1) {
					
					do {
					System.out.println("Escoja opción:");
					System.out.println("1.- Ver todos los productos");
					System.out.println("2.- Ver un producto concreto");
					System.out.println("3.- Crear un nuevo producto");
					System.out.println("4.- Modificar un producto");
					System.out.println("5.- Eliminar un producto");
					System.out.println("0.- Salir");
					res = Integer.parseInt(entrada.nextLine());
	
					switch (res) {
					case 1:
						stmt = con.createStatement();
						rs = stmt.executeQuery("select * from Producto");
						while (rs.next())
							System.out.println(rs.getInt("idproducto") + "  " + rs.getInt("Codigo") + "  " +rs.getString("Nombre")+ "  " +rs.getString("precioUni"));
						break;
					case 2:
						System.out.println("Introduzca el Codigo del producto que quiere ver: ");
						id = Integer.parseInt(entrada.nextLine());
						pstmt = con.prepareStatement("select Codigo, Producto.Nombre, precioUni, Proveedor.Nombre from Producto inner join Proveedor on Producto.idProveedor and Proveedor.idProveedor where Codigo=?");
						pstmt.setInt(1, id);
						rs = pstmt.executeQuery();
						if (rs.next()) {
							System.out.println("Código:" + rs.getString("Codigo") + " | Nombre:" + rs.getString("Producto.Nombre")+ " | Precio:" + rs.getString("precioUni")+ " | Proveedor:" + rs.getString("Proveedor.Nombre"));
						} else {
							System.out.println("No encontrado");
						}
						break;
					case 3:
						System.out.println("Introduzca el nombre del producto : ");
						nombre = entrada.nextLine();
						System.out.println("Introduzca el codigo del producto : ");
						codigo = Integer.parseInt(entrada.nextLine());
						System.out.println("Introduzca el precio del producto : ");
						precioUni = Double.parseDouble(entrada.nextLine());
						System.out.println("Introduzca el id del proveedor : ");
						idproveedor = Integer.parseInt(entrada.nextLine());
						pstmt = con.prepareStatement("insert into Producto (nombre,codigo,precioUni,idProveedor) values(?,?,?,?)");
						pstmt.setString(1, nombre);
						pstmt.setInt(2, codigo);
						pstmt.setDouble(3, precioUni);
						pstmt.setInt(4, idproveedor);
						pstmt.execute();
						System.out.println("Producto insertado");
						break;
					case 4:
						System.out.println("Introduzca el codigo del producto que quiere modificar: ");
						id = Integer.parseInt(entrada.nextLine());
						System.out.println("Introduzca el nuevo nombre del producto : ");
						nombre = entrada.nextLine();
						pstmt = con.prepareStatement("update Producto set Nombre=? where Codigo=?");
						pstmt.setString(1, nombre);
						pstmt.setInt(2, id);
						pstmt.execute();
						System.out.println("Producto modificado");
						break;
					case 5:
						System.out.println("Introduzca el codigo delproducto que quiere eliminar: ");
						id = Integer.parseInt(entrada.nextLine());
						pstmt = con.prepareStatement("delete from Producto where Codigo=?");
						pstmt.setInt(1, id);
						pstmt.execute();
						System.out.println("Producto eliminado");
						break;
					}
					} while (res != 0);
				}else if(res0==2) {
					do {
						System.out.println("Escoja opción:");
						System.out.println("1.- Ver todos los proveedores");
						System.out.println("2.- Ver un proveedor en concreto");
						System.out.println("3.- Crear un nuevo proveedor");
						System.out.println("4.- Modificar un proveedor");
						System.out.println("5.- Eliminar un proveedor");
						System.out.println("0.- Salir");
						res = Integer.parseInt(entrada.nextLine());
		
						switch (res) {
						case 1:
							stmt = con.createStatement();
							rs = stmt.executeQuery("select * from Proveedor");
							while (rs.next())
								System.out.println(rs.getInt("idproveedor") + "  " + rs.getInt("NIF") + "  " +rs.getString("Nombre")+"  " +rs.getString("Direccion"));
							break;
						case 2:
							System.out.println("Introduzca el Codigo del proveedor que quiere ver: ");
							id = Integer.parseInt(entrada.nextLine());
							pstmt = con.prepareStatement("select * from Proveedor where idProveedor=?");
							pstmt.setInt(1, id);
							rs = pstmt.executeQuery();
							if (rs.next()) {
								System.out.println("idProveedor:" + rs.getString("idProveedor") + " | Nombre:" + rs.getString("Nombre")+ " | NIF:" + rs.getString("NIF")+ " | Dirección:" + rs.getString("Direccion"));
							} else {
								System.out.println("No encontrado");
							}
							break;
						case 3:
							System.out.println("Introduzca el nombre del proveedor : ");
							nombre = entrada.nextLine();
							System.out.println("Introduzca el NIF del proveedor: ");
							NIF = entrada.nextLine();
							System.out.println("Introduzca la dirección : ");
							direccion = entrada.nextLine();
							pstmt = con.prepareStatement("insert into Proveedor (nombre,NIF,direccion) values(?,?,?)");
							pstmt.setString(1, nombre);
							pstmt.setString(2, NIF);
							pstmt.setString(3, direccion);						
							pstmt.execute();
							System.out.println("Proveedor insertado");
							break;
						case 4:
							System.out.println("Introduzca el id del proveedor que quiere modificar: ");
							id = Integer.parseInt(entrada.nextLine());
							System.out.println("Introduzca el nuevo nombre del proveedor : ");
							nombre = entrada.nextLine();
							pstmt = con.prepareStatement("update Proveedor set Nombre=? where idProveedor=?");
							pstmt.setString(1, nombre);
							pstmt.setInt(2, id);
							pstmt.execute();
							System.out.println("Proveedor modificado");
							break;
						case 5:
							System.out.println("Introduzca el codigo del proveedor que quiere eliminar: ");
							id = Integer.parseInt(entrada.nextLine());
							pstmt = con.prepareStatement("delete from Proveedor where idProveedor=?");
							pstmt.setInt(1, id);
							pstmt.execute();
							System.out.println("Proveedor eliminado");
							break;
						}
						} while (res != 0);
				}
				
			} while (res0 != 0);	
			con.close();
			entrada.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}