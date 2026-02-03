package defpackage;

import defpackage.eooi;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eosh extends eooi.f implements Runnable {
    private final Runnable a;

    public eosh(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.eooi
    protected final String gu() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }
}
