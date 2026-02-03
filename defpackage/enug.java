package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enug {
    public static final /* synthetic */ enga a(enfz enfzVar) {
        evsn evsnVarBuild = enfzVar.build();
        evsnVarBuild.getClass();
        return (enga) evsnVarBuild;
    }

    public static final void b(evrj evrjVar, enfz enfzVar) {
        enfzVar.copyOnWrite();
        enga engaVar = (enga) enfzVar.instance;
        enga engaVar2 = enga.a;
        engaVar.f = evrjVar;
        engaVar.b |= 2;
    }

    public static final void c(boolean z, enfz enfzVar) {
        enfzVar.copyOnWrite();
        enga engaVar = (enga) enfzVar.instance;
        enga engaVar2 = enga.a;
        engaVar.b |= 1;
        engaVar.e = z;
    }

    public static final void d(engc engcVar, enfz enfzVar) {
        enfzVar.copyOnWrite();
        enga engaVar = (enga) enfzVar.instance;
        enga engaVar2 = enga.a;
        engaVar.d = engcVar;
        engaVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }
}
