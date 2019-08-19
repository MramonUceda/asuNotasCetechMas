package mx.com.uacm.ProyectoFinalUACM;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Persona {

	public static void main(String[] args) {
		AtributosRegistrosPersonas sr = new AtributosRegistrosPersonas();
		Ficheros metodos = new Ficheros();
		Pruebas en = new Pruebas();
		
		JOptionPane.showMessageDialog(null, "Contesta lo siguiente con un 'SI'/'NO', y lo que sea con numero,con numero ");
		
		sr.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre completo:"));
		metodos.LeerFichero(sr.getNombre());
		sr.setSinMedicina(JOptionPane
				.showInputDialog("�Horas libreas de medicamento?"));
		// System.out.println(sr.sinMedicina);
		int sinMed = Integer.parseInt(sr.getSinMedicina());
		System.out.println(sinMed);
		// System.out.println((sinMed + 5) );
		if (sinMed < 72) {
			JOptionPane.showMessageDialog(null,
					"No aplicas por el tiempo que tienes sin medicamento");
		} else {
			sr.setGripe(JOptionPane.showInputDialog("�Gripa?"));
			System.out.println(sr.getGripe());
			if (sr.getGripe().equals("si")) {
				JOptionPane.showMessageDialog(null,
						"No puede seguir con el proceso.");
			} else {
				sr.setDiabetes(JOptionPane.showInputDialog("�Diabetes?"));
				if (sr.getDiabetes().equals("si")) {
					JOptionPane
							.showMessageDialog(null,
									"No puede seguir con el proceso por tiene DIABETES.");
				} else {
					sr.setHipertension(JOptionPane
							.showInputDialog("�Eres hipertensa?"));
					if (sr.getHipertension().equals("si")) {
						JOptionPane.showMessageDialog(null,
								"Hasta aqui termina el proceso.");
					} else {
						sr.setLibreDeAlcohol(JOptionPane
								.showInputDialog("�Cuanto tiempo llevas sin consumir alcohol?"));
						int alcohol = Integer.parseInt(sr.getLibreDeAlcohol());
						System.out.println(alcohol);
						if (alcohol < 48) {
							JOptionPane.showMessageDialog(null,
									"Consumo no permitido.");
						} else {
							sr.setHorasAyunoSinGrasa(JOptionPane
									.showInputDialog("�Tienes 6 horas sin consumir algun alimento, grasa o lacteos?"));
							if (sr.getHorasAyunoSinGrasa().equals("no")) {
								JOptionPane.showMessageDialog(null,
										"No puede continuar.");
							} else {
								sr.setVacunas(JOptionPane
										.showInputDialog("De minimo un mes sin vacunas,�si?/�no?"));
								if (sr.getVacunas().equals("no")) {
									JOptionPane
											.showMessageDialog(null,
													"Como tiene menos de un mes no podras continuar con el proceso");
								} else {
									sr.setPeso(JOptionPane
											.showInputDialog("�Cual es tu peso (KG)?"));
									float pes = Integer.parseInt(sr.getPeso());
									if (pes < 50) {
										JOptionPane
												.showMessageDialog(
														null,
														"Tu peso es de "
																+ pes
																+ "no puedes continuar");
									} else {
										sr.setEstatura(JOptionPane
												.showInputDialog("�Cual es tu estatura?"));
										double estatura = Double.parseDouble(sr
												.getEstatura());
										if (estatura < 1.50) {
											JOptionPane
													.showMessageDialog(
															null,
															"Tu estatura  es de "
																	+ estatura
																	+ "no puedes continuar");
										} else {
											sr.setEmbarazoLactencia(JOptionPane
													.showInputDialog("�Embarazada o en Etapa de Lactancia?"));
											if (sr.getEmbarazoLactencia()
													.equals("si")) {
												JOptionPane
														.showMessageDialog(
																null,
																"No puedes hacer la donacion");
											} else {
												sr.setEdad(JOptionPane
														.showInputDialog("�Que edad tienes?"));
												int edadPer = Integer
														.parseInt(sr.getEdad());
												if (edadPer <= 18
														|| edadPer >= 65) {
													JOptionPane
															.showMessageDialog(
																	null,
																	"No puedes hacer la donacion");
												} else {
													JOptionPane
															.showMessageDialog(
																	null,
																	"Segunda Filtro");
													sr.setFactorRh(JOptionPane.showInputDialog("�Tipo de sangre?:"));
													sr.setCorreo(JOptionPane.showInputDialog("�Cual es tu correo?:"));
													sr.setTelefono(JOptionPane.showInputDialog("�Cual es tu numero telefonico?:"));
													sr.setFecha(metodos.ObtenerFecha());
													String faseDos = (sr
															.getNombre()
															+ "$"
															+ sr.getEdad()
															+ "$"
															+ sr.getEstatura()
															+ "$"
															+ sr.getDiabetes()
															+ "$"
															+ sr.getHorasAyunoSinGrasa()
															+ "$" + sr
															.getGripe() + sr.getCorreo() + "$" + sr.getFactorRh()+ "$" + sr.getTelefono() + "$" + sr.getFecha() );

													JOptionPane.showMessageDialog(null, faseDos);

													
													if (metodos.EscribirFichero(faseDos)) {
														System.out
																.println("Vamos bien...!");
													} else {
														System.out
																.println("Hasta aqu� llego...");
													}

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
