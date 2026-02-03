package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class eywm extends fdbo implements fdap {
    public eywm(Object obj) {
        super(1, obj, eywr.class, "receiveMessagesExpress", "receiveMessagesExpress(Lgoogle/internal/communications/instantmessaging/v1/Tachyon$ReceiveMessagesExpressRequest;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws StatusException {
        ((ezkj) obj).getClass();
        throw new StatusException(Status.n.withDescription("Method google.internal.communications.instantmessaging.v1.Messaging.ReceiveMessagesExpress is unimplemented"));
    }
}
