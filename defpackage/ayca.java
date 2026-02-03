package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayca {
    private static final eksp b = eksp.c("Bugle");
    private static final eksp c = eksp.c("BugleNotifications");
    public final crje a;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final eosc g;

    public ayca(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, crje crjeVar, eosc eoscVar) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.a = crjeVar;
        this.g = eoscVar;
    }

    public final aybz a(MessageIdType messageIdType) {
        fcsu fcsuVar = this.d;
        MessageCoreData messageCoreDataA = ((baxe) fcsuVar.b()).A(messageIdType);
        if (messageCoreDataA == null) {
            eksl ekslVar = (eksl) b.j();
            ekslVar.X(cqnc.a, messageIdType.b());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "getLatestMessageId", 168, "ReceiveSmartSuggestionsActionHelper.java")).q("Couldn't add Smart suggestions to conversation: target message ID not found.");
            return null;
        }
        ConversationIdType conversationIdTypeA = messageCoreDataA.A();
        MessageCoreData messageCoreDataO = ((baxe) fcsuVar.b()).o(conversationIdTypeA);
        if (messageCoreDataO == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "getLatestMessageId", 175, "ReceiveSmartSuggestionsActionHelper.java")).q("Couldn't add Smart suggestions to conversation: latest message in conversation was null.");
            return null;
        }
        MessageIdType messageIdTypeC = messageCoreDataO.C();
        if (messageIdTypeC == null) {
            throw new NullPointerException("Null lastMessageId");
        }
        if (conversationIdTypeA != null) {
            return new axlt(messageIdTypeC, conversationIdTypeA);
        }
        throw new NullPointerException("Null conversationId");
    }

    public final eiju b(MessageIdType messageIdType, Supplier supplier) {
        aybz aybzVarA = a(messageIdType);
        if ((((Boolean) ((cczi) tet.k.get()).e()).booleanValue() || ((Boolean) ((cczi) crbf.by.get()).e()).booleanValue()) && aybzVarA != null) {
            fcsu fcsuVar = this.f;
            if (!((Optional) fcsuVar.b()).isEmpty()) {
                return ((afkc) ((Optional) fcsuVar.b()).get()).a(((axlt) aybzVarA).b, (List) supplier.get());
            }
        }
        return eijx.e(false);
    }

    public final eiju c(MessageIdType messageIdType, Supplier supplier) {
        if (a(messageIdType) != null) {
            fcsu fcsuVar = this.e;
            if (!((Optional) fcsuVar.b()).isEmpty()) {
                if (crbf.g() || crbf.h()) {
                    return ((cdvn) ((Optional) fcsuVar.b()).get()).a(messageIdType, (List) supplier.get());
                }
                ((eksl) ((eksl) b.f()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "persistMessageClassifications", 127, "ReceiveSmartSuggestionsActionHelper.java")).q("Not persisting classifications for message because it is not enabled.");
                return eijx.e(false);
            }
        }
        return eijx.e(false);
    }

    public final eiju d(final MessageIdType messageIdType, ArrayList arrayList, final Supplier supplier, Supplier supplier2, Supplier supplier3) {
        aybz aybzVarA = a(messageIdType);
        if (aybzVarA != null) {
            this.a.a(messageIdType, arrayList, (List) supplier2.get(), ((axlt) aybzVarA).b);
        }
        return eijx.k(c(messageIdType, supplier2), b(messageIdType, supplier3)).a(new Callable() { // from class: ayby
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.e(messageIdType, supplier);
                return null;
            }
        }, this.g);
    }

    public final void e(MessageIdType messageIdType, Supplier supplier) {
        aybz aybzVarA = a(messageIdType);
        if (aybzVarA == null) {
            return;
        }
        crje crjeVar = this.a;
        if (((crlk) crjeVar.b.b()).b()) {
            axlt axltVar = (axlt) aybzVarA;
            MessageIdType messageIdType2 = axltVar.a;
            cqce cqceVar = crjeVar.e;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("persistSmartSuggestions");
            if (cqbdVarA.d) {
                cqbdVarA.q("latestMessageId");
                cqbdVarA.b.append(cqcv.e(messageIdType2.toString()));
            }
            cqbdVarA.r();
            if (((Boolean) ((cczi) crbf.af.get()).e()).booleanValue() || fdbq.f(messageIdType2, messageIdType)) {
                ConversationIdType conversationIdType = axltVar.b;
                crif crifVar = (crif) crjeVar.a.b();
                Object obj = supplier.get();
                obj.getClass();
                crifVar.j((List) obj, conversationIdType, messageIdType, crjeVar.c.f().toEpochMilli());
                crjeVar.d.o(conversationIdType);
            } else {
                cqbd cqbdVarE = cqceVar.e();
                cqbdVarE.I("Couldn't add suggestions to conversation: last message ID doesn't match the target message ID. latest:");
                cqbdVarE.d(messageIdType2);
                cqbdVarE.v(", target:");
                cqbdVarE.d(messageIdType);
                cqbdVarE.r();
            }
        } else {
            crjeVar.e.n("Smart suggestions are not enabled");
        }
        ((eksl) ((eksl) c.h()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "refreshNotificationActions", 210, "ReceiveSmartSuggestionsActionHelper.java")).q("Using system replies, not refreshing for smart replies");
    }
}
