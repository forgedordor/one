package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngs implements fdat {
    private final fdat a;
    private Object b;
    private Object c;
    private Object d;

    public dngs(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final Object a(Object obj, Object obj2) {
        if (!fdbq.f(this.b, obj) || !fdbq.f(this.c, obj2)) {
            this.b = obj;
            this.c = obj2;
            this.d = null;
        }
        Object obj3 = this.d;
        if (obj3 != null) {
            return obj3;
        }
        Object objA = this.a.a(obj, obj2);
        this.d = objA;
        return objA;
    }
}
