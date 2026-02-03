package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqfi implements fdau {
    final /* synthetic */ inz a;
    final /* synthetic */ String b;
    final /* synthetic */ float c;
    final /* synthetic */ String d;

    public dqfi(inz inzVar, String str, float f, String str2) {
        this.a = inzVar;
        this.b = str;
        this.c = f;
        this.d = str2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            inz inzVar = this.a;
            String str = this.b;
            float f = this.c;
            ico icoVar = ics.e;
            gkd.a(inzVar, str, egq.k(icoVar, f), 0L, hmlVar, 0, 8);
            String str2 = this.d;
            if (str2 != null) {
                gyj.c(str2, efy.j(icoVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hmlVar, 48, 24960, 241660);
            }
        }
        return fctx.a;
    }
}
