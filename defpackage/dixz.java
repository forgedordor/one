package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dixz implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ hsf b;

    public dixz(String str, hsf hsfVar) {
        this.a = str;
        this.b = hsfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ede edeVar = (ede) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edeVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            diyj.c(edeVar, this.a, diyj.d(this.b), hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}
