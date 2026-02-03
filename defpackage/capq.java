package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capq implements bzaa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/participants/CmsRestoreParticipantsWorkerAdapter");
    public final cpmc b;
    public final caiy c;
    private final byxd d;
    private final apoy e;
    private final aurx f;
    private final eosc g;
    private final aqfp h;

    public capq(cpmc cpmcVar, byxd byxdVar, aurx aurxVar, apoy apoyVar, eosc eoscVar, aqfp aqfpVar, caiy caiyVar) {
        this.b = cpmcVar;
        this.d = byxdVar;
        this.f = aurxVar;
        this.e = apoyVar;
        this.g = eoscVar;
        this.h = aqfpVar;
        this.c = caiyVar;
    }

    @Override // defpackage.bzaa
    public final aumn a() {
        return aumn.PARTICIPANTS;
    }

    @Override // defpackage.bzaa
    public final bmra b() {
        return bmra.PARTICIPANT;
    }

    @Override // defpackage.bzaa
    public final bykl c() {
        return this.d;
    }

    @Override // defpackage.bzaa
    public final eiju d(String str) {
        return i(str, this.h.a());
    }

    @Override // defpackage.bzaa
    public final eiju e(pzs pzsVar) {
        return eijx.e(null);
    }

    @Override // defpackage.bzaa
    public final emec f() {
        return emec.RESTORE_PARTICIPANT;
    }

    @Override // defpackage.bzaa
    public final /* synthetic */ String g(Object obj) {
        return ((eqnl) obj).c;
    }

    @Override // defpackage.bzaa
    public final String h() {
        return "Participants";
    }

    public final eiju i(final String str, final boolean z) {
        if (this.h.a()) {
            caiy caiyVar = this.c;
            eiju eijuVarB = caiyVar.b(str, eqnl.class);
            if (eijuVarB == null) {
                eijuVarB = null;
            } else if (z) {
                eijuVarB = caiyVar.a(eijuVarB, new fdap() { // from class: capl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return this.a.i((String) obj, false);
                    }
                }, eqnl.class);
            }
            if (eijuVarB != null) {
                return eijuVarB;
            }
        }
        if (this.e.a()) {
            return this.f.m().i(new eooz() { // from class: capm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    String str2 = str;
                    final capq capqVar = this.a;
                    boolean z2 = z;
                    evvp evvpVar = (evvp) obj;
                    if (evvpVar == null || evvpVar.equals(evxc.c)) {
                        ekrw ekrwVarE = capq.a.e();
                        ekrwVarE.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/participants/CmsRestoreParticipantsWorkerAdapter", "listCmsItems", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CmsRestoreParticipantsWorkerAdapter.java")).q("CmsRestoreParticipantsWorkerAdapter: Cms Delta sync timestamp is not present.");
                        eiju eijuVarP = capqVar.b.P(str2);
                        return !z2 ? eijuVarP : capqVar.c.a(eijuVarP, new fdap() { // from class: capp
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                return capqVar.i((String) obj2, false);
                            }
                        }, eqnl.class);
                    }
                    ekrw ekrwVarH = capq.a.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/participants/CmsRestoreParticipantsWorkerAdapter", "listCmsItems", 87, "CmsRestoreParticipantsWorkerAdapter.java")).t("CmsRestoreParticipantsWorkerAdapter: Passing delta sync timestamp %s in ListParticipants.", evxc.h(evvpVar));
                    eiju eijuVarQ = capqVar.b.Q(str2, evvpVar);
                    return !z2 ? eijuVarQ : capqVar.c.a(eijuVarQ, new fdap() { // from class: capo
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            return capqVar.i((String) obj2, false);
                        }
                    }, eqnl.class);
                }
            }, this.g);
        }
        eiju eijuVarP = this.b.P(str);
        return z ? this.c.a(eijuVarP, new fdap() { // from class: capn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return this.a.i((String) obj, false);
            }
        }, eqnl.class) : eijuVarP;
    }
}
