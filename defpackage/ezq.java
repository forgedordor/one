package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezq implements iwj {
    public final fcu a;
    public final int b;
    public final kfm c;
    public final fdae d;

    public ezq(fcu fcuVar, int i, kfm kfmVar, fdae fdaeVar) {
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
        if (!(obj instanceof ezq)) {
            return false;
        }
        ezq ezqVar = (ezq) obj;
        return fdbq.f(this.a, ezqVar.a) && this.b == ezqVar.b && fdbq.f(this.c, ezqVar.c) && fdbq.f(this.d, ezqVar.d);
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
    public final ixn i(final ixp ixpVar, ixk ixkVar, long j) {
        long j2;
        if (ixkVar.b(kil.a(j)) < kil.b(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = kil.m(j2, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13);
        }
        final iyl iylVarE = ixkVar.e(j);
        final int iMin = Math.min(iylVarE.a, kil.b(j2));
        return ixpVar.ej(iMin, iylVarE.b, fcvp.a, new fdap() { // from class: ezp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                ezq ezqVar = this.a;
                fda fdaVar = (fda) ezqVar.d.invoke();
                jyi jyiVar = fdaVar != null ? fdaVar.a : null;
                kfm kfmVar = ezqVar.c;
                int i = ezqVar.b;
                int i2 = iMin;
                iyl iylVar = iylVarE;
                ihu ihuVarA = fcr.a(iykVar, i, kfmVar, jyiVar, ixpVar.q() == kji.b, iylVar.a);
                fcu fcuVar = ezqVar.a;
                fcuVar.e(dwm.b, ihuVarA, i2, iylVar.a);
                iyk.A(iykVar, iylVar, Math.round(-fcuVar.b()), 0);
                return fctx.a;
            }
        });
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
