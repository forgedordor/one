package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftj extends eyix {
    private final eyir b;
    private final eyir c;

    public dftj(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2) {
        super(eyikVar2, new eyji(dftj.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        dfvo dfvoVar = (dfvo) ((dfwc) list.get(1)).a((RemoveUserFromGroupRequest) list.get(0));
        int i = dfvoVar.b;
        dgzn dgznVar = dfvoVar.a;
        if (i == 2) {
            dfvv dfvvVarF = dfvw.f();
            dfvvVarF.c(dgznVar);
            return eork.i(dfvvVarF.a());
        }
        SettableFuture settableFuture = new dfvu(dgznVar).a;
        dgznVar.j();
        return settableFuture;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return eork.f(this.b.d(), this.c.d());
    }
}
