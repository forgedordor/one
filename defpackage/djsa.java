package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djsa implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ qrn b;
    final /* synthetic */ boolean c;
    final /* synthetic */ djsq d;
    final /* synthetic */ hox e;
    final /* synthetic */ int f;
    final /* synthetic */ hox g;

    public djsa(ics icsVar, qrn qrnVar, boolean z, djsq djsqVar, hox hoxVar, int i, hox hoxVar2) {
        this.a = icsVar;
        this.b = qrnVar;
        this.c = z;
        this.d = djsqVar;
        this.e = hoxVar;
        this.f = i;
        this.g = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarA = joj.a(ecs.a(this.a, 1.0f, false), "LottieAnimation");
            qrn qrnVar = this.b;
            boolean z = false;
            if ((qrnVar == null ? this.c : djsd.a(this.g)) && !fdgn.G(this.d.a, "unit_test", false)) {
                z = true;
            }
            qrj.c((qnm) this.e.a(), icsVarA, z, false, qrnVar, 0.0f, this.f, 0, null, null, null, false, hmlVar, 0, 0, 262048);
        }
        return fctx.a;
    }
}
