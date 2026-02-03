package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ataj {
    private static final atal a = new atal();

    public static final aubt a(ChatMessage chatMessage) {
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        aubx aubxVar = (aubx) a.fH().fM(ContentType.e(chatMessage.getContentType()));
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubxVar.getClass();
        aubtVar.c = aubxVar;
        aubtVar.b |= 1;
        evqs evqsVarX = evqs.x(chatMessage.getContent());
        aubsVar.copyOnWrite();
        aubt aubtVar2 = (aubt) aubsVar.instance;
        aubtVar2.b |= 2;
        aubtVar2.d = evqsVarX;
        return (aubt) aubsVar.build();
    }
}
