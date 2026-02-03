package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnn implements xmx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl");
    public static final djfn b = new djfn(fcvo.a, null, new fdap() { // from class: xmy
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ekrg ekrgVar = xnn.a;
            ((djex) obj).getClass();
            return fctx.a;
        }
    });
    public final ConversationId c;
    public final fcyh d;
    public final ajln e;
    public final xmw f;
    public final fdpl g;
    private final fdjx h;
    private final fcyh i;
    private final fdpl j;
    private final fduj k;
    private final aqhc l;
    private final fdpl m;
    private final wre n;

    public xnn(Context context, ConversationId conversationId, fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, ajln ajlnVar, xmw xmwVar, fdpl fdplVar, fdpl fdplVar2, fduj fdujVar, wre wreVar, aqhc aqhcVar) {
        context.getClass();
        conversationId.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        ajlnVar.getClass();
        fdplVar2.getClass();
        fdujVar.getClass();
        wreVar.getClass();
        aqhcVar.getClass();
        this.c = conversationId;
        this.h = fdjxVar;
        this.i = fcyhVar;
        this.d = fcyhVar2;
        this.e = ajlnVar;
        this.f = xmwVar;
        this.g = fdplVar;
        this.j = fdplVar2;
        this.k = fdujVar;
        this.n = wreVar;
        this.l = aqhcVar;
        auvw.k(fdjxVar, fcyhVar, null, new xnb(this, null), 2);
        this.m = aqhcVar.a() ? new fdpu(false) : fdqq.a(new xnm(new xnj(fdujVar)));
    }

    @Override // defpackage.xmx
    public final fdvc a() {
        return fdtg.b(fdud.b(this.m, this.j, this.g, this.n.a, new xnf(this, null)), this.h, fdur.b, b);
    }

    public final void b(aoer aoerVar) {
        auvw.k(this.h, this.i, null, new xng(aoerVar, this, null), 2);
    }
}
