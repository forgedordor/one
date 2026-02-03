package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deer implements Runnable {
    final /* synthetic */ defn a;
    final /* synthetic */ dees b;

    public deer(dees deesVar, defn defnVar) {
        this.a = defnVar;
        this.b = deesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defn defnVar = this.a;
        if (((defv) defnVar).d) {
            this.b.b.x();
            return;
        }
        try {
            this.b.b.v(this.b.a.a(defnVar));
        } catch (defl e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.u(e);
                return;
            }
            dees deesVar = this.b;
            deesVar.b.u((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.u(e2);
        }
    }
}
