package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class lac {
    public boolean a;
    public boolean b;
    public plz c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            plz plzVar = this.c;
            if (plzVar != null) {
                try {
                    plzVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
