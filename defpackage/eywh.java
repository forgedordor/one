package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class eywh extends fdbo implements fdat {
    public eywh(Object obj) {
        super(2, obj, eywr.class, "echo", "echo(Lgoogle/internal/communications/instantmessaging/v1/Tachyon$EchoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws StatusException {
        throw new StatusException(Status.n.withDescription("Method google.internal.communications.instantmessaging.v1.Messaging.Echo is unimplemented"));
    }
}
