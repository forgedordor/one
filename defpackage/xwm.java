package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwm implements xvy {
    public final Context a;
    public final xyy b;
    public final yql c;
    public final ybd d;
    private final ajmh e;
    private final fcsu f;
    private final fcsu g;
    private final wfo h;
    private final ahnw i;

    public xwm(ajmh ajmhVar, Context context, xyy xyyVar, ybd ybdVar, yql yqlVar, ahnw ahnwVar, fcsu fcsuVar, fcsu fcsuVar2, wfo wfoVar) {
        ajmhVar.getClass();
        context.getClass();
        ahnwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        wfoVar.getClass();
        this.e = ajmhVar;
        this.a = context;
        this.b = xyyVar;
        this.d = ybdVar;
        this.c = yqlVar;
        this.i = ahnwVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = wfoVar;
    }

    private static final fdpl b(fdvc fdvcVar, fdap fdapVar) {
        xwd xwdVar = new xwd(null, new HashMap(1), fdapVar);
        int i = fdsn.a;
        return new fdwg(xwdVar, fdvcVar);
    }

    @Override // defpackage.xvy
    public final xwn a(ajlt ajltVar, final fdjx fdjxVar, final fdae fdaeVar) {
        fdpl fdpuVar;
        fdpl fdpuVar2;
        ajltVar.getClass();
        fdvc fdvcVarB = fdtg.b(anov.a(this.e.i(ajltVar.b())), fdjxVar, fdur.a(0L, 3), ajltVar);
        final fduf fdufVarA = fdvf.a(false);
        xwk xwkVar = new xwk(fdvcVarB, this, fdaeVar, fdufVarA);
        fcsu fcsuVar = this.g;
        Object obj = null;
        fdpl fdplVarB = ((apwi) fcsuVar.b()).a() ? b(fdvcVarB, new fdap() { // from class: xwb
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ajlt ajltVar2 = (ajlt) obj2;
                ajltVar2.getClass();
                return fdtg.a(fdqq.a(new fdui(new yau(this.a.d, ajltVar2, fdufVarA, fdaeVar, null))), fdjxVar, fdur.b, 1);
            }
        }) : new fdpu(null);
        fcsu fcsuVar2 = this.f;
        if (((apwh) fcsuVar2.b()).a()) {
            xwc xwcVar = new xwc(null, this);
            int i = fdsn.a;
            fdpuVar = new fdwg(xwcVar, fdvcVarB);
        } else {
            fdpuVar = new fdpu(null);
        }
        if (((apwh) fcsuVar2.b()).a()) {
            ahnw ahnwVar = this.i;
            ckmn ckmnVar = ckmn.MEDIA_VIEWER_REACTION_PICKER;
            ahoh ahohVar = ahnwVar.a;
            ahoi ahoiVar = ahohVar.c;
            fdpl fdplVarBn = ahoiVar.bn();
            ConversationId conversationId = (ConversationId) ahoiVar.j.b();
            fdpl fdplVar = (fdpl) ahoiVar.v.b();
            ahkn ahknVar = ahohVar.a;
            obj = null;
            xwe xweVar = new xwe(null, new zvx(fdplVarBn, conversationId, fdplVar, ahknVar.b.aI(), (zvc) ahoiVar.dT.b(), ahoiVar.av(), ahknVar.a.tC, ckmnVar));
            int i2 = fdsn.a;
            fdpuVar2 = new fdwg(xweVar, fdvcVarB);
        } else {
            fdpuVar2 = new fdpu(null);
        }
        return new xwn(xwkVar, fdplVarB, fdpuVar, fdpuVar2, ((apwi) fcsuVar.b()).a() ? b(fdvcVarB, new fdap() { // from class: xvz
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ajlt ajltVar2 = (ajlt) obj2;
                ajltVar2.getClass();
                return fdtg.a(fdqq.a(new xwh(fdqq.a(anov.a(ajltVar2.l())), this, fdufVarA)), fdjxVar, fdur.b, 1);
            }
        }) : new fdpu(obj), this.h.a());
    }
}
