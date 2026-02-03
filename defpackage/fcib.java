package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcib implements Runnable {
    final /* synthetic */ fcil a;

    public fcib(fcil fcilVar) {
        this.a = fcilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcil fcilVar = this.a;
        fcilVar.p = null;
        fcilVar.i.c();
        fcilVar.c();
    }
}
