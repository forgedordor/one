package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vie implements vdy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/actions/details/ConversationDetailsActionPlugin");
    public final fdjx b;
    public final ajlu c;
    public final afzc d;
    public final fcsu e;
    public final fdpl f;
    public final fdat g;
    private final Context h;
    private final fdpl i;
    private final fdpl j;
    private final ConversationId k;
    private final Optional l;
    private final fdpl m;
    private final fdpl n;
    private final Set o;

    public vie(Context context, fdjx fdjxVar, fdpl fdplVar, ajlu ajluVar, fdpl fdplVar2, ConversationId conversationId, afzc afzcVar, Optional optional, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        ajluVar.getClass();
        fdplVar2.getClass();
        conversationId.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        this.h = context;
        this.b = fdjxVar;
        this.i = fdplVar;
        this.c = ajluVar;
        this.j = fdplVar2;
        this.k = conversationId;
        this.d = afzcVar;
        this.l = optional;
        this.e = fcsuVar;
        cwdc cwdcVar = (cwdc) fdct.b(optional);
        fdpl fdpuVar = cwdcVar != null ? cwdcVar.b : new fdpu(null);
        cwdc cwdcVar2 = (cwdc) fdct.b(optional);
        vid vidVar = new vid(new via(avac.i(fdpuVar, cwdcVar2 != null ? cwdcVar2.c : new fdpu(null), fdjxVar, new vhw(null)), this));
        vhx vhxVar = new vhx(null);
        int i = fdsn.a;
        fdwg fdwgVar = new fdwg(vhxVar, vidVar);
        this.m = fdwgVar;
        cwdc cwdcVar3 = (cwdc) fdct.b(optional);
        fdpl fdplVarH = avac.h(fdplVar, fdplVar2, cwdcVar3 != null ? cwdcVar3.b : new fdpu(null), fdwgVar, fdjxVar, new vht(this, null));
        this.n = fdplVarH;
        this.f = conversationId instanceof RbmConversationId ? new fdpu(null) : fdplVarH;
        this.g = auxh.d(new vhv(this), fdjxVar);
        this.o = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.o;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.f;
    }

    public final dihq c(final ajlk ajlkVar) {
        String string = this.h.getString(ajlkVar.c() == ajlj.GROUP ? R.string.action_people_and_options_group : R.string.action_people_and_options);
        string.getClass();
        return new dihq(string, djrr.bT, false, true, true, false, null, false, null, new fdae() { // from class: vhs
            @Override // defpackage.fdae
            public final Object invoke() {
                vie vieVar = this.a;
                vieVar.g.a(ajlkVar, vieVar.c);
                return fctx.a;
            }
        }, 996);
    }
}
