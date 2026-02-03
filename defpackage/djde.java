package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djde implements fdau {
    final /* synthetic */ ije a;
    final /* synthetic */ djdh b;
    final /* synthetic */ ije c;
    final /* synthetic */ boolean d;

    public djde(ije ijeVar, djdh djdhVar, ije ijeVar2, boolean z) {
        this.a = ijeVar;
        this.b = djdhVar;
        this.c = ijeVar2;
        this.d = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ije ijeVar = this.a;
            djdh djdhVar = this.b;
            djdg.c(ijeVar, djdhVar.c, hxe.d(786407611, new djdd(djdhVar, this.c, this.d), hmlVar), hmlVar, 384);
        }
        return fctx.a;
    }
}
