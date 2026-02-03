package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcje implements Runnable {
    final /* synthetic */ fcjf a;

    public fcje(fcjf fcjfVar) {
        this.a = fcjfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcjf fcjfVar = this.a;
        fcjfVar.b.execute(new fcjd(fcjfVar));
    }
}
