package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbzh implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fbzi b;

    public fbzh(fbzi fbziVar, int i) {
        this.a = i;
        this.b = fbziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = fcsr.a;
            fcbg fcbgVar = this.b.o;
            int i2 = this.a;
            ejwl.b(i2 > 0, "numMessages must be > 0");
            if (((fchq) fcbgVar).b()) {
                return;
            }
            ((fchq) fcbgVar).e += i2;
            ((fchq) fcbgVar).a();
        } catch (Throwable th) {
            this.b.b(th);
        }
    }
}
