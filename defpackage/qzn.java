package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzn implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ qzo c;

    public qzn(qzo qzoVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = qzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qzo qzoVar = this.c;
        qzz qzzVar = qzoVar.a;
        qzzVar.a(this.a, this.b);
        qzzVar.b(qzoVar.toString());
    }
}
