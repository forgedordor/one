package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbth {
    public static bcuw a(final ConversationIdType conversationIdType) {
        bcuy bcuyVarC = c();
        bcuyVarC.e(new Function() { // from class: bbtg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bcvd bcvdVar = (bcvd) obj;
                bcvdVar.d(conversationIdType);
                return bcvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bcuyVarC.b();
    }

    public static bcuy b() {
        bcuy bcuyVarB = bcve.b();
        bcuyVarB.A("+ConversationListFromConversationToParticipantsQueries#getSearchQuery");
        bcuyVarB.s();
        bcuyVarB.c(new bcuv(bcve.b.b, false));
        bcuyVarB.n(PartsTable.d.c, "SNIPPET_TO_USE");
        bcuyVarB.o(bcvp.e, bcvp.h);
        bcuyVarB.o(bcvp.c, ((Boolean) ((cczi) tet.l.get()).e()).booleanValue() ? bcvp.b : "0");
        bcuyVarB.s();
        bcvd bcvdVar = new bcvd();
        bcvdVar.c();
        bcuyVarB.k(new bcuz(bcvdVar));
        bcuyVarB.n(bxjj.a, "unread_message_count");
        return bcuyVarB;
    }

    public static bcuy c() {
        bcuy bcuyVarB = bcve.b();
        bcuyVarB.A("+ConversationListFromConversationToParticipantsQueries#makeBuilder");
        bcuyVarB.w(bcve.b.a);
        bcuyVarB.n(botm.c.g, "SNIPPET_TO_USE");
        bcuyVarB.n(bcvp.f, "conversation_contains_vsms_participant");
        bcuyVarB.n(bcvp.g, "earliest_reminder_trigger_time");
        bcuyVarB.o(bcvp.e, bcvp.d);
        bcuyVarB.o(bcvp.c, ((Boolean) ((cczi) tet.l.get()).e()).booleanValue() ? bcvp.b : "0");
        bcuyVarB.s();
        bcuyVarB.n(bxjj.a, "unread_message_count");
        if (cdsz.a()) {
            bcuyVarB.n(cdsx.a, "conversation_contains_matrix_participant");
        }
        return bcuyVarB;
    }
}
