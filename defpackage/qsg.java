package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsg implements qoh {
    final /* synthetic */ fdis a;

    public qsg(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // defpackage.qoh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        fdis fdisVar = this.a;
        Throwable th = (Throwable) obj;
        if (fdisVar.k()) {
            return;
        }
        th.getClass();
        fdisVar.w(fctl.a(th));
    }
}
