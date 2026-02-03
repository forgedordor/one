package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eilg implements defb {
    final /* synthetic */ kog a;

    public eilg(kog kogVar) {
        this.a = kogVar;
    }

    @Override // defpackage.defb
    public final void a(defn defnVar) {
        if (defnVar.m()) {
            this.a.b(defnVar.i());
        } else if (defnVar.h() != null) {
            this.a.c(defnVar.h());
        } else {
            this.a.c(new Exception("Task failed with unknown result"));
        }
    }
}
