package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enui {
    public static final /* synthetic */ emvw a(emvv emvvVar) {
        evsn evsnVarBuild = emvvVar.build();
        evsnVarBuild.getClass();
        return (emvw) evsnVarBuild;
    }

    public static final void b(boolean z, emvv emvvVar) {
        emvvVar.copyOnWrite();
        emvw emvwVar = (emvw) emvvVar.instance;
        emvw emvwVar2 = emvw.a;
        emvwVar.b |= 1;
        emvwVar.e = z;
    }

    public static final void c(evrj evrjVar, emvv emvvVar) {
        emvvVar.copyOnWrite();
        emvw emvwVar = (emvw) emvvVar.instance;
        emvw emvwVar2 = emvw.a;
        emvwVar.f = evrjVar;
        emvwVar.b |= 2;
    }

    public static final void d(emvy emvyVar, emvv emvvVar) {
        emvvVar.copyOnWrite();
        emvw emvwVar = (emvw) emvvVar.instance;
        emvw emvwVar2 = emvw.a;
        emvwVar.d = emvyVar;
        emvwVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }
}
