package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgoi extends fgnp {
    public static final fgoi o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap;
        fgoi fgoiVar = new fgoi(fgog.H);
        o = fgoiVar;
        concurrentHashMap.put(fgmz.a, fgoiVar);
    }

    private fgoi(fgmq fgmqVar) {
        super(fgmqVar, null);
    }

    public static fgoi N() {
        return O(fgmz.j());
    }

    public static fgoi O(fgmz fgmzVar) {
        if (fgmzVar == null) {
            fgmzVar = fgmz.j();
        }
        ConcurrentHashMap concurrentHashMap = p;
        fgoi fgoiVar = (fgoi) concurrentHashMap.get(fgmzVar);
        if (fgoiVar != null) {
            return fgoiVar;
        }
        fgoi fgoiVar2 = new fgoi(fgom.N(o, fgmzVar));
        fgoi fgoiVar3 = (fgoi) concurrentHashMap.putIfAbsent(fgmzVar, fgoiVar2);
        return fgoiVar3 == null ? fgoiVar2 : fgoiVar3;
    }

    private Object writeReplace() {
        return new fgoh(z());
    }

    @Override // defpackage.fgnp
    protected final void M(fgno fgnoVar) {
        if (this.a.z() == fgmz.a) {
            fgnoVar.H = new fgos(fgoj.a, fgmu.d);
            fgnoVar.k = fgnoVar.H.q();
            fgnoVar.G = new fgpb((fgos) fgnoVar.H, fgmu.e);
            fgnoVar.C = new fgpb((fgos) fgnoVar.H, fgnoVar.h, fgmu.j);
        }
    }

    @Override // defpackage.fgmq
    public final fgmq a() {
        return o;
    }

    @Override // defpackage.fgmq
    public final fgmq b(fgmz fgmzVar) {
        return fgmzVar == z() ? this : O(fgmzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgoi) {
            return z().equals(((fgoi) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        fgmz fgmzVarZ = z();
        if (fgmzVarZ == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + fgmzVarZ.c + "]";
    }
}
