package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensu implements evsv {
    static final evsv a = new ensu();

    private ensu() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ensv ensvVar;
        switch (i) {
            case 0:
                ensvVar = ensv.MAGIC_COMPOSE_ERROR_SUB_TYPE_UNSPECIFIED;
                break;
            case 1:
                ensvVar = ensv.MAGIC_COMPOSE_FILTERED_BY_SAFETY_BLOCKLIST;
                break;
            case 2:
                ensvVar = ensv.MAGIC_COMPOSE_COULD_NOT_GENERATE_RESULTS;
                break;
            case 3:
                ensvVar = ensv.MAGIC_COMPOSE_NETWORK_UNAVAILABLE_STATUS;
                break;
            case 4:
                ensvVar = ensv.MAGIC_COMPOSE_SEVER_ERROR_STATUS;
                break;
            case 5:
                ensvVar = ensv.MAGIC_COMPOSE_RATE_LIMITED_STATUS;
                break;
            case 6:
                ensvVar = ensv.MAGIC_COMPOSE_DEADLINE_EXCEEDED_STATUS;
                break;
            case 7:
                ensvVar = ensv.MAGIC_COMPOSE_UNAUTHORIZED_STATUS;
                break;
            case 8:
                ensvVar = ensv.MAGIC_COMPOSE_UNKNOWN_STATUS;
                break;
            case 9:
                ensvVar = ensv.MAGIC_COMPOSE_SERVER_THROTTLED;
                break;
            case 10:
                ensvVar = ensv.MAGIC_COMPOSE_MAGIC_REWRITE_WITHOUT_DRAFT;
                break;
            case 11:
                ensvVar = ensv.MAGIC_COMPOSE_FEATURE_DOWNLOADING;
                break;
            default:
                ensvVar = null;
                break;
        }
        return ensvVar != null;
    }
}
