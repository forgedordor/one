package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgmt extends fgmu {
    private static final long serialVersionUID = -9937958251642L;
    public final transient fgnc a;
    private final byte z;

    public fgmt(String str, byte b, fgnc fgncVar) {
        super(str);
        this.z = b;
        this.a = fgncVar;
    }

    private Object readResolve() {
        switch (this.z) {
            case 1:
                return fgmu.b;
            case 2:
                return fgmu.c;
            case 3:
                return fgmu.d;
            case 4:
                return fgmu.e;
            case 5:
                return fgmu.f;
            case 6:
                return fgmu.g;
            case 7:
                return fgmu.h;
            case 8:
                return fgmu.i;
            case 9:
                return fgmu.j;
            case 10:
                return fgmu.k;
            case 11:
                return fgmu.l;
            case 12:
                return fgmu.m;
            case 13:
                return fgmu.n;
            case 14:
                return fgmu.o;
            case 15:
                return fgmu.p;
            case 16:
                return fgmu.q;
            case 17:
                return fgmu.r;
            case 18:
                return fgmu.s;
            case 19:
                return fgmu.t;
            case 20:
                return fgmu.u;
            case 21:
                return fgmu.v;
            case 22:
                return fgmu.w;
            default:
                return fgmu.x;
        }
    }

    @Override // defpackage.fgmu
    public final fgms a(fgmq fgmqVar) {
        byte b = this.z;
        fgmq fgmqVarC = fgmw.c(fgmqVar);
        switch (b) {
            case 1:
                return fgmqVarC.i();
            case 2:
                return fgmqVarC.y();
            case 3:
                return fgmqVarC.c();
            case 4:
                return fgmqVarC.x();
            case 5:
                return fgmqVarC.w();
            case 6:
                return fgmqVarC.h();
            case 7:
                return fgmqVarC.q();
            case 8:
                return fgmqVarC.f();
            case 9:
                return fgmqVarC.v();
            case 10:
                return fgmqVarC.u();
            case 11:
                return fgmqVarC.t();
            case 12:
                return fgmqVarC.g();
            case 13:
                return fgmqVarC.j();
            case 14:
                return fgmqVarC.l();
            case 15:
                return fgmqVarC.e();
            case 16:
                return fgmqVarC.d();
            case 17:
                return fgmqVarC.k();
            case 18:
                return fgmqVarC.o();
            case 19:
                return fgmqVarC.p();
            case 20:
                return fgmqVarC.r();
            case 21:
                return fgmqVarC.s();
            case 22:
                return fgmqVarC.m();
            default:
                return fgmqVarC.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgmt) && this.z == ((fgmt) obj).z;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}
