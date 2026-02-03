package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbm implements ehay {
    private final ehay a;
    private ehcl b = null;

    public ehbm(ehay ehayVar) {
        this.a = ehayVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ecem.c();
        ehcl ehclVar = this.b;
        ehau ehauVar = new ehau(th);
        this.b = ehauVar;
        if (ehauVar.equals(ehclVar)) {
            return;
        }
        this.a.a(th);
    }

    @Override // defpackage.ehay
    public final void b(Object obj) {
        ecem.c();
        ehcl ehclVar = this.b;
        ehav ehavVar = new ehav(obj);
        this.b = ehavVar;
        if (ehavVar.equals(ehclVar)) {
            return;
        }
        this.a.b(obj);
    }
}
