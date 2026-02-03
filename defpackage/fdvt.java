package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdvt implements fdww {
    public final fcyh a;
    public final int b;
    public final int c;

    public fdvt(fcyh fcyhVar, int i, int i2) {
        this.a = fcyhVar;
        this.b = i;
        this.c = i2;
        boolean z = fdkb.a;
    }

    public static /* synthetic */ Object h(fdvt fdvtVar, fdpm fdpmVar, fcxy fcxyVar) {
        Object objA = fdjy.a(new fdvr(fdpmVar, fdvtVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.fdpl
    public Object a(fdpm fdpmVar, fcxy fcxyVar) {
        return h(this, fdpmVar, fcxyVar);
    }

    protected abstract Object b(fdos fdosVar, fcxy fcxyVar);

    protected abstract fdvt c(fcyh fcyhVar, int i, int i2);

    protected String d() {
        return null;
    }

    public fdou e(fdjx fdjxVar) {
        fdjz fdjzVar = fdjz.c;
        fdvs fdvsVar = new fdvs(this, null);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return fdor.c(fdjxVar, this.a, i, i2, fdjzVar, fdvsVar);
    }

    public fdpl f() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r5
      0x0019: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:7:0x0011, B:11:0x0017, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fdww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fdpl hM(defpackage.fcyh r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = defpackage.fdkb.a
            fcyh r0 = r2.a
            fcyh r3 = r3.plus(r0)
            r1 = 1
            if (r5 != r1) goto L23
            int r5 = r2.b
            r1 = -3
            if (r5 != r1) goto L11
            goto L21
        L11:
            if (r4 != r1) goto L14
            goto L19
        L14:
            r1 = -2
            if (r5 == r1) goto L21
            if (r4 != r1) goto L1b
        L19:
            r4 = r5
            goto L21
        L1b:
            int r5 = r5 + r4
            if (r5 >= 0) goto L19
            r4 = 2147483647(0x7fffffff, float:NaN)
        L21:
            int r5 = r2.c
        L23:
            boolean r0 = defpackage.fdbq.f(r3, r0)
            if (r0 == 0) goto L32
            int r0 = r2.b
            if (r4 != r0) goto L32
            int r0 = r2.c
            if (r5 != r0) goto L32
            return r2
        L32:
            fdvt r3 = r2.c(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdvt.hM(fcyh, int, int):fdpl");
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        fcyh fcyhVar = this.a;
        if (fcyhVar != fcyi.a) {
            Objects.toString(fcyhVar);
            arrayList.add("context=".concat(String.valueOf(fcyhVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.g(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(fdnp.a(i2));
            arrayList.add("onBufferOverflow=".concat(fdnp.a(i2)));
        }
        return fdkc.a(this) + "[" + fcva.aF(arrayList, ", ", null, null, null, 62) + "]";
    }
}
