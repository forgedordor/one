package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class neg extends nec {
    public static final Object c = new Object();
    public final Object d;
    private final Object e;

    public neg(mcl mclVar, Object obj, Object obj2) {
        super(mclVar);
        this.e = obj;
        this.d = obj2;
    }

    public static neg s(mbo mboVar) {
        return new neg(new neh(mboVar), mck.a, c);
    }

    @Override // defpackage.nec, defpackage.mcl
    public final int a(Object obj) {
        Object obj2;
        if (c.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.a(obj);
    }

    @Override // defpackage.nec, defpackage.mcl
    public final mcj d(int i, mcj mcjVar, boolean z) {
        this.b.d(i, mcjVar, z);
        if (Objects.equals(mcjVar.b, this.d) && z) {
            mcjVar.b = c;
        }
        return mcjVar;
    }

    @Override // defpackage.nec, defpackage.mcl
    public final mck e(int i, mck mckVar, long j) {
        this.b.e(i, mckVar, j);
        if (Objects.equals(mckVar.b, this.e)) {
            mckVar.b = mck.a;
        }
        return mckVar;
    }

    @Override // defpackage.nec, defpackage.mcl
    public final Object f(int i) {
        Object objF = this.b.f(i);
        return Objects.equals(objF, this.d) ? c : objF;
    }

    public final neg r(mcl mclVar) {
        return new neg(mclVar, this.e, this.d);
    }
}
