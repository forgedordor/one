package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcco extends dccp {
    public dcco(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.dccp
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new dccq("Invalid response to one way request"));
        }
    }

    @Override // defpackage.dccp
    public final boolean b() {
        return true;
    }
}
