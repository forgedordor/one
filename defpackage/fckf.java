package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckf implements Runnable {
    final /* synthetic */ fbrg a;
    final /* synthetic */ fckm b;

    public fckf(fckm fckmVar, fbrg fbrgVar) {
        this.a = fbrgVar;
        this.b = fckmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.C.c(this.a);
    }
}
