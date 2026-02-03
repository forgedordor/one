package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dcjt extends dcjv {
    public final int a;
    public final Bundle b;
    final /* synthetic */ BaseGmsClient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected dcjt(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, true);
        this.c = baseGmsClient;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean b();

    @Override // defpackage.dcjv
    protected final /* bridge */ /* synthetic */ void c() {
        int i = this.a;
        if (i != 0) {
            this.c.gp(1, null);
            Bundle bundle = this.b;
            a(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable(RcsIntents.EXTRA_PENDING_INTENT) : null));
        } else {
            if (b()) {
                return;
            }
            this.c.gp(1, null);
            a(new ConnectionResult(8, null));
        }
    }
}
