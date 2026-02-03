package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efnb implements efoe {
    public static final ContentType a;

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        efilVarD.e("plain");
        a = efilVarD.g();
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ eflb a(efnd efndVar) {
        efhg efhgVar = new efhg();
        efhgVar.b(efndVar.b());
        efhgVar.c(efndVar.a());
        return efhgVar.a();
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ efnd b(eflb eflbVar) {
        ChatMessage chatMessage = (ChatMessage) eflbVar;
        efmx efmxVar = new efmx();
        efmxVar.b(chatMessage.b());
        efmxVar.c(chatMessage.a());
        return efmxVar.a();
    }
}
