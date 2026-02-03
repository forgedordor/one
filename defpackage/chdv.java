package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdv implements cgxv {
    final /* synthetic */ fcsu a;
    private final fddy b;
    private final cgzk c;
    private final chhp d;
    private final chai e;
    private final cgyh f;

    public chdv(cgyh cgyhVar, cgzk cgzkVar, chhp chhpVar, chai chaiVar, fcsu fcsuVar) {
        this.a = fcsuVar;
        int i = fdcj.a;
        this.b = new fdbi(chdq.class);
        this.f = cgyhVar;
        this.c = cgzkVar;
        this.d = chhpVar;
        this.e = chaiVar;
    }

    @Override // defpackage.cgxv
    public final cgxk a() {
        return new cgxo(new cgxm("Configurator"), fcva.b(this.a.b()));
    }

    @Override // defpackage.cgxv
    public final cgzk b() {
        return this.c;
    }

    @Override // defpackage.cgxv
    public final cgzu c() {
        return new chds();
    }

    @Override // defpackage.cgxv
    public final chai d() {
        return this.e;
    }

    @Override // defpackage.cgxv
    public final chhp e() {
        return this.d;
    }

    @Override // defpackage.cgxv
    public final fddy f() {
        return this.b;
    }

    @Override // defpackage.cgxv
    public final cgyh g() {
        return this.f;
    }
}
