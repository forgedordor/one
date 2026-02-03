package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdk implements bpu {
    final /* synthetic */ Runnable a;

    public bdk(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.run();
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
    }
}
