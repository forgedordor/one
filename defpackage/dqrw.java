package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqrw implements dqsp {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dqry b;

    public dqrw(dqry dqryVar, Runnable runnable) {
        this.a = runnable;
        this.b = dqryVar;
    }

    @Override // defpackage.dqsp
    public final Runnable a() {
        return this.a;
    }

    @Override // defpackage.dqsp
    public final boolean b() {
        return this.b.b;
    }
}
