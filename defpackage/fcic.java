package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcic implements Runnable {
    final /* synthetic */ fcil a;

    public fcic(fcil fcilVar) {
        this.a = fcilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcil fcilVar = this.a;
        fcilVar.l = null;
        if (fcilVar.i.e()) {
            fcilVar.c();
        }
    }
}
