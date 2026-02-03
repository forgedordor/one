package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsu extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;
    private final eyir g;
    private final eyir h;

    public dfsu(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5, eyir eyirVar6, eyir eyirVar7) {
        super(eyikVar2, new eyji(dfsu.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
        this.g = eyje.c(eyirVar6);
        this.h = eyje.c(eyirVar7);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional optionalEmpty;
        List list = (List) obj;
        dftb dftbVar = (dftb) list.get(0);
        eyiq eyiqVar = (eyiq) list.get(1);
        eyiq eyiqVar2 = (eyiq) list.get(2);
        Optional optional = (Optional) list.get(3);
        dfwc dfwcVar = (dfwc) list.get(4);
        dfrq dfrqVar = (dfrq) list.get(5);
        dfrh dfrhVar = (dfrh) list.get(6);
        dhip dhipVar = dfsq.a;
        dgzn dgznVar = (dgzn) dftbVar.b().orElseThrow(new Supplier() { // from class: dfsa
            @Override // java.util.function.Supplier
            public final Object get() {
                dhip dhipVar2 = dfsq.a;
                return new IllegalArgumentException("No session provided in request!");
            }
        });
        if (optional.isPresent()) {
            dgznVar.j();
            dgznVar.aT((dgzl) optional.get());
            optionalEmpty = Optional.empty();
        } else {
            dfsq.a(eyiqVar);
            Optional optional2 = (Optional) dfsq.a(eyiqVar2);
            Conversation conversationD = dfwf.d(dgznVar);
            dfwe dfweVarB = dfwcVar.b(conversationD, (dhat) dgznVar);
            dhja.d(dfsq.a.b("produceIncomingSessionResult"), "Incoming session added to session store with result: %s", dfweVarB);
            dfrp dfrpVarA = dfrqVar.a(dgznVar);
            if (((AutoValue_Conversation) conversationD).c == 1) {
                dfvo dfvoVar = (dfvo) dfweVarB;
                int i = dfvoVar.b - 1;
                if (i == 0) {
                    dgznVar.aF(dfrpVarA);
                    dgznVar.j();
                    dgznVar.C();
                } else if (i != 2) {
                    dgznVar.j();
                    dgznVar.af(5, 57);
                } else {
                    dfvoVar.a.n(5, 57);
                    dgznVar.aF(dfrpVarA);
                    dgznVar.j();
                    dgznVar.C();
                }
            } else {
                dfvo dfvoVar2 = (dfvo) dfweVarB;
                int i2 = dfvoVar2.b - 1;
                if (i2 == 0) {
                    dgznVar.aF(dfrpVarA);
                    dgznVar.aF(dfrhVar.a(dgznVar));
                    dgznVar.j();
                    dgznVar.C();
                } else if (i2 != 2) {
                    dgznVar.j();
                    dgznVar.af(5, 57);
                } else {
                    dfvoVar2.a.n(5, 57);
                    dgznVar.aF(dfrpVarA);
                    dgznVar.aF(dfrhVar.a(dgznVar));
                    dgznVar.j();
                    dgznVar.C();
                }
            }
            optionalEmpty = optional2;
        }
        return eork.i(optionalEmpty);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.c;
        ListenableFuture listenableFutureD = this.b.d();
        ListenableFuture listenableFutureA = eyje.a(eyirVar.d());
        ListenableFuture listenableFutureA2 = eyje.a(this.d.d());
        eyir eyirVar2 = this.h;
        eyir eyirVar3 = this.g;
        return eork.f(listenableFutureD, listenableFutureA, listenableFutureA2, this.e.d(), this.f.d(), eyirVar3.d(), eyirVar2.d());
    }
}
