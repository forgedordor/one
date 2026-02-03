package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokz {
    public static final /* synthetic */ dokj a(dokg dokgVar) {
        evsn evsnVarBuild = dokgVar.build();
        evsnVarBuild.getClass();
        return (dokj) evsnVarBuild;
    }

    public static final void b(dokf dokfVar, dokg dokgVar) {
        dokgVar.copyOnWrite();
        dokj dokjVar = (dokj) dokgVar.instance;
        dokj dokjVar2 = dokj.a;
        dokjVar.c = dokfVar;
        dokjVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public static final void c(doki dokiVar, dokg dokgVar) {
        dokgVar.copyOnWrite();
        dokj dokjVar = (dokj) dokgVar.instance;
        dokj dokjVar2 = dokj.a;
        dokjVar.c = dokiVar;
        dokjVar.b = 100;
    }
}
