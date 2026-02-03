package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfd implements Runnable {
    final /* synthetic */ qjn a;
    final /* synthetic */ qfe b;

    public qfd(qfe qfeVar, qjn qjnVar) {
        this.b = qfeVar;
        this.a = qjnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qjn qjnVar = this.a;
        qas.c().a(qfe.a, "Scheduling work ".concat(qjnVar.c));
        this.b.b.c(qjnVar);
    }
}
