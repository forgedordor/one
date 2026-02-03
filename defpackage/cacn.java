package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
class cacn implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        caeg caegVar = (caeg) obj;
        switch (caegVar) {
            case UNSPECIFIED_STEP:
                return emdn.OPT_OUT_UNSPECIFIED_STEP_WORK;
            case TACHYON_UNREGISTER:
                return emdn.OPT_OUT_TACHYON_UNREGISTER_WORK;
            case SET_SERVER_STATUS_OFF:
                return emdn.OPT_OUT_SET_SERVER_STATUS_OFF_WORK;
            case COMPLETE_OPT_OUT_MD:
                return emdn.OPT_OUT_COMPLETE_OPT_OUT_MD_WORK;
            case CLEAR_PRIMARY_DEVICE_ID:
                return emdn.OPT_OUT_CLEAR_PRIMARY_DEVICE_ID_WORK;
            case CLEAR_INITIAL_SYNC_STATUS:
                return emdn.OPT_OUT_CLEAR_INITIAL_SYNC_STATUS_WORK;
            case RESET_BOX:
                return emdn.OPT_OUT_RESET_BOX_WORK;
            case CANCEL_CMS_WORK_MANAGER_WORK:
                return emdn.OPT_OUT_CANCEL_CMS_WORK_MANAGER_WORK;
            case COMPLETE_OPT_OUT_BNR:
                return emdn.OPT_OUT_COMPLETE_OPT_OUT_BNR_WORK;
            case COMPLETE_DOWNGRADE_MD_TO_BNR:
                return emdn.OPT_OUT_COMPLETE_DOWNGRADE_MD_TO_BNR;
            case CLEAR_FEATURE_TYPES:
                return emdn.OPT_OUT_CLEAR_FEATURE_TYPES_WORK;
            case RETRIEVE_CMS_TIMESTAMP:
                return emdn.OPT_OUT_RETRIEVE_CMS_TIMESTAMP_WORK;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(caegVar))));
        }
    }
}
