package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckh implements Runnable {
    final /* synthetic */ fcjz a;
    final /* synthetic */ fckn b;
    final /* synthetic */ fckm c;

    public fckh(fckm fckmVar, fcjz fcjzVar, fckn fcknVar) {
        this.a = fcjzVar;
        this.b = fcknVar;
        this.c = fckmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcjz fcjzVar = this.a;
        synchronized (fcjzVar.a) {
            if (fcjzVar.c) {
                return;
            }
            fcjzVar.a();
            fckm fckmVar = this.c;
            fckmVar.b.k.execute(new fckg(this, this.b));
        }
    }
}
