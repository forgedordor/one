package defpackage;

import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecea implements eceb {
    private static final String a = "eceb";

    @Override // defpackage.eceb
    public final void a(ecdy ecdyVar) throws Resources.NotFoundException, IOException {
        try {
            dedi.a(ecdyVar.b);
        } catch (dcen e) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e);
            dcdt.a.b(ecdyVar.b, e.a);
            int i = ecdyVar.c;
            throw new IOException("Blocked unpatched use of SSL stack.", e);
        } catch (dceo e2) {
            dcdt.a.b(ecdyVar.b, e2.a);
            int i2 = ecdyVar.c;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e2);
        }
    }
}
