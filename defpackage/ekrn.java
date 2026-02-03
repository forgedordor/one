package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekrn implements ekrw, eksx {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private ekrm d;
    private ekrq e;
    private ekse f;
    private ekub g;
    private Object[] h;

    protected ekrn(Level level) {
        long jB = ekty.b();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.b = level;
        this.c = jB;
    }

    private final void aa(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof ekri) {
                objArr[i] = ((ekri) obj).a();
            }
        }
        if (str != a) {
            this.g = new ekub(b(), str);
        }
        ekwe ekweVarK = ekty.k();
        if (!ekweVarK.b()) {
            ekte ekteVarI = i();
            ekrz ekrzVar = ekrl.h;
            ekwe ekweVar = (ekwe) ekteVarI.d(ekrzVar);
            if (ekweVar != null) {
                ekweVarK = ekweVarK.a(ekweVar);
            }
            n(ekrzVar, ekweVarK);
        }
        ekqs ekqsVarA = a();
        try {
            ekwt ekwtVarA = ekwt.a();
            int i2 = ekwtVarA.a + 1;
            ekwtVarA.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    ekqsVarA.b.b(this);
                } else {
                    ekqs.l("unbounded recursion in log statement", this);
                }
                if (ekwtVarA != null) {
                    ekwtVarA.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                ekqsVarA.b.g(e, this);
            } catch (ektb e2) {
                throw e2;
            } catch (RuntimeException e3) {
                ekqs.l(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean ab() {
        ekrr ekrrVarB;
        ekrm ekrmVar;
        int i;
        if (this.e == null) {
            this.e = ekty.g().a(ekrn.class, 1);
        }
        if (this.e != ekrq.a) {
            ekrrVarB = this.e;
            ekrm ekrmVar2 = this.d;
            if (ekrmVar2 != null && (i = ekrmVar2.b) > 0) {
                ekrrVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (ekrl.f.equals(ekrmVar2.c(i2))) {
                        Object objE = ekrmVar2.e(i2);
                        ekrrVarB = objE instanceof ekrx ? ((ekrx) objE).b() : new eksi(ekrrVarB, objE);
                    }
                }
            }
        } else {
            ekrrVarB = null;
        }
        boolean zC = c(ekrrVarB);
        ekse ekseVar = this.f;
        if (ekseVar == null) {
            return zC;
        }
        eksd eksdVar = (eksd) eksd.a.b(ekrrVarB, this.d);
        int iIncrementAndGet = eksdVar.c.incrementAndGet();
        int i3 = -1;
        if (ekseVar != ekse.c && eksdVar.b.compareAndSet(false, true)) {
            try {
                ekseVar.a();
                eksdVar.b.set(false);
                eksdVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                eksdVar.b.set(false);
                throw th;
            }
        }
        if (zC && i3 > 0 && (ekrmVar = this.d) != null) {
            ekrmVar.f(ekrl.e, Integer.valueOf(i3));
        }
        return zC & (i3 >= 0);
    }

    @Override // defpackage.ekrw
    public final void A(String str, long j, Object obj) {
        if (ab()) {
            aa(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.ekrw
    public final void B(String str, Object obj, int i) {
        if (ab()) {
            aa(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ekrw
    public final void C(String str, Object obj, long j) {
        if (ab()) {
            aa(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.ekrw
    public final void D(String str, Object obj, Object obj2) {
        if (ab()) {
            aa(str, obj, obj2);
        }
    }

    @Override // defpackage.ekrw
    public final void E(String str, Object obj, boolean z) {
        if (ab()) {
            aa(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ekrw
    public final void F(String str, boolean z, long j) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    @Override // defpackage.ekrw
    public final void G(String str, boolean z, Object obj) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.ekrw
    public final void H(String str, boolean z, boolean z2) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.ekrw
    public final void I(String str, Object obj, Object obj2, Object obj3) {
        if (ab()) {
            aa(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.ekrw
    public final void J(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.ekrw
    public final void K(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.ekrw
    public final void L(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.ekrw
    public final void M(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.ekrw
    public final void N(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // defpackage.ekrw
    public final void O(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object... objArr) {
        if (ab()) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length + 10];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            objArr2[6] = obj7;
            objArr2[7] = obj8;
            objArr2[8] = obj9;
            objArr2[9] = obj10;
            System.arraycopy(objArr, 0, objArr2, 10, length);
            aa(str, objArr2);
        }
    }

    @Override // defpackage.ekrw
    public final void P(String str, Object[] objArr) {
        if (ab()) {
            aa(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.ekrw
    public final boolean Q() {
        return R() || a().m(this.b);
    }

    @Override // defpackage.eksx
    public final boolean R() {
        return this.d != null && Boolean.TRUE.equals(this.d.d(ekrl.g));
    }

    @Override // defpackage.eksx
    public final Object[] S() {
        ekwr.b(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.ekrw
    public final void T(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (ab()) {
            aa("Transition threw:\n   from: %s (%s)\n   from target: %s (%s)\n   to: %s (%s)\n   to target: %s (%s)\n   requestId: %s", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // defpackage.ekrw
    public final void U(Object obj) {
        if (ab()) {
            aa("Result of audio playback (volume: %f) : %s", Float.valueOf(0.25f), obj);
        }
    }

    @Override // defpackage.ekrw
    public final void V(int i, TimeUnit timeUnit) {
        if (R()) {
            return;
        }
        ekrz ekrzVar = ekrl.d;
        ekrt ekrtVar = ekqx.a;
        n(ekrzVar, new ekqw(i, timeUnit));
    }

    @Override // defpackage.ekrw
    public final void W() {
        ekrz ekrzVar = ekrl.b;
        if (R()) {
            return;
        }
        n(ekrzVar, 100);
    }

    @Override // defpackage.ekrw
    public final void X(ekrz ekrzVar, Object obj) {
        ekrzVar.getClass();
        if (obj != null) {
            n(ekrzVar, obj);
        }
    }

    @Override // defpackage.ekrw
    public final void Y(ekrq ekrqVar) {
        if (this.e == null) {
            this.e = ekrqVar;
        }
    }

    @Override // defpackage.ekrw
    public final void Z(eksk ekskVar) {
        ekskVar.getClass();
        if (ekskVar != eksk.NONE) {
            n(ekrl.i, ekskVar);
        }
    }

    protected abstract ekqs a();

    protected abstract ekwn b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Type inference failed for: r0v8, types: [ekse] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [ekse] */
    /* JADX WARN: Type inference failed for: r15v8, types: [eksh] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ekse] */
    /* JADX WARN: Type inference failed for: r3v7, types: [ekse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean c(defpackage.ekrr r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekrn.c(ekrr):boolean");
    }

    @Override // defpackage.eksx
    public final long d() {
        return this.c;
    }

    @Override // defpackage.eksx
    public final ekrq e() {
        ekrq ekrqVar = this.e;
        if (ekrqVar != null) {
            return ekrqVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.ekrw
    public final ekrw f(String str) {
        X(ekrl.f, str);
        return this;
    }

    @Override // defpackage.ekrw
    public final ekrw g(Throwable th) {
        X(ekrl.a, th);
        return this;
    }

    @Override // defpackage.ekrw
    public final ekrw h(String str, String str2, int i, String str3) {
        ekrq ekrqVar = ekrq.a;
        Y(new ekrp(str, str2, i, str3));
        return this;
    }

    @Override // defpackage.eksx
    public final ekte i() {
        ekrm ekrmVar = this.d;
        return ekrmVar != null ? ekrmVar : ektd.a;
    }

    @Override // defpackage.eksx
    public final ekub j() {
        return this.g;
    }

    @Override // defpackage.eksx
    public final Object k() {
        ekwr.b(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.eksx
    public final String l() {
        return a().b.d();
    }

    @Override // defpackage.eksx
    public final Level m() {
        return this.b;
    }

    protected final void n(ekrz ekrzVar, Object obj) {
        if (this.d == null) {
            this.d = new ekrm();
        }
        this.d.f(ekrzVar, obj);
    }

    @Override // defpackage.ekrw
    public final void o() {
        if (ab()) {
            aa(a, "");
        }
    }

    @Override // defpackage.ekrw
    public final void p(Object obj) {
        if (ab()) {
            aa("%s", obj);
        }
    }

    @Override // defpackage.ekrw
    public final void q(String str) {
        if (ab()) {
            aa(a, str);
        }
    }

    @Override // defpackage.ekrw
    public final void r(String str, int i) {
        if (ab()) {
            aa(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ekrw
    public final void s(String str, long j) {
        if (ab()) {
            aa(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.ekrw
    public final void t(String str, Object obj) {
        if (ab()) {
            aa(str, obj);
        }
    }

    @Override // defpackage.ekrw
    public final void u(String str, int i, int i2) {
        if (ab()) {
            aa(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.ekrw
    public final void v(String str, int i, long j) {
        if (ab()) {
            aa(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.ekrw
    public final void w(String str, int i, Object obj) {
        if (ab()) {
            aa(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.ekrw
    public final void x(String str, int i, boolean z) {
        if (ab()) {
            aa(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ekrw
    public final void y(String str, long j, int i) {
        if (ab()) {
            aa(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    @Override // defpackage.ekrw
    public final void z(String str, long j, long j2) {
        if (ab()) {
            aa(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
