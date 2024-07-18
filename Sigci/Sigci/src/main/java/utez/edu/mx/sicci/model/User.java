package utez.edu.mx.sicci.model;

public class User {

    private int id;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String curp;
    private String fechaNacimiento;
    private String pass;
    private String fechaCreacion;
    private String estadoPass;
    private int estadoUsuario;
    private int tipoUsuario;
    private int idDIvision;
    private int idGrupo;



    public User(){

    }

    public User(String nombreUsuario, String nombre, String apellido, String correo, String curp,
                String fechaNacimiento,String pass, String fechaCreacion, String estadoPass,int estadoUsuario,int tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.pass = pass;
        this.fechaCreacion = fechaCreacion;
        this.estadoPass = estadoPass;
        this.estadoUsuario = estadoUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public User(int id, String nombreUsuario, String nombre, String apellido, String correo, String curp,
                String fechaNacimiento, String pass, String fechaCreacion, String estadoPass, int estadoUsuario,
                int tipoUsuario, int idDIvision, int idGrupo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.pass = pass;
        this.fechaCreacion = fechaCreacion;
        this.estadoPass = estadoPass;
        this.estadoUsuario = estadoUsuario;
        this.tipoUsuario = tipoUsuario;
        this.idDIvision = idDIvision;
        this.idGrupo = idGrupo;
    }

    // getters

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCurp() {
        return curp;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPass() {
        return pass;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getEstadoPass() {
        return estadoPass;
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public int getIdDIvision() {
        return idDIvision;
    }

    public int getIdGrupo() {
        return idGrupo;
    }


    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setEstadoPass(String estadoPass) {
        this.estadoPass = estadoPass;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setIdDIvision(int idDIvision) {
        this.idDIvision = idDIvision;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
}
