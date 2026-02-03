package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkyz implements fdau {
    final /* synthetic */ fdau a;

    public dkyz(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(Float.valueOf(edkVar.d()), hmlVar, 0);
        }
        return fctx.a;
    }
}
