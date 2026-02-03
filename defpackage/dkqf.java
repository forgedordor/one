package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkqf implements fdau {
    final /* synthetic */ dkpe a;

    public dkqf(dkpe dkpeVar) {
        this.a = dkpeVar;
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
            long jEs = ((kio) hmlVar.e(jmh.e)).es(edkVar.d() * 0.6666f);
            dthx.b(String.valueOf(this.a.b), dihi.c(edkVar.a(ics.e, ibw.e)), glz.a(hmlVar).v, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVar).f, 0L, jEs, null, null, null, null, 0L, null, 0, 0, jEs, null, null, 0, 16646141), hmlVar, 0, 0, 65528);
        }
        return fctx.a;
    }
}
