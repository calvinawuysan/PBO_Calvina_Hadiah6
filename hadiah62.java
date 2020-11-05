import java.util.Scanner;
class identitas
{
	public String nama;
	public String jurusan;
	public int nim;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama)
	{ 
		this.nama=nama;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan)
	{ 
		this.jurusan=jurusan;
	}
	public int getNim() {
		return nim;
	}
	public void setNim(int nim)
	{ 
		this.nim=nim;
	}
}

public class hadiah62{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	identitas p = new identitas();
	System.out.print("Masukkan Nama = ");
	p.nama = masukan.nextLine();
	System.out.print("Masukkan Jurusan = ");
	p.jurusan = masukan.nextLine();
	System.out.print("Masukkan NIM = ");
	p.nim = masukan.nextInt();
	System.out.println("Nama saya adalah "+p.getNama()+" dan jurusan saya adalah "+p.getJurusan()+ " dan nim saya adalah "+p.getNim()
);
}
}	
	