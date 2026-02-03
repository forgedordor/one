package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class eywk extends fdbo implements fdap {
    public eywk(Object obj) {
        super(1, obj, eywr.class, "bind", "bind(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws StatusException {
        ((fdpl) obj).getClass();
        throw new StatusException(Status.n.withDescription("Method google.internal.communications.instantmessaging.v1.Messaging.Bind is unimplemented"));
    }
}
