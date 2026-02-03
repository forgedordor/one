package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jep extends fdbr implements fdae {
    final /* synthetic */ jer a;
    final /* synthetic */ icr b;
    final /* synthetic */ jel c;
    final /* synthetic */ long d;
    final /* synthetic */ jbu e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ float h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jep(jer jerVar, icr icrVar, jel jelVar, long j, jbu jbuVar, int i, boolean z, float f, boolean z2) {
        super(0);
        this.a = jerVar;
        this.b = icrVar;
        this.c = jelVar;
        this.d = j;
        this.e = jbuVar;
        this.f = i;
        this.g = z;
        this.h = f;
        this.i = z2;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        icr icrVar = this.b;
        jel jelVar = this.c;
        this.a.au(jes.a(icrVar, jelVar.a()), jelVar, this.d, this.e, this.f, this.g, this.h, this.i);
        return fctx.a;
    }
}
