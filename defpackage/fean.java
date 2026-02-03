package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fean {
    public final Object a;
    public final fdau b;
    public final Object c;
    public Object d;
    public int e = -1;
    private final fdau f;
    private final Object g;

    public fean(Object obj, fdau fdauVar, fdau fdauVar2, Object obj2, Object obj3) {
        this.a = obj;
        this.b = fdauVar;
        this.f = fdauVar2;
        this.c = obj2;
        this.g = obj3;
    }

    public final Object a(Object obj, fcxy fcxyVar) {
        Object obj2 = this.c;
        Object obj3 = this.g;
        return obj2 == feat.f ? ((fdap) obj3).invoke(fcxyVar) : ((fdat) obj3).a(obj, fcxyVar);
    }

    public final Object b(Object obj) {
        return this.f.a(this.a, this.c, obj);
    }

    public final void c() {
        Object obj = this.d;
        if (obj instanceof fdzf) {
            ((fdzf) obj).l(this.e);
            return;
        }
        fdks fdksVar = obj instanceof fdks ? (fdks) obj : null;
        if (fdksVar != null) {
            fdksVar.hz();
        }
    }
}
