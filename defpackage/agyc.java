package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyc implements cqrf {
    public final fcsu a;
    private final eosc b;
    private final fcsu c;
    private final fcsu d;

    public agyc(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = eoscVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.a = fcsuVar3;
    }

    @Override // defpackage.cqrf
    public final double a() {
        return ((Double) cqry.w.e()).doubleValue();
    }

    @Override // defpackage.cqrf
    public final eiju b() {
        eiju eijuVarH = ((ajln) this.a.b()).h(new akzk(ekgb.r(((anty) this.d.b()).h(((alrj) this.c.b()).v())), ekoe.a, Optional.empty(), 3, false, null, false, false));
        eooz eoozVar = new eooz() { // from class: agya
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                if (ekgbVar.isEmpty()) {
                    return eijx.e(0);
                }
                agyc agycVar = this.a;
                return ((ajln) agycVar.a.b()).a((ConversationId) ekgbVar.get(0), ajlm.MINIMAL).c().w();
            }
        };
        eosc eoscVar = this.b;
        return eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: agyb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((long) ((Integer) obj).intValue()) >= ((Long) crbf.aK.e()).longValue());
            }
        }, eoscVar);
    }

    @Override // defpackage.cqrg
    public final elup c() {
        return elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.cqrf
    public final String d() {
        return (String) cqry.v.e();
    }
}
