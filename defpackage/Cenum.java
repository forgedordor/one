package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* renamed from: enum, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cenum {
    public static final /* synthetic */ engu a(engt engtVar) {
        evsn evsnVarBuild = engtVar.build();
        evsnVarBuild.getClass();
        return (engu) evsnVarBuild;
    }

    public static final void b(engw engwVar, engt engtVar) {
        engtVar.copyOnWrite();
        engu enguVar = (engu) engtVar.instance;
        engu enguVar2 = engu.a;
        enguVar.d = engwVar;
        enguVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public static final void c(boolean z, engt engtVar) {
        engtVar.copyOnWrite();
        engu enguVar = (engu) engtVar.instance;
        engu enguVar2 = engu.a;
        enguVar.b |= 1;
        enguVar.e = z;
    }
}
