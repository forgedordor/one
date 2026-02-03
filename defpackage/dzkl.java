package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkl extends dzkn {
    public static final dzkl a = new dzkl();

    private dzkl() {
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh a(String str, Object obj) {
        HealthStats healthStatsM166m = aky$$ExternalSyntheticApiModelOutline0.m166m(obj);
        fecz feczVar = (fecz) feda.a.createBuilder();
        feczVar.a(dzko.a.d(dzkq.c(healthStatsM166m, 40001)));
        feczVar.b(dzkk.a.d((healthStatsM166m == null || !healthStatsM166m.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStatsM166m.getMeasurements(40002)));
        if (str != null) {
            fecy fecyVarD = dzkq.d(str);
            feczVar.copyOnWrite();
            feda fedaVar = (feda) feczVar.instance;
            fecyVarD.getClass();
            fedaVar.e = fecyVarD;
            fedaVar.b |= 1;
        }
        feda fedaVar2 = (feda) feczVar.build();
        if (dzkq.i(fedaVar2)) {
            return null;
        }
        return fedaVar2;
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh b(evuh evuhVar, evuh evuhVar2) {
        feda fedaVar = (feda) evuhVar;
        feda fedaVar2 = (feda) evuhVar2;
        if (fedaVar == null || fedaVar2 == null) {
            return fedaVar;
        }
        fecz feczVar = (fecz) feda.a.createBuilder();
        feczVar.a(dzko.a.e(fedaVar.c, fedaVar2.c));
        feczVar.b(dzkk.a.e(fedaVar.d, fedaVar2.d));
        fecy fecyVar = fedaVar.e;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        feczVar.copyOnWrite();
        feda fedaVar3 = (feda) feczVar.instance;
        fecyVar.getClass();
        fedaVar3.e = fecyVar;
        fedaVar3.b |= 1;
        feda fedaVar4 = (feda) feczVar.build();
        if (dzkq.i(fedaVar4)) {
            return null;
        }
        return fedaVar4;
    }

    @Override // defpackage.dzkn
    public final /* bridge */ /* synthetic */ String c(evuh evuhVar) {
        fecy fecyVar = ((feda) evuhVar).e;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        return fecyVar.d;
    }
}
