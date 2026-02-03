package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimt implements fdat {
    final /* synthetic */ long a;

    public dimt(long j) {
        this.a = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
            hmlVar.v(-457783803);
            ind indVar = new ind(((kio) hmlVar.e(jmh.e)).en(2.0f), 0.0f, 1, 0, 26);
            ics icsVarH = egq.h(ics.e, 18.0f);
            long j = this.a;
            dtio.a(icsVarH, j, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.2f, ije.f(j)), indVar, indVar, 0.0f, 0.0f, 0.0f, 0.0f, hmlVar, 6);
            hmlVar.o();
        } else {
            hmlVar.v(-457363226);
            dtgm.a(egq.h(ics.e, 18.0f), this.a, 2.0f, 0L, 0, 0.0f, hmlVar, 390, 56);
            hmlVar.o();
        }
        return fctx.a;
    }
}
