package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgnb extends fgnc {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public fgnb(String str, byte b) {
        super(str);
        this.n = b;
    }

    private Object readResolve() {
        switch (this.n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            case 8:
                return h;
            case 9:
                return i;
            case 10:
                return j;
            case 11:
                return k;
            default:
                return l;
        }
    }

    @Override // defpackage.fgnc
    public final fgna a(fgmq fgmqVar) {
        byte b = this.n;
        fgmq fgmqVarC = fgmw.c(fgmqVar);
        switch (b) {
            case 1:
                return fgmqVarC.C();
            case 2:
                return fgmqVarC.A();
            case 3:
                return fgmqVarC.K();
            case 4:
                return fgmqVarC.L();
            case 5:
                return fgmqVarC.H();
            case 6:
                return fgmqVarC.J();
            case 7:
                return fgmqVarC.B();
            case 8:
                return fgmqVarC.D();
            case 9:
                return fgmqVarC.E();
            case 10:
                return fgmqVarC.G();
            case 11:
                return fgmqVarC.I();
            default:
                return fgmqVarC.F();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgnb) && this.n == ((fgnb) obj).n;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
