package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aikk extends dqpi {
    final /* synthetic */ aikl a;

    public aikk(aikl aiklVar) {
        this.a = aiklVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        bojh bojhVar = (bojh) dqsdVar.b();
        if (bojhVar != null) {
            aikl aiklVar = this.a;
            ConversationIdType conversationIdTypeC = bojhVar.C();
            if (conversationIdTypeC.b()) {
                return;
            }
            aiklVar.f(aiwp.CONVERSATION_CREATED_EVENT, Optional.of(conversationIdTypeC.toString()));
            return;
        }
        final botd botdVar = (botd) dqsdVar.c();
        if (botdVar != null) {
            final aikl aiklVar2 = this.a;
            botdVar.m(new dqyi() { // from class: aikf
                @Override // defpackage.dqyi
                public final boolean a(dqyq dqyqVar) {
                    if (dqyqVar instanceof dqpj) {
                        dqpj dqpjVar = (dqpj) dqyqVar;
                        if (dhim.a(dqpjVar.d, botm.c.a.toString()) && dqpjVar.b == 1) {
                            botd botdVar2 = botdVar;
                            if (botdVar2.n("archive_status")) {
                                aiklVar2.f(bvdk.a(botdVar2.a.getAsInteger("archive_status").intValue()).d() ? aiwp.CONVERSATION_ARCHIVED_EVENT : aiwp.CONVERSATION_UNARCHIVED_EVENT, Optional.of(dqpjVar.a));
                            }
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
        botf botfVar = (botf) dqsdVar.d();
        if (botfVar != null) {
            final aikl aiklVar3 = this.a;
            botfVar.f(new dqyi() { // from class: aikb
                @Override // defpackage.dqyi
                public final boolean a(dqyq dqyqVar) {
                    if (!(dqyqVar instanceof dqpj)) {
                        return false;
                    }
                    dqpj dqpjVar = (dqpj) dqyqVar;
                    if (!dhim.a(dqpjVar.d, botm.c.a.toString()) || dqpjVar.b != 1) {
                        return false;
                    }
                    aiklVar3.f(aiwp.CONVERSATION_DELETED_EVENT, Optional.of(dqpjVar.a));
                    return true;
                }
            });
        }
    }
}
