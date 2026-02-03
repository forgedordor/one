package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fec implements iwj {
    public final fcu a;
    public final int b;
    public final kfm c;
    public final fdae d;

    public fec(fcu fcuVar, int i, kfm kfmVar, fdae fdaeVar) {
        this.a = fcuVar;
        this.b = i;
        this.c = kfmVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.ics
    public final /* synthetic */ ics a(ics icsVar) {
        return icn.a(this, icsVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ Object b(Object obj, fdat fdatVar) {
        return icp.a(this, obj, fdatVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ boolean c(fdap fdapVar) {
        return icp.b(this, fdapVar);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.a(this, ivuVar, ivtVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fec)) {
            return false;
        }
        fec fecVar = (fec) obj;
        return fdbq.f(this.a, fecVar.a) && this.b == fecVar.b && fdbq.f(this.c, fecVar.c) && fdbq.f(this.d, fecVar.d);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.d(this, ivuVar, ivtVar, i);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.iwj
    public final ixn i(ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(kil.m(j, 0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7));
        final int iMin = Math.min(iylVarE.b, kil.a(j));
        return ixpVar.ej(iylVarE.a, iMin, fcvp.a, new fdap() { // from class: feb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                fec fecVar = this.a;
                fda fdaVar = (fda) fecVar.d.invoke();
                jyi jyiVar = fdaVar != null ? fdaVar.a : null;
                kfm kfmVar = fecVar.c;
                int i = fecVar.b;
                int i2 = iMin;
                iyl iylVar = iylVarE;
                ihu ihuVarA = fcr.a(iykVar, i, kfmVar, jyiVar, false, iylVar.a);
                fcu fcuVar = fecVar.a;
                fcuVar.e(dwm.a, ihuVarA, i2, iylVar.b);
                iyk.A(iykVar, iylVar, 0, Math.round(-fcuVar.b()));
                return fctx.a;
            }
        });
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
