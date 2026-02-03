package defpackage;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgya {
    static Class a;
    private static fgzk e;
    private static fgyu[] f;
    private static Map g;
    private static int h;
    public fgzk b;
    public fgwr c;
    public int d;
    private fgyu[] i;
    private int j;
    private fgyu k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private List r;
    private fgzh[] s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fgya(java.lang.String r3, int r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            fgyu r3 = defpackage.fgyu.e(r3, r0)
            r2.<init>()
            defpackage.fhag.b(r4)
            r0 = 1
            defpackage.fgwy.b(r0)
            r1 = 41
            if (r4 == r1) goto L17
            switch(r4) {
                case 249: goto L17;
                case 250: goto L17;
                case 251: goto L17;
                case 252: goto L17;
                case 253: goto L17;
                case 254: goto L17;
                case 255: goto L17;
                default: goto L16;
            }
        L16:
            goto L1b
        L17:
            r1 = 255(0xff, float:3.57E-43)
            if (r4 != r1) goto L5f
        L1b:
            r2.k = r3
            r2.l = r4
            r2.d = r0
            java.lang.Class r3 = defpackage.fgya.a
            if (r3 != 0) goto L39
            java.lang.String r3 = "fgya"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2e
            defpackage.fgya.a = r3
            goto L39
        L2e:
            r3 = move-exception
            java.lang.NoClassDefFoundError r4 = new java.lang.NoClassDefFoundError
            r4.<init>()
            java.lang.Throwable r3 = r4.initCause(r3)
            throw r3
        L39:
            monitor-enter(r3)
            fgzk r4 = b()     // Catch: java.lang.Throwable -> L5c
            r2.b = r4     // Catch: java.lang.Throwable -> L5c
            fgyu[] r4 = d()     // Catch: java.lang.Throwable -> L5c
            r2.i = r4     // Catch: java.lang.Throwable -> L5c
            fgwr r4 = f()     // Catch: java.lang.Throwable -> L5c
            r2.c = r4     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            r3 = 3
            r2.j = r3
            java.lang.String r3 = "verbose"
            boolean r3 = defpackage.fgyz.a(r3)
            r2.m = r3
            r3 = -1
            r2.t = r3
            return
        L5c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r4
        L5f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot query for meta-types other than ANY"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgya.<init>(java.lang.String, int):void");
    }

    public static synchronized fgzk b() {
        return e;
    }

    public static synchronized void c() {
        try {
            e = new fgxk();
            f = ResolverConfig.b().c;
            g = new HashMap();
            int i = ResolverConfig.b().d;
            if (i < 0) {
                i = 1;
            }
            h = i;
        } catch (UnknownHostException unused) {
            throw new RuntimeException("Failed to initialize resolver");
        }
    }

    public static synchronized fgyu[] d() {
        return f;
    }

    public static synchronized fgwr f() {
        fgwy.b(1);
        fgwr fgwrVar = (fgwr) g.get(fgyj.b(1));
        if (fgwrVar != null) {
            return fgwrVar;
        }
        fgwr fgwrVar2 = new fgwr(null);
        g.put(fgyj.b(1), fgwrVar2);
        return fgwrVar2;
    }

    private final void g(fgyu fgyuVar, fgyu fgyuVar2) {
        this.o = true;
        this.v = false;
        this.w = false;
        this.x = false;
        this.u = false;
        this.z = false;
        int i = this.n + 1;
        this.n = i;
        if (i >= 6 || fgyuVar.equals(fgyuVar2)) {
            this.t = 1;
            this.p = true;
        } else {
            if (this.r == null) {
                this.r = new ArrayList();
            }
            this.r.add(fgyuVar2);
            h(fgyuVar);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void h(defpackage.fgyu r23) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgya.h(fgyu):void");
    }

    private final void i(fgyu fgyuVar, fgzt fgztVar) {
        int i = fgztVar.d;
        if (i == 6) {
            List list = (List) fgztVar.e;
            fgze[] fgzeVarArr = (fgze[]) list.toArray(new fgze[list.size()]);
            ArrayList arrayList = new ArrayList();
            for (fgze fgzeVar : fgzeVarArr) {
                Iterator itF = fgzeVar.f();
                while (itF.hasNext()) {
                    arrayList.add(itF.next());
                }
            }
            this.t = 0;
            this.s = (fgzh[]) arrayList.toArray(new fgzh[arrayList.size()]);
            this.p = true;
            return;
        }
        if (i == 1) {
            this.u = true;
            this.q = true;
            if (this.n > 0) {
                this.t = 3;
                this.p = true;
                return;
            }
            return;
        }
        if (i == 2) {
            this.t = 4;
            this.s = null;
            this.p = true;
        } else {
            if (i == 4) {
                g(((fgwm) ((fgze) fgztVar.e).h()).a, fgyuVar);
                return;
            }
            if (i != 5) {
                if (i == 3) {
                    this.z = true;
                }
            } else {
                try {
                    g(fgyuVar.d((fgxb) ((fgze) fgztVar.e).h()), fgyuVar);
                } catch (fgyv unused) {
                    this.t = 1;
                    this.p = true;
                }
            }
        }
    }

    private final void j(fgyu fgyuVar, fgyu fgyuVar2) {
        this.q = false;
        if (fgyuVar2 != null) {
            try {
                fgyuVar = fgyu.c(fgyuVar, fgyuVar2);
            } catch (fgyv unused) {
                this.y = true;
                return;
            }
        }
        h(fgyuVar);
    }

    public final int a() {
        int i;
        if (this.p && (i = this.t) != -1) {
            return i;
        }
        StringBuffer stringBuffer = new StringBuffer("Lookup of ");
        stringBuffer.append(this.k);
        stringBuffer.append(" ");
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
        if (this.d != 1) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(fgwy.a(this.d));
            stringBuffer3.append(" ");
            stringBuffer2.append(stringBuffer3.toString());
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(fhag.a(this.l));
        stringBuffer4.append(" isn't done");
        stringBuffer2.append(stringBuffer4.toString());
        throw new IllegalStateException(stringBuffer2.toString());
    }

    public final fgzh[] e() {
        int i = 0;
        if (this.p) {
            this.n = 0;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = null;
            this.s = null;
            this.t = -1;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = false;
        }
        if (this.k.j()) {
            j(this.k, null);
        } else {
            if (this.i != null) {
                if (this.k.a() > h) {
                    j(this.k, fgyu.a);
                }
                if (!this.p) {
                    while (true) {
                        fgyu[] fgyuVarArr = this.i;
                        if (i >= fgyuVarArr.length) {
                            break;
                        }
                        j(this.k, fgyuVarArr[i]);
                        if (!this.p) {
                            if (this.o) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                return this.s;
            }
            j(this.k, fgyu.a);
        }
        if (!this.p) {
            if (this.v || this.x || this.w) {
                this.t = 2;
            } else if (this.u) {
                this.t = 3;
            } else if (this.z || this.y) {
                this.t = 1;
            }
            this.p = true;
        }
        return this.s;
    }
}
