

import java.io.*;

public class Persistencia {

    public static void salvarObjeto(Object objeto, String nomeArquivo) throws IOException {
        FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
        ObjectOutputStream out = new ObjectOutputStream(arquivo);
        out.writeObject(objeto);
        out.close();
        arquivo.close();
    }

    public static Object carregarObjeto(String nomeArquivo) throws IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream(nomeArquivo);
        ObjectInputStream in = new ObjectInputStream(arquivo);
        Object objeto = in.readObject();
        in.close();
        arquivo.close();
        return objeto;
    }
}