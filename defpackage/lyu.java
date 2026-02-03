package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyu {
    private final lxp a;
    private final lxk b;
    private final lyp c;
    private final lzb d = new lzb();

    public lyu(lxp lxpVar, lxk lxkVar, lyp lypVar) {
        this.a = lxpVar;
        this.b = lxkVar;
        this.c = lypVar;
    }

    public final lxd a(fddy fddyVar, String str) {
        lxd lxdVarA;
        synchronized (this.d) {
            lxp lxpVar = this.a;
            lxdVarA = lxpVar.a(str);
            if (fddyVar.d(lxdVarA)) {
                Object obj = this.b;
                if (obj instanceof lxm) {
                    lxdVarA.getClass();
                    ((lxm) obj).d(lxdVarA);
                }
                lxdVarA.getClass();
            } else {
                lys lysVar = new lys(this.c);
                lysVar.b(lxo.a, str);
                lxdVarA = lyv.a(this.b, fddyVar, lysVar);
                lxdVarA.getClass();
                lxd lxdVar = (lxd) lxpVar.a.put(str, lxdVarA);
                if (lxdVar != null) {
                    lxdVar.fB();
                }
            }
        }
        return lxdVarA;
    }
}
