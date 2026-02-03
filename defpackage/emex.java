package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emex implements evsv {
    static final evsv a = new emex();

    private emex() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emey emeyVar;
        if (i == 20) {
            emeyVar = emey.RCS_MLS_PROVISIONING_KDS_CERTIFICATE_CHAIN_REQUEST_FAILURE;
        } else if (i != 21) {
            switch (i) {
                case 0:
                    emeyVar = emey.RCS_MLS_PROVISIONING_UNKNOWN;
                    break;
                case 1:
                    emeyVar = emey.RCS_MLS_PROVISIONING_START;
                    break;
                case 2:
                    emeyVar = emey.RCS_MLS_PROVISIONING_ACS_FAILURE;
                    break;
                case 3:
                    emeyVar = emey.RCS_MLS_PROVISIONING_ACS_SUCCESS;
                    break;
                case 4:
                    emeyVar = emey.RCS_MLS_PROVISIONING_KDS_SKIP_REFRESH_NOT_NEEDED;
                    break;
                case 5:
                    emeyVar = emey.RCS_MLS_PROVISIONING_KDS_CERTIFICATE_CHAIN_RESPONSE_FAILURE;
                    break;
                case 6:
                    emeyVar = emey.RCS_MLS_PROVISIONING_KDS_CERTIFICATE_CHAIN_RESPONSE_SUCCESS;
                    break;
                case 7:
                    emeyVar = emey.RCS_MLS_PROVISIONING_KDS_UPLOAD_KEY_PACKAGE_FAILURE;
                    break;
                case 8:
                    emeyVar = emey.RCS_MLS_PROVISIONING_KDS_UPLOAD_KEY_PACKAGE_SUCCESS;
                    break;
                case 9:
                    emeyVar = emey.RCS_MLS_PROVISIONING_FAILED_KEYPAIRS_MISSING;
                    break;
                case 10:
                    emeyVar = emey.RCS_MLS_PROVISIONING_START_FROM_UPI;
                    break;
                case 11:
                    emeyVar = emey.RCS_MLS_PROVISIONING_START_FROM_OTP;
                    break;
                case 12:
                    emeyVar = emey.RCS_MLS_PROVISIONING_START_FROM_CONFIG_REFRESH;
                    break;
                default:
                    emeyVar = null;
                    break;
            }
        } else {
            emeyVar = emey.RCS_MLS_PROVISIONING_KDS_CERTIFICATE_CHAIN_REQUEST;
        }
        return emeyVar != null;
    }
}
