package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtju extends kam {
    public final dtjp c;
    public final kcc d;
    public final int e;
    public final dtjr f;
    public final dtjq g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtju(dtjp dtjpVar, kcc kccVar, dtjr dtjrVar, dtjq dtjqVar) {
        super(2, dtka.a, dtjrVar.a);
        kccVar.getClass();
        this.c = dtjpVar;
        this.d = kccVar;
        this.e = 0;
        this.f = dtjrVar;
        this.g = dtjqVar;
        this.h = "name=Google Sans&weight=" + dtjqVar.a.i + "&italic=" + (kbw.b(0, 1) ? 1 : 0);
    }

    @Override // defpackage.kbh
    public final kcc b() {
        return this.d;
    }

    @Override // defpackage.kbh
    public final void c() {
    }
}
