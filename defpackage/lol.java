package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lol {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final lov b;
    public volatile int c = 0;

    public lol(lov lovVar, int i) {
        this.b = lovVar;
        this.a = i;
    }

    public final int a(int i) {
        plh plhVarD = d();
        int iB = plhVarD.b(16);
        if (iB != 0) {
            return plhVarD.b.getInt(plhVarD.c(iB) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        plh plhVarD = d();
        int iB = plhVarD.b(16);
        if (iB != 0) {
            return plhVarD.d(iB);
        }
        return 0;
    }

    public final int c() {
        plh plhVarD = d();
        int iB = plhVarD.b(4);
        if (iB != 0) {
            return plhVarD.b.getInt(iB + plhVarD.a);
        }
        return 0;
    }

    public final plh d() {
        ThreadLocal threadLocal = d;
        plh plhVar = (plh) threadLocal.get();
        if (plhVar == null) {
            plhVar = new plh();
            threadLocal.set(plhVar);
        }
        lov lovVar = this.b;
        int i = this.a;
        pli pliVar = lovVar.a;
        int iB = pliVar.b(6);
        if (iB != 0) {
            int iC = pliVar.c(iB) + (i * 4);
            plhVar.e(iC + pliVar.b.getInt(iC), pliVar.b);
        }
        return plhVar;
    }

    public final short e() {
        plh plhVarD = d();
        int iB = plhVarD.b(14);
        if (iB != 0) {
            return plhVarD.b.getShort(iB + plhVarD.a);
        }
        return (short) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
