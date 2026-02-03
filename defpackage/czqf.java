package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqf extends abs {
    private final iy a;
    private final Runnable d;

    public czqf(iy iyVar, Runnable runnable) {
        super(true);
        this.a = iyVar;
        this.d = runnable;
        iyVar.c().b(iyVar, this);
    }

    @Override // defpackage.abs
    public final void b() {
        this.d.run();
        h(false);
        this.a.c().d();
    }
}
