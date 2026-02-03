package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jf implements Runnable {
    final /* synthetic */ jz a;

    public jf(jz jzVar) {
        this.a = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz jzVar = this.a;
        if ((jzVar.K & 1) != 0) {
            jzVar.D(0);
        }
        if ((jzVar.K & 4096) != 0) {
            jzVar.D(108);
        }
        jzVar.J = false;
        jzVar.K = 0;
    }
}
