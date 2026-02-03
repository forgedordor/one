package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fgex implements Runnable {
    public final /* synthetic */ fgfw a;
    public final /* synthetic */ fgfx b;

    public /* synthetic */ fgex(fgfw fgfwVar, fgfx fgfxVar) {
        this.a = fgfwVar;
        this.b = fgfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a();
        } catch (Throwable th) {
            this.a.c(th);
        }
    }
}
