package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiti extends ecic {
    private final ains a;
    private final eclu b = new eclu(aith.a);

    public aiti(ains ainsVar) {
        this.a = ainsVar;
    }

    @Override // defpackage.ecic
    public final ListenableFuture a(IOException iOException, ecid ecidVar) {
        this.a.c("Bugle.ProtoDataStore.Corruption.UsageData.Count");
        return this.b.a(iOException, ecidVar);
    }
}
