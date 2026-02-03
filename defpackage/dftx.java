package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftx extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dftx(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dftx.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional optionalOfNullable;
        List list = (List) obj;
        efdi efdiVar = (efdi) list.get(0);
        dfwc dfwcVar = (dfwc) list.get(1);
        dfrq dfrqVar = (dfrq) list.get(2);
        dfrh dfrhVar = (dfrh) list.get(3);
        Conversation conversationB = efdiVar.b();
        if (conversationB.c() != 2) {
            optionalOfNullable = Optional.empty();
        } else {
            String strC = dfwc.c(conversationB);
            synchronized (dfwcVar.b) {
                optionalOfNullable = Optional.ofNullable((dgzn) dfwcVar.c.get(strC));
            }
        }
        if (optionalOfNullable.isPresent()) {
            if (dfog.F()) {
                return new dfvu((dgzn) optionalOfNullable.get()).a;
            }
            dfvv dfvvVarF = dfvw.f();
            dfvvVarF.c((dgzn) optionalOfNullable.get());
            return eork.i(dfvvVarF.a());
        }
        if (!efdiVar.f()) {
            return eork.i(dfvw.f().a());
        }
        dfvo dfvoVar = (dfvo) dfwcVar.a(efdiVar);
        if (dfvoVar.b == 2) {
            if (dfog.F()) {
                return new dfvu(dfvoVar.a).a;
            }
            dgzn dgznVar = dfvoVar.a;
            dfvv dfvvVarF2 = dfvw.f();
            dfvvVarF2.c(dgznVar);
            return eork.i(dfvvVarF2.a());
        }
        dgzn dgznVar2 = dfvoVar.a;
        dgznVar2.aF(dfrhVar.a(dgznVar2));
        SettableFuture settableFuture = new dfvu(dgznVar2).a;
        dgznVar2.aF(dfrqVar.a(dgznVar2));
        dgznVar2.j();
        return settableFuture;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.e;
        eyir eyirVar2 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar2.d(), eyirVar.d());
    }
}
