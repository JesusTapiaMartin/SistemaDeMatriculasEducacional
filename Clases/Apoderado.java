
package Clases;

public class Apoderado {
    String  nombres             , apellidos                 , rut                   , parentesco                ,
            telefono            , email                     , direccion             , ciudad                    ,
            situacionLaboral    , escolaridad               , observaciones;

    //==================== CONSTRUCTORES ====================

    public Apoderado(   String nombres              , String apellidos          , String rut                , String parentesco     ,
                        String telefono             , String email              , String direccion          , String ciudad         ,
                        String situacionLaboral     , String escolaridad        , String observaciones) {
        this.nombres            = nombres;
        this.apellidos          = apellidos;
        this.rut                = rut;
        this.parentesco         = parentesco;
        this.telefono           = telefono;
        this.email              = email;
        this.direccion          = direccion;
        this.ciudad             = ciudad;
        this.situacionLaboral   = situacionLaboral;
        this.escolaridad        = escolaridad;
        this.observaciones      = observaciones;
    }

    //==================== GET ====================

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRut() {
        return rut;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public String getObservaciones() {
        return observaciones;
    }


    //==================== SET ====================

    public void setNombres(String nombres) {
        this.nombres            = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos          = apellidos;
    }

    public void setRut(String rut) {
        this.rut                = rut;
    }

    public void setParentesco(String parentesco) {
        this.parentesco         = parentesco;
    }

    public void setTelefono(String telefono) {
        this.telefono           = telefono;
    }

    public void setEmail(String email) {
        this.email              = email;
    }

    public void setDireccion(String direccion) {
        this.direccion          = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad             = ciudad;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral   = situacionLaboral;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad        = escolaridad;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones      = observaciones;
    }

}
