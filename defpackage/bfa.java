package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfa extends bhr {
    final /* synthetic */ bfe a;

    public bfa(bfe bfeVar) {
        this.a = bfeVar;
    }

    @Override // defpackage.bhr
    public final void d(int i) {
        bpn.a().execute(new Runnable() { // from class: bez
            @Override // java.lang.Runnable
            public final void run() {
                bgb bgbVar = this.a.a.a;
                if (bgbVar != null) {
                    bgbVar.l.e();
                }
            }
        });
    }
}
