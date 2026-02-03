package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgvh {
    public Throwable c;
    protected int d;
    protected int e;
    private Thread f;
    public volatile dgws a = dgws.INITIAL;
    public final Object b = new Object();
    private final Runnable g = new dgvg(this);

    static int a(dezf dezfVar) {
        int iOrdinal = dezfVar.ordinal();
        if (iOrdinal == 21) {
            return 50;
        }
        if (iOrdinal == 22) {
            return 51;
        }
        switch (iOrdinal) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 47;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 2;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            default:
                return 18;
        }
    }

    protected abstract void c();

    protected abstract void d();

    protected abstract void e();

    protected abstract void f();

    protected abstract void g(Throwable th);

    protected final void h(int i) {
        if (this.d == 0) {
            this.d = i;
        }
    }

    protected final void i(int i) {
        if (this.e == 0) {
            this.e = i;
        }
    }

    public final synchronized void j() {
        dhja.c("Starting session in state [%s]", this.a);
        if (this.a.ordinal() == 0) {
            this.a = dgws.STARTING;
            k();
        } else {
            Object obj = this.b;
            synchronized (obj) {
                obj.notify();
            }
        }
    }

    protected final synchronized void k() {
        Thread thread = new Thread(this.g);
        this.f = thread;
        thread.start();
    }

    public final synchronized void l() {
        m(null);
    }

    public final synchronized void m(Throwable th) {
        dhja.c("Stopping session in state [%s] error [%s]", this.a, th);
        if (this.c == null) {
            this.c = th;
        }
        if (this.f == null) {
            dhja.c("Session thread is null, starting session thread.", new Object[0]);
            k();
        }
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            this.a = dgws.STOPPING;
            if (this.f != null) {
                dhja.k("Interrupting session thread.", new Object[0]);
                this.f.interrupt();
            }
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            return;
        }
        Object obj = this.b;
        synchronized (obj) {
            obj.notify();
        }
    }

    public final synchronized void n(int i, int i2) {
        this.d = i;
        this.e = i2;
        l();
    }

    public final synchronized void o(Throwable th, int i, int i2) {
        this.d = i;
        this.e = i2;
        m(th);
    }

    public final void p() {
        try {
            dhja.c("On stopped", new Object[0]);
            if (this.c == null) {
                e();
            } else {
                r();
            }
        } catch (Exception e) {
            dhja.i(e, "Error while calling stopped: %s", e.getMessage());
        }
    }

    public final synchronized boolean q() {
        if (this.a != dgws.STOPPING) {
            if (this.a != dgws.STOPPED) {
                return false;
            }
        }
        return true;
    }

    protected abstract void r();

    public String toString() {
        return " State: " + String.valueOf(this.a) + "\r\n Error: " + String.valueOf(this.c);
    }

    protected void b() {
    }
}
