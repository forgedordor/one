package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvt extends ecic {
    private final ains a;
    private final eclu b = new eclu(cmvh.a);

    public cmvt(ains ainsVar) {
        this.a = ainsVar;
    }

    @Override // defpackage.ecic
    public final ListenableFuture a(IOException iOException, ecid ecidVar) {
        this.a.c("Bugle.ForwardSync.SyncManagerDataStore.CorruptData.Count");
        return this.b.a(iOException, ecidVar);
    }
}
