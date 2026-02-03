package defpackage;

import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ataa extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        evqs evqsVarB = chatMessage.b();
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubtVar.b |= 2;
        aubtVar.d = evqsVarB;
        aubx aubxVar = (aubx) atai.a.fH().fM(chatMessage.a());
        aubsVar.copyOnWrite();
        aubt aubtVar2 = (aubt) aubsVar.instance;
        aubxVar.getClass();
        aubtVar2.c = aubxVar;
        aubtVar2.b |= 1;
        return (aubt) aubsVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubt aubtVar = (aubt) obj;
        efhg efhgVar = new efhg();
        if ((aubtVar.b & 1) != 0) {
            ejvj ejvjVar = atai.a;
            aubx aubxVar = aubtVar.c;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            efhgVar.c((ContentType) ejvjVar.fM(aubxVar));
        }
        if ((aubtVar.b & 2) != 0) {
            efhgVar.b(aubtVar.d);
        }
        return efhgVar.a();
    }
}
