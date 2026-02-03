package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epgb implements evsy {
    @Override // defpackage.evsy
    public final /* bridge */ /* synthetic */ Object a(int i) {
        epgc epgcVar;
        switch (i) {
            case 0:
                epgcVar = epgc.UNKNOWN_API_FEATURE;
                break;
            case 1:
                epgcVar = epgc.CALL_INTENT_API_CALL_PHONE_NUMBER;
                break;
            case 2:
                epgcVar = epgc.CALL_INTENT_API_TARGETED_CALL;
                break;
            case 3:
                epgcVar = epgc.INTENT_API_OPEN_SETTINGS;
                break;
            case 4:
                epgcVar = epgc.INTENT_API_OPEN_BLOCKED_CONTACTS;
                break;
            case 5:
                epgcVar = epgc.CALL_INTENT_API_SELF_CALL;
                break;
            case 6:
                epgcVar = epgc.SERVICE_API_GET_REGISTRATION_INFO;
                break;
            case 7:
                epgcVar = epgc.SERVICE_API_GET_REGISTERED_ID_TYPE;
                break;
            case 8:
                epgcVar = epgc.DUO_KIT_REQUESTS;
                break;
            case 9:
                epgcVar = epgc.MEET_API_REQUESTS;
                break;
            default:
                epgcVar = null;
                break;
        }
        return epgcVar == null ? epgc.UNRECOGNIZED : epgcVar;
    }
}
