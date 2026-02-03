package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyeg implements fdau {
    final /* synthetic */ String a;

    public cyeg(String str) {
        this.a = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        egc egcVar = (egc) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egcVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egcVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fjm.b(null, hxe.d(-598016260, new cyef(this.a, egcVar), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
