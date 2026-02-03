package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aags implements aagg {
    private final ConversationId a;
    private final fdjx b;
    private final fdpl c;
    private final fdpl d;

    public aags(ConversationId conversationId, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, fcsu fcsuVar) {
        conversationId.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fcsuVar.getClass();
        this.a = conversationId;
        this.b = fdjxVar;
        this.c = fdplVar;
        this.d = fdplVar2;
        aagf aagfVar = (aagf) fcsuVar.b();
        fdpl fdplVarA = fdqq.a(new aafz(aagfVar.d));
        auvw.k(aagfVar.b, null, null, new aagb(fdplVarA, null), 3);
        auvw.k(aagfVar.b, null, null, new aage(aagfVar, fdplVarA, null), 3);
    }

    @Override // defpackage.aagg
    public final fdvc a() {
        aagn aagnVar = new aagn(fdqq.a(new aagk(this.c)));
        fdpl fdplVarA = fdqq.a(new aagq(this.d));
        boolean z = this.a instanceof EmergencySosConversationId;
        return fdtg.b(new fdua(aagnVar, fdplVarA, new aagr(this, z, null)), this.b, fdur.b, new aagu(dlkk.a, false, z));
    }
}
