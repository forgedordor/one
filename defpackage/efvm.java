package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvm {
    public static final /* synthetic */ int b = 0;
    private static final ekhx c;
    private static final ekhx d;
    private static final efvm e;
    public final ekhx a;

    static {
        ekhx ekhxVarR = ekhx.r("google.com", "www.google.com");
        c = ekhxVarR;
        ekhx ekhxVarR2 = ekhx.r("gmail.com", "www.gmail.com");
        d = ekhxVarR2;
        ekhx.r("googlemail.com", "www.googlemail.com");
        efvm efvmVar = new efvm(ekhxVarR);
        e = efvmVar;
        new efvm(ekhxVarR2);
        new efvm(ekeh.b(ekhxVarR2, efvmVar.a));
    }

    public efvm(Iterable iterable) {
        ekhv ekhvVar = new ekhv();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String strSubstring = (String) it.next();
            if (strSubstring.startsWith(".")) {
                strSubstring = strSubstring.substring(1);
            }
            ekhvVar.c(ejuf.c(strSubstring));
        }
        this.a = ekhvVar.g();
    }
}
