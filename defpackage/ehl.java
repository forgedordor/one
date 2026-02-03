package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehl implements fdau {
    final /* synthetic */ ehc a;

    public ehl(ehc ehcVar) {
        this.a = ehcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-1415685722);
        ehc ehcVar = this.a;
        boolean zD = hmlVar.D(ehcVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new efi(ehcVar);
            hmlVar.y(objF);
        }
        efi efiVar = (efi) objF;
        hmlVar.o();
        return efiVar;
    }
}
