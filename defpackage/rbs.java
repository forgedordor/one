package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rbs implements Runnable {
    final /* synthetic */ rbv a;

    public rbs(rbv rbvVar) {
        this.a = rbvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rbv rbvVar = this.a;
        rbvVar.c.a(rbvVar);
    }
}
