package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acq implements hnx {
    final /* synthetic */ acm a;

    public acq(acm acmVar) {
        this.a = acmVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        adj adjVar = this.a.a;
        if (adjVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        adjVar.b();
    }
}
