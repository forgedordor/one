package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xac implements wzf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl");
    public static final long b;
    public final Context c;
    public final fcyh d;
    public final fdjx e;
    public final fdjx f;
    public final eigp g;
    public final wqf h;
    public final ConversationId i;
    public final Optional j;
    public final wwx k;
    public final fcsu l;
    public final vts m;
    public final fctc n;
    public final fduf o;
    public final djew p;
    public final wre q;
    private final fduj r;
    private final fdpl s;
    private final fdpl t;
    private final fdvc u;

    static {
        long j = fdhi.a;
        b = fdhk.f(BasePaymentResult.ERROR_REQUEST_FAILED, fdhl.c);
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [ahdx, java.lang.Object] */
    public xac(Context context, fcyh fcyhVar, fdjx fdjxVar, fdjx fdjxVar2, eigp eigpVar, wre wreVar, wqf wqfVar, fduj fdujVar, ConversationId conversationId, Optional optional, wwx wwxVar, Optional optional2, fcsu fcsuVar, vts vtsVar, aqhb aqhbVar, final fcsu fcsuVar2) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        eigpVar.getClass();
        wreVar.getClass();
        wqfVar.getClass();
        fdujVar.getClass();
        conversationId.getClass();
        fcsuVar.getClass();
        this.c = context;
        this.d = fcyhVar;
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.g = eigpVar;
        this.q = wreVar;
        this.h = wqfVar;
        this.r = fdujVar;
        this.i = conversationId;
        this.j = optional;
        this.k = wwxVar;
        this.l = fcsuVar;
        this.m = vtsVar;
        this.n = fctd.a(new fdae() { // from class: wzi
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = xac.a;
                return (vwj) fcsuVar2.b();
            }
        });
        fduf fdufVarA = fdvf.a(false);
        this.o = fdufVarA;
        this.p = new djew(djrr.dA, (fdae) new wzn(this), (fdae) new wzo(this), (String) null, false, new djev(aqhbVar.a(), 1), 56);
        fdpl fdplVarA = fdqq.a(new wzy(new wzv(fdujVar)));
        this.s = fdplVarA;
        this.t = new fdua(fdufVarA, fdsn.b(fdqq.a(new xab(fdplVarA)), new wzp(null)), new wzq(null));
        optional2.isPresent();
        this.u = optional2.get().a();
    }

    @Override // defpackage.wzf
    public final fdvc a() {
        return fdtg.b(fdud.a(this.s, this.t, this.u, new wzm(this, null)), this.f, fdur.b, this.p);
    }

    public final void b() {
        eieh eiehVarA = this.g.a("ComposeRowSendButton.onScheduledSendDisabled");
        try {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onScheduledSendDisabled", 204, "SendButtonUiAdapterImpl.kt")).q("Skipping onScheduledSend as sending is disabled.");
            fczl.a(eiehVarA, null);
        } finally {
        }
    }

    public final void c() {
        eieh eiehVarA = this.g.a("ComposeRowSendButton.onSendDisabled");
        try {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSendDisabled", 198, "SendButtonUiAdapterImpl.kt")).q("Skipping onSend as sending is disabled.");
            fczl.a(eiehVarA, null);
        } finally {
        }
    }
}
