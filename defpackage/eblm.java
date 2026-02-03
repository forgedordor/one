package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblm {
    public ebqq a;
    public final String c;
    public final eblu d;
    private ebll h;
    public ebqq b = null;
    public long e = System.currentTimeMillis();
    private boolean g = false;
    public long f = 60000;

    public eblm(String str, ebqq ebqqVar, eblu ebluVar) {
        this.a = null;
        this.c = str;
        this.a = ebqqVar;
        this.d = ebluVar;
    }

    public static String j(ebpc ebpcVar) {
        ebnn ebnnVar = ebpcVar.g;
        if (ebnnVar == null) {
            return null;
        }
        return ebpcVar.v(ebnnVar.e(), 2);
    }

    public final int a() {
        ebqs ebqsVar;
        if (!g() || (ebqsVar = (ebqs) this.b) == null) {
            return -1;
        }
        return ebqsVar.y();
    }

    public final ebqs b() {
        if (g()) {
            return (ebqs) this.b;
        }
        return null;
    }

    public final String c() {
        ebqs ebqsVarB = b();
        if (ebqsVarB != null) {
            return ebqsVarB.A();
        }
        ebll ebllVar = this.h;
        if (ebllVar == null) {
            return null;
        }
        return ebllVar.c;
    }

    public final void d(ebll ebllVar) {
        synchronized (this) {
            this.g = true;
            this.h = ebllVar;
            notifyAll();
        }
        eblu ebluVar = this.d;
        if (ebluVar != null) {
            ebluVar.a(this);
        }
    }

    public final void e(ebqq ebqqVar) {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.b = ebqqVar;
            notify();
            eblu ebluVar = this.d;
            if (ebluVar != null) {
                ebluVar.b(this);
            }
        }
    }

    public final boolean f() {
        ebqq ebqqVar = this.b;
        return ebqqVar != null && ((ebqr) ebqqVar).z().equals("ACK");
    }

    public final boolean g() {
        ebqq ebqqVar = this.b;
        if (ebqqVar != null) {
            return ebqqVar.x();
        }
        return false;
    }

    public final int h(int i) {
        return i(0, i);
    }

    public final int i(int i, int i2) {
        if (i <= 0) {
            i = i2;
        }
        this.f = i * 1000;
        try {
            if (this.b != null) {
                return 1;
            }
            synchronized (this) {
                if (this.g) {
                    this.b = null;
                    return 3;
                }
                wait(this.f);
                if (this.g) {
                    this.b = null;
                    return 3;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.e > this.f) {
                    return 1;
                }
                this.e = jCurrentTimeMillis;
                return i(0, i2);
            }
        } catch (InterruptedException unused) {
            this.b = null;
            return 2;
        }
    }
}
