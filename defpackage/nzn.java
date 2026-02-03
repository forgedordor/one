package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzn implements nnr {
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public nnu e;
    public int f;
    public boolean g;
    public int h;
    public final nyc i;
    private final int j;
    private final mfr k;
    private final SparseIntArray l;
    private final nvl m;
    private final nzk n;
    private nzj o;
    private boolean p;
    private boolean q;
    private int r;

    @Deprecated
    public nzn() {
        this(1, nvl.a, new mfy(0L), new nyc((byte[]) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0254  */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r22, defpackage.non r23) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzn.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        if (this.j == 0) {
            nnuVar = new nvo(nnuVar, this.m);
        }
        this.e = nnuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10, long r12) {
        /*
            r9 = this;
            r10 = 1
            defpackage.mee.c(r10)
            java.util.List r10 = r9.a
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        Lc:
            r2 = 0
            if (r1 >= r11) goto L39
            java.lang.Object r4 = r10.get(r1)
            mfy r4 = (defpackage.mfy) r4
            long r5 = r4.f()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L33
            long r5 = r4.d()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L36
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L36
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L36
        L33:
            r4.i(r12)
        L36:
            int r1 = r1 + 1
            goto Lc
        L39:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L44
            nzj r10 = r9.o
            if (r10 == 0) goto L44
            r10.b(r12)
        L44:
            mfr r10 = r9.k
            r10.G(r0)
            android.util.SparseIntArray r10 = r9.l
            r10.clear()
            r10 = r0
        L4f:
            android.util.SparseArray r11 = r9.b
            int r12 = r11.size()
            if (r10 >= r12) goto L63
            java.lang.Object r11 = r11.valueAt(r10)
            nzr r11 = (defpackage.nzr) r11
            r11.c()
            int r10 = r10 + 1
            goto L4f
        L63:
            r9.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzn.e(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.nns r7) {
        /*
            r6 = this;
            mfr r0 = r6.k
            byte[] r0 = r0.a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.i(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.l(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzn.f(nns):boolean");
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    public nzn(int i, nvl nvlVar, mfy mfyVar, nyc nycVar) {
        this.i = nycVar;
        this.j = i;
        this.m = nvlVar;
        this.a = Collections.singletonList(mfyVar);
        this.k = new mfr(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.l = new SparseIntArray();
        this.n = new nzk();
        this.e = nnu.y;
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.put(sparseArray2.keyAt(i2), (nzr) sparseArray2.valueAt(i2));
        }
        this.b.put(0, new nzf(new nzl(this)));
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
