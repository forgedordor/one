package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vjx implements fdae {
    final /* synthetic */ vkb a;
    final /* synthetic */ String b;
    final /* synthetic */ afzc c;

    public vjx(vkb vkbVar, String str, afzc afzcVar) {
        this.a = vkbVar;
        this.b = str;
        this.c = afzcVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        vkb vkbVar = this.a;
        ajhd ajhdVar = (ajhd) vkbVar.b.b();
        elrk elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU;
        String str = this.b;
        ajhdVar.am(2, elrkVar, str);
        this.c.h(new agde((RbmConversationId) vkbVar.a, str));
        return fctx.a;
    }
}
