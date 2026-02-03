package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkm extends dzkn {
    public static final dzkm a = new dzkm();

    private dzkm() {
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh a(String str, Object obj) {
        HealthStats healthStatsM166m = aky$$ExternalSyntheticApiModelOutline0.m166m(obj);
        fedd feddVar = (fedd) fede.a.createBuilder();
        long jA = dzkq.a(healthStatsM166m, 30001);
        if (jA != 0) {
            feddVar.copyOnWrite();
            fede fedeVar = (fede) feddVar.instance;
            fedeVar.b |= 1;
            fedeVar.c = jA;
        }
        long jA2 = dzkq.a(healthStatsM166m, 30002);
        if (jA2 != 0) {
            feddVar.copyOnWrite();
            fede fedeVar2 = (fede) feddVar.instance;
            fedeVar2.b |= 2;
            fedeVar2.d = jA2;
        }
        long jA3 = dzkq.a(healthStatsM166m, 30003);
        if (jA3 != 0) {
            feddVar.copyOnWrite();
            fede fedeVar3 = (fede) feddVar.instance;
            fedeVar3.b |= 4;
            fedeVar3.e = jA3;
        }
        long jA4 = dzkq.a(healthStatsM166m, 30004);
        if (jA4 != 0) {
            feddVar.copyOnWrite();
            fede fedeVar4 = (fede) feddVar.instance;
            fedeVar4.b |= 8;
            fedeVar4.f = jA4;
        }
        long jA5 = dzkq.a(healthStatsM166m, 30005);
        if (jA5 != 0) {
            feddVar.copyOnWrite();
            fede fedeVar5 = (fede) feddVar.instance;
            fedeVar5.b |= 16;
            fedeVar5.g = jA5;
        }
        long jA6 = dzkq.a(healthStatsM166m, 30006);
        if (jA6 != 0) {
            feddVar.copyOnWrite();
            fede fedeVar6 = (fede) feddVar.instance;
            fedeVar6.b |= 32;
            fedeVar6.h = jA6;
        }
        if (str != null) {
            fecy fecyVarD = dzkq.d(str);
            feddVar.copyOnWrite();
            fede fedeVar7 = (fede) feddVar.instance;
            fecyVarD.getClass();
            fedeVar7.i = fecyVarD;
            fedeVar7.b |= 64;
        }
        fede fedeVar8 = (fede) feddVar.build();
        if (dzkq.j(fedeVar8)) {
            return null;
        }
        return fedeVar8;
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh b(evuh evuhVar, evuh evuhVar2) {
        fede fedeVar = (fede) evuhVar;
        fede fedeVar2 = (fede) evuhVar2;
        if (fedeVar == null || fedeVar2 == null) {
            return fedeVar;
        }
        fedd feddVar = (fedd) fede.a.createBuilder();
        if ((fedeVar.b & 1) != 0) {
            long j = fedeVar.c - fedeVar2.c;
            if (j != 0) {
                feddVar.copyOnWrite();
                fede fedeVar3 = (fede) feddVar.instance;
                fedeVar3.b |= 1;
                fedeVar3.c = j;
            }
        }
        if ((fedeVar.b & 2) != 0) {
            long j2 = fedeVar.d - fedeVar2.d;
            if (j2 != 0) {
                feddVar.copyOnWrite();
                fede fedeVar4 = (fede) feddVar.instance;
                fedeVar4.b |= 2;
                fedeVar4.d = j2;
            }
        }
        if ((fedeVar.b & 4) != 0) {
            long j3 = fedeVar.e - fedeVar2.e;
            if (j3 != 0) {
                feddVar.copyOnWrite();
                fede fedeVar5 = (fede) feddVar.instance;
                fedeVar5.b |= 4;
                fedeVar5.e = j3;
            }
        }
        if ((fedeVar.b & 8) != 0) {
            long j4 = fedeVar.f - fedeVar2.f;
            if (j4 != 0) {
                feddVar.copyOnWrite();
                fede fedeVar6 = (fede) feddVar.instance;
                fedeVar6.b |= 8;
                fedeVar6.f = j4;
            }
        }
        if ((fedeVar.b & 16) != 0) {
            long j5 = fedeVar.g - fedeVar2.g;
            if (j5 != 0) {
                feddVar.copyOnWrite();
                fede fedeVar7 = (fede) feddVar.instance;
                fedeVar7.b |= 16;
                fedeVar7.g = j5;
            }
        }
        if ((fedeVar.b & 32) != 0) {
            long j6 = fedeVar.h - fedeVar2.h;
            if (j6 != 0) {
                feddVar.copyOnWrite();
                fede fedeVar8 = (fede) feddVar.instance;
                fedeVar8.b |= 32;
                fedeVar8.h = j6;
            }
        }
        fecy fecyVar = fedeVar.i;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        feddVar.copyOnWrite();
        fede fedeVar9 = (fede) feddVar.instance;
        fecyVar.getClass();
        fedeVar9.i = fecyVar;
        fedeVar9.b |= 64;
        fede fedeVar10 = (fede) feddVar.build();
        if (dzkq.j(fedeVar10)) {
            return null;
        }
        return fedeVar10;
    }

    @Override // defpackage.dzkn
    public final /* bridge */ /* synthetic */ String c(evuh evuhVar) {
        fecy fecyVar = ((fede) evuhVar).i;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        return fecyVar.d;
    }
}
