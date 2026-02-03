package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syt implements cna {
    final /* synthetic */ Conversation a;
    final /* synthetic */ syw b;

    public syt(syw sywVar, Conversation conversation) {
        this.a = conversation;
        this.b = sywVar;
    }

    @Override // defpackage.cna
    public final void a() {
        syw sywVar = this.b;
        ((ains) sywVar.h.b()).c("Bugle.Auto.App.ReadMessage");
        this.a.c().z().i(new eooz() { // from class: syq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.b.p.a();
            }
        }, sywVar.m);
    }

    @Override // defpackage.cna
    public final void b(final String str) {
        Conversation conversation = this.a;
        ajlu ajluVarA = conversation.a();
        final ajlw ajlwVarB = conversation.b();
        syw sywVar = this.b;
        fhaz fhazVarA = cqdr.a();
        ((ains) sywVar.h.b()).c("Bugle.Auto.App.ReplyMessage");
        ajna ajnaVar = ajna.BEST_AVAILABLE;
        amwf amwfVar = new amwf() { // from class: syh
            @Override // defpackage.amwf
            public final /* synthetic */ ekgb a() {
                int i = ekgb.d;
                return ekoe.a;
            }

            @Override // defpackage.amwf, defpackage.amvr
            public final /* synthetic */ String b() {
                return "text/plain";
            }

            @Override // defpackage.amwf
            public final String c() {
                return str;
            }
        };
        int i = ekgb.d;
        eiju eijuVarK = ajluVarA.k(ajnaVar, amwfVar, ekoe.a, null, null, null, elny.ANDROID_AUTO_REPLY, fhazVarA, null);
        ajlwVarB.getClass();
        eooz eoozVar = new eooz() { // from class: syr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ajlwVarB.b((ajlx) obj);
            }
        };
        eosc eoscVar = sywVar.m;
        auvh.h(eijuVarK.i(eoozVar, eoscVar).e(ajlf.class, new ejvr() { // from class: sys
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ = syw.d.j();
                ekrwVarJ.X(eksq.a, "BugleAppOnAuto");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((ajlf) obj)).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen$1", "onTextReply", 318, "MessagingTemplateScreen.java")).q("Attempted to reply to non reply capable conversation");
                return null;
            }
        }, eoscVar));
    }
}
