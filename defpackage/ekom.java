package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekom extends ekhj {
    static final ekom a = new ekom(new eknt());
    final transient eknt b;
    private final transient int c;
    private transient ekhx d;

    public ekom(eknt ekntVar) {
        this.b = ekntVar;
        long jC = 0;
        for (int i = 0; i < ekntVar.c; i++) {
            jC += ekntVar.c(i);
        }
        this.c = eonc.f(jC);
    }

    @Override // defpackage.ekni
    public final int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ekhj, defpackage.ekni
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ekhx i() {
        ekhx ekhxVar = this.d;
        if (ekhxVar != null) {
            return ekhxVar;
        }
        ekok ekokVar = new ekok(this);
        this.d = ekokVar;
        return ekokVar;
    }

    @Override // defpackage.ekhj
    public final eknh p(int i) {
        return this.b.h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ekni
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ekhj, defpackage.ekfn
    public Object writeReplace() {
        return new ekol(this);
    }
}
