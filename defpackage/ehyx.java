package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyx implements ehlj {
    private final fcsu a;
    private final boolean b;

    public ehyx(fcsu fcsuVar, boolean z) {
        this.a = fcsuVar;
        this.b = z;
    }

    @Override // defpackage.ehlj
    public final ListenableFuture a() {
        return this.b ? ((ehwx) this.a.b()).a() : eorv.a;
    }
}
