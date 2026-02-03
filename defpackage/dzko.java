package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzko extends dzkn {
    public static final dzko a = new dzko();

    private dzko() {
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh a(String str, Object obj) {
        HealthStats healthStatsM166m = aky$$ExternalSyntheticApiModelOutline0.m166m(obj);
        fedf fedfVar = (fedf) fedg.a.createBuilder();
        int iA = (int) dzkq.a(healthStatsM166m, 50001);
        if (iA != 0) {
            fedfVar.copyOnWrite();
            fedg fedgVar = (fedg) fedfVar.instance;
            fedgVar.b |= 1;
            fedgVar.c = iA;
        }
        int iA2 = (int) dzkq.a(healthStatsM166m, 50002);
        if (iA2 != 0) {
            fedfVar.copyOnWrite();
            fedg fedgVar2 = (fedg) fedfVar.instance;
            fedgVar2.b |= 2;
            fedgVar2.d = iA2;
        }
        if (str != null) {
            fecy fecyVarD = dzkq.d(str);
            fedfVar.copyOnWrite();
            fedg fedgVar3 = (fedg) fedfVar.instance;
            fecyVarD.getClass();
            fedgVar3.e = fecyVarD;
            fedgVar3.b |= 4;
        }
        fedg fedgVar4 = (fedg) fedfVar.build();
        if (dzkq.k(fedgVar4)) {
            return null;
        }
        return fedgVar4;
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh b(evuh evuhVar, evuh evuhVar2) {
        int i;
        int i2;
        fedg fedgVar = (fedg) evuhVar;
        fedg fedgVar2 = (fedg) evuhVar2;
        if (fedgVar == null || fedgVar2 == null) {
            return fedgVar;
        }
        fedf fedfVar = (fedf) fedg.a.createBuilder();
        if ((fedgVar.b & 1) != 0 && (i2 = fedgVar.c - fedgVar2.c) != 0) {
            fedfVar.copyOnWrite();
            fedg fedgVar3 = (fedg) fedfVar.instance;
            fedgVar3.b |= 1;
            fedgVar3.c = i2;
        }
        if ((fedgVar.b & 2) != 0 && (i = fedgVar.d - fedgVar2.d) != 0) {
            fedfVar.copyOnWrite();
            fedg fedgVar4 = (fedg) fedfVar.instance;
            fedgVar4.b |= 2;
            fedgVar4.d = i;
        }
        fecy fecyVar = fedgVar.e;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        fedfVar.copyOnWrite();
        fedg fedgVar5 = (fedg) fedfVar.instance;
        fecyVar.getClass();
        fedgVar5.e = fecyVar;
        fedgVar5.b |= 4;
        fedg fedgVar6 = (fedg) fedfVar.build();
        if (dzkq.k(fedgVar6)) {
            return null;
        }
        return fedgVar6;
    }

    @Override // defpackage.dzkn
    public final /* bridge */ /* synthetic */ String c(evuh evuhVar) {
        fecy fecyVar = ((fedg) evuhVar).e;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        return fecyVar.d;
    }
}
