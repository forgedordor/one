package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahla implements akgx {
    final /* synthetic */ ahmz a;

    public ahla(ahmz ahmzVar) {
        this.a = ahmzVar;
    }

    @Override // defpackage.akgx
    public final akgw a(BugleConversationId bugleConversationId) {
        ahkn ahknVar = this.a.a;
        fcyh fcyhVar = (fcyh) ahknVar.cA.b();
        ahnh ahnhVar = ahknVar.a;
        return new akgw(bugleConversationId, fcyhVar, (fdjx) ahnhVar.m.b(), (awnf) ahnhVar.sJ.b(), (cqtp) ahknVar.dK.b(), (awlc) ahnhVar.sN.b());
    }
}
