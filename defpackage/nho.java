package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nho extends nhz implements Comparable {
    private final int e;
    private final boolean f;
    private final String g;
    private final nhs h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nho(int r8, defpackage.mcm r9, int r10, defpackage.nhs r11, int r12, boolean r13, defpackage.ejwm r14) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nho.<init>(int, mcm, int, nhs, int, boolean, ejwm):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nho nhoVar) {
        boolean z = this.f;
        eknw eknwVarC = (z && this.i) ? nid.a : nid.a.c();
        ekdr ekdrVarE = ekdr.b.e(this.i, nhoVar.i);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(nhoVar.k);
        ekop ekopVar = ekop.a;
        ekdr ekdrVarD = ekdrVarE.d(numValueOf, numValueOf2, ekopVar).b(this.j, nhoVar.j).b(this.l, nhoVar.l).e(this.p, nhoVar.p).e(this.m, nhoVar.m).d(Integer.valueOf(this.n), Integer.valueOf(nhoVar.n), ekopVar).b(this.o, nhoVar.o).e(z, nhoVar.f).d(Integer.valueOf(this.t), Integer.valueOf(nhoVar.t), ekopVar);
        boolean z2 = this.h.B;
        ekdr ekdrVarD2 = ekdrVarD.e(this.u, nhoVar.u).e(this.v, nhoVar.v).e(this.w, nhoVar.w).d(Integer.valueOf(this.q), Integer.valueOf(nhoVar.q), eknwVarC).d(Integer.valueOf(this.r), Integer.valueOf(nhoVar.r), eknwVarC);
        if (Objects.equals(this.g, nhoVar.g)) {
            ekdrVarD2 = ekdrVarD2.d(Integer.valueOf(this.s), Integer.valueOf(nhoVar.s), eknwVarC);
        }
        return ekdrVarD2.a();
    }

    @Override // defpackage.nhz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.nhz
    public final /* bridge */ /* synthetic */ boolean c(nhz nhzVar) {
        String str;
        nhs nhsVar = this.h;
        nho nhoVar = (nho) nhzVar;
        boolean z = nhsVar.N;
        mau mauVar = this.d;
        int i = mauVar.G;
        if (i == -1) {
            return false;
        }
        mau mauVar2 = nhoVar.d;
        if (i != mauVar2.G || (str = mauVar.o) == null || !TextUtils.equals(str, mauVar2.o)) {
            return false;
        }
        boolean z2 = nhsVar.M;
        int i2 = mauVar.H;
        if (i2 == -1 || i2 != mauVar2.H) {
            return false;
        }
        boolean z3 = nhsVar.O;
        return this.u == nhoVar.u && this.v == nhoVar.v;
    }
}
