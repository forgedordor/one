package defpackage;

import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsx implements cmpy {
    private final fcsu a;
    private final cmnp b;
    private final cmsw c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public cmsx(fcsu fcsuVar, cmnp cmnpVar, cmsw cmswVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = cmnpVar;
        this.c = cmswVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    @Override // defpackage.cmpy
    public final eiju a(cmpx cmpxVar, final asrg asrgVar, Instant instant, int i) {
        eiju eijuVarE;
        efhu efhuVar;
        efjm efjmVar;
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufw aufwVar = aufw.CONTROL;
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufxVar.c = aufwVar.d;
        aufxVar.b |= 1;
        aufu aufuVar = aufu.LOW;
        aufsVar.copyOnWrite();
        aufx aufxVar2 = (aufx) aufsVar.instance;
        aufxVar2.d = aufuVar.e;
        aufxVar2.b |= 2;
        aufsVar.copyOnWrite();
        aufx aufxVar3 = (aufx) aufsVar.instance;
        aufxVar3.b |= 4;
        aufxVar3.e = false;
        final aufx aufxVar4 = (aufx) aufsVar.build();
        final aubq aubqVarB = ((chtk) this.d.b()).b(i);
        final eyga eygaVar = eyga.a;
        eieu eieuVarK = eiiy.k("ChatApiSender::sendTypingIndicator");
        cmsw cmswVar = this.c;
        final cmnp cmnpVar = this.b;
        try {
            final basd basdVarA = cmnpVar.e.a();
            auhe auheVar = (auhe) auhf.a.createBuilder();
            String strF = basdVarA.f();
            auheVar.copyOnWrite();
            auhf auhfVar = (auhf) auheVar.instance;
            auhfVar.b |= 1;
            auhfVar.e = strF;
            auhy auhyVar = (auhy) auhz.a.createBuilder();
            boolean zEquals = cmpx.ACTIVE.equals(cmpxVar);
            auhyVar.copyOnWrite();
            auhz auhzVar = (auhz) auhyVar.instance;
            auhzVar.b |= 1;
            auhzVar.c = zEquals;
            auheVar.copyOnWrite();
            auhf auhfVar2 = (auhf) auheVar.instance;
            auhz auhzVar2 = (auhz) auhyVar.build();
            auhzVar2.getClass();
            auhfVar2.d = auhzVar2;
            auhfVar2.c = 6;
            atau atauVar = cmnpVar.h;
            cqdr cqdrVar = cmnpVar.l;
            auib auibVar = (auib) atauVar.fM(cqdr.a());
            auheVar.copyOnWrite();
            auhf auhfVar3 = (auhf) auheVar.instance;
            auibVar.getClass();
            auhfVar3.g = auibVar;
            auhfVar3.b |= 4;
            final auhf auhfVar4 = (auhf) auheVar.build();
            try {
                efhuVar = new efhu();
                int iOrdinal = cmpxVar.ordinal();
                if (iOrdinal == 0) {
                    efjmVar = efjm.START;
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unsupported typing state ".concat(String.valueOf(cmpxVar.name())));
                    }
                    efjmVar = efjm.STOP;
                }
                efhuVar.c(efjmVar);
                efhuVar.b(cmsw.a);
                efhuVar.d(instant);
            } catch (IllegalArgumentException e) {
                eijuVarE = eijx.e(cmnp.l(e, basdVarA, 5));
            }
            try {
                eiju eijuVarE2 = eijx.e((aubt) cmswVar.c.fM(cmswVar.b.b(IsComposingMessage.class).b(efhuVar.a())));
                eooz eoozVar = new eooz() { // from class: cmnd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return cmnpVar.e(basdVarA, (aubt) obj, eygaVar, asrgVar, auhfVar4, aufxVar4, aubqVarB);
                    }
                };
                eosc eoscVar = cmnpVar.c;
                eijuVarE = eijuVarE2.i(eoozVar, eoscVar).h(new ejvr() { // from class: cmng
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cmnpVar.m((augz) obj, 5);
                    }
                }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmnh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cmnp.l((IllegalArgumentException) obj, basdVarA, 5);
                    }
                }, eoscVar);
                eieuVarK.b(eijuVarE);
                eieuVarK.close();
                return eijuVarE;
            } catch (efoc e2) {
                throw new cmph(e2);
            }
        } finally {
        }
    }

    @Override // defpackage.cmpy
    public final boolean b(int i) {
        if (!((dghj) this.f.b()).g(i).isEmpty() && ((dggw) this.e.b()).w(i)) {
            return ((crqx) this.a.b()).l();
        }
        return false;
    }
}
