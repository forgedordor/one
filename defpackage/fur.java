package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fur implements fdat {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ fdat c;
    final /* synthetic */ boolean d;
    final /* synthetic */ long e;

    public fur(float f, long j, fdat fdatVar, boolean z, long j2) {
        this.a = f;
        this.b = j;
        this.c = fdatVar;
        this.d = z;
        this.e = j2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            jyq jyqVarA = jyr.a(fqq.c(hmlVar).a, fqq.c(hmlVar).d, this.a);
            boolean z = this.d;
            long j = this.e;
            if (z) {
                jyqVarA = jyq.y(jyqVarA, j, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            }
            fuy.d(this.b, jyqVarA, this.c, hmlVar, 384, 0);
        }
        return fctx.a;
    }
}
