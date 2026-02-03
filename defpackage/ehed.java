package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehed implements ehti, ehsz {
    private final ehej a;
    private final Set b;

    public ehed(Map map, ehej ehejVar, eosd eosdVar) {
        map.getClass();
        ehejVar.getClass();
        eosdVar.getClass();
        this.a = ehejVar;
        this.b = map.keySet();
    }

    @Override // defpackage.ehti
    public final ListenableFuture a(Intent intent) throws IOException {
        intent.getClass();
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        eieu eieuVarJ = eiiy.j("Updating experiments", eiey.a);
        try {
            ListenableFuture listenableFutureG = stringExtra == null ? this.a.g() : this.b.contains(stringExtra) ? this.a.f(stringExtra) : eork.i(null);
            egoc.c(listenableFutureG, "Failed updating experiments for package %s", stringExtra);
            final fdap fdapVar = new fdap() { // from class: eheb
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((Exception) obj).getClass();
                    return null;
                }
            };
            ListenableFuture listenableFutureE = eika.e(listenableFutureG, Exception.class, new ejvr() { // from class: ehec
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    fdapVar.invoke(obj);
                    return null;
                }
            }, eoqg.a);
            fczl.a(eieuVarJ, null);
            return listenableFutureE;
        } finally {
        }
    }

    @Override // defpackage.ehsz
    public final long b() {
        return 25000L;
    }

    @Override // defpackage.ehsz
    public final long c() {
        return 25000L;
    }
}
