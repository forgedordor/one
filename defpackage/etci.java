package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etci extends esyv {
    final /* synthetic */ esyv a;
    final /* synthetic */ Class b;

    public etci(esyv esyvVar, Class cls) {
        this.a = esyvVar;
        this.b = cls;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) {
        Object objA = this.a.a(etdbVar);
        if (objA != null) {
            Class cls = this.b;
            if (!cls.isInstance(objA)) {
                Class<?> cls2 = objA.getClass();
                throw new esyr("Expected a " + cls.getName() + " but was " + cls2.getName() + "; at path " + etdbVar.f());
            }
        }
        return objA;
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) {
        this.a.b(etddVar, obj);
    }
}
