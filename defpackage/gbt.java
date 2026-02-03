package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbt implements fdau {
    final /* synthetic */ dew a;

    public gbt(dew dewVar) {
        this.a = dewVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dhe dheVar = (dhe) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(630790831);
        Object objA = dheVar.a();
        jue jueVar = jue.b;
        Object dggVar = objA == jueVar ? new dgg(0) : dheVar.b() == jueVar ? new dgg(100) : this.a;
        hmlVar.o();
        return dggVar;
    }
}
