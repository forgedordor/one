package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eclu extends ecic {
    private final evuh a;

    public eclu(evuh evuhVar) {
        this.a = evuhVar;
    }

    @Override // defpackage.ecic
    public final ListenableFuture a(final IOException iOException, ecid ecidVar) {
        return !(iOException.getCause() instanceof evtj) ? eork.h(iOException) : eooh.g(ecidVar.a(eork.i(this.a)), IOException.class, new eooz() { // from class: eclt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, eoqg.a);
    }
}
