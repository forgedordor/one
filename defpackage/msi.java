package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msi {
    public final mtu a;
    public int b;
    public boolean c;
    public mqa d;
    public msf e;
    public msf f;
    public msf g;
    public msf h;
    public msf i;
    public int j;
    public Object k;
    public final mrq m;
    private final mew p;
    private long q;
    private long r;
    private final mcj n = new mcj();
    private final mck o = new mck();
    public List l = new ArrayList();

    public msi(mtu mtuVar, mew mewVar, mrq mrqVar, mqa mqaVar) {
        this.a = mtuVar;
        this.p = mewVar;
        this.m = mrqVar;
        this.d = mqaVar;
    }

    private final long o(Object obj) {
        for (int i = 0; i < this.l.size(); i++) {
            msf msfVar = (msf) this.l.get(i);
            if (msfVar.b.equals(obj)) {
                return msfVar.g.a.d;
            }
        }
        return -1L;
    }

    private static nen p(mcl mclVar, Object obj, long j, long j2, mck mckVar, mcj mcjVar) {
        mclVar.o(obj, mcjVar);
        mclVar.p(mcjVar.c, mckVar);
        mclVar.a(obj);
        mcjVar.m();
        mclVar.o(obj, mcjVar);
        int iC = mcjVar.c(j);
        return iC == -1 ? new nen(obj, j2, mcjVar.b(j)) : new nen(obj, iC, mcjVar.d(iC), j2);
    }

    private final boolean q(mcl mclVar, nen nenVar, boolean z) {
        int iA = mclVar.a(nenVar.a);
        mcj mcjVar = this.n;
        int i = mclVar.n(iA, mcjVar).c;
        mck mckVar = this.o;
        return !mclVar.p(i, mckVar).i && mclVar.i(iA, mcjVar, mckVar, this.b, this.c) == -1 && z;
    }

    private final boolean r(mcl mclVar, nen nenVar) {
        if (!s(nenVar)) {
            return false;
        }
        Object obj = nenVar.a;
        return mclVar.p(mclVar.o(obj, this.n).c, this.o).o == mclVar.a(obj);
    }

    private static final boolean s(nen nenVar) {
        return !nenVar.b() && nenVar.e == -1;
    }

    private final msg t(mcl mclVar, Object obj, int i, int i2, long j, long j2) {
        nen nenVar = new nen(obj, i, i2, j2);
        Object obj2 = nenVar.a;
        int i3 = nenVar.b;
        int i4 = nenVar.c;
        mcj mcjVar = this.n;
        long jE = mclVar.o(obj2, mcjVar).e(i3, i4);
        if (i2 == mcjVar.d(i)) {
            mcjVar.i();
        }
        mcjVar.k(i3);
        long jMax = 0;
        if (jE != -9223372036854775807L && jE <= 0) {
            jMax = Math.max(0L, (-1) + jE);
        }
        return new msg(nenVar, jMax, j, -9223372036854775807L, jE, false, false, false);
    }

    private final msg u(mcl mclVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        mcj mcjVar = this.n;
        mclVar.o(obj, mcjVar);
        int iB = mcjVar.b(jMax);
        if (iB == -1) {
            mcjVar.m();
        } else {
            mcjVar.k(iB);
        }
        nen nenVar = new nen(obj, j3, iB);
        boolean zS = s(nenVar);
        boolean zR = r(mclVar, nenVar);
        boolean zQ = q(mclVar, nenVar, zS);
        if (iB != -1) {
            mcjVar.k(iB);
        }
        if (iB != -1) {
            mcjVar.o(iB);
        }
        if (iB != -1) {
            mcjVar.h(iB);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = mcjVar.d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new msg(nenVar, jMax, j2, j6, j5, zS, zR, zQ);
    }

    private final void v(mcl mclVar, Object obj, int i) {
        mcj mcjVar = this.n;
        mclVar.o(obj, mcjVar);
        mcjVar.h(i);
        long j = mcjVar.g.a(i).h;
    }

    public final int a(msf msfVar) {
        mee.g(msfVar);
        int i = 0;
        if (msfVar.equals(this.h)) {
            return 0;
        }
        this.h = msfVar;
        while (true) {
            msfVar = msfVar.i;
            if (msfVar == null) {
                msf msfVar2 = this.h;
                mee.f(msfVar2);
                msfVar2.j(null);
                j();
                return i;
            }
            if (msfVar == this.f) {
                msf msfVar3 = this.e;
                this.f = msfVar3;
                this.g = msfVar3;
                i = 3;
            }
            if (msfVar == this.g) {
                this.g = this.f;
                i |= 2;
            }
            msfVar.i();
            this.j--;
        }
    }

    public final int b(mcl mclVar) {
        mcl mclVar2;
        msf msfVar;
        msf msfVar2 = this.e;
        if (msfVar2 == null) {
            return 0;
        }
        int iA = mclVar.a(msfVar2.b);
        while (true) {
            mclVar2 = mclVar;
            iA = mclVar2.i(iA, this.n, this.o, this.b, this.c);
            while (true) {
                mee.f(msfVar2);
                msfVar = msfVar2.i;
                if (msfVar == null || msfVar2.g.h) {
                    break;
                }
                msfVar2 = msfVar;
            }
            if (iA == -1 || msfVar == null || mclVar2.a(msfVar.b) != iA) {
                break;
            }
            msfVar2 = msfVar;
            mclVar = mclVar2;
        }
        int iA2 = a(msfVar2);
        msfVar2.g = f(mclVar2, msfVar2.g);
        return iA2;
    }

    public final msf c() {
        msf msfVar = this.e;
        if (msfVar == null) {
            return null;
        }
        if (msfVar == this.f) {
            this.f = msfVar.i;
        }
        if (msfVar == this.g) {
            this.g = msfVar.i;
        }
        msfVar.i();
        int i = this.j - 1;
        this.j = i;
        if (i == 0) {
            this.h = null;
            msf msfVar2 = this.e;
            this.k = msfVar2.b;
            this.r = msfVar2.g.a.d;
        }
        this.e = this.e.i;
        j();
        return this.e;
    }

    public final msg d(mcl mclVar, msf msfVar, long j) {
        mcl mclVar2;
        long j2;
        long j3;
        mcl mclVar3;
        mcj mcjVar;
        mck mckVar;
        Object obj;
        long j4;
        long j5;
        long j6;
        long j7;
        msg msgVar = msfVar.g;
        long j8 = msfVar.l;
        long j9 = msgVar.e;
        long j10 = (j8 + j9) - j;
        if (!msgVar.h) {
            nen nenVar = msgVar.a;
            Object obj2 = nenVar.a;
            mcj mcjVar2 = this.n;
            mclVar.o(obj2, mcjVar2);
            boolean z = msgVar.g;
            if (!nenVar.b()) {
                int i = nenVar.e;
                if (i != -1) {
                    mcjVar2.o(i);
                }
                int iD = mcjVar2.d(i);
                mcjVar2.k(i);
                if (iD != mcjVar2.a(i)) {
                    return t(mclVar, obj2, i, iD, j9, nenVar.d);
                }
                v(mclVar, obj2, i);
                return u(mclVar, obj2, 0L, j9, nenVar.d);
            }
            int i2 = nenVar.b;
            if (mcjVar2.a(i2) == -1) {
                return null;
            }
            int iB = mcjVar2.g.a(i2).b(nenVar.c);
            if (iB < 0) {
                return t(mclVar, obj2, i2, iB, msgVar.c, nenVar.d);
            }
            long jLongValue = msgVar.c;
            if (jLongValue == -9223372036854775807L) {
                j2 = 0;
                Pair pairM = mclVar.m(this.o, mcjVar2, mcjVar2.c, -9223372036854775807L, Math.max(0L, j10));
                mclVar2 = mclVar;
                if (pairM == null) {
                    return null;
                }
                jLongValue = ((Long) pairM.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                mclVar2 = mclVar;
                j2 = 0;
                j3 = jLongValue;
            }
            v(mclVar2, obj2, i2);
            return u(mclVar2, obj2, Math.max(j2, jLongValue), j3, nenVar.d);
        }
        nen nenVar2 = msgVar.a;
        Object obj3 = nenVar2.a;
        int iA = mclVar.a(obj3);
        int i3 = this.b;
        boolean z2 = this.c;
        mck mckVar2 = this.o;
        mcj mcjVar3 = this.n;
        int i4 = mclVar.i(iA, mcjVar3, mckVar2, i3, z2);
        if (i4 == -1) {
            return null;
        }
        int i5 = mclVar.d(i4, mcjVar3, true).c;
        Object obj4 = mcjVar3.b;
        mee.f(obj4);
        long j11 = nenVar2.d;
        if (mclVar.p(i5, mckVar2).n == i4) {
            Pair pairM2 = mclVar.m(mckVar2, mcjVar3, i5, -9223372036854775807L, Math.max(0L, j10));
            if (pairM2 == null) {
                return null;
            }
            Object obj5 = pairM2.first;
            long jLongValue2 = ((Long) pairM2.second).longValue();
            msf msfVar2 = msfVar.i;
            if (msfVar2 == null || !msfVar2.b.equals(obj5)) {
                long jO = o(obj5);
                if (jO == -1) {
                    jO = this.q;
                    this.q = 1 + jO;
                }
                j7 = jO;
            } else {
                j7 = msfVar2.g.a.d;
            }
            mclVar3 = mclVar;
            mckVar = mckVar2;
            mcjVar = mcjVar3;
            obj = obj5;
            j4 = j7;
            j5 = jLongValue2;
            j6 = -9223372036854775807L;
        } else {
            mclVar3 = mclVar;
            mcjVar = mcjVar3;
            mckVar = mckVar2;
            obj = obj4;
            j4 = j11;
            j5 = 0;
            j6 = 0;
        }
        nen nenVarP = p(mclVar3, obj, j5, j4, mckVar, mcjVar);
        long j12 = j5;
        mcj mcjVar4 = mcjVar;
        if (j6 != -9223372036854775807L && msgVar.c != -9223372036854775807L) {
            mclVar3.o(obj3, mcjVar4).m();
            mcjVar4.j();
        }
        return e(mclVar3, nenVarP, j6, j12);
    }

    public final msg e(mcl mclVar, nen nenVar, long j, long j2) {
        Object obj = nenVar.a;
        mclVar.o(obj, this.n);
        return nenVar.b() ? t(mclVar, obj, nenVar.b, nenVar.c, j, nenVar.d) : u(mclVar, obj, j2, j, nenVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.msg f(defpackage.mcl r14, defpackage.msg r15) {
        /*
            r13 = this;
            nen r1 = r15.a
            boolean r10 = s(r1)
            boolean r11 = r13.r(r14, r1)
            boolean r12 = r13.q(r14, r1, r10)
            java.lang.Object r0 = r1.a
            mcj r2 = r13.n
            r14.o(r0, r2)
            boolean r14 = r1.b()
            r0 = -1
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 != 0) goto L2d
            int r14 = r1.e
            if (r14 != r0) goto L28
            goto L2d
        L28:
            r2.h(r14)
            r7 = r3
            goto L2e
        L2d:
            r7 = r5
        L2e:
            boolean r14 = r1.b()
            if (r14 == 0) goto L3f
            int r14 = r1.b
            int r3 = r1.c
            long r3 = r2.e(r14, r3)
        L3c:
            r6 = r7
            r8 = r3
            goto L49
        L3f:
            int r14 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r14 == 0) goto L46
            r6 = r3
            r8 = r6
            goto L49
        L46:
            long r3 = r2.d
            goto L3c
        L49:
            boolean r14 = r1.b()
            if (r14 == 0) goto L55
            int r14 = r1.b
            r2.k(r14)
            goto L5c
        L55:
            int r14 = r1.e
            if (r14 == r0) goto L5c
            r2.k(r14)
        L5c:
            msg r0 = new msg
            long r2 = r15.b
            long r4 = r15.c
            boolean r14 = r15.f
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msi.f(mcl, msg):msg");
    }

    public final nen g(mcl mclVar, Object obj, long j) {
        long jO;
        int iA;
        mcj mcjVar = this.n;
        int i = mclVar.o(obj, mcjVar).c;
        Object obj2 = this.k;
        if (obj2 == null || (iA = mclVar.a(obj2)) == -1 || mclVar.n(iA, mcjVar).c != i) {
            msf msfVar = this.e;
            while (true) {
                if (msfVar == null) {
                    msf msfVar2 = this.e;
                    while (true) {
                        if (msfVar2 != null) {
                            int iA2 = mclVar.a(msfVar2.b);
                            if (iA2 != -1 && mclVar.n(iA2, mcjVar).c == i) {
                                jO = msfVar2.g.a.d;
                                break;
                            }
                            msfVar2 = msfVar2.i;
                        } else {
                            jO = o(obj);
                            if (jO == -1) {
                                jO = this.q;
                                this.q = 1 + jO;
                                if (this.e == null) {
                                    this.k = obj;
                                    this.r = jO;
                                }
                            }
                        }
                    }
                } else {
                    if (msfVar.b.equals(obj)) {
                        jO = msfVar.g.a.d;
                        break;
                    }
                    msfVar = msfVar.i;
                }
            }
        } else {
            jO = this.r;
        }
        long j2 = jO;
        mclVar.o(obj, mcjVar);
        mck mckVar = this.o;
        mclVar.p(mcjVar.c, mckVar);
        Object obj3 = obj;
        for (int iA3 = mclVar.a(obj); iA3 >= mckVar.n; iA3--) {
            mclVar.d(iA3, mcjVar, true);
            mcjVar.m();
            if (mcjVar.c(mcjVar.d) != -1) {
                Object obj4 = mcjVar.b;
                mee.f(obj4);
                obj3 = obj4;
            }
        }
        return p(mclVar, obj3, j, j2, mckVar, mcjVar);
    }

    public final void h() {
        if (this.j == 0) {
            return;
        }
        msf msfVar = this.e;
        mee.g(msfVar);
        this.k = msfVar.b;
        this.r = msfVar.g.a.d;
        while (msfVar != null) {
            msfVar.i();
            msfVar = msfVar.i;
        }
        this.e = null;
        this.h = null;
        this.f = null;
        this.g = null;
        this.j = 0;
        j();
    }

    public final void i() {
        msf msfVar = this.i;
        if (msfVar == null || msfVar.m()) {
            this.i = null;
            for (int i = 0; i < this.l.size(); i++) {
                msf msfVar2 = (msf) this.l.get(i);
                if (!msfVar2.m()) {
                    this.i = msfVar2;
                    return;
                }
            }
        }
    }

    public final void j() {
        int i = ekgb.d;
        final ekfw ekfwVar = new ekfw();
        for (msf msfVar = this.e; msfVar != null; msfVar = msfVar.i) {
            ekfwVar.h(msfVar.g.a);
        }
        msf msfVar2 = this.f;
        final nen nenVar = msfVar2 == null ? null : msfVar2.g.a;
        this.p.b(new Runnable() { // from class: msh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                mtu mtuVar = this.a.a;
                ekgb ekgbVarG = ekfwVar.g();
                mwk mwkVar = (mwk) mtuVar;
                mcg mcgVar = mwkVar.e;
                mee.f(mcgVar);
                ekgb ekgbVarN = ekgb.n(ekgbVarG);
                mwj mwjVar = mwkVar.b;
                mwjVar.b = ekgbVarN;
                if (!ekgbVarG.isEmpty()) {
                    nen nenVar2 = nenVar;
                    mwjVar.d = (nen) ekgbVarG.get(0);
                    mee.f(nenVar2);
                    mwjVar.e = nenVar2;
                }
                if (mwjVar.c == null) {
                    mwjVar.c = mwj.b(mcgVar, mwjVar.b, mwjVar.d, mwjVar.a);
                }
                mwjVar.c(mcgVar.H());
            }
        });
    }

    public final void k(long j) {
        msf msfVar = this.h;
        if (msfVar != null) {
            mee.c(msfVar.n());
            if (msfVar.e) {
                msfVar.a.l(msfVar.e(j));
            }
        }
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.size(); i++) {
            ((msf) this.l.get(i)).i();
        }
        this.l = arrayList;
        this.i = null;
        i();
    }

    public final boolean m(nel nelVar) {
        msf msfVar = this.h;
        return msfVar != null && msfVar.a == nelVar;
    }

    public final boolean n(nel nelVar) {
        msf msfVar = this.i;
        return msfVar != null && msfVar.a == nelVar;
    }
}
