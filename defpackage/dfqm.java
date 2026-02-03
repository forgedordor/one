package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfqm extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;

    public dfqm(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3) {
        super(eyikVar2, new eyji(dfqm.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) list.get(0);
        dfvw dfvwVar = (dfvw) list.get(1);
        dgrs dgrsVar = (dgrs) list.get(2);
        efcb efcbVar = new efcb();
        if (dfvwVar.d().isPresent()) {
            efcbVar.b(dfwf.d((dgzn) dfvwVar.d().get()));
            efcbVar.c(MessagingResult.d);
        } else {
            efhi efhiVar = new efhi();
            efhiVar.c(createGroupRequest.d());
            efid efidVar = new efid();
            efidVar.b(dfql.a(dgrsVar));
            efidVar.c(2);
            efhiVar.b(efidVar.a());
            efhiVar.d(2);
            efcbVar.b(efhiVar.a());
            efcbVar.c(dfwf.b(dfvwVar));
        }
        return eork.i(efcbVar.a());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar.d());
    }
}
