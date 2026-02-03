package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcnm extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ String c = GroupManagementRequest.XML_TAG;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcnm(fdpl fdplVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.d = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcnm) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdce fdceVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdceVar = (fdce) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdpm fdpmVar = (fdpm) this.e;
            fdce fdceVar2 = new fdce();
            fdpl fdplVar = this.b;
            fcnl fcnlVar = new fcnl(fdceVar2, fdpmVar, this.d);
            this.e = fdceVar2;
            this.a = 1;
            if (fdplVar.a(fcnlVar, this) == fcylVar) {
                return fcylVar;
            }
            fdceVar = fdceVar2;
        }
        if (fdceVar.a) {
            return fctx.a;
        }
        String str = this.c;
        Object obj2 = this.d;
        throw new StatusException(Status.o.withDescription("Expected one " + str + " for " + obj2 + " but received none"));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fcnm fcnmVar = new fcnm(this.b, this.d, fcxyVar);
        fcnmVar.e = obj;
        return fcnmVar;
    }
}
