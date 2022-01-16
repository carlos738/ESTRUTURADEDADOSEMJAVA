package ProjetoNo.src;

public class No {
    private String conteudo;
    private  No proximoNo;

    public No(String conteudo) {
        this.proximoNo= null;
        this.conteudo = conteudo;
    }

    public No(No proximono) {
        this.proximoNo = proximono;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void settProximoNo(No proximoNo) {
         this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
