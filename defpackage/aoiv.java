package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoiv implements cqto {
    final /* synthetic */ aoiw a;

    public aoiv(aoiw aoiwVar) {
        this.a = aoiwVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        aoiw aoiwVar = this.a;
        cmlb cmlbVar = (cmlb) aoiwVar.g.b();
        int i = aoiwVar.d;
        Optional optionalI = cmlbVar.i(i);
        if (optionalI.isPresent() && (((cmmh) optionalI.get()).b & 1) != 0) {
            ((dggw) aoiwVar.f.b()).q(((cmmh) optionalI.get()).c, aoiwVar.e, aoiwVar.c);
            return;
        }
        ekrw ekrwVarJ = aoiw.a.j();
        ekrwVarJ.X(eksq.a, "BugleSelfIdentity");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.w, Integer.valueOf(i));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier$1", "onFirstRegister", 133, "SubscriptionRcsAvailabilitySupplier.java")).q("Not able to setup RCS availability listener since there is no available SIM ID for the subscription ID.");
    }

    @Override // defpackage.cqto
    public final void fK() {
        aoiw aoiwVar = this.a;
        ((dggw) aoiwVar.f.b()).t(aoiwVar.e);
    }
}
