package defpackage;

import android.telephony.ims.ImsException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggc implements dhkw {
    private final dgfv a;

    public dggc(dgfv dgfvVar) {
        this.a = dgfvVar;
    }

    private final dhki d(int i) {
        boolean z = craf.e;
        if (!z || !dfog.G()) {
            dhja.k("[SR]: Single Registration is disabled. Skipping Single Registration capability check for subId: %s, OS.isAtLeastS:[%s], enableSingleRegistrationProvisioning:[%s]", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(dfog.G()));
            return dhki.DUAL_REG;
        }
        try {
            boolean zIsRcsVolteSingleRegistrationCapable = this.a.a(i).isRcsVolteSingleRegistrationCapable();
            dhja.k("[SR]: AOSP ProvisioningManager.isRcsVolteSingleRegistrationCapable:[%s] for subId: %d, OS.isAtLeastS:[%s], enableSingleRegistrationProvisioning:[%s]", Boolean.valueOf(zIsRcsVolteSingleRegistrationCapable), Integer.valueOf(i), true, Boolean.valueOf(dfog.G()));
            return zIsRcsVolteSingleRegistrationCapable ? dhki.SINGLE_REG : dhki.DUAL_REG;
        } catch (ImsException | RuntimeException e) {
            dhja.i(e, "[SR]: Failed to retrieve SR capability from IMS for subId: %d", Integer.valueOf(i));
            return dhki.UNKNOWN;
        }
    }

    @Override // defpackage.dhkw
    public final dhki a(int i) {
        return d(i);
    }

    @Override // defpackage.dhkw
    public final boolean b(int i) {
        return dhki.SINGLE_REG.equals(d(i));
    }

    public final boolean c(int i) {
        if (!craf.e || !dfog.G()) {
            dhja.q("[SR]: Single Registration is disabled. Skipping reconfiguration trigger for subId: %s", Integer.valueOf(i));
            return false;
        }
        Integer numValueOf = Integer.valueOf(i);
        dhja.k("[SR]: Triggering Reconfiguration for subId: %s", numValueOf);
        try {
            this.a.a(i).triggerRcsReconfiguration();
            dhja.c("[SR]: Reconfiguration Trigger for subId: %s succesful", numValueOf);
            return true;
        } catch (ImsException | RuntimeException e) {
            dhja.i(e, "[SR]: Failed to trigger reconfiguration for subId: %d", Integer.valueOf(i));
            return false;
        }
    }
}
