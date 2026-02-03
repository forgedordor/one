package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agua implements agtj {
    public final fdjx a;
    public final ConversationId b;
    public final Optional c;
    public final yir d;
    public final addt e;
    public final afzc f;
    public final ahax g;
    public final Optional h;
    public final fcsu i;
    public final fdpl j;
    public final fdvc k;

    public agua(fdjx fdjxVar, ConversationId conversationId, Optional optional, yir yirVar, addt addtVar, afzc afzcVar, Optional optional2, fcsu fcsuVar, fcsu fcsuVar2, ahax ahaxVar, Optional optional3, fcsu fcsuVar3) {
        fdvc fdvcVarJ;
        fdjxVar.getClass();
        conversationId.getClass();
        yirVar.getClass();
        addtVar.getClass();
        afzcVar.getClass();
        optional2.getClass();
        fcsuVar.getClass();
        ahaxVar.getClass();
        optional3.getClass();
        fcsuVar3.getClass();
        this.a = fdjxVar;
        this.b = conversationId;
        this.c = optional;
        this.d = yirVar;
        this.e = addtVar;
        this.f = afzcVar;
        this.g = ahaxVar;
        this.h = optional3;
        this.i = fcsuVar3;
        Object objB = fcsuVar2.b();
        objB.getClass();
        this.j = fdqq.a(new fdui(new agqz((Optional) objB, null)));
        if (optional2.isEmpty()) {
            fdvcVarJ = fdvf.a(false);
        } else {
            cgte cgteVar = (cgte) optional2.get();
            Object objB2 = fcsuVar.b();
            objB2.getClass();
            fdvcVarJ = cgteVar.j((efwo) objB2);
        }
        this.k = fdvcVarJ;
    }

    @Override // defpackage.agtj
    public final void a() {
        if (this.b instanceof PenpalBotConversationId) {
            auvw.k(this.a, null, null, new agtz(this, null), 3);
        }
    }
}
