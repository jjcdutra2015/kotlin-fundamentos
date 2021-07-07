package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Julio", "Jose", "Dutra");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
