package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgt implements Runnable, Comparable, rgm, rvq {
    private rfg A;
    private volatile boolean B;
    private boolean C;
    private int D;
    public rbc d;
    public res e;
    public rbh f;
    public rho g;
    public int h;
    public int i;
    public rha j;
    public rex k;
    public rgp l;
    public int m;
    public res n;
    public volatile rgn o;
    public volatile boolean p;
    public int q;
    public final rhf r;
    private final lcd u;
    private long v;
    private Thread w;
    private res x;
    private Object y;
    private reb z;
    public final rgo a = new rgo();
    private final List s = new ArrayList();
    private final rvu t = new rvt();
    public final rgq b = new rgq();
    public final rgr c = new rgr();

    public rgt(rhf rhfVar, lcd lcdVar) {
        this.r = rhfVar;
        this.u = lcdVar;
    }

    private final int g() {
        return this.f.ordinal();
    }

    private final rgn h() {
        int i = this.D;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new rhz(this.a, this);
        }
        if (i2 == 2) {
            rgo rgoVar = this.a;
            return new rgj(rgoVar.e(), rgoVar, this);
        }
        if (i2 == 3) {
            return new rie(this.a, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(rgs.a(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0255 A[Catch: all -> 0x0262, TRY_ENTER, TryCatch #0 {all -> 0x0262, blocks: (B:59:0x0170, B:64:0x018b, B:67:0x0197, B:69:0x019b, B:71:0x01c6, B:75:0x01e3, B:104:0x0255, B:105:0x0261, B:70:0x01bd, B:72:0x01d3, B:73:0x01e0, B:62:0x0185, B:89:0x0216, B:83:0x01f7, B:84:0x0206), top: B:188:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0231 A[EDGE_INSN: B:220:0x0231->B:96:0x0231 BREAK  A[LOOP:1: B:29:0x00c0->B:92:0x021c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021c A[LOOP:1: B:29:0x00c0->B:92:0x021c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0235 A[Catch: all -> 0x026f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x026f, blocks: (B:98:0x0235, B:110:0x0269, B:111:0x026e), top: B:202:0x00a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgt.i():void");
    }

    private final void j(String str, long j, String str2) {
        double dA = rvd.a(j);
        String strValueOf = String.valueOf(this.g);
        String strConcat = str2 != null ? ", ".concat(str2) : "";
        Log.v("DecodeJob", str + " in " + dA + ", load key: " + strValueOf + strConcat + ", thread: " + Thread.currentThread().getName());
    }

    private final void k() {
        m();
        rhs rhsVar = new rhs("Failed to load resource", new ArrayList(this.s));
        rgp rgpVar = this.l;
        synchronized (rgpVar) {
            ((rhm) rgpVar).j = rhsVar;
        }
        synchronized (rgpVar) {
            ((rhm) rgpVar).b.a();
            if (((rhm) rgpVar).m) {
                ((rhm) rgpVar).f();
            } else {
                rhl rhlVar = ((rhm) rgpVar).a;
                if (rhlVar.d()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (((rhm) rgpVar).k) {
                    throw new IllegalStateException("Already failed once");
                }
                ((rhm) rgpVar).k = true;
                res resVar = ((rhm) rgpVar).e;
                rhl rhlVarB = rhlVar.b();
                ((rhm) rgpVar).e(rhlVarB.a() + 1);
                rhm rhmVar = (rhm) rgpVar;
                rhmVar.d.c(rhmVar, resVar, null);
                Iterator<rhk> it = rhlVarB.iterator();
                while (it.hasNext()) {
                    rhk next = it.next();
                    next.b.execute(new rhi(rhmVar, next.a));
                }
                rhmVar.d();
            }
        }
        if (this.c.c()) {
            b();
        }
    }

    private final void l() {
        this.w = Thread.currentThread();
        int i = rvd.a;
        this.v = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.p && this.o != null && !(zB = this.o.b())) {
            this.D = e(this.D);
            this.o = h();
            if (this.D == 4) {
                f(2);
                return;
            }
        }
        if ((this.D == 6 || this.p) && !zB) {
            k();
        }
    }

    private final void m() {
        this.t.a();
        if (this.B) {
            List list = this.s;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.B = true;
    }

    public final void b() {
        this.c.a();
        rgq rgqVar = this.b;
        rgqVar.a = null;
        rgqVar.b = null;
        rgqVar.c = null;
        rgo rgoVar = this.a;
        rgoVar.c = null;
        rgoVar.d = null;
        rgoVar.m = null;
        rgoVar.g = null;
        rgoVar.j = null;
        rgoVar.h = null;
        rgoVar.n = null;
        rgoVar.i = null;
        rgoVar.o = null;
        rgoVar.a.clear();
        rgoVar.k = false;
        rgoVar.b.clear();
        rgoVar.l = false;
        this.B = false;
        this.d = null;
        this.e = null;
        this.k = null;
        this.f = null;
        this.g = null;
        this.l = null;
        this.D = 0;
        this.o = null;
        this.w = null;
        this.n = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.v = 0L;
        this.p = false;
        this.s.clear();
        this.u.b(this);
    }

    @Override // defpackage.rgm
    public final void c(res resVar, Exception exc, rfg rfgVar, reb rebVar) {
        rfgVar.e();
        rhs rhsVar = new rhs("Fetching data failed", Collections.singletonList(exc));
        rhsVar.b(resVar, rebVar, rfgVar.a());
        this.s.add(rhsVar);
        if (Thread.currentThread() != this.w) {
            f(2);
        } else {
            l();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        rgt rgtVar = (rgt) obj;
        int iG = g() - rgtVar.g();
        return iG == 0 ? this.m - rgtVar.m : iG;
    }

    @Override // defpackage.rgm
    public final void d(res resVar, Object obj, rfg rfgVar, reb rebVar, res resVar2) throws Throwable {
        this.n = resVar;
        this.y = obj;
        this.A = rfgVar;
        this.z = rebVar;
        this.x = resVar2;
        this.C = resVar != this.a.e().get(0);
        if (Thread.currentThread() == this.w) {
            i();
        } else {
            f(3);
        }
    }

    public final int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.j.b()) {
                return 2;
            }
            return e(2);
        }
        if (i2 == 1) {
            if (this.j.a()) {
                return 3;
            }
            return e(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(rgs.a(i)));
    }

    @Override // defpackage.rvq
    public final rvu eY() {
        return this.t;
    }

    public final void f(int i) {
        this.q = i;
        ((rhm) this.l).b().execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        rfg rfgVar = this.A;
        try {
            try {
                if (this.p) {
                    k();
                } else {
                    int i = this.q;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        this.D = e(1);
                        this.o = h();
                        l();
                    } else if (i2 == 1) {
                        l();
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                        }
                        i();
                    }
                }
            } finally {
                if (rfgVar != null) {
                    rfgVar.e();
                }
            }
        } catch (rgi e) {
            throw e;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.p + ", stage: " + rgs.a(this.D), th);
            }
            if (this.D != 5) {
                this.s.add(th);
                k();
            }
            if (!this.p) {
                throw th;
            }
            throw th;
        }
    }
}
