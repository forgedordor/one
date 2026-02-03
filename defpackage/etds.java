package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etds {
    static final ekgp a;
    static final ekgp b;
    static final ekgp c;
    static final String d;
    public static final Pattern e;
    static final Pattern f;
    static final String g;
    static final String h;
    static final String i;
    static final String j;
    static final Pattern k;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i('0', '0');
        ekgiVar.i('1', '1');
        ekgiVar.i('2', '2');
        ekgiVar.i('3', '3');
        ekgiVar.i('4', '4');
        ekgiVar.i('5', '5');
        ekgiVar.i('6', '6');
        ekgiVar.i('7', '7');
        ekgiVar.i('8', '8');
        ekgiVar.i('9', '9');
        ekgp ekgpVarC = ekgiVar.c();
        a = ekgpVarC;
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i('A', '2');
        ekgiVar2.i('B', '2');
        ekgiVar2.i('C', '2');
        ekgiVar2.i('D', '3');
        ekgiVar2.i('E', '3');
        ekgiVar2.i('F', '3');
        ekgiVar2.i('G', '4');
        ekgiVar2.i('H', '4');
        ekgiVar2.i('I', '4');
        ekgiVar2.i('J', '5');
        ekgiVar2.i('K', '5');
        ekgiVar2.i('L', '5');
        ekgiVar2.i('M', '6');
        ekgiVar2.i('N', '6');
        ekgiVar2.i('O', '6');
        ekgiVar2.i('P', '7');
        ekgiVar2.i('Q', '7');
        ekgiVar2.i('R', '7');
        ekgiVar2.i('S', '7');
        ekgiVar2.i('T', '8');
        ekgiVar2.i('U', '8');
        ekgiVar2.i('V', '8');
        ekgiVar2.i('W', '9');
        ekgiVar2.i('X', '9');
        ekgiVar2.i('Y', '9');
        ekgiVar2.i('Z', '9');
        ekgp ekgpVarC2 = ekgiVar2.c();
        b = ekgpVarC2;
        ekgi ekgiVar3 = new ekgi();
        ekgiVar3.g(ekgpVarC2);
        ekgiVar3.g(ekgpVarC);
        c = ekgiVar3.c();
        String strConcat = String.valueOf(ekgpVarC2.keySet().toString().replaceAll("[, \\[\\]]", "")).concat(String.valueOf(ejuf.c(ekgpVarC2.keySet().toString()).replaceAll("[, \\[\\]]", "")));
        d = strConcat;
        e = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        f = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat2 = String.valueOf(strConcat).concat("\\p{Nd}");
        g = strConcat2;
        String strC = a.C("[", "]+((\\-)*[", strConcat2, strConcat2, "])*");
        h = strC;
        String strC2 = a.C("[", "]+((\\-)*[", strConcat, strConcat2, "])*");
        i = strC2;
        String strC3 = a.C("^(", "\\.)*", strC, strC2, "\\.?$");
        j = strC3;
        k = Pattern.compile(strC3);
    }
}
