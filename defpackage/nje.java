package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nje implements Runnable {
    private final njd a;

    public nje(njd njdVar) {
        this.a = njdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nfq nfqVar = (nfq) this.a;
        for (ngb ngbVar : nfqVar.m) {
            ngbVar.l(true);
            ngbVar.j();
        }
        ndg ndgVar = (ndg) nfqVar.g;
        nnr nnrVar = ndgVar.a;
        if (nnrVar != null) {
            nnrVar.d();
            ndgVar.a = null;
        }
        ndgVar.b = null;
    }
}
