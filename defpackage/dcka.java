package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcka extends dcjt {
    final /* synthetic */ BaseGmsClient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcka(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.g = baseGmsClient;
    }

    @Override // defpackage.dcjt
    protected final void a(ConnectionResult connectionResult) {
        this.g.i.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.dcjt
    protected final boolean b() {
        this.g.i.a(ConnectionResult.a);
        return true;
    }
}
