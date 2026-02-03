package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlcc implements fdau {
    final /* synthetic */ dlcn a;

    public dlcc(dlcn dlcnVar) {
        this.a = dlcnVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlcm.d(hmlVar, 0);
            dlco dlcoVar = this.a.a;
            dlcm.h(dlcoVar.a, dlcoVar.c, dlcoVar.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
