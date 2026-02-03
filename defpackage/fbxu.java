package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxu implements Runnable {
    final fbxs a;
    final /* synthetic */ String b;
    final /* synthetic */ fbrg c;
    final /* synthetic */ fbrk d;
    final /* synthetic */ fcmm e;
    final /* synthetic */ fbnc f;
    final /* synthetic */ fbxv g;

    public fbxu(fbxv fbxvVar, String str, fbrg fbrgVar, fbrk fbrkVar, fcmm fcmmVar, fbnc fbncVar) {
        this.b = str;
        this.c = fbrgVar;
        this.d = fbrkVar;
        this.e = fcmmVar;
        this.f = fbncVar;
        this.g = fbxvVar;
        this.a = new fbxs(str, fbxvVar.a, fbxvVar.e, fbrgVar, fbxvVar, this, fbxvVar.c, fbxvVar.f, fbrkVar, fcmmVar, fbncVar, fbxvVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        fbxv fbxvVar = this.g;
        synchronized (fbxvVar.c) {
            if (fbxvVar.j) {
                this.a.o.j(fbxvVar.k, true, new fbrg());
            } else {
                if (!fbxvVar.l) {
                    throw new AssertionError("Transport is not started");
                }
                fbxs fbxsVar = this.a;
                fbxvVar.d.add(fbxsVar);
                fbxsVar.o.h.p = fbxvVar.i;
            }
        }
    }
}
