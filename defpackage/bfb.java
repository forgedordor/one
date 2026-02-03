package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfb implements bpu {
    final /* synthetic */ bgb a;
    final /* synthetic */ bfe b;

    public bfb(bfe bfeVar, bgb bgbVar) {
        this.b = bfeVar;
        this.a = bgbVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        box.b();
        bgb bgbVar = this.a;
        bfe bfeVar = this.b;
        if (bgbVar == bfeVar.a) {
            bbs.f("CaptureNode", "request aborted, id=" + bfeVar.a.a);
            bfo bfoVar = bfeVar.g;
            if (bfoVar != null) {
                bfoVar.a = null;
            }
            bfeVar.a = null;
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
