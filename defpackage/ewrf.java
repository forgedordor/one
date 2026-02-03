package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewrf implements evsv {
    public static final evsv a = new ewrf();

    private ewrf() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewrg ewrgVar;
        switch (i) {
            case 0:
                ewrgVar = ewrg.CONSENT_REASON_UNKNOWN;
                break;
            case 1:
                ewrgVar = ewrg.SEAMLESS_AUTHORIZED_PROVISIONING_ALLOWED;
                break;
            case 2:
                ewrgVar = ewrg.IMEI_PII_FORMAT_NONE;
                break;
            case 3:
                ewrgVar = ewrg.IMEI_PII_FORMAT_SHORT;
                break;
            case 4:
                ewrgVar = ewrg.IMEI_PII_FORMAT_IGNORED;
                break;
            case 5:
                ewrgVar = ewrg.IMSI_PII_FORMAT_NONE;
                break;
            case 6:
                ewrgVar = ewrg.IMSI_PII_FORMAT_SHORT;
                break;
            case 7:
                ewrgVar = ewrg.IMSI_PII_FORMAT_IGNORED;
                break;
            case 8:
                ewrgVar = ewrg.CONSENT_ALREADY_GRANTED;
                break;
            case 9:
                ewrgVar = ewrg.HE_REQUEST_SUCCESSFUL;
                break;
            case 10:
                ewrgVar = ewrg.GOOGLE_TOS_DISABLED;
                break;
            case 11:
                ewrgVar = ewrg.RCS_DEFAULT_ON_ALREADY_SEEN;
                break;
            default:
                ewrgVar = null;
                break;
        }
        return ewrgVar != null;
    }
}
