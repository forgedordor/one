package defpackage;

import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class chtv implements dgfv {
    @Override // defpackage.dgfv
    public final ProvisioningManager a(int i) throws ImsException {
        try {
            return ProvisioningManager.createForSubscriptionId(i);
        } catch (IllegalArgumentException e) {
            throw new ImsException("Invalid subscription id.", 3, e);
        }
    }
}
