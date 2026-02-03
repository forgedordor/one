package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aca implements lvh, aap {
    final /* synthetic */ ace a;
    private final lvc b;
    private final abs c;
    private aap d;

    public aca(ace aceVar, lvc lvcVar, abs absVar) {
        lvcVar.getClass();
        this.a = aceVar;
        this.b = lvcVar;
        this.c = absVar;
        lvcVar.c(this);
    }

    @Override // defpackage.aap
    public final void b() {
        this.b.d(this);
        this.c.g(this);
        aap aapVar = this.d;
        if (aapVar != null) {
            aapVar.b();
        }
        this.d = null;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar == lva.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (lvaVar != lva.ON_STOP) {
            if (lvaVar == lva.ON_DESTROY) {
                b();
            }
        } else {
            aap aapVar = this.d;
            if (aapVar != null) {
                aapVar.b();
            }
        }
    }
}
