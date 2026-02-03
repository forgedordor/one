package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ezoa implements evsy {
    @Override // defpackage.evsy
    public final /* bridge */ /* synthetic */ Object a(int i) {
        felh felhVar;
        if (i != 0) {
            switch (i) {
                case 3:
                    felhVar = felh.GAIA_CALLER_ID;
                    break;
                case 4:
                    felhVar = felh.TESTING;
                    break;
                case 5:
                    felhVar = felh.EMAIL_CONTACTS;
                    break;
                case 6:
                    felhVar = felh.TACHYGRAM;
                    break;
                case 7:
                    felhVar = felh.MUTUAL_CJNS;
                    break;
                case 8:
                    felhVar = felh.PUSH_ALERTS;
                    break;
                case 9:
                    felhVar = felh.UNICORN;
                    break;
                case 10:
                    felhVar = felh.GROUP_CALLING_TICKLE_WEB;
                    break;
                case 11:
                    felhVar = felh.GUESTS_SUPPORTED;
                    break;
                case 12:
                    felhVar = felh.SUSPECTED_SPAM_UI_SUPPORTED;
                    break;
                case 13:
                    felhVar = felh.SELF_GROUP_CALL_TICKLE_SUPPORTED;
                    break;
                case 14:
                    felhVar = felh.DUET_GROUP_CALL;
                    break;
                case 15:
                    felhVar = felh.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN;
                    break;
                case 16:
                    felhVar = felh.SUPPORTS_24_HOUR_RCS_AUTH_TOKEN;
                    break;
                case 17:
                    felhVar = felh.SUPPORTS_RECEIVING_RCS_SENDER_FANOUT;
                    break;
                default:
                    felhVar = null;
                    break;
            }
        } else {
            felhVar = felh.UNKNOWN;
        }
        return felhVar == null ? felh.UNRECOGNIZED : felhVar;
    }
}
