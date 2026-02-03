package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mja implements miu {
    public final mix[] a;
    public int b;
    private final Thread c;
    private final miy[] g;
    private int h;
    private mix i;
    private miv j;
    private boolean k;
    private boolean l;
    private int m;
    private final Object d = new Object();
    private long n = -9223372036854775807L;
    private final ArrayDeque e = new ArrayDeque();
    private final ArrayDeque f = new ArrayDeque();

    protected mja(mix[] mixVarArr, miy[] miyVarArr) {
        this.a = mixVarArr;
        this.b = mixVarArr.length;
        for (int i = 0; i < this.b; i++) {
            this.a[i] = i();
        }
        this.g = miyVarArr;
        this.h = miyVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.g[i2] = k();
        }
        miz mizVar = new miz(this);
        this.c = mizVar;
        mizVar.start();
    }

    private final void p() {
        if (s()) {
            this.d.notify();
        }
    }

    private final void r(mix mixVar) {
        mixVar.eP();
        int i = this.b;
        this.b = i + 1;
        this.a[i] = mixVar;
    }

    private final boolean s() {
        return !this.e.isEmpty() && this.h > 0;
    }

    private final void t() throws miv {
        miv mivVar = this.j;
        if (mivVar != null) {
            throw mivVar;
        }
    }

    @Override // defpackage.miu
    public final void c() {
        synchronized (this.d) {
            this.k = true;
            this.m = 0;
            mix mixVar = this.i;
            if (mixVar != null) {
                r(mixVar);
                this.i = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.e;
                if (arrayDeque.isEmpty()) {
                    break;
                } else {
                    r((mix) arrayDeque.removeFirst());
                }
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.f;
                if (!arrayDeque2.isEmpty()) {
                    ((miy) arrayDeque2.removeFirst()).h();
                }
            }
        }
    }

    @Override // defpackage.miu
    public final void e() throws InterruptedException {
        Object obj = this.d;
        synchronized (obj) {
            this.l = true;
            obj.notify();
        }
        try {
            this.c.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.miu
    public final void f(long j) {
        synchronized (this.d) {
            boolean z = true;
            if (this.b != this.a.length && !this.k) {
                z = false;
            }
            mee.c(z);
            this.n = j;
        }
    }

    protected abstract miv g(Throwable th);

    protected abstract miv h(mix mixVar, miy miyVar, boolean z);

    protected abstract mix i();

    @Override // defpackage.miu
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final mix a() {
        mix mixVar;
        synchronized (this.d) {
            t();
            mee.c(this.i == null);
            int i = this.b;
            if (i == 0) {
                mixVar = null;
            } else {
                mix[] mixVarArr = this.a;
                int i2 = i - 1;
                this.b = i2;
                mixVar = mixVarArr[i2];
            }
            this.i = mixVar;
        }
        return mixVar;
    }

    protected abstract miy k();

    @Override // defpackage.miu
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final miy b() {
        synchronized (this.d) {
            t();
            ArrayDeque arrayDeque = this.f;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            return (miy) arrayDeque.removeFirst();
        }
    }

    @Override // defpackage.miu
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void d(mix mixVar) {
        synchronized (this.d) {
            t();
            mee.a(mixVar == this.i);
            this.e.addLast(mixVar);
            p();
            this.i = null;
        }
    }

    public final void n(miy miyVar) {
        synchronized (this.d) {
            miyVar.eP();
            miy[] miyVarArr = this.g;
            int i = this.h;
            this.h = i + 1;
            miyVarArr[i] = miyVar;
            p();
        }
    }

    public final boolean o() {
        boolean z;
        miv mivVarG;
        Object obj = this.d;
        synchronized (obj) {
            while (!this.l && !s()) {
                obj.wait();
            }
            if (this.l) {
                return false;
            }
            mix mixVar = (mix) this.e.removeFirst();
            miy[] miyVarArr = this.g;
            int i = this.h - 1;
            this.h = i;
            miy miyVar = miyVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (mixVar.eS()) {
                miyVar.eQ(4);
            } else {
                miyVar.b = mixVar.f;
                if (mixVar.eR(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)) {
                    miyVar.eQ(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                }
                long j = mixVar.f;
                synchronized (obj) {
                    long j2 = this.n;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    miyVar.d = true;
                }
                try {
                    mivVarG = h(mixVar, miyVar, z2);
                } catch (OutOfMemoryError e) {
                    mivVarG = g(e);
                } catch (RuntimeException e2) {
                    mivVarG = g(e2);
                }
                if (mivVarG != null) {
                    synchronized (this.d) {
                        this.j = mivVarG;
                    }
                    return false;
                }
            }
            synchronized (this.d) {
                if (this.k) {
                    miyVar.h();
                } else if (miyVar.d) {
                    this.m++;
                    miyVar.h();
                } else {
                    miyVar.c = this.m;
                    this.m = 0;
                    this.f.addLast(miyVar);
                }
                r(mixVar);
            }
            return true;
        }
    }
}
