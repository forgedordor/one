package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjy implements dcjw {
    final /* synthetic */ BaseGmsClient a;

    public dcjy(BaseGmsClient baseGmsClient) {
        this.a = baseGmsClient;
    }

    @Override // defpackage.dcjw
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.c()) {
            BaseGmsClient baseGmsClient = this.a;
            baseGmsClient.o(null, baseGmsClient.z());
        } else {
            dckn dcknVar = this.a.t;
            if (dcknVar != null) {
                dcknVar.a(connectionResult);
            }
        }
    }
}
