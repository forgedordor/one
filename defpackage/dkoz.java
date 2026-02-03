package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkoz implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;
    final /* synthetic */ String e;

    public dkoz(djrr djrrVar, boolean z, boolean z2, long j, String str) {
        this.a = djrrVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkpa.c(this.a, this.b, this.c, this.d, this.e, hmlVar, 0);
        }
        return fctx.a;
    }
}
