package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donf {
    public static final dona a(dohq dohqVar) {
        domz domzVar;
        dohqVar.getClass();
        domx domxVar = (domx) dona.a.createBuilder();
        domxVar.getClass();
        doin doinVarN = dohqVar.n();
        doinVarN.getClass();
        int iOrdinal = doinVarN.ordinal();
        if (iOrdinal == 0) {
            domzVar = domz.VERY_LOW;
        } else if (iOrdinal == 1) {
            domzVar = domz.LOW;
        } else if (iOrdinal == 2) {
            domzVar = domz.HIGH;
        } else {
            if (iOrdinal != 3) {
                throw new fctg();
            }
            domzVar = domz.ORIGINAL;
        }
        domzVar.getClass();
        domxVar.copyOnWrite();
        dona donaVar = (dona) domxVar.instance;
        donaVar.c = domzVar.a();
        donaVar.b |= 1;
        String strA = dohqVar.l().c().a();
        strA.getClass();
        domxVar.copyOnWrite();
        dona donaVar2 = (dona) domxVar.instance;
        donaVar2.b = 2 | donaVar2.b;
        donaVar2.d = strA;
        String strF = dohqVar.f();
        domxVar.copyOnWrite();
        dona donaVar3 = (dona) domxVar.instance;
        donaVar3.b |= 4;
        donaVar3.e = strF;
        if (dohqVar instanceof dohp) {
            dohp dohpVar = (dohp) dohqVar;
            int iJ = dohpVar.j();
            domxVar.copyOnWrite();
            dona donaVar4 = (dona) domxVar.instance;
            donaVar4.b |= 8;
            donaVar4.g = iJ;
            int iH = dohpVar.h();
            domxVar.copyOnWrite();
            dona donaVar5 = (dona) domxVar.instance;
            donaVar5.b |= 16;
            donaVar5.h = iH;
        }
        long jA = dohqVar.a();
        domxVar.copyOnWrite();
        dona donaVar6 = (dona) domxVar.instance;
        donaVar6.b |= 32;
        donaVar6.i = jA;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(donaVar6.f)).getClass();
        Map mapO = dohqVar.o();
        if (mapO == null) {
            mapO = fcvp.a;
        }
        domxVar.copyOnWrite();
        dona donaVar7 = (dona) domxVar.instance;
        evub evubVar = donaVar7.f;
        if (!evubVar.b) {
            donaVar7.f = evubVar.a();
        }
        donaVar7.f.putAll(mapO);
        evsn evsnVarBuild = domxVar.build();
        evsnVarBuild.getClass();
        return (dona) evsnVarBuild;
    }
}
