package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxq extends lxd {
    public final Executor a;
    public final dtws b;
    public final AtomicReference c = new AtomicReference(null);
    public String d = "";

    public dtxq(dtws dtwsVar, Executor executor) {
        this.b = dtwsVar;
        this.a = executor;
    }

    public final ListenableFuture a() {
        return eika.j(this.b.c(this.d), new ejvr() { // from class: dtxo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                lvy lvyVar = (lvy) this.a.c.get();
                lvyVar.getClass();
                lvyVar.j(ekgb.n((ekgb) obj));
                return null;
            }
        }, this.a);
    }
}
