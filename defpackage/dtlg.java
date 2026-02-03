package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtlg extends dtlh {
    protected final dtli a;
    protected final Runnable b = new dtlf(this);

    public dtlg(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // defpackage.dtlh
    public final void a(int i) {
        this.a.g(this.b);
    }

    @Override // defpackage.dtlh
    public final void b() {
        this.a.f(this.b);
    }
}
