package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehws implements ehwx {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/sync/impl/NoOpSyncManager");

    @Override // defpackage.ehwx
    public final ListenableFuture a() {
        ((ekrd) ((ekrd) a.i()).h("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "poke", 18, "NoOpSyncManager.java")).q("Skipping #poke() because this is not a supported process");
        return eorv.a;
    }

    @Override // defpackage.ehwx
    public final ListenableFuture b() {
        ((ekrd) ((ekrd) a.i()).h("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "sync", 24, "NoOpSyncManager.java")).q("Skipping #sync() because this is not a supported process");
        return eorv.a;
    }
}
