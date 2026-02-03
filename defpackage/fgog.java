package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgog extends fgnw {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final fgog H = ah(fgmz.a);

    private fgog(fgmq fgmqVar, int i) {
        super(fgmqVar, i);
    }

    public static fgog ah(fgmz fgmzVar) {
        return ai(fgmzVar, 4);
    }

    public static fgog ai(fgmz fgmzVar, int i) {
        fgog fgogVar;
        if (fgmzVar == null) {
            fgmzVar = fgmz.j();
        }
        ConcurrentHashMap concurrentHashMap = I;
        fgog[] fgogVarArr = (fgog[]) concurrentHashMap.get(fgmzVar);
        if (fgogVarArr == null) {
            fgogVarArr = new fgog[7];
            fgog[] fgogVarArr2 = (fgog[]) concurrentHashMap.putIfAbsent(fgmzVar, fgogVarArr);
            if (fgogVarArr2 != null) {
                fgogVarArr = fgogVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            fgog fgogVar2 = fgogVarArr[i2];
            if (fgogVar2 != null) {
                return fgogVar2;
            }
            synchronized (fgogVarArr) {
                fgogVar = fgogVarArr[i2];
                if (fgogVar == null) {
                    fgmz fgmzVar2 = fgmz.a;
                    fgogVar = fgmzVar == fgmzVar2 ? new fgog(null, i) : new fgog(fgom.N(ai(fgmzVar2, i), fgmzVar), i);
                    fgogVarArr[i2] = fgogVar;
                }
            }
            return fgogVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.g(i, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i = ((fgnt) this).G;
        if (i == 0) {
            i = 4;
        }
        fgmq fgmqVar = this.a;
        return fgmqVar == null ? ai(fgmz.a, i) : ai(fgmqVar.z(), i);
    }

    @Override // defpackage.fgnt, defpackage.fgnp
    protected final void M(fgno fgnoVar) {
        if (this.a == null) {
            fgnoVar.a = fgnt.o;
            fgnoVar.b = fgnt.p;
            fgnoVar.c = fgnt.q;
            fgnoVar.d = fgnt.r;
            fgnoVar.e = fgnt.s;
            fgnoVar.f = fgnt.t;
            fgnoVar.g = fgnt.u;
            fgnoVar.m = fgnt.v;
            fgnoVar.n = fgnt.w;
            fgnoVar.o = fgnt.x;
            fgnoVar.p = fgnt.y;
            fgnoVar.q = fgnt.z;
            fgnoVar.r = fgnt.A;
            fgnoVar.s = fgnt.B;
            fgnoVar.u = fgnt.C;
            fgnoVar.t = fgnt.D;
            fgnoVar.v = fgnt.E;
            fgnoVar.w = fgnt.F;
            fgnoVar.E = new fgoa(this);
            fgnoVar.F = new fgof(fgnoVar.E, this);
            fgms fgmsVar = fgnoVar.F;
            fgnoVar.H = new fgos(new fgox(fgmsVar, fgmsVar == null ? null : fgmsVar.p(), 99), fgmu.d);
            fgnoVar.k = fgnoVar.H.q();
            fgos fgosVar = (fgos) fgnoVar.H;
            fgnoVar.G = new fgox(new fgpb(fgosVar, fgosVar.g), fgmu.e);
            fgnoVar.I = new fgoc(this);
            fgnoVar.x = new fgob(this, fgnoVar.f);
            fgnoVar.y = new fgnu(this, fgnoVar.f);
            fgnoVar.z = new fgnv(this, fgnoVar.f);
            fgnoVar.D = new fgoe(this);
            fgnoVar.B = new fgnz(this);
            fgnoVar.A = new fgny(this, fgnoVar.g);
            fgms fgmsVar2 = fgnoVar.B;
            fgna fgnaVar = fgnoVar.k;
            fgmu fgmuVar = fgmu.j;
            fgnoVar.C = new fgox(new fgpb(fgmsVar2, fgnaVar, fgmuVar), fgmuVar);
            fgnoVar.j = fgnoVar.E.q();
            fgnoVar.i = fgnoVar.D.q();
            fgnoVar.h = fgnoVar.B.q();
        }
    }

    @Override // defpackage.fgnt
    public final long Z(int i) {
        int i2;
        int i3 = i / 100;
        if (i >= 0) {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (ag(i)) {
            }
            return ((i * 365) + (i2 - 719527)) * 86400000;
        }
        i2 = (((i + 3) >> 2) - i3) + ((i3 + 3) >> 2);
        i2--;
        return ((i * 365) + (i2 - 719527)) * 86400000;
    }

    @Override // defpackage.fgmq
    public final fgmq a() {
        return H;
    }

    @Override // defpackage.fgnt
    public final boolean ag(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // defpackage.fgmq
    public final fgmq b(fgmz fgmzVar) {
        return fgmzVar == z() ? this : ah(fgmzVar);
    }
}
