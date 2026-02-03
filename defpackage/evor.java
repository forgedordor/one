package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evor {
    public static final ejxk a;
    public static final ejwc b;
    public static final ejwc c;
    private static final ejxk d;
    private static final ejxk e;
    private static final ejwc f;
    private static final ekgb g;

    static {
        ejxk ejxkVarA = ejxk.b('=').a();
        ejwl.d(true, "must be greater than zero: %s", 2);
        a = new ejxk(ejxkVarA.c, ejxkVarA.b, ejxkVarA.a, 2);
        d = ejxk.b('/');
        e = ejxk.b('-');
        ejxk.b(':');
        b = new ejwc("/");
        f = new ejwc("-");
        c = new ejwc("=");
        g = ekgb.C(new evoq("s", false), new evoq("w", false), new evoq("c", true), new evoq("d", true), new evoq("h", false), new evoq("s", true), new evoq("h", true), new evoq("p", true), new evoq("pp", true), new evoq("pf", true), new evoq("n", true), new evoq("r", false), new evoq("r", true), new evoq("o", true), new evoq("o", false), new evoq("j", false), new evoq("x", false), new evoq("y", false), new evoq("z", false), new evoq("g", true), new evoq("e", false), new evoq("f", false), new evoq("k", true), new evoq("u", true), new evoq("ut", true), new evoq("i", true), new evoq("a", true), new evoq("b", true), new evoq("b", false), new evoq("c", false), new evoq("t", false), new evoq("nt0", false), new evoq("v", true), new evoq("q", false), new evoq("fh", true), new evoq("fv", true), new evoq("fg", true), new evoq("ci", true), new evoq("rw", true), new evoq("rwu", true), new evoq("rwa", true), new evoq("nw", true), new evoq("rh", true), new evoq("no", true), new evoq("ns", true), new evoq("k", false), new evoq("p", false), new evoq("l", false), new evoq("v", false), new evoq("nu", true), new evoq("ft", true), new evoq("cc", true), new evoq("nd", true), new evoq("ip", true), new evoq("nc", true), new evoq("a", false), new evoq("rj", true), new evoq("rp", true), new evoq("rg", true), new evoq("pd", true), new evoq("pa", true), new evoq("m", false), new evoq("vb", false), new evoq("vl", false), new evoq("lf", true), new evoq("mv", true), new evoq("id", true), new evoq("al", true), new evoq("ic", false), new evoq("pg", true), new evoq("mo", true), new evoq("iv", false), new evoq("il", false), new evoq("ba", false), new evoq("vm", false), new evoq("vf", false));
    }

    protected evor() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(String str, String str2, boolean z) {
        ejwl.b(str != null, "oldOptions is null");
        ejwl.b(true, "newOptions is null");
        if (!str.isEmpty()) {
            List<String> listD = d(str, !z);
            if (!listD.isEmpty()) {
                listD.addAll(d(str2, false));
                ejwl.b(true, "options is null");
                ekby ekbyVar = new ekby();
                ArrayList arrayList = new ArrayList();
                for (String str3 : listD) {
                    ekgb ekgbVar = g;
                    int i = ((ekoe) ekgbVar).c;
                    evoq evoqVar = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        evoq evoqVar2 = (evoq) ekgbVar.get(i2);
                        String lowerCase = str3.toLowerCase(Locale.getDefault());
                        String str4 = evoqVar2.a;
                        if (lowerCase.startsWith(str4)) {
                            if (evoqVar2.b) {
                                if (str3.length() == str4.length()) {
                                    evoqVar = evoqVar2;
                                    break;
                                }
                            } else {
                                evoqVar = evoqVar2;
                            }
                        }
                        i2++;
                    }
                    if (evoqVar != null) {
                        ekbyVar.t(evoqVar, str3);
                    } else {
                        arrayList.add(str3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ekgb ekgbVar2 = g;
                int i3 = ((ekoe) ekgbVar2).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    String str5 = "";
                    for (String str6 : ekbyVar.c((evoq) ekgbVar2.get(i4))) {
                        if (Character.isUpperCase(str6.charAt(0))) {
                            arrayList2.add(str6);
                        } else {
                            str5 = str6;
                        }
                    }
                    if (!str5.isEmpty()) {
                        arrayList2.add(str5);
                    }
                }
                arrayList2.addAll(arrayList);
                return f.b(arrayList2);
            }
        }
        return str2;
    }

    public static List d(String str, boolean z) {
        ejwl.b(str != null, "options is null");
        ArrayList arrayList = new ArrayList();
        Iterator it = e.g(str).iterator();
        while (it.hasNext()) {
            String strG = (String) it.next();
            if (!strG.isEmpty()) {
                if (strG.startsWith("O") || strG.startsWith("J")) {
                    while (strG.length() < 12) {
                        strG = f.g(strG, it.hasNext() ? it.next() : "", new Object[0]);
                    }
                }
                if (strG.equals("pi") || strG.equals("ya") || strG.equals("ro")) {
                    strG = f.g(strG, it.hasNext() ? it.next() : "", new Object[0]);
                }
                if (!z || Character.isUpperCase(strG.charAt(0))) {
                    arrayList.add(strG);
                }
            }
        }
        return arrayList;
    }

    public static final List e(drjh drjhVar) {
        ArrayList arrayListA = ekjz.a(d.g(drjhVar.a()));
        return (arrayListA.size() <= 0 || !((String) arrayListA.get(0)).isEmpty()) ? arrayListA : arrayListA.subList(1, arrayListA.size());
    }
}
