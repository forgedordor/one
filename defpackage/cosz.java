package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosz {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    private final eosc c;
    private final coti d;

    public cosz(eosc eoscVar, fcsu fcsuVar, coti cotiVar) {
        this.c = eoscVar;
        this.b = fcsuVar;
        this.d = cotiVar;
    }

    final eiju a(final basd basdVar) {
        if (!((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) {
            return eijx.g(new Callable() { // from class: cosy
                @Override // java.util.concurrent.Callable
                public final Object call() throws cond {
                    baxe baxeVar = (baxe) this.a.b.b();
                    basd basdVar2 = basdVar;
                    MessageCoreData messageCoreDataX = baxeVar.x(basdVar2);
                    if (messageCoreDataX == null) {
                        eksl ekslVar = (eksl) cosz.a.j();
                        ekslVar.X(cqnc.e, basdVar2.b);
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 105, "MessageCoreDataGetter.java")).q("Message does not exist");
                        throw new cond(false, coid.FILE_TRANSFER_FAILURE_REASON_MESSAGE_NOT_FOUND, "Message does not exist");
                    }
                    if (messageCoreDataX.H() == null) {
                        eksl ekslVar2 = (eksl) cosz.a.j();
                        ekslVar2.X(cqnc.e, basdVar2.b);
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 117, "MessageCoreDataGetter.java")).q("Message has no attachments");
                        throw new cond(false, coid.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, "Message has no attachments");
                    }
                    if (messageCoreDataX.u() == null) {
                        eksl ekslVar3 = (eksl) cosz.a.j();
                        ekslVar3.X(cqnc.e, basdVar2.b);
                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 133, "MessageCoreDataGetter.java")).q("Message SMS URI is null");
                        throw new cond(true, coid.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, "Message SMS URI is null");
                    }
                    eksl ekslVar4 = (eksl) cosz.a.h();
                    ekslVar4.X(cqnc.e, basdVar2.b);
                    ekslVar4.X(cqnc.r, messageCoreDataX.A().toString());
                    ekslVar4.X(cqnc.a, String.valueOf(messageCoreDataX.C().a));
                    ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 149, "MessageCoreDataGetter.java")).q("MessageCoreData found for incoming file transfer");
                    return Optional.of(messageCoreDataX);
                }
            }, this.c);
        }
        coti cotiVar = this.d;
        eksp ekspVar = coti.a;
        eksl ekslVar = (eksl) ekspVar.h();
        String str = basdVar.b;
        ekrz ekrzVar = cqnc.e;
        ekslVar.X(ekrzVar, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "getfutureForRcsMessage", 67, "TelephonyInsertionFutureRepository.java")).q("Retrieving Telephony insertion future for finalizing file transfer.");
        eiju eijuVarE = (eiju) cotiVar.b.get(basdVar);
        if (eijuVarE == null) {
            eksl ekslVar2 = (eksl) ekspVar.h();
            ekslVar2.X(ekrzVar, str);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "getfutureForRcsMessage", 81, "TelephonyInsertionFutureRepository.java")).q("No Telephony insertion future found.");
            eijuVarE = eijx.e(null);
        }
        return eijuVarE.h(new ejvr() { // from class: cosx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                baxe baxeVar = (baxe) this.a.b.b();
                basd basdVar2 = basdVar;
                MessageCoreData messageCoreDataX = baxeVar.x(basdVar2);
                if (messageCoreDataX == null) {
                    eksl ekslVar3 = (eksl) cosz.a.j();
                    ekslVar3.X(cqnc.e, basdVar2.b);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 69, "MessageCoreDataGetter.java")).q("Message does not exist");
                    return Optional.empty();
                }
                if (messageCoreDataX.H() == null) {
                    eksl ekslVar4 = (eksl) cosz.a.j();
                    ekslVar4.X(cqnc.e, basdVar2.b);
                    ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 78, "MessageCoreDataGetter.java")).q("Message has no attachments");
                    return Optional.empty();
                }
                if (messageCoreDataX.u() != null) {
                    return Optional.of(messageCoreDataX);
                }
                eksl ekslVar5 = (eksl) cosz.a.j();
                ekslVar5.X(cqnc.e, basdVar2.b);
                ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 86, "MessageCoreDataGetter.java")).q("Message SMS URI is null");
                return Optional.empty();
            }
        }, this.c);
    }
}
