package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xwp implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ ybf b;
    final /* synthetic */ dplu c;

    public xwp(boolean z, dplu dpluVar, ybf ybfVar) {
        this.a = z;
        this.c = dpluVar;
        this.b = ybfVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else if (this.a) {
            yam.l(edkVar, dpma.a(this.c, ics.e, hmlVar), this.b, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}
