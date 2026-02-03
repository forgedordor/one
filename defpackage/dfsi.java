package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsi extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;
    private final eyir g;
    private final eyir h;

    public dfsi(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5, eyir eyirVar6, eyir eyirVar7) {
        super(eyikVar2, new eyji(dfsi.class), eyikVar);
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
        Optional optionalOf;
        List list = (List) obj;
        dftb dftbVar = (dftb) list.get(0);
        eyiq eyiqVar = (eyiq) list.get(1);
        Conversation conversation = (Conversation) list.get(2);
        Optional optional = (Optional) list.get(3);
        dfwc dfwcVar = (dfwc) list.get(4);
        dfrq dfrqVar = (dfrq) list.get(5);
        dfrh dfrhVar = (dfrh) list.get(6);
        dfny dfnyVar = dfsd.a;
        if (dftbVar.b().isEmpty()) {
            optionalOf = Optional.empty();
        } else {
            Object obj2 = dftbVar.b().get();
            dgwe dgweVar = (dgwe) obj2;
            if (dgweVar.p) {
                optionalOf = Optional.of(obj2);
            } else if (optional.isPresent()) {
                ((dgvh) obj2).j();
                ((dgzn) obj2).aT((dgzl) optional.get());
                optionalOf = Optional.empty();
            } else {
                dfsd.a(eyiqVar);
                dfwe dfweVarB = dfwcVar.b(conversation, (dhat) obj2);
                dhja.c("Incoming session added to session store with result: %s", dfweVarB);
                dfvo dfvoVar = (dfvo) dfweVarB;
                int i = dfvoVar.b;
                if (i == 1 || !obj2.equals(dfvoVar.a)) {
                    dgzn dgznVar = (dgzn) obj2;
                    dfrp dfrpVarA = dfrqVar.a(dgznVar);
                    dgzn dgznVar2 = dfvoVar.a;
                    if (conversation.c() == 1) {
                        int i2 = i - 1;
                        if (i2 == 0) {
                            dgznVar.aF(dfrpVarA);
                            ((dgvh) obj2).j();
                            dgweVar.C();
                            optionalOf = Optional.of(obj2);
                        } else if (i2 != 2) {
                            ((dgvh) obj2).j();
                            dgweVar.af(5, 57);
                            optionalOf = Optional.of(obj2);
                        } else {
                            dgznVar2.n(5, 57);
                            dgznVar.aF(dfrpVarA);
                            ((dgvh) obj2).j();
                            dgweVar.C();
                            optionalOf = Optional.of(obj2);
                        }
                    } else {
                        if (conversation.c() != 2) {
                            throw new IllegalStateException("Unexpected conversation type ".concat(efip.a(conversation.c())));
                        }
                        int i3 = i - 1;
                        if (i3 == 0) {
                            dgznVar.aF(dfrpVarA);
                            dgznVar.aF(dfrhVar.a(dgznVar));
                            ((dgvh) obj2).j();
                            dgweVar.C();
                            optionalOf = Optional.of(obj2);
                        } else if (i3 != 2) {
                            ((dgvh) obj2).j();
                            dgweVar.af(5, 57);
                            optionalOf = Optional.of(obj2);
                        } else {
                            dgznVar2.n(5, 57);
                            dgznVar.aF(dfrpVarA);
                            dgznVar.aF(dfrhVar.a(dgznVar));
                            ((dgvh) obj2).j();
                            dgweVar.C();
                            optionalOf = Optional.of(obj2);
                        }
                    }
                } else {
                    optionalOf = Optional.of(obj2);
                }
            }
        }
        return eork.i(optionalOf);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.c;
        ListenableFuture listenableFutureD = this.b.d();
        ListenableFuture listenableFutureA = eyje.a(eyirVar.d());
        eyir eyirVar2 = this.h;
        eyir eyirVar3 = this.g;
        eyir eyirVar4 = this.f;
        return eork.f(listenableFutureD, listenableFutureA, this.d.d(), this.e.d(), eyirVar4.d(), eyirVar3.d(), eyirVar2.d());
    }
}
