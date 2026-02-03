package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cafd {
    public static final Map a;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.CLEAR_INITIAL_SYNC_STATUS, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.CLEAR_PRIMARY_DEVICE_ID, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.SET_SERVER_STATUS_OFF, cpyb.MULTI_DEVICE);
        ekgiVar.i(caeg.TACHYON_UNREGISTER, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.RESET_BOX, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.CLEAR_FEATURE_TYPES, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.RETRIEVE_CMS_TIMESTAMP, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.COMPLETE_OPT_OUT_MD, cpyb.MULTI_DEVICE);
        ekgiVar.i(caeg.UNSPECIFIED_STEP, cpyb.UNDEFINED);
        ekgiVar.i(caeg.COMPLETE_OPT_OUT_BNR, cpyb.BACKUP_AND_RESTORE);
        ekgiVar.i(caeg.COMPLETE_DOWNGRADE_MD_TO_BNR, cpyb.MULTI_DEVICE);
        a = ekgiVar.c();
    }
}
