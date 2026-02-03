package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsat extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etjl etjlVar = (etjl) obj;
        switch (etjlVar) {
            case TARGETING_FAILED_REASON_UNKNOWN:
                return evon.TARGETING_FAILED_REASON_UNKNOWN;
            case TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT:
                return evon.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE:
                return evon.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE:
                return evon.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE:
                return evon.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE:
                return evon.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED:
                return evon.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE:
                return evon.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING:
                return evon.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND:
                return evon.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK:
                return evon.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED:
                return evon.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET:
                return evon.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(etjlVar.toString()));
        }
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evon evonVar = (evon) obj;
        switch (evonVar) {
            case TARGETING_FAILED_REASON_UNKNOWN:
                return etjl.TARGETING_FAILED_REASON_UNKNOWN;
            case TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT:
                return etjl.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE:
                return etjl.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE:
                return etjl.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE:
                return etjl.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE:
                return etjl.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED:
                return etjl.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE:
                return etjl.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING:
                return etjl.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND:
                return etjl.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK:
                return etjl.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED:
                return etjl.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET:
                return etjl.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(evonVar.toString()));
        }
    }
}
