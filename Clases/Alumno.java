package Clases;

public class Alumno {
    // Atributos
    String nombres, apellidos, edad, rut, matricula, sexo, direccion, ciudad, email, nacionalidad, viveCon, gestionadoPor, etnia, insOrigen, ultCurso, repitente,
    enfermedades, medicamentos, fechaDeNacimiento, telefono, curso, letraCurso;

    // Constructor

    public Alumno(String nombres, String apellidos, String edad, String rut, String matricula, String sexo, String direccion, String ciudad, String email, String nacionalidad, String viveCon, String gestionadoPor, String etnia, String insOrigen, String ultCurso, String repitente, String enfermedades, String medicamentos, String fechaDeNacimiento, String telefono, String curso, String letraCurso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.rut = rut;
        this.matricula = matricula;
        this.sexo = sexo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.viveCon = viveCon;
        this.gestionadoPor = gestionadoPor;
        this.etnia = etnia;
        this.insOrigen = insOrigen;
        this.ultCurso = ultCurso;
        this.repitente = repitente;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.curso = curso;
        this.letraCurso = letraCurso;
    }

    public Alumno() {
    }

    // Get

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getRut() {
        return rut;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEmail() {
        return email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getViveCon() {
        return viveCon;
    }

    public String getGestionadoPor() {
        return gestionadoPor;
    }

    public String getEtnia() {
        return etnia;
    }

    public String getInsOrigen() {
        return insOrigen;
    }

    public String getUltCurso() {
        return ultCurso;
    }

    public String getRepitente() {
        return repitente;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCurso() {
        return curso;
    }

    public String getLetraCurso() {
        return letraCurso;
    }

    // Sett

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setViveCon(String viveCon) {
        this.viveCon = viveCon;
    }

    public void setGestionadoPor(String gestionadoPor) {
        this.gestionadoPor = gestionadoPor;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public void setInsOrigen(String insOrigen) {
        this.insOrigen = insOrigen;
    }

    public void setUltCurso(String ultCurso) {
        this.ultCurso = ultCurso;
    }

    public void setRepitente(String repitente) {
        this.repitente = repitente;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setLetraCurso(String letraCurso) {
        this.letraCurso = letraCurso;
    }
}
