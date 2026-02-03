package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmr implements eooy {
    final /* synthetic */ Map.Entry a;

    public ehmr(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        return ((ehlj) ((fcsu) this.a.getValue()).b()).a();
    }
}
