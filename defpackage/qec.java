package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qec {
    public final qcu a;
    private final qmg b;

    public qec(qcu qcuVar, qmg qmgVar) {
        qcuVar.getClass();
        qmgVar.getClass();
        this.a = qcuVar;
        this.b = qmgVar;
    }

    public final /* synthetic */ void a(qda qdaVar) {
        b(qdaVar, null);
    }

    public final void b(final qda qdaVar, final qcd qcdVar) {
        this.b.a(new Runnable() { // from class: qeb
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.a.g(qdaVar, qcdVar);
            }
        });
    }

    public final void c(qda qdaVar, int i) {
        this.b.a(new qlu(this.a, qdaVar, false, i));
    }
}
