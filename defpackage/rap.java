package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rap extends qzo {
    private final Object m;
    private qzt n;

    static {
        String.format("application/json; charset=%s", "utf-8");
    }

    public rap(String str, qzt qztVar, qzs qzsVar) {
        super(str, qzsVar);
        this.m = new Object();
        this.n = qztVar;
    }

    @Override // defpackage.qzo
    public final void e() {
        super.e();
        synchronized (this.m) {
            this.n = null;
        }
    }

    @Override // defpackage.qzo
    protected final void f(Object obj) {
        qzt qztVar;
        synchronized (this.m) {
            qztVar = this.n;
        }
        if (qztVar != null) {
            qztVar.a(obj);
        }
    }
}
