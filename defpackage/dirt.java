package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirt implements fdau {
    final /* synthetic */ djrr a;
    final /* synthetic */ dirz b;
    final /* synthetic */ String c;

    public dirt(djrr djrrVar, dirz dirzVar, String str) {
        this.a = djrrVar;
        this.b = dirzVar;
        this.c = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            inz inzVarB = djrs.b(this.a, hmlVar);
            dirz dirzVar = this.b;
            hmlVar.v(-1497247473);
            long j = dirzVar.a == 1 ? ((ije) hmlVar.e(gea.a)).i : ije.a;
            hmlVar.o();
            dtfn.a(inzVarB, this.c, efy.j(egq.c(efy.d(ics.e, 4.0f), 1.0f), 0.0f, 0.0f, 0.0f, 1.0f, 7), j, hmlVar, 384, 0);
        }
        return fctx.a;
    }
}
