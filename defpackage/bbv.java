package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbv extends bhr {
    final /* synthetic */ bbw a;

    public bbv(bbw bbwVar) {
        this.a = bbwVar;
    }

    @Override // defpackage.bhr
    public final void b(int i, bib bibVar) {
        bbw bbwVar = this.a;
        synchronized (bbwVar.a) {
            if (bbwVar.d) {
                return;
            }
            bbwVar.f.put(bibVar.a(), new bqv(bibVar));
            bbwVar.m();
        }
    }
}
