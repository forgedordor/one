package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqy extends dnqr {
    public static final /* synthetic */ fdeh[] n;
    public final Activity o;
    public final SparseIntArray p;
    public int q;
    public final fdcz r;
    private final fdjx s;

    static {
        fdbv fdbvVar = new fdbv(dnqy.class, "recentItems", "getRecentItems()Ljava/util/List;", 0);
        int i = fdcj.a;
        n = new fdeh[]{fdbvVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqy(Activity activity, fdjx fdjxVar, dnky dnkyVar, dngc dngcVar, fdjx fdjxVar2, dnth dnthVar) {
        super(dnkyVar, dngcVar, fdjxVar2, dnthVar);
        activity.getClass();
        fdjxVar.getClass();
        dnkyVar.getClass();
        dngcVar.getClass();
        fdjxVar2.getClass();
        dnthVar.getClass();
        this.o = activity;
        this.s = fdjxVar;
        this.p = new SparseIntArray();
        this.r = new dnqx(fcvo.a, this);
    }

    private final boolean S(int i) {
        return i < P();
    }

    @Override // defpackage.dnqr
    public final dnqu I(int i) {
        return S(i) ? (dnqu) R().get(i) : super.I(i - P());
    }

    @Override // defpackage.dnqr
    public final void M(Context context, int i) throws Resources.NotFoundException {
        super.M(context, i);
        int i2 = this.h;
        this.q = i2 + i2;
    }

    public final int O(int i) {
        if (i == 0) {
            return 0;
        }
        return this.p.get(i) + P();
    }

    public final int P() {
        return fddu.g(R().size(), this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.util.List r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dnqv
            if (r0 == 0) goto L13
            r0 = r7
            dnqv r0 = (defpackage.dnqv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnqv r0 = new dnqv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dnqy r6 = r0.d
            defpackage.fctl.b(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            fdjx r7 = r5.s
            fcyh r7 = r7.hE()
            dnqw r2 = new dnqw
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L56
            r6 = r5
        L4b:
            java.util.List r7 = (java.util.List) r7
            r6.L(r7)
            r5.p()
            fctx r6 = defpackage.fctx.a
            return r6
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnqy.Q(java.util.List, fcxy):java.lang.Object");
    }

    public final List R() {
        return (List) this.r.c(n[0]);
    }

    @Override // defpackage.dnqr, defpackage.vo
    public final int a() {
        return P() + super.a();
    }

    @Override // defpackage.dnqr
    public final dnno l(int i) {
        return S(i) ? dnnm.a : dnnk.a;
    }
}
