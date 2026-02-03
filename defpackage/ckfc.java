package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfc implements bayk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnOutgoingMessageInsertionListener");
    private final fcsu b;
    private final fcsu c;

    public ckfc(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.bayk
    public final Object a(MessageCoreData messageCoreData, fcxy fcxyVar) throws IOException {
        eieu eieuVarH = eiiy.h("EditOnOutgoingMessageInsertionListener#onBeforeInsertion");
        try {
            if (messageCoreData.U() != null) {
                messageCoreData.bx(false);
            }
            fczl.a(eieuVarH, null);
            return messageCoreData;
        } finally {
        }
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final void h(MessageCoreData messageCoreData) throws IOException {
        MessageCoreData messageCoreData2;
        Instant instant;
        fcsu fcsuVar;
        eieu eieuVarH = eiiy.h("EditOnOutgoingMessageInsertionListener#onInsertInTransaction");
        try {
            ckfm ckfmVarU = messageCoreData.U();
            if (ckfmVarU == null) {
                fczl.a(eieuVarH, null);
                return;
            }
            String strAB = messageCoreData.aB();
            if (strAB == null) {
                fczl.a(eieuVarH, null);
                return;
            }
            fcsu fcsuVar2 = this.b;
            basd basdVar = ckfmVarU.c;
            ckez ckezVarC = ckfa.c(basdVar, strAB);
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleRcsEdits");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrz ekrzVar2 = ckfb.a;
            ekrz ekrzVar3 = ckfb.a;
            ekrdVar.X(ekrzVar3, messageCoreData.C());
            ekrdVar.X(ckfb.b, ckfmVarU.b);
            ekrdVar.X(ckfb.c, basdVar);
            ekrz ekrzVar4 = ckfb.d;
            Instant instant2 = ckfmVarU.d;
            ekrdVar.X(ekrzVar4, instant2);
            ekrdVar.X(ckfb.e, ckezVarC != null ? ckezVarC.a : null);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnOutgoingMessageInsertionListener", "onInsertInTransaction", 67, "EditOnOutgoingMessageInsertionListener.kt")).q("Processing outgoing edit.");
            Instant instantOfEpochMilli = Instant.ofEpochMilli(messageCoreData.o());
            Instant instantB = ckfa.b(basdVar, strAB);
            if (instantB != null) {
                instant = instant2;
                messageCoreData2 = messageCoreData;
                messageCoreData2.bL(instantB.toEpochMilli());
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("onInsertInTransaction");
                fcsuVar = fcsuVar2;
                brduVar.G(instantB.toEpochMilli());
                brduVar.e(messageCoreData2.C());
            } else {
                messageCoreData2 = messageCoreData;
                instant = instant2;
                fcsuVar = fcsuVar2;
            }
            ckfa ckfaVar = (ckfa) fcsuVar.b();
            Instant instant3 = instant;
            ConversationIdType conversationIdTypeA = messageCoreData2.A();
            conversationIdTypeA.getClass();
            MessageIdType messageIdTypeC = messageCoreData2.C();
            messageIdTypeC.getClass();
            instantOfEpochMilli.getClass();
            ckfaVar.a(conversationIdTypeA, messageIdTypeC, strAB, basdVar, instant3, instantOfEpochMilli, ckezVarC);
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleRcsEdits");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(ekrzVar3, messageCoreData2.C());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnOutgoingMessageInsertionListener", "onInsertInTransaction", 99, "EditOnOutgoingMessageInsertionListener.kt")).q("Processed outgoing edit.");
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.bayk
    public final /* bridge */ /* synthetic */ boolean j() {
        return ((Boolean) this.c.b()).booleanValue();
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
