package defpackage;

import android.util.Pair;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvpn implements dvjd {
    public static final String a = "dvpn";
    public final dvrd b;
    public final dvyx c;
    private final dviq d;

    public dvpn(dvrd dvrdVar, dvyx dvyxVar, dviq dviqVar) {
        this.b = dvrdVar;
        this.c = dvyxVar;
        this.d = dviqVar;
    }

    public static final dwhp c(dwje dwjeVar) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.g(93);
        return dwhpVarR;
    }

    public final void a(dwje dwjeVar, dvjc dvjcVar, Pair pair) {
        try {
            dwpx dwpxVar = (dwpx) pair.first;
            long jLongValue = ((Long) pair.second).longValue();
            ((cdrl) dvjcVar).d.b(dwpxVar.c().d());
            ((cdre) ((cdrl) dvjcVar).c.b()).c(jLongValue);
            this.b.b(dwjeVar).E((dwpx) pair.first);
        } catch (RuntimeException e) {
            dvyx dvyxVar = this.c;
            dwhp dwhpVarC = c(dwjeVar);
            dwhpVarC.d((dwpx) pair.first);
            dwhpVarC.f(713);
            dvyxVar.b(dwhpVarC.a());
            throw e;
        }
    }

    public final void b(dwje dwjeVar, dvjc dvjcVar, dwpo dwpoVar) {
        dwws dwwsVarB = this.b.b(dwjeVar);
        ejwi ejwiVarW = dwwsVarB.w(dwpoVar.h());
        dwov dwovVarN = dwwsVarB.n(dwpoVar.h());
        ejwi ejwiVarB = this.d.b(dwjeVar, ejwi.j(dwpoVar));
        ejwi ejwiVarA = dvju.a(ejwiVarW);
        try {
            dwpo dwpoVar2 = (dwpo) ejwiVarB.c();
            boolean zA = dwovVarN.a();
            long jD = dwpoVar.d();
            akhu akhuVar = (akhu) akhv.a.createBuilder();
            String strD = dwpoVar2.h().c().d();
            akhuVar.copyOnWrite();
            akhv akhvVar = (akhv) akhuVar.instance;
            akhvVar.b |= 1;
            akhvVar.c = strD;
            String string = ((JSONObject) dwpoVar2.h().f().c()).toString();
            akhuVar.copyOnWrite();
            akhv akhvVar2 = (akhv) akhuVar.instance;
            string.getClass();
            akhvVar2.b |= 2;
            akhvVar2.d = string;
            String str = (String) dwpoVar2.l().e("");
            akhuVar.copyOnWrite();
            akhv akhvVar3 = (akhv) akhuVar.instance;
            akhvVar3.b |= 4;
            akhvVar3.e = str;
            String str2 = (String) dwpoVar2.j().e("");
            akhuVar.copyOnWrite();
            akhv akhvVar4 = (akhv) akhuVar.instance;
            akhvVar4.b |= 16;
            akhvVar4.g = str2;
            long jA = dwpoVar2.a();
            akhuVar.copyOnWrite();
            akhv akhvVar5 = (akhv) akhuVar.instance;
            akhvVar5.b |= 512;
            akhvVar5.l = jA;
            akhuVar.copyOnWrite();
            akhv akhvVar6 = (akhv) akhuVar.instance;
            akhvVar6.b |= 1024;
            akhvVar6.m = jD;
            akhuVar.copyOnWrite();
            akhv akhvVar7 = (akhv) akhuVar.instance;
            akhvVar7.b |= 256;
            akhvVar7.k = zA;
            if (ejwiVarA.g()) {
                long millis = TimeUnit.MICROSECONDS.toMillis(((dwqw) ejwiVarA.c()).d());
                akhuVar.copyOnWrite();
                akhv akhvVar8 = (akhv) akhuVar.instance;
                akhvVar8.b |= 32;
                akhvVar8.h = millis;
                String str3 = (String) ((dwqw) ejwiVarA.c()).m().e("");
                akhuVar.copyOnWrite();
                akhv akhvVar9 = (akhv) akhuVar.instance;
                akhvVar9.b |= 8;
                akhvVar9.f = str3;
                boolean z = !((dwqw) ejwiVarA.c()).i().equals(dwqq.INCOMING_RECEIVED);
                akhuVar.copyOnWrite();
                akhv akhvVar10 = (akhv) akhuVar.instance;
                akhvVar10.b |= 64;
                akhvVar10.i = z;
                boolean zContains = dwqq.n.contains(((dwqw) ejwiVarA.c()).i());
                akhuVar.copyOnWrite();
                akhv akhvVar11 = (akhv) akhuVar.instance;
                akhvVar11.b |= 128;
                akhvVar11.j = zContains;
            } else {
                akhuVar.copyOnWrite();
                akhv akhvVar12 = (akhv) akhuVar.instance;
                akhvVar12.b |= 8;
                akhvVar12.f = "";
                akhuVar.copyOnWrite();
                akhv akhvVar13 = (akhv) akhuVar.instance;
                akhvVar13.b |= 64;
                akhvVar13.i = true;
                akhuVar.copyOnWrite();
                akhv akhvVar14 = (akhv) akhuVar.instance;
                akhvVar14.b |= 128;
                akhvVar14.j = false;
            }
            ((cdrl) dvjcVar).d.a((akhv) akhuVar.build());
            ((cdre) ((cdrl) dvjcVar).c.b()).c(jD);
        } catch (RuntimeException e) {
            dvyx dvyxVar = this.c;
            dwhp dwhpVarC = c(dwjeVar);
            dwhpVarC.d(dwpoVar.h());
            dwhpVarC.f(713);
            dvyxVar.b(dwhpVarC.a());
            throw e;
        }
    }
}
