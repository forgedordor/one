package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsq implements cmpi {
    public final cmss a;
    public final cmsm b;
    public final cmnp c;
    private final cmsr d;
    private final eosc e;
    private final aspc f;

    public cmsq(cmss cmssVar, cmsm cmsmVar, cmsr cmsrVar, aspc aspcVar, cmnp cmnpVar, eosc eoscVar) {
        this.a = cmssVar;
        this.b = cmsmVar;
        this.d = cmsrVar;
        this.f = aspcVar;
        this.c = cmnpVar;
        this.e = eoscVar;
    }

    @Override // defpackage.cmpi
    public final eiju a(final MessageCoreData messageCoreData, final asrg asrgVar, Optional optional) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("UnencryptedRcsChatMessageSender#sendChatMessage");
        try {
            aufs aufsVar = (aufs) aufx.a.createBuilder();
            aufw aufwVar = aufw.USER;
            aufsVar.copyOnWrite();
            aufx aufxVar = (aufx) aufsVar.instance;
            aufxVar.c = aufwVar.d;
            aufxVar.b |= 1;
            aufu aufuVar = aufu.HIGH;
            aufsVar.copyOnWrite();
            aufx aufxVar2 = (aufx) aufsVar.instance;
            aufxVar2.d = aufuVar.e;
            aufxVar2.b |= 2;
            aufsVar.copyOnWrite();
            aufx aufxVar3 = (aufx) aufsVar.instance;
            aufxVar3.b |= 4;
            aufxVar3.e = true;
            final aufx aufxVar4 = (aufx) aufsVar.build();
            if (messageCoreData.cl() && !messageCoreData.cE()) {
                eijuVarH = this.c.f(messageCoreData, asrgVar, this.d, new cmsn(), (aucl) optional.orElse(null), aufxVar4);
            } else if (messageCoreData.cr()) {
                cmnp cmnpVar = this.c;
                aspc aspcVar = this.f;
                cmsn cmsnVar = new cmsn();
                eieu eieuVarK2 = eiiy.k("ChatApiSender::sendRbmSuggestionResponse");
                try {
                    if (messageCoreData.cr()) {
                        basd basdVarF = messageCoreData.F();
                        auhe auheVar = (auhe) auhf.a.createBuilder();
                        String strF = basdVarF.f();
                        auheVar.copyOnWrite();
                        auhf auhfVar = (auhf) auheVar.instance;
                        auhfVar.b |= 1;
                        auhfVar.e = strF;
                        auhw auhwVar = (auhw) auhx.a.createBuilder();
                        evvp evvpVarC = evxc.c(messageCoreData.r());
                        auhwVar.copyOnWrite();
                        auhx auhxVar = (auhx) auhwVar.instance;
                        evvpVarC.getClass();
                        auhxVar.c = evvpVarC;
                        auhxVar.b = 1 | auhxVar.b;
                        auheVar.copyOnWrite();
                        auhf auhfVar2 = (auhf) auheVar.instance;
                        auhx auhxVar2 = (auhx) auhwVar.build();
                        auhxVar2.getClass();
                        auhfVar2.d = auhxVar2;
                        auhfVar2.c = 7;
                        auib auibVarA = cmnpVar.a(messageCoreData);
                        auheVar.copyOnWrite();
                        auhf auhfVar3 = (auhf) auheVar.instance;
                        auibVarA.getClass();
                        auhfVar3.g = auibVarA;
                        auhfVar3.b |= 4;
                        eijuVarH = cmnpVar.n(messageCoreData, eijx.g(new Callable() { // from class: aspb
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                aubs aubsVar = (aubs) aubt.a.createBuilder();
                                String strAz = messageCoreData.az();
                                strAz.getClass();
                                evqs evqsVarA = evqs.A(strAz);
                                aubsVar.copyOnWrite();
                                aubt aubtVar = (aubt) aubsVar.instance;
                                aubtVar.b |= 2;
                                aubtVar.d = evqsVarA;
                                aubv aubvVar = (aubv) aubx.a.createBuilder();
                                aubvVar.copyOnWrite();
                                aubx aubxVar = (aubx) aubvVar.instance;
                                aubxVar.b |= 1;
                                aubxVar.c = "application";
                                aubvVar.copyOnWrite();
                                aubx aubxVar2 = (aubx) aubvVar.instance;
                                aubxVar2.b |= 2;
                                aubxVar2.d = "vnd.gsma.botsuggestion.response.v1.0+json";
                                aubsVar.copyOnWrite();
                                aubt aubtVar2 = (aubt) aubsVar.instance;
                                aubx aubxVar3 = (aubx) aubvVar.build();
                                aubxVar3.getClass();
                                aubtVar2.c = aubxVar3;
                                aubtVar2.b |= 1;
                                return (aubt) aubsVar.build();
                            }
                        }, aspcVar.a), asrgVar, cmsnVar, aufxVar4, basdVarF, (auhf) auheVar.build(), 6);
                    } else {
                        eijuVarH = eijx.e(cmnp.b);
                    }
                    eieuVarK2.b(eijuVarH);
                    eieuVarK2.close();
                } finally {
                }
            } else {
                eiju eijuVarO = this.c.o(messageCoreData, asrgVar, this.a, new cmsn(), aufxVar4);
                eooz eoozVar = new eooz() { // from class: cmso
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        chvf chvfVar = (chvf) obj;
                        if (chvfVar.c() != 0) {
                            return eijx.e(chvfVar);
                        }
                        aufx aufxVar5 = aufxVar4;
                        asrg asrgVar2 = asrgVar;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        cmsq cmsqVar = this.a;
                        return cmsqVar.c.g(messageCoreData2, asrgVar2, cmsqVar.b, new cmsn(), aufxVar5);
                    }
                };
                eosc eoscVar = this.e;
                eijuVarH = eijuVarO.i(eoozVar, eoscVar).h(new ejvr() { // from class: cmsp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        chvf chvfVar = (chvf) obj;
                        if (chvfVar.c() != 0) {
                            return chvfVar;
                        }
                        MessageCoreData messageCoreData2 = messageCoreData;
                        cmsq cmsqVar = this.a;
                        if (cmnp.p(messageCoreData2) || cmnp.j(messageCoreData2, cmsqVar.b)) {
                            return chvfVar;
                        }
                        chve chveVarJ = chvf.j(3, 10003);
                        chveVarJ.b(1);
                        enxt enxtVar = (enxt) enxu.a.createBuilder();
                        enxv enxvVar = (enxv) enxw.a.createBuilder();
                        enxvVar.copyOnWrite();
                        enxw enxwVar = (enxw) enxvVar.instance;
                        enxwVar.e = 1;
                        enxwVar.b |= 4;
                        enxi enxiVar = enxi.CHAT_API_EMPTY_CHAT_MESSAGE;
                        enxvVar.copyOnWrite();
                        enxw enxwVar2 = (enxw) enxvVar.instance;
                        enxwVar2.f = enxiVar.D;
                        enxwVar2.b |= 8;
                        enxtVar.copyOnWrite();
                        enxu enxuVar = (enxu) enxtVar.instance;
                        enxw enxwVar3 = (enxw) enxvVar.build();
                        enxwVar3.getClass();
                        enxuVar.c = enxwVar3;
                        enxuVar.b = 1 | enxuVar.b;
                        ((chue) chveVarJ).d = (enxu) enxtVar.build();
                        return chveVarJ.a();
                    }
                }, eoscVar);
            }
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } finally {
        }
    }
}
