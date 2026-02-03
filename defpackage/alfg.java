package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alfg implements anpj {
    private final /* synthetic */ anpj a;

    public alfg(alcn alcnVar, alfm alfmVar, EmergencySosConversationId emergencySosConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3) {
        this.a = alcnVar.a(alfmVar, new BugleConversationId(emergencySosConversationId.a), anpjVar, anpjVar2, anpjVar3);
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.a.a(anpiVar);
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return this.a.b();
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        return alcm.e();
    }
}
