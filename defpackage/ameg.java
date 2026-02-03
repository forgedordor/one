package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ameg implements ajmp {
    public final ConversationId a;
    private final cogw b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final cqtq d;

    public ameg(cogw cogwVar, cqtp cqtpVar, ConversationId conversationId) {
        this.b = cogwVar;
        this.a = conversationId;
        this.d = cqtpVar.a(new amef());
    }

    @Override // defpackage.ajmp
    public final ajmo a(MessageId messageId) {
        ajmo ajmoVar = (ajmo) this.c.get(messageId);
        return ajmoVar == null ? ajmk.a : ajmoVar;
    }

    @Override // defpackage.ajmp
    public final cquc b(final ajmg ajmgVar) {
        return this.d.a(new cqtk() { // from class: amed
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return ajmgVar.a((ajmf) obj);
            }
        }, "DefaultOptimisticReactionsCache::register", "DefaultOptimisticReactionsCache::callback", "DefaultOptimisticReactionsCache::unregister");
    }

    @Override // defpackage.ajmp
    public final void c(final MessageId messageId, anhj anhjVar, aoer aoerVar, fhaz fhazVar) {
        ajmm ajmnVar;
        fhazVar.getClass();
        final Instant instantF = this.b.f();
        if (anhjVar != null) {
            instantF.getClass();
            ajmnVar = new ajml(aoerVar, instantF, fhazVar, anhjVar);
        } else {
            instantF.getClass();
            ajmnVar = new ajmn(aoerVar, instantF, fhazVar);
        }
        this.c.put(messageId, ajmnVar);
        this.d.c(new Supplier() { // from class: amee
            @Override // java.util.function.Supplier
            public final Object get() {
                return new anap(ajle.UPDATE, messageId, this.a, instantF, 0);
            }
        }, "DefaultOptimisticReactionsCache::notify");
    }
}
