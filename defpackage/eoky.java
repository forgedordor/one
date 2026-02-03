package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoky implements evsv {
    static final evsv a = new eoky();

    private eoky() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        eokz eokzVar;
        switch (i) {
            case 0:
                eokzVar = eokz.UNKNOWN;
                break;
            case 1:
                eokzVar = eokz.GROUP_NOT_FOUND;
                break;
            case 2:
                eokzVar = eokz.NEW_BUILD_ID;
                break;
            case 3:
                eokzVar = eokz.NEW_VARIANT_ID;
                break;
            case 4:
                eokzVar = eokz.NEW_VERSION_NUMBER;
                break;
            case 5:
                eokzVar = eokz.DIFFERENT_FILES;
                break;
            case 6:
                eokzVar = eokz.DIFFERENT_STALE_LIFETIME;
                break;
            case 7:
                eokzVar = eokz.DIFFERENT_EXPIRATION_DATE;
                break;
            case 8:
                eokzVar = eokz.DIFFERENT_DOWNLOAD_CONDITIONS;
                break;
            case 9:
                eokzVar = eokz.DIFFERENT_ALLOWED_READERS;
                break;
            case 10:
                eokzVar = eokz.DIFFERENT_DOWNLOAD_POLICY;
                break;
            case 11:
                eokzVar = eokz.DIFFERENT_EXPERIMENT_INFO;
                break;
            case 12:
                eokzVar = eokz.DIFFERENT_CUSTOM_METADATA;
                break;
            default:
                eokzVar = null;
                break;
        }
        return eokzVar != null;
    }
}
