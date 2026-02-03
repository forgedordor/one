package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edd implements ixm {
    public final iby a;
    private final boolean b;

    public edd(iby ibyVar, boolean z) {
        this.a = ibyVar;
        this.b = z;
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(final ixp ixpVar, final List list, long j) {
        int iD;
        int iC;
        iyl iylVarE;
        if (list.isEmpty()) {
            return ixpVar.ej(kil.d(j), kil.c(j), fcvp.a, new fdap() { // from class: eda
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return fctx.a;
                }
            });
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final ixk ixkVar = (ixk) list.get(0);
            if (ecz.d(ixkVar)) {
                iD = kil.d(j);
                iC = kil.c(j);
                iylVarE = ixkVar.e(kik.c(kil.d(j), kil.c(j)));
            } else {
                iylVarE = ixkVar.e(j2);
                iD = Math.max(kil.d(j), iylVarE.a);
                iC = Math.max(kil.c(j), iylVarE.b);
            }
            final int i = iC;
            final int i2 = iD;
            final iyl iylVar = iylVarE;
            return ixpVar.ej(i2, i, fcvp.a, new fdap() { // from class: edb
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ecz.c((iyk) obj, iylVar, ixkVar, ixpVar.q(), i2, i, this.a);
                    return fctx.a;
                }
            });
        }
        final iyl[] iylVarArr = new iyl[list.size()];
        final fdcg fdcgVar = new fdcg();
        fdcgVar.a = kil.d(j);
        final fdcg fdcgVar2 = new fdcg();
        fdcgVar2.a = kil.c(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            ixk ixkVar2 = (ixk) list.get(i3);
            if (ecz.d(ixkVar2)) {
                z = true;
            } else {
                iyl iylVarE2 = ixkVar2.e(j2);
                iylVarArr[i3] = iylVarE2;
                fdcgVar.a = Math.max(fdcgVar.a, iylVarE2.a);
                fdcgVar2.a = Math.max(fdcgVar2.a, iylVarE2.b);
            }
        }
        if (z) {
            int i4 = fdcgVar.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = fdcgVar2.a;
            long jD = kim.d(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ixk ixkVar3 = (ixk) list.get(i7);
                if (ecz.d(ixkVar3)) {
                    iylVarArr[i7] = ixkVar3.e(jD);
                }
            }
        }
        return ixpVar.ej(fdcgVar.a, fdcgVar2.a, fcvp.a, new fdap() { // from class: edc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    iyl[] iylVarArr2 = iylVarArr;
                    if (i8 >= iylVarArr2.length) {
                        return fctx.a;
                    }
                    edd eddVar = this;
                    fdcg fdcgVar3 = fdcgVar2;
                    fdcg fdcgVar4 = fdcgVar;
                    ixp ixpVar2 = ixpVar;
                    List list2 = list;
                    iyl iylVar2 = iylVarArr2[i8];
                    iylVar2.getClass();
                    ecz.c(iykVar, iylVar2, (ixk) list2.get(i9), ixpVar2.q(), fdcgVar4.a, fdcgVar3.a, eddVar.a);
                    i8++;
                    i9++;
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edd)) {
            return false;
        }
        edd eddVar = (edd) obj;
        return fdbq.f(this.a, eddVar.a) && this.b == eddVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
