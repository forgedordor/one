package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kif implements fdat {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public kif(Object[] objArr, String str, String str2) {
        this.a = objArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new hph(0);
                hmlVar.y(objF);
            }
            Object[] objArr = this.a;
            hri hriVar = (hri) objF;
            fst.a(null, null, null, null, null, hxe.d(958604965, new kid(objArr, hriVar), hmlVar), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hxe.d(57310875, new kie(this.b, this.c, objArr, hriVar), hmlVar), hmlVar, 196608, 12582912, 131039);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
