package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aylz {
    private final fcsu a;
    private final cogw b;

    public aylz(fcsu fcsuVar, cogw cogwVar) {
        this.a = fcsuVar;
        this.b = cogwVar;
    }

    public final void a(ayly aylyVar) {
        aylt ayltVar = (aylt) aylyVar;
        evvp evvpVarC = ayltVar.d;
        if (evvpVarC == null) {
            evvpVarC = evxc.c(this.b.f().toEpochMilli());
        }
        b(ayltVar.a, ayltVar.b, ayltVar.e, ayltVar.f, ayltVar.g, Optional.ofNullable(ayltVar.c), evvpVarC);
    }

    public final void b(fhaz fhazVar, basd basdVar, int i, int i2, int i3, Optional optional, evvp evvpVar) {
        if (cqdz.a(fhazVar)) {
            febx febxVar = (febx) fecc.a.createBuilder();
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).e = fecb.a(i);
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).f = fhba.a(i2);
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).g = feca.a(i3);
            febxVar.copyOnWrite();
            fecc feccVar = (fecc) febxVar.instance;
            evvpVar.getClass();
            feccVar.h = evvpVar;
            feccVar.b |= 4;
            if (fhazVar != null) {
                febxVar.copyOnWrite();
                fecc feccVar2 = (fecc) febxVar.instance;
                feccVar2.c = fhazVar;
                feccVar2.b |= 1;
            }
            if (optional.isPresent()) {
                feby febyVar = (feby) febz.a.createBuilder();
                febt febtVar = (febt) optional.get();
                febyVar.copyOnWrite();
                febz febzVar = (febz) febyVar.instance;
                febzVar.c = Integer.valueOf(febtVar.a());
                febzVar.b = 2;
                febxVar.copyOnWrite();
                fecc feccVar3 = (fecc) febxVar.instance;
                febz febzVar2 = (febz) febyVar.build();
                febzVar2.getClass();
                feccVar3.i = febzVar2;
                feccVar3.b |= 32;
            }
            if (basdVar != null && basd.l(basdVar)) {
                febv febvVar = (febv) febw.a.createBuilder();
                febvVar.a(basdVar.f());
                febxVar.copyOnWrite();
                fecc feccVar4 = (fecc) febxVar.instance;
                febw febwVar = (febw) febvVar.build();
                febwVar.getClass();
                feccVar4.d = febwVar;
                feccVar4.b |= 2;
            }
            long jA = evxc.a(evvpVar);
            aill aillVar = (aill) this.a.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.XSL_REQUEST_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            fecc feccVar5 = (fecc) febxVar.build();
            feccVar5.getClass();
            ellhVar2.aS = feccVar5;
            ellhVar2.e |= 16777216;
            aillVar.l(ellgVar, emxt.XSL_REQUEST_EVENT, jA);
        }
    }

    public final void c(fhaz fhazVar, basd basdVar, int i, Optional optional) {
        b(fhazVar, basdVar, 10, 21, i, optional, evxc.c(this.b.f().toEpochMilli()));
    }
}
