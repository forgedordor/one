package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyem implements evsv {
    static final evsv a = new eyem();

    private eyem() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        eyen eyenVar;
        switch (i) {
            case 0:
                eyenVar = eyen.NOT_SET;
                break;
            case 1:
                eyenVar = eyen.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                break;
            case 2:
                eyenVar = eyen.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                break;
            case 3:
                eyenVar = eyen.LOGGER_OVERRIDE_PROVIDER;
                break;
            case 4:
                eyenVar = eyen.LOGGER_DEFERRING_PROVIDER;
                break;
            case 5:
                eyenVar = eyen.EVENT_OVERRIDE;
                break;
            case 6:
                eyenVar = eyen.EVENT_DEFERRING;
                break;
            case 7:
                eyenVar = eyen.LOG_SOURCE_MAPPED;
                break;
            case 8:
                eyenVar = eyen.SERVER_INFRASTRUCTURE;
                break;
            case 9:
                eyenVar = eyen.LOG_REQUEST_SETTER_WEB;
                break;
            case 10:
                eyenVar = eyen.PRIVACY_CONTEXT_RESOLVER;
                break;
            default:
                eyenVar = null;
                break;
        }
        return eyenVar != null;
    }
}
