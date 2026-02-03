package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecky implements ecid {
    private final eckz a;

    public ecky(eckz eckzVar) {
        this.a = eckzVar;
    }

    @Override // defpackage.ecid
    public final ListenableFuture a(ListenableFuture listenableFuture) {
        final eckz eckzVar = this.a;
        return eooq.g(listenableFuture, eiid.d(new eooz() { // from class: ecko
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException {
                eckz eckzVar2 = eckzVar;
                eckzVar2.c((Uri) eork.q(eckzVar2.a), obj);
                return eorv.a;
            }
        }), eckzVar.b);
    }
}
