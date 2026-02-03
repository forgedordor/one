package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egzg {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    public final egzh b;

    public egzg(egzh egzhVar) {
        this.b = egzhVar;
    }

    public final ListenableFuture a(final egzb egzbVar) {
        egxz egxzVar = (egxz) egzbVar;
        final ejvr ejvrVar = egxzVar.c;
        if (ejvrVar != null) {
            this.a.add(ejvrVar);
            this.b.a(eork.i(null), egxzVar.b);
        }
        ListenableFuture listenableFuture = egxzVar.a;
        listenableFuture.b(eiid.k(new Runnable() { // from class: egzc
            @Override // java.lang.Runnable
            public final void run() {
                ejvr ejvrVar2 = ejvrVar;
                egzg egzgVar = this.a;
                if (ejvrVar2 != null) {
                    egzgVar.a.remove(ejvrVar2);
                }
                egzgVar.b.a(eork.i(null), ((egxz) egzbVar).b);
            }
        }), eoqg.a);
        return listenableFuture;
    }
}
