package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcnl implements fdpm {
    final /* synthetic */ fdce a;
    final /* synthetic */ fdpm b;
    final /* synthetic */ String c = GroupManagementRequest.XML_TAG;
    final /* synthetic */ Object d;

    public fcnl(fdce fdceVar, fdpm fdpmVar, Object obj) {
        this.a = fdceVar;
        this.b = fdpmVar;
        this.d = obj;
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) throws StatusException {
        fdce fdceVar = this.a;
        if (!fdceVar.a) {
            fdceVar.a = true;
            Object objFO = this.b.fO(obj, fcxyVar);
            return objFO == fcyl.a ? objFO : fctx.a;
        }
        String str = this.c;
        Object obj2 = this.d;
        throw new StatusException(Status.o.withDescription("Expected one " + str + " for " + obj2 + " but received two"));
    }
}
