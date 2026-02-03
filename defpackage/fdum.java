package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdum extends fdvo implements fdue, fdpl, fdww {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public fdum(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    private final int c() {
        return (int) ((f() + this.h) - this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [fdpm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object g(defpackage.fdum r17, defpackage.fdpm r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdum.g(fdum, fdpm, fcxy):java.lang.Object");
    }

    private final int p() {
        return this.h + this.i;
    }

    private final long q() {
        return f() + this.h;
    }

    private final long r() {
        return f() + this.h + this.i;
    }

    private final long s(fduo fduoVar) {
        long j = fduoVar.a;
        if (j >= q() && (this.g > 0 || j > f() || this.i == 0)) {
            return -1L;
        }
        return j;
    }

    private final void t() {
        fdvq[] fdvqVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        fdun.b(objArr, f(), null);
        this.h--;
        long jF = f() + 1;
        if (this.b < jF) {
            this.b = jF;
        }
        if (this.c < jF) {
            if (this.e != 0 && (fdvqVarArr = this.d) != null) {
                for (fdvq fdvqVar : fdvqVarArr) {
                    if (fdvqVar != null) {
                        fduo fduoVar = (fduo) fdvqVar;
                        long j = fduoVar.a;
                        if (j >= 0 && j < jF) {
                            fduoVar.a = jF;
                        }
                    }
                }
            }
            this.c = jF;
        }
        boolean z = fdkb.a;
    }

    private final void u(Object obj) {
        int iP = p();
        Object[] objArrX = this.a;
        if (objArrX == null) {
            objArrX = x(null, 0, 2);
        } else {
            int length = objArrX.length;
            if (iP >= length) {
                objArrX = x(objArrX, iP, length + length);
            }
        }
        fdun.b(objArrX, f() + iP, obj);
    }

    private final void v(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = fdkb.a;
        for (long jF = f(); jF < jMin; jF++) {
            Object[] objArr = this.a;
            objArr.getClass();
            fdun.b(objArr, jF, null);
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - jMin);
        this.i = (int) (j4 - j3);
    }

    private final boolean w(Object obj) {
        if (this.e == 0) {
            boolean z = fdkb.a;
            int i = this.f;
            if (i != 0) {
                u(obj);
                int i2 = this.h + 1;
                this.h = i2;
                if (i2 > i) {
                    t();
                }
                this.c = f() + this.h;
            }
            return true;
        }
        int i3 = this.h;
        int i4 = this.g;
        if (i3 >= i4 && this.c <= this.b) {
            int i5 = this.j;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i5 - 1;
            if (i6 == 0) {
                return false;
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    return true;
                }
                throw new fctg();
            }
        }
        u(obj);
        int i7 = this.h + 1;
        this.h = i7;
        if (i7 > i4) {
            t();
        }
        if (c() > this.f) {
            v(this.b + 1, this.c, q(), r());
        }
        return true;
    }

    private final Object[] x(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jF = f();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jF;
                fdun.b(objArr2, j, fdun.a(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final fcxy[] y(fcxy[] fcxyVarArr) {
        fdvq[] fdvqVarArr;
        fduo fduoVar;
        fcxy fcxyVar;
        if (this.e != 0 && (fdvqVarArr = this.d) != null) {
            int length = fcxyVarArr.length;
            int i = 0;
            fcxyVarArr = fcxyVarArr;
            while (i < fdvqVarArr.length) {
                fdvq fdvqVar = fdvqVarArr[i];
                if (fdvqVar != null && (fcxyVar = (fduoVar = (fduo) fdvqVar).b) != null && s(fduoVar) >= 0) {
                    int length2 = fcxyVarArr.length;
                    fcxyVarArr = fcxyVarArr;
                    if (length >= length2) {
                        ?? CopyOf = Arrays.copyOf(fcxyVarArr, Math.max(2, length2 + length2));
                        CopyOf.getClass();
                        fcxyVarArr = CopyOf;
                    }
                    fcxyVarArr[length] = fcxyVar;
                    fduoVar.b = null;
                    length++;
                }
                i++;
                fcxyVarArr = fcxyVarArr;
            }
        }
        return fcxyVarArr;
    }

    @Override // defpackage.fduj, defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        return g(this, fdpmVar, fcxyVar);
    }

    @Override // defpackage.fduj
    public final List d() {
        synchronized (this) {
            int iC = c();
            if (iC == 0) {
                return fcvo.a;
            }
            ArrayList arrayList = new ArrayList(iC);
            Object[] objArr = this.a;
            objArr.getClass();
            for (int i = 0; i < iC; i++) {
                arrayList.add(fdun.a(objArr, this.b + i));
            }
            return arrayList;
        }
    }

    @Override // defpackage.fdue
    public final void e() throws Throwable {
        synchronized (this) {
            try {
                try {
                    v(q(), this.c, q(), r());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final long f() {
        return Math.min(this.c, this.b);
    }

    @Override // defpackage.fdue, defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) throws Throwable {
        Throwable th;
        fcxy[] fcxyVarArrY;
        fduk fdukVar;
        if (h(obj)) {
            return fctx.a;
        }
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        fcxy[] fcxyVarArrY2 = fdvp.a;
        synchronized (this) {
            try {
                if (w(obj)) {
                    try {
                        fdiuVar.w(fctx.a);
                        fcxyVarArrY = y(fcxyVarArrY2);
                        fdukVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        fdukVar = new fduk(this, f() + p(), obj, fdiuVar);
                        u(fdukVar);
                        this.i++;
                        if (this.g == 0) {
                            fcxyVarArrY2 = y(fcxyVarArrY2);
                        }
                        fcxyVarArrY = fcxyVarArrY2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (fdukVar != null) {
                    fdiw.b(fdiuVar, fdukVar);
                }
                for (fcxy fcxyVar2 : fcxyVarArrY) {
                    if (fcxyVar2 != null) {
                        fcxyVar2.w(fctx.a);
                    }
                }
                Object objM = fdiuVar.m();
                fcyl fcylVar = fcyl.a;
                if (objM == fcylVar) {
                    fcxyVar.getClass();
                }
                if (objM != fcylVar) {
                    objM = fctx.a;
                }
                return objM != fcylVar ? fctx.a : objM;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.fdue
    public final boolean h(Object obj) {
        int i;
        boolean z;
        fcxy[] fcxyVarArrY = fdvp.a;
        synchronized (this) {
            if (w(obj)) {
                fcxyVarArrY = y(fcxyVarArrY);
                z = true;
            } else {
                z = false;
            }
        }
        for (fcxy fcxyVar : fcxyVarArrY) {
            if (fcxyVar != null) {
                fcxyVar.w(fctx.a);
            }
        }
        return z;
    }

    @Override // defpackage.fdww
    public final fdpl hM(fcyh fcyhVar, int i, int i2) {
        return fdun.c(this, fcyhVar, i, i2);
    }

    protected final Object i() {
        Object[] objArr = this.a;
        objArr.getClass();
        return fdun.a(objArr, (this.b + c()) - 1);
    }

    @Override // defpackage.fdvo
    public final /* synthetic */ fdvq j() {
        return new fduo();
    }

    public final void k() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0 && fdun.a(objArr, (f() + p()) - 1) == fdun.a) {
                this.i--;
                fdun.b(objArr, f() + p(), null);
            }
        }
    }

    public final fcxy[] l(long j) {
        long j2;
        long j3;
        long j4;
        fdvq[] fdvqVarArr;
        boolean z = fdkb.a;
        if (j <= this.c) {
            long jF = f();
            long j5 = this.h + jF;
            int i = this.g;
            if (i == 0 && this.i > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (fdvqVarArr = this.d) != null) {
                for (fdvq fdvqVar : fdvqVarArr) {
                    if (fdvqVar != null) {
                        long j6 = ((fduo) fdvqVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.c) {
                long jQ = q();
                int iMin = this.e > 0 ? Math.min(this.i, i - ((int) (jQ - j5))) : this.i;
                fcxy[] fcxyVarArr = fdvp.a;
                long j7 = this.i + jQ;
                if (iMin > 0) {
                    fcxyVarArr = new fcxy[iMin];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = 1;
                    long j8 = jQ;
                    while (true) {
                        if (jQ >= j7) {
                            j2 = jF;
                            j3 = j5;
                            jQ = j8;
                            break;
                        }
                        j2 = jF;
                        Object objA = fdun.a(objArr, jQ);
                        fdzi fdziVar = fdun.a;
                        if (objA != fdziVar) {
                            objA.getClass();
                            int i3 = i2 + 1;
                            j3 = j5;
                            fduk fdukVar = (fduk) objA;
                            fcxyVarArr[i2] = fdukVar.d;
                            fdun.b(objArr, jQ, fdziVar);
                            fdun.b(objArr, j8, fdukVar.c);
                            long j9 = j8 + 1;
                            if (i3 >= iMin) {
                                jQ = j9;
                                break;
                            }
                            i2 = i3;
                            j8 = j9;
                        } else {
                            j3 = j5;
                        }
                        jQ++;
                        jF = j2;
                        j5 = j3;
                    }
                } else {
                    j2 = jF;
                    j3 = j5;
                    j4 = 1;
                }
                long j10 = jQ - j2;
                long j11 = this.e == 0 ? jQ : j3;
                long jMax = Math.max(this.b, jQ - Math.min(this.f, (int) j10));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (fdbq.f(fdun.a(objArr2, jMax), fdun.a)) {
                        jQ += j4;
                        jMax += j4;
                    }
                }
                v(jMax, j11, jQ, j7);
                k();
                return fcxyVarArr.length == 0 ? fcxyVarArr : y(fcxyVarArr);
            }
        }
        return fdvp.a;
    }

    @Override // defpackage.fdvo
    public final /* bridge */ /* synthetic */ fdvq[] m() {
        return new fduo[2];
    }
}
