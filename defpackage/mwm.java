package defpackage;

import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwm implements mwv {
    private static final Random d = new Random();
    public mwu c;
    private String g;
    public final mck a = new mck();
    public final mcj b = new mcj();
    private final HashMap e = new HashMap();
    private mcl f = mcl.a;
    private long h = -1;

    public static String b() {
        byte[] bArr = new byte[12];
        d.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final mwl i(int i, nen nenVar) {
        long j;
        HashMap map = this.e;
        long j2 = Long.MAX_VALUE;
        mwl mwlVar = null;
        for (mwl mwlVar2 : map.values()) {
            if (mwlVar2.c == -1 && i == mwlVar2.b && nenVar != null) {
                long jA = mwlVar2.g.a();
                long j3 = nenVar.d;
                if (j3 >= jA) {
                    mwlVar2.c = j3;
                }
            }
            if (nenVar != null) {
                nen nenVar2 = mwlVar2.d;
                if (nenVar2 != null) {
                    j = -1;
                    if (nenVar.d != nenVar2.d || nenVar.b != nenVar2.b || nenVar.c != nenVar2.c) {
                    }
                } else if (!nenVar.b() && nenVar.d == mwlVar2.c) {
                    j = -1;
                }
            } else if (i == mwlVar2.b) {
                j = -1;
            }
            long j4 = mwlVar2.c;
            if (j4 == j || j4 < j2) {
                mwlVar = mwlVar2;
                j2 = j4;
            } else if (j4 == j2) {
                String str = mgb.a;
                if (mwlVar.d != null && mwlVar2.d != null) {
                    mwlVar = mwlVar2;
                }
            }
        }
        if (mwlVar != null) {
            return mwlVar;
        }
        String strB = b();
        mwl mwlVar3 = new mwl(this, strB, i, nenVar);
        map.put(strB, mwlVar3);
        return mwlVar3;
    }

    private final void j(mwl mwlVar) {
        long j = mwlVar.c;
        if (j != -1) {
            this.h = j;
        }
        this.g = null;
    }

    private final void k(mtv mtvVar) {
        nen nenVar;
        if (mtvVar.b.q()) {
            String str = this.g;
            if (str != null) {
                mwl mwlVar = (mwl) this.e.get(str);
                mee.f(mwlVar);
                j(mwlVar);
                return;
            }
            return;
        }
        mwl mwlVar2 = (mwl) this.e.get(this.g);
        int i = mtvVar.c;
        nen nenVar2 = mtvVar.d;
        this.g = i(i, nenVar2).a;
        f(mtvVar);
        if (nenVar2 == null || !nenVar2.b()) {
            return;
        }
        if (mwlVar2 != null) {
            if (mwlVar2.c == nenVar2.d && (nenVar = mwlVar2.d) != null) {
                if (nenVar.b == nenVar2.b && nenVar.c == nenVar2.c) {
                    return;
                }
            }
        }
        i(i, new nen(nenVar2.a, nenVar2.d));
    }

    public final long a() {
        mwl mwlVar = (mwl) this.e.get(this.g);
        if (mwlVar != null) {
            long j = mwlVar.c;
            if (j != -1) {
                return j;
            }
        }
        return this.h + 1;
    }

    @Override // defpackage.mwv
    public final synchronized String c() {
        return this.g;
    }

    @Override // defpackage.mwv
    public final synchronized String d(mcl mclVar, nen nenVar) {
        return i(mclVar.o(nenVar.a, this.b).c, nenVar).a;
    }

    @Override // defpackage.mwv
    public final synchronized void e(mtv mtvVar) {
        mwu mwuVar;
        String str = this.g;
        if (str != null) {
            mwl mwlVar = (mwl) this.e.get(str);
            mee.f(mwlVar);
            j(mwlVar);
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            mwl mwlVar2 = (mwl) it.next();
            it.remove();
            if (mwlVar2.e && (mwuVar = this.c) != null) {
                mwuVar.l(mtvVar, mwlVar2.a);
            }
        }
    }

    @Override // defpackage.mwv
    public final synchronized void f(mtv mtvVar) {
        mwl mwlVar;
        mee.f(this.c);
        mcl mclVar = mtvVar.b;
        if (!mclVar.q()) {
            nen nenVar = mtvVar.d;
            if (nenVar != null) {
                if (nenVar.d >= a() && ((mwlVar = (mwl) this.e.get(this.g)) == null || mwlVar.c != -1 || mwlVar.b == mtvVar.c)) {
                }
            }
            int i = mtvVar.c;
            mwl mwlVarI = i(i, nenVar);
            if (this.g == null) {
                this.g = mwlVarI.a;
            }
            if (nenVar != null && nenVar.b()) {
                Object obj = nenVar.a;
                long j = nenVar.d;
                int i2 = nenVar.b;
                mwl mwlVarI2 = i(i, new nen(obj, j, i2));
                if (!mwlVarI2.e) {
                    mwlVarI2.e = true;
                    mcj mcjVar = this.b;
                    mclVar.o(obj, mcjVar);
                    mcjVar.h(i2);
                    Math.max(0L, mgb.B(0L) + mcjVar.f());
                }
            }
            if (!mwlVarI.e) {
                mwlVarI.e = true;
            }
            String str = mwlVarI.a;
            if (str.equals(this.g) && !mwlVarI.f) {
                mwlVarI.f = true;
                mwu mwuVar = this.c;
                if (nenVar == null || !nenVar.b()) {
                    ((mwt) mwuVar).j();
                    ((mwt) mwuVar).b = str;
                    ((mwt) mwuVar).c = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.1");
                    ((mwt) mwuVar).k(mclVar, nenVar);
                }
            }
        }
    }

    @Override // defpackage.mwv
    public final synchronized void g(mtv mtvVar, int i) {
        mee.f(this.c);
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            mwl mwlVar = (mwl) it.next();
            if (mwlVar.a(mtvVar)) {
                it.remove();
                if (mwlVar.e) {
                    String str = mwlVar.a;
                    boolean zEquals = str.equals(this.g);
                    if (i == 0) {
                        if (zEquals) {
                            boolean z = mwlVar.f;
                            j(mwlVar);
                        }
                        this.c.l(mtvVar, str);
                    } else {
                        if (zEquals) {
                            j(mwlVar);
                        }
                        this.c.l(mtvVar, str);
                    }
                }
            }
        }
        k(mtvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0016 A[SYNTHETIC] */
    @Override // defpackage.mwv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(defpackage.mtv r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            mwu r0 = r9.c     // Catch: java.lang.Throwable -> L8f
            defpackage.mee.f(r0)     // Catch: java.lang.Throwable -> L8f
            mcl r0 = r9.f     // Catch: java.lang.Throwable -> L8f
            mcl r1 = r10.b     // Catch: java.lang.Throwable -> L8f
            r9.f = r1     // Catch: java.lang.Throwable -> L8f
            java.util.HashMap r1 = r9.e     // Catch: java.lang.Throwable -> L8f
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L8f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8f
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8f
            mwl r2 = (defpackage.mwl) r2     // Catch: java.lang.Throwable -> L8f
            mcl r3 = r9.f     // Catch: java.lang.Throwable -> L8f
            int r4 = r2.b     // Catch: java.lang.Throwable -> L8f
            int r5 = r0.c()     // Catch: java.lang.Throwable -> L8f
            r6 = -1
            if (r4 < r5) goto L35
            int r5 = r3.c()     // Catch: java.lang.Throwable -> L8f
            if (r4 < r5) goto L58
        L33:
            r4 = r6
            goto L58
        L35:
            mwm r5 = r2.g     // Catch: java.lang.Throwable -> L8f
            mck r7 = r5.a     // Catch: java.lang.Throwable -> L8f
            r0.p(r4, r7)     // Catch: java.lang.Throwable -> L8f
            int r4 = r7.n     // Catch: java.lang.Throwable -> L8f
        L3e:
            int r8 = r7.o     // Catch: java.lang.Throwable -> L8f
            if (r4 > r8) goto L33
            java.lang.Object r8 = r0.f(r4)     // Catch: java.lang.Throwable -> L8f
            int r8 = r3.a(r8)     // Catch: java.lang.Throwable -> L8f
            if (r8 == r6) goto L55
            mcj r4 = r5.b     // Catch: java.lang.Throwable -> L8f
            mcj r4 = r3.n(r8, r4)     // Catch: java.lang.Throwable -> L8f
            int r4 = r4.c     // Catch: java.lang.Throwable -> L8f
            goto L58
        L55:
            int r4 = r4 + 1
            goto L3e
        L58:
            r2.b = r4     // Catch: java.lang.Throwable -> L8f
            if (r4 != r6) goto L5d
            goto L70
        L5d:
            nen r4 = r2.d     // Catch: java.lang.Throwable -> L8f
            if (r4 != 0) goto L62
            goto L6a
        L62:
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L8f
            int r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L8f
            if (r3 == r6) goto L70
        L6a:
            boolean r3 = r2.a(r10)     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L16
        L70:
            r1.remove()     // Catch: java.lang.Throwable -> L8f
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L16
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = r9.g     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L84
            r9.j(r2)     // Catch: java.lang.Throwable -> L8f
        L84:
            mwu r2 = r9.c     // Catch: java.lang.Throwable -> L8f
            r2.l(r10, r3)     // Catch: java.lang.Throwable -> L8f
            goto L16
        L8a:
            r9.k(r10)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r9)
            return
        L8f:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8f
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwm.h(mtv):void");
    }
}
