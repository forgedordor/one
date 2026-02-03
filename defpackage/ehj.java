package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehj implements fdau {
    final /* synthetic */ ehc a;

    public ehj(ehc ehcVar) {
        this.a = ehcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(788931215);
        ehc ehcVar = this.a;
        boolean zD = hmlVar.D(ehcVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new egx(ehcVar);
            hmlVar.y(objF);
        }
        egx egxVar = (egx) objF;
        hmlVar.o();
        return egxVar;
    }
}
