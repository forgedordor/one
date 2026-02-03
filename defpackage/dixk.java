package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dixk implements fdau {
    final /* synthetic */ dixn a;
    final /* synthetic */ dsd b;

    public dixk(dixn dixnVar, dsd dsdVar) {
        this.a = dixnVar;
        this.b = dsdVar;
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
            dixm.d(edeVar, this.a.a, hmlVar, iIntValue & 14);
            dixm.c(this.b, hmlVar, 6);
        }
        return fctx.a;
    }
}
