package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egec implements ehti, ehsz {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver");
    private final egeb b;

    public egec(egeb egebVar) {
        this.b = egebVar;
    }

    @Override // defpackage.ehti
    public final ListenableFuture a(Intent intent) {
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver", "onReceive", 40, "DeviceAccountsChangedReceiver.java")).q("DeviceAccountsChangedReceiver#onReceive");
        egeb egebVar = this.b;
        if (egebVar.c()) {
            return eork.i(null);
        }
        egebVar.b();
        return egebVar.a();
    }

    @Override // defpackage.ehsz
    public final long b() {
        return -1L;
    }

    @Override // defpackage.ehsz
    public final /* synthetic */ long c() {
        return -1L;
    }
}
