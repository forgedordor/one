package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eezo implements Runnable {
    public final defr d;

    public eezo() {
        this.d = null;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        defr defrVar = this.d;
        if (defrVar != null) {
            defrVar.c(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }

    public eezo(defr defrVar) {
        this.d = defrVar;
    }
}
