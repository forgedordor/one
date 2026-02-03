package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomi {
    private static final ejvf b = ejvf.m(".。．｡");
    private static final ejxk c = ejxk.b('.');
    private static final ejvf d;
    private static final ejvf e;
    private static final ejvf f;
    private static final ejvf g;
    public final String a;
    private final ekgb h;

    static {
        ejwc.d('.');
        ejvf ejvfVarM = ejvf.m("-_");
        d = ejvfVarM;
        ejuu ejuuVar = new ejuu('0', '9');
        e = ejuuVar;
        ejvd ejvdVar = new ejvd(new ejuu('a', 'z'), new ejuu('A', 'Z'));
        f = ejvdVar;
        g = new ejvd(new ejvd(ejuuVar, ejvdVar), ejvfVarM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eomi(String str) {
        String strC = ejuf.c(b.h(str, '.'));
        boolean z = false;
        strC = strC.endsWith(".") ? strC.substring(0, strC.length() - 1) : strC;
        ejwl.f(strC.length() <= 253, "Domain name too long: '%s':", strC);
        this.a = strC;
        ekgb ekgbVarJ = ekgb.j(c.g(strC));
        this.h = ekgbVarJ;
        ejwl.f(ekgbVarJ.size() <= 127, "Domain has too many parts: '%s'", strC);
        int size = ekgbVarJ.size() - 1;
        if (a((String) ekgbVarJ.get(size), true)) {
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = true;
                    break;
                } else if (!a((String) ekgbVarJ.get(i), false)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ejwl.f(z, "Not a valid domain name: '%s'", strC);
    }

    private static boolean a(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (!g.i(new ejvb(ejuq.a).p(str))) {
                return false;
            }
            ejvf ejvfVar = d;
            if (!ejvfVar.c(str.charAt(0)) && !ejvfVar.c(str.charAt(str.length() - 1))) {
                return (z && e.c(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eomi) {
            return this.a.equals(((eomi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
