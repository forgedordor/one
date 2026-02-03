package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emdm implements evsv {
    static final evsv a = new emdm();

    private emdm() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emdn emdnVar;
        switch (i) {
            case 0:
                emdnVar = emdn.UNKNOWN_WORK;
                break;
            case 1:
                emdnVar = emdn.BLOCK_ON_TELEPHONY_SYNC_WORK;
                break;
            case 2:
                emdnVar = emdn.RESTORE_PARTICIPANTS_WORK;
                break;
            case 3:
                emdnVar = emdn.RESTORE_MESSAGES_WORK;
                break;
            case 4:
                emdnVar = emdn.BACKUP_WORK;
                break;
            case 5:
                emdnVar = emdn.OPT_IN_WORK;
                break;
            case 6:
                emdnVar = emdn.RESTORE_BACKUP_KEY_WORK;
                break;
            case 7:
                emdnVar = emdn.RESTORE_CONVERSATIONS_WORK;
                break;
            case 8:
                emdnVar = emdn.RESTORE_ENCRYPTION_KEY_WORK;
                break;
            case 9:
                emdnVar = emdn.OPT_IN_UNSPECIFIED_STEP_WORK;
                break;
            case 10:
                emdnVar = emdn.OPT_IN_TACHYON_REGISTRATION_WORK;
                break;
            case 11:
                emdnVar = emdn.OPT_IN_SET_STATUS_ON_SERVER_WORK;
                break;
            case 12:
                emdnVar = emdn.OPT_IN_COMPLETE_OPT_IN_MD_WORK;
                break;
            case 13:
                emdnVar = emdn.OPT_IN_COMPLETE_OPT_IN_BNR_WORK;
                break;
            case 14:
                emdnVar = emdn.OPT_OUT_UNSPECIFIED_STEP_WORK;
                break;
            case 15:
                emdnVar = emdn.OPT_OUT_SET_SERVER_STATUS_OFF_WORK;
                break;
            case 16:
                emdnVar = emdn.OPT_OUT_TACHYON_UNREGISTER_WORK;
                break;
            case 17:
                emdnVar = emdn.OPT_OUT_COMPLETE_OPT_OUT_MD_WORK;
                break;
            case 18:
                emdnVar = emdn.OPT_OUT_COMPLETE_OPT_OUT_BNR_WORK;
                break;
            case 19:
                emdnVar = emdn.OPT_OUT_CLEAR_PRIMARY_DEVICE_ID_WORK;
                break;
            case 20:
                emdnVar = emdn.OPT_OUT_CLEAR_INITIAL_SYNC_STATUS_WORK;
                break;
            case 21:
                emdnVar = emdn.OPT_OUT_RESET_BOX_WORK;
                break;
            case 22:
                emdnVar = emdn.OPT_OUT_CANCEL_CMS_WORK_MANAGER_WORK;
                break;
            case 23:
                emdnVar = emdn.OPT_OUT_COMPLETE_DOWNGRADE_MD_TO_BNR;
                break;
            case 24:
                emdnVar = emdn.OPT_OUT_CLEAR_FEATURE_TYPES_WORK;
                break;
            case 25:
                emdnVar = emdn.OPT_OUT_RETRIEVE_CMS_TIMESTAMP_WORK;
                break;
            default:
                emdnVar = null;
                break;
        }
        return emdnVar != null;
    }
}
