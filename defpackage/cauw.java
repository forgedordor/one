package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauw extends cayv {
    private final eosc a;
    private final fcsu b;
    private final fcsu c;

    public cauw(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = eoscVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("LogMessageSentOrReceivedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cavf.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cavf cavfVar = (cavf) evuhVar;
        return eijx.g(new Callable() { // from class: cauv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.k(cavfVar);
                return cbcw.i();
            }
        }, this.a);
    }

    public final void k(cavf cavfVar) {
        MessageCoreData messageCoreDataW = ((baxe) this.c.b()).w(bary.b(cavfVar.c));
        if (messageCoreDataW != null) {
            elpg elpgVar = cavfVar.f;
            if (elpgVar == null) {
                elpgVar = elpg.b;
            }
            int iA = elow.a(elpgVar.W);
            if (iA == 0) {
                iA = 1;
            }
            elpg elpgVar2 = cavfVar.f;
            if (elpgVar2 == null) {
                elpgVar2 = elpg.b;
            }
            elof elofVar = (elof) elpgVar2.toBuilder();
            elofVar.copyOnWrite();
            elpg elpgVar3 = (elpg) elofVar.instance;
            elpgVar3.W = iA - 1;
            elpgVar3.d |= 524288;
            elpg elpgVar4 = cavfVar.f;
            if (elpgVar4 == null) {
                elpgVar4 = elpg.b;
            }
            fhaz fhazVar = elpgVar4.p;
            if (fhazVar == null) {
                fhazVar = fhaz.a;
            }
            elofVar.copyOnWrite();
            elpg elpgVar5 = (elpg) elofVar.instance;
            fhazVar.getClass();
            elpgVar5.p = fhazVar;
            elpgVar5.c |= 1024;
            elpg elpgVar6 = cavfVar.f;
            elol elolVarB = elol.b((elpgVar6 == null ? elpg.b : elpgVar6).ah);
            if (elolVarB == null) {
                elolVarB = elol.UNKNOWN_FORMAT_TYPE;
            }
            eloq eloqVarB = eloq.b((elpgVar6 == null ? elpg.b : elpgVar6).ai);
            if (eloqVarB == null) {
                eloqVarB = eloq.UNKNOWN_IS_IMS;
            }
            if (elpgVar6 == null) {
                elpgVar6 = elpg.b;
            }
            elon elonVarB = elon.b(elpgVar6.aj);
            if (elonVarB == null) {
                elonVarB = elon.UNKNOWN_HANDLED_BY;
            }
            if (elolVarB != elol.UNKNOWN_FORMAT_TYPE) {
                elofVar.copyOnWrite();
                elpg elpgVar7 = (elpg) elofVar.instance;
                elpgVar7.ah = elolVarB.d;
                elpgVar7.d |= Integer.MIN_VALUE;
            }
            if (eloqVarB != eloq.UNKNOWN_IS_IMS) {
                elofVar.copyOnWrite();
                elpg elpgVar8 = (elpg) elofVar.instance;
                elpgVar8.ai = eloqVarB.d;
                elpgVar8.e = 1 | elpgVar8.e;
            }
            if (elonVarB != elon.UNKNOWN_HANDLED_BY) {
                elofVar.copyOnWrite();
                elpg elpgVar9 = (elpg) elofVar.instance;
                elpgVar9.aj = elonVarB.d;
                elpgVar9.e |= 2;
            }
            ajhd ajhdVar = (ajhd) this.b.b();
            int i = cavfVar.d;
            long j = cavfVar.e;
            ajhdVar.at(messageCoreDataW, i, new ainn(cavfVar.g, cavfVar.h), elofVar);
        }
    }
}
