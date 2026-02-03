package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdtb implements dtpd {
    private final Supplier a;
    private final Supplier b;

    public cdtb(Supplier supplier, Supplier supplier2) {
        this.a = supplier;
        this.b = supplier2;
    }

    @Override // defpackage.dtpd
    public final ListenableFuture a(dtsl dtslVar) {
        return ((Boolean) ((cczv) this.b.get()).e()).booleanValue() ? ((dtpd) this.a.get()).a(dtslVar) : eijx.e(null);
    }
}
