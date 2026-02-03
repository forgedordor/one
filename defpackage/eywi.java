package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class eywi extends fdbo implements fdat {
    public eywi(Object obj) {
        super(2, obj, eywr.class, "sendMessage", "sendMessage(Lgoogle/internal/communications/instantmessaging/v1/Tachyon$InboxSendRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws StatusException {
        throw new StatusException(Status.n.withDescription("Method google.internal.communications.instantmessaging.v1.Messaging.SendMessage is unimplemented"));
    }
}
