public class Computador {
    private Integer memoriaRam;
    private Integer ssd;
    private Integer nucleos;
    private Float operacoesPorSegundo;
    
    public Computador(Integer memoriaRam, Integer ssd, Integer nucleos, Float operacoesPorSegundo)
    {
        this.memoriaRam = memoriaRam;
        this.ssd = ssd;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

     public Integer getMemoriaRam()
     {
        return this.memoriaRam;
     }
     public void setMemoriaRam(Integer memoriaRam)
     {
        this.memoriaRam = memoriaRam;
     }

     public Integer getSsd()
     {
        return this.ssd;
     }
     public void setSsd(Integer ssd)
     {
        this.ssd = ssd;
     }

     public Integer getNucleos()
     {
        return this.nucleos;
     }
     public void setNucleos(Integer nucleos)
     {
        this.nucleos = nucleos;
     }

     public Float getOperacoesPorSegundo()
     {
        return this.operacoesPorSegundo;
     }
     public void setOperacoesPorSegundo(Float operacoesPorSegundo)
     {
        this.operacoesPorSegundo = operacoesPorSegundo;
     }
}
