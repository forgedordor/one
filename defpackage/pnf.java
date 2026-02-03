package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pnf extends pmx {
    private pmx[] A;
    int w;
    ArrayList v = new ArrayList();
    private boolean y = true;
    boolean x = false;
    private int z = 0;

    private final void S(pmx pmxVar) {
        this.v.add(pmxVar);
        pmxVar.h = this;
    }

    private final void T(pmx[] pmxVarArr) {
        Arrays.fill(pmxVarArr, (Object) null);
        this.A = pmxVarArr;
    }

    private final pmx[] U() {
        pmx[] pmxVarArr = this.A;
        this.A = null;
        if (pmxVarArr == null) {
            pmxVarArr = new pmx[this.v.size()];
        }
        return (pmx[]) this.v.toArray(pmxVarArr);
    }

    @Override // defpackage.pmx
    public final void A(pmg pmgVar) {
        super.A(pmgVar);
        this.z |= 4;
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                ((pmx) this.v.get(i)).A(pmgVar);
            }
        }
    }

    @Override // defpackage.pmx
    public final boolean C() {
        for (int i = 0; i < this.v.size(); i++) {
            if (((pmx) this.v.get(i)).C()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pmx
    public final /* bridge */ /* synthetic */ void G(View view) {
        for (int i = 0; i < this.v.size(); i++) {
            ((pmx) this.v.get(i)).G(view);
        }
        super.G(view);
    }

    @Override // defpackage.pmx
    public final void H(Class cls) {
        for (int i = 0; i < this.v.size(); i++) {
            ((pmx) this.v.get(i)).H(cls);
        }
        super.H(cls);
    }

    @Override // defpackage.pmx
    public final /* bridge */ /* synthetic */ void J(View view) {
        for (int i = 0; i < this.v.size(); i++) {
            ((pmx) this.v.get(i)).J(view);
        }
        super.J(view);
    }

    @Override // defpackage.pmx
    public final void M() {
        this.z |= 2;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((pmx) this.v.get(i)).M();
        }
    }

    @Override // defpackage.pmx
    public final /* synthetic */ void N(long j) {
        this.a = j;
    }

    public final void O(pmx pmxVar) {
        S(pmxVar);
        long j = this.b;
        if (j >= 0) {
            pmxVar.K(j);
        }
        if ((this.z & 1) != 0) {
            pmxVar.L(this.c);
        }
        if ((this.z & 2) != 0) {
            pmxVar.M();
        }
        if ((this.z & 4) != 0) {
            pmxVar.A(this.r);
        }
        if ((this.z & 8) != 0) {
            pmxVar.z(this.q);
        }
    }

    @Override // defpackage.pmx
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void K(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.v) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pmx) this.v.get(i)).K(j);
        }
    }

    public final void Q(int i) {
        this.y = i == 0;
    }

    @Override // defpackage.pmx
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void L(TimeInterpolator timeInterpolator) {
        this.z |= 1;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pmx) this.v.get(i)).L(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.pmx
    public final void b(pnh pnhVar) {
        if (E(pnhVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pmx pmxVar = (pmx) arrayList.get(i);
                if (pmxVar.E(pnhVar.b)) {
                    pmxVar.b(pnhVar);
                    pnhVar.c.add(pmxVar);
                }
            }
        }
    }

    @Override // defpackage.pmx
    public final void c(pnh pnhVar) {
        if (E(pnhVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pmx pmxVar = (pmx) arrayList.get(i);
                if (pmxVar.E(pnhVar.b)) {
                    pmxVar.c(pnhVar);
                    pnhVar.c.add(pmxVar);
                }
            }
        }
    }

    @Override // defpackage.pmx
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.pmx
    public final boolean d() {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            if (!((pmx) this.v.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.v.size();
    }

    public final pmx g(int i) {
        if (i < 0 || i >= this.v.size()) {
            return null;
        }
        return (pmx) this.v.get(i);
    }

    @Override // defpackage.pmx
    /* renamed from: i */
    public final pmx clone() {
        pnf pnfVar = (pnf) super.clone();
        pnfVar.v = new ArrayList();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            pnfVar.S(((pmx) this.v.get(i)).clone());
        }
        return pnfVar;
    }

    @Override // defpackage.pmx
    public final String m(String str) {
        String strM = super.m(str);
        for (int i = 0; i < this.v.size(); i++) {
            strM = strM + "\n" + ((pmx) this.v.get(i)).m(str.concat("  "));
        }
        return strM;
    }

    @Override // defpackage.pmx
    protected final void n() {
        super.n();
        pmx[] pmxVarArrU = U();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            pmxVarArrU[i].n();
        }
        T(pmxVarArrU);
    }

    @Override // defpackage.pmx
    public final void o(pnh pnhVar) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((pmx) this.v.get(i)).o(pnhVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.pmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(android.view.ViewGroup r13, defpackage.pni r14, defpackage.pni r15, java.util.ArrayList r16, java.util.ArrayList r17) {
        /*
            r12 = this;
            long r0 = r12.a
            java.util.ArrayList r2 = r12.v
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L3d
            java.util.ArrayList r5 = r12.v
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            pmx r6 = (defpackage.pmx) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            boolean r5 = r12.y
            if (r5 != 0) goto L22
            if (r4 != 0) goto L30
            r4 = r3
        L22:
            long r9 = r6.a
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2d
            long r9 = r9 + r0
            r6.N(r9)
            goto L30
        L2d:
            r6.N(r0)
        L30:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.r(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnf.r(android.view.ViewGroup, pni, pni, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // defpackage.pmx
    public final void u(View view) {
        super.u(view);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((pmx) this.v.get(i)).u(view);
        }
    }

    @Override // defpackage.pmx
    public final void v() {
        this.s = 0L;
        pnd pndVar = new pnd(this);
        for (int i = 0; i < this.v.size(); i++) {
            pmx pmxVar = (pmx) this.v.get(i);
            pmxVar.F(pndVar);
            pmxVar.v();
            long j = pmxVar.s;
            if (this.y) {
                this.s = Math.max(this.s, j);
            } else {
                long j2 = this.s;
                pmxVar.u = j2;
                this.s = j2 + j;
            }
        }
    }

    @Override // defpackage.pmx
    public final void w(View view) {
        super.w(view);
        pmx[] pmxVarArrU = U();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            pmxVarArrU[i].w(view);
        }
        T(pmxVarArrU);
    }

    @Override // defpackage.pmx
    protected final void x() {
        if (this.v.isEmpty()) {
            B();
            s();
            return;
        }
        pne pneVar = new pne(this);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pmx) arrayList.get(i)).F(pneVar);
        }
        this.w = this.v.size();
        if (this.y) {
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((pmx) arrayList2.get(i2)).x();
            }
            return;
        }
        for (int i3 = 1; i3 < this.v.size(); i3++) {
            ((pmx) this.v.get(i3 - 1)).F(new pnc((pmx) this.v.get(i3)));
        }
        pmx pmxVar = (pmx) this.v.get(0);
        if (pmxVar != null) {
            pmxVar.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnf.y(long, long):void");
    }

    @Override // defpackage.pmx
    public final void z(pmm pmmVar) {
        this.q = pmmVar;
        this.z |= 8;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((pmx) this.v.get(i)).z(pmmVar);
        }
    }
}
