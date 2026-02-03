package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzvr {
    private final fcsu b;
    private final diep c;
    private final Object a = new Object();
    private int d = 0;
    private long e = 0;

    public dzvr(fcsu fcsuVar, diep diepVar) {
        this.b = fcsuVar;
        this.c = diepVar;
    }

    public final void a() {
        Object obj = this.a;
        long jA = this.c.a();
        synchronized (obj) {
            this.d++;
            if (jA - this.e > 1000) {
                this.d = 0;
                this.e = jA;
            }
        }
    }

    public final boolean b() {
        int iIntValue = ((Integer) this.b.b()).intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (iIntValue == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (this.d < iIntValue) {
                return false;
            }
            return this.c.a() - this.e <= 1000;
        }
    }
}
