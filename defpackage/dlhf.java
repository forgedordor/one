package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlhf implements fdat {
    final /* synthetic */ dlhm a;
    final /* synthetic */ ddp b;

    public dlhf(dlhm dlhmVar, ddp ddpVar) {
        this.a = dlhmVar;
        this.b = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlig.c(this.a, ((ije) this.b.d()).i, hmlVar, 0);
        }
        return fctx.a;
    }
}
