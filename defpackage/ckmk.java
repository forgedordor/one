package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmk {
    public static final /* synthetic */ ckmb a(ckma ckmaVar) {
        evsn evsnVarBuild = ckmaVar.build();
        evsnVarBuild.getClass();
        return (ckmb) evsnVarBuild;
    }

    public static final void b(dnwn dnwnVar, ckma ckmaVar) {
        ckmaVar.copyOnWrite();
        ckmb ckmbVar = (ckmb) ckmaVar.instance;
        ckmb ckmbVar2 = ckmb.a;
        ckmbVar.c = dnwnVar;
        ckmbVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public static final void c(String str, ckma ckmaVar) {
        ckmaVar.copyOnWrite();
        ckmb ckmbVar = (ckmb) ckmaVar.instance;
        ckmb ckmbVar2 = ckmb.a;
        ckmbVar.d = str;
    }

    public static final void d(ckml ckmlVar, ckma ckmaVar) {
        ckmlVar.getClass();
        ckmaVar.copyOnWrite();
        ckmb ckmbVar = (ckmb) ckmaVar.instance;
        ckmb ckmbVar2 = ckmb.a;
        ckmbVar.e = ckmlVar.a();
    }
}
