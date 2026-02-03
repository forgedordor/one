package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwiy implements atto {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener");
    private final fcsu b;
    private final fcsu c;

    public bwiy(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar2;
        this.b = fcsuVar;
    }

    @Override // defpackage.atto
    public final eiju a(aubq aubqVar, ConversationIdType conversationIdType, auen auenVar) {
        if (auenVar.b.size() + auenVar.d.size() + auenVar.c.size() <= 0) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 70, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("No group changes found. Skip updating group conversation e2ee state.");
            return eijx.e(null);
        }
        bajf bajfVarA = ((axgh) this.c.b()).a(conversationIdType);
        if (bajfVarA == null) {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 76, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Conversation is missing. Skip updating group conversation e2ee state.");
            return eijx.e(null);
        }
        Stream map = Collection.EL.stream(auenVar.b).filter(new Predicate() { // from class: bwiw
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
                auej auejVarB = auej.b(((auaz) obj).e);
                if (auejVarB == null) {
                    auejVarB = auej.UNKNOWN_STATE;
                }
                return auejVarB.compareTo(auej.JOINED) == 0;
            }
        }).map(new Function() { // from class: bwix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aubq aubqVar2 = ((auaz) obj).c;
                return aubqVar2 == null ? aubq.a : aubqVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        eiju eijuVarB = ((bvvb) this.b.b()).a(aubqVar, conversationIdType).b((ekgb) map.collect(ekcv.a));
        if (bajfVarA.D()) {
            ekrw ekrwVarH3 = a.h();
            ekrwVarH3.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 92, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Participant changes found. Updating group conversation e2ee state.");
            return eijuVarB;
        }
        ekrw ekrwVarH4 = a.h();
        ekrwVarH4.X(eksq.a, "BugleE2eeEtouffee");
        ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 87, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Conversation is not already encrypted. Launch async encryption update worker.");
        auvh.h(eijuVarB);
        return eijx.e(null);
    }
}
