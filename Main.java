import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Evento e = new Evento();
        Scanner sc= new Scanner(System.in);
        int id = sc.nextInt();
        e.setId(id);
        int d = sc.nextInt();
        e.getOcorrenicia().setDia(d);
        int m = sc.nextInt();
        e.getOcorrenicia().setMes(m);
        int a = sc.nextInt();
        e.getOcorrenicia().setAno(a);
        sc.nextLine();
        String n = sc.nextLine();
        e.setNome(n);
        System.out.println("id:" + e.getId());
        System.out.println("dia:" + e.getOcorrenicia().getDia());
        System.out.println("mes:" + e.getOcorrenicia().getMes());
        System.out.println("ano:" + e.getOcorrenicia().getAno());
        System.out.println("nome:" + e.getNome());
    }
}