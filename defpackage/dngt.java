package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngt implements fdau {
    private final fdau a;
    private Object b;
    private Object c;
    private Object d;
    private Object e;

    public dngt(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.fdau
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (!fdbq.f(this.b, obj) || !fdbq.f(this.c, obj2) || !fdbq.f(this.d, obj3)) {
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = null;
        }
        Object obj4 = this.e;
        if (obj4 != null) {
            return obj4;
        }
        Object objA = this.a.a(obj, obj2, obj3);
        this.e = objA;
        return objA;
    }
}
