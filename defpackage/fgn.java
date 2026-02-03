package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgn extends jbi implements jcd, jbp, jbr {
    public fgr a;
    public final fhb b;

    public fgn(juo juoVar, jyq jyqVar, kbi kbiVar, fdap fdapVar, int i, boolean z, int i2, int i3, List list, fdap fdapVar2, fgr fgrVar, ijh ijhVar) {
        this.a = fgrVar;
        fhb fhbVar = new fhb(juoVar, jyqVar, kbiVar, fdapVar, i, z, i2, i3, list, fdapVar2, this.a, ijhVar, null);
        N(fhbVar);
        this.b = fhbVar;
        if (this.a != null) {
            return;
        }
        ebs.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new fcta();
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        return this.b.b(ixpVar, ixkVar, j);
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jbr
    public final void dR(ivy ivyVar) {
        fgr fgrVar = this.a;
        if (fgrVar != null) {
            fgrVar.d = fgu.a(fgrVar.d, ivyVar, null, 2);
            fgrVar.b.c(fgrVar.a);
        }
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        return this.b.e(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        return this.b.f(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        return this.b.g(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        return this.b.h(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) throws Throwable {
        this.b.r(imwVar);
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
