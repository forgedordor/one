package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfw implements dvfq {
    public final ddsq a;
    public final CallerInfo b;

    public dvfw(Context context, ddsq ddsqVar, String str, Account account, ejxr ejxrVar, ejxr ejxrVar2) {
        this.a = ddsqVar;
        this.b = new CallerInfo("profile-".concat(str), 1L);
        dvfu dvfuVar = new dvfu(ejxrVar2, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dvfuVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(dvfuVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        dvfv dvfvVar = new dvfv(ejxrVar, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dvfvVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(dvfvVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    @Override // defpackage.dvfq
    public final ListenableFuture a() {
        SyncOptions syncOptions = new SyncOptions();
        return eika.k(drgi.a(this.a.a(1, new byte[0], syncOptions, this.b)), new eooz() { // from class: dvfr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                evrr evrrVar = evrr.a;
                evuq evuqVar = evuq.a;
                evrr evrrVar2 = evrr.a;
                return eork.i((eucu) evsn.parseFrom(eucu.a, (byte[]) obj, evrrVar2));
            }
        }, eoqg.a);
    }
}
