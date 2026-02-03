package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anay implements anco {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/BugleMessageMutationsStore");
    private final ekmj b = new ekpy(new ekby());
    private amgj c;

    @Override // defpackage.anco
    public final List a(MessageId messageId) {
        return fcva.ao(this.b.c(messageId));
    }

    @Override // defpackage.anco
    public final void b() {
        this.c = null;
    }

    @Override // defpackage.anco
    public final void c(amgj amgjVar) {
        this.c = amgjVar;
    }

    @Override // defpackage.anco
    public final void d(ConversationId conversationId, MessageId messageId, final String str) {
        ekmj ekmjVar = this.b;
        synchronized (ekmjVar) {
            Collection collectionC = ekmjVar.c(messageId);
            final fdap fdapVar = new fdap() { // from class: anau
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(fdbq.f(((anaw) obj).a.a, str));
                }
            };
            Collection.EL.removeIf(collectionC, new Predicate() { // from class: anav
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                }
            });
            if (collectionC.isEmpty()) {
                ekmjVar.d(messageId);
            }
            amgj amgjVar = this.c;
            if (amgjVar != null) {
                ajle ajleVar = ajle.UPDATE;
                Instant instantNow = Instant.now();
                instantNow.getClass();
                amgjVar.a(ajleVar, messageId, conversationId, instantNow);
            }
        }
    }

    @Override // defpackage.anco
    public final ancn e(ConversationId conversationId, MessageId messageId, anax anaxVar) {
        anaxVar.getClass();
        anaw anawVar = new anaw(anaxVar);
        this.b.t(messageId, anawVar);
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/internal/BugleMessageMutationsStore", "add", 57, "BugleMessageMutationsStore.kt")).D("OMv2: Added %s mutation for message %s to MutationsStore.", anaxVar, messageId.a());
        amgj amgjVar = this.c;
        if (amgjVar != null) {
            ajle ajleVar = ajle.UPDATE;
            Instant instantNow = Instant.now();
            instantNow.getClass();
            amgjVar.a(ajleVar, messageId, conversationId, instantNow);
        }
        return anawVar.a;
    }
}
