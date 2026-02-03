package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahiz implements akgx {
    final /* synthetic */ ahjq a;

    public ahiz(ahjq ahjqVar) {
        this.a = ahjqVar;
    }

    @Override // defpackage.akgx
    public final akgw a(BugleConversationId bugleConversationId) {
        ahjq ahjqVar = this.a;
        ahkn ahknVar = ahjqVar.a;
        fcyh fcyhVar = (fcyh) ahknVar.cA.b();
        ahnh ahnhVar = ahknVar.a;
        return new akgw(bugleConversationId, fcyhVar, (fdjx) ahnhVar.m.b(), (awnf) ahjqVar.b.G.b(), (cqtp) ahknVar.dK.b(), (awlc) ahnhVar.sN.b());
    }
}
