package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akil implements akif {
    public static final /* synthetic */ int d = 0;
    private static final eksp e = eksp.c("Bugle");
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final eosc f;
    private final eosc g;
    private final fcsu h;

    public akil(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.f = eoscVar;
        this.g = eoscVar2;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.h = fcsuVar3;
        this.c = fcsuVar4;
    }

    @Override // defpackage.akif
    public final eiju a(ekgb ekgbVar, int i) {
        ((eksl) ((eksl) e.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/markunread/MarkAsUnreadManagerImpl", "markConversationsAsRead", 82, "MarkAsUnreadManagerImpl.java")).q("beginning MarkAsUnreadManager#markConversationsAsRead");
        ejwl.b(Collection.EL.stream(ekgbVar).allMatch(new Predicate() { // from class: akij
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
                int i2 = akil.d;
                return ((ConversationId) obj) instanceof BugleConversationId;
            }
        }), "Only BugleConversationIds are supported.");
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: akik
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = akil.d;
                return ((BugleConversationId) ((ConversationId) obj)).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        ((aypj) this.h.b()).g((ConversationIdType[]) ((ekgb) map.collect(ekcv.a)).toArray(new ConversationIdType[0]), bary.a).s();
        ((akie) this.c.b()).a(2, i, ekgbVar.size());
        return eijx.e(null);
    }

    @Override // defpackage.akif
    public final eiju b(final ekgb ekgbVar, final int i) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: akig
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = akil.d;
                return barn.b(((ConversationId) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        final ekgb ekgbVar2 = (ekgb) map.collect(ekcv.a);
        return auvh.a(eijx.f(new Runnable() { // from class: akih
            @Override // java.lang.Runnable
            public final void run() {
                akil akilVar = this.a;
                cawo.k((bakt) akilVar.a.b(), (bxlc) akilVar.b.b(), ekgbVar2, true);
            }
        }, this.f)).h(new ejvr() { // from class: akii
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((akie) this.a.c.b()).a(3, i, ekgbVar.size());
                return null;
            }
        }, this.g);
    }
}
