package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbuj implements cbvk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/client/MalformingMlsClientSync");
    private final cbui b;
    private final cbvk c;

    public cbuj(cbui cbuiVar, cbvk cbvkVar) {
        cbuiVar.getClass();
        this.b = cbuiVar;
        this.c = cbvkVar;
    }

    @Override // defpackage.cbvk
    public final ccfx a(enba enbaVar, int i) {
        return this.c.a(enbaVar, i);
    }

    @Override // defpackage.cbvk
    public final eprb b(ccep ccepVar, List list, enba enbaVar) {
        return this.c.b(ccepVar, list, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epun c(cbwd cbwdVar, cchc cchcVar, epsb epsbVar, int i, enba enbaVar) {
        return this.c.c(cbwdVar, cchcVar, epsbVar, i, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epun d(cbwd cbwdVar, cchc cchcVar, eprw eprwVar, ccep ccepVar, int i, enba enbaVar) {
        return this.c.d(cbwdVar, cchcVar, eprwVar, ccepVar, i, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epun e(cbwd cbwdVar, cchc cchcVar, eprw eprwVar, int i, enba enbaVar) {
        return this.c.e(cbwdVar, cchcVar, eprwVar, i, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epuq f(cbwd cbwdVar, ccep ccepVar, basd basdVar, ccct ccctVar, enba enbaVar) {
        return j(this.c.f(cbwdVar, ccepVar, basdVar, ccctVar, enbaVar));
    }

    @Override // defpackage.cbvk
    public final epuq g(ccep ccepVar, eprw eprwVar, enba enbaVar) {
        return this.c.g(ccepVar, eprwVar, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epuq h(ccep ccepVar, epsb epsbVar, enba enbaVar) {
        return this.c.h(ccepVar, epsbVar, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epuq i(enba enbaVar, ccep ccepVar) {
        return this.c.i(enbaVar, ccepVar);
    }

    public final epuq j(epuq epuqVar) {
        epuqVar.getClass();
        fdhw fdhwVar = this.b.a;
        if (!fdhwVar.b()) {
            return epuqVar;
        }
        epup epupVar = (epup) epuqVar.toBuilder();
        epupVar.getClass();
        DesugarCollections.unmodifiableList(((epuq) epupVar.instance).b).getClass();
        epupVar.copyOnWrite();
        ((epuq) epupVar.instance).b = epuq.emptyProtobufList();
        for (epun epunVar : epuqVar.b) {
            if (epunVar.c == 4 && ((epuc) epunVar.d).c == 1 && fdhwVar.a(true, false)) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleE2eeMls");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.e, (epunVar.c == 4 ? (epuc) epunVar.d : epuc.a).e.E());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/MalformingMlsClientSync", "malformFirstApplicationMessageInResults", 96, "MalformingMlsClientSync.kt")).q("Malforming outgoing message payload (on purpose)");
                DesugarCollections.unmodifiableList(((epuq) epupVar.instance).b).getClass();
                epunVar.getClass();
                epum epumVar = (epum) epunVar.toBuilder();
                epumVar.getClass();
                epun epunVar2 = (epun) epumVar.instance;
                epuc epucVar = epunVar2.c == 4 ? (epuc) epunVar2.d : epuc.a;
                epucVar.getClass();
                epub epubVar = (epub) epucVar.toBuilder();
                epubVar.getClass();
                epuc epucVar2 = (epuc) epubVar.instance;
                evqs evqsVarX = epucVar2.c == 1 ? (evqs) epucVar2.d : evqs.b;
                evqsVarX.getClass();
                if (evqsVarX.d() >= 5) {
                    int iD = evqsVarX.d() - 5;
                    int iA = evqsVarX.a(iD) + 1;
                    byte[] bArrI = evqsVarX.I();
                    bArrI[iD] = (byte) iA;
                    evqsVarX = evqs.x(bArrI);
                }
                epud.b(evqsVarX, epubVar);
                epuo.b(epud.a(epubVar), epumVar);
                epur.a(epuo.a(epumVar), epupVar);
            } else {
                DesugarCollections.unmodifiableList(((epuq) epupVar.instance).b).getClass();
                epunVar.getClass();
                epur.a(epunVar, epupVar);
            }
        }
        evsn evsnVarBuild = epupVar.build();
        evsnVarBuild.getClass();
        return (epuq) evsnVarBuild;
    }

    @Override // defpackage.cbvk
    public final epuq k(ccep ccepVar, epti eptiVar, enba enbaVar) {
        return this.c.k(ccepVar, eptiVar, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epuq l(cbwd cbwdVar, List list, evqs evqsVar, enba enbaVar) {
        return this.c.l(cbwdVar, list, evqsVar, enbaVar);
    }

    @Override // defpackage.cbvk
    public final epuq m(cbwd cbwdVar, eyxu eyxuVar) {
        return this.c.m(cbwdVar, eyxuVar);
    }

    @Override // defpackage.cbvk
    public final epuq n(cbwd cbwdVar, cchc cchcVar, int i, evqs evqsVar, aubq aubqVar, enba enbaVar, basd basdVar) {
        cbwdVar.getClass();
        enbaVar.getClass();
        return j(this.c.n(cbwdVar, cchcVar, i, evqsVar, aubqVar, enbaVar, basdVar));
    }

    @Override // defpackage.cbvk
    public final void o(enba enbaVar) {
        this.c.o(enbaVar);
    }

    @Override // defpackage.cbvk
    public final boolean p(ccep ccepVar, enba enbaVar) {
        return this.c.p(ccepVar, enbaVar);
    }
}
