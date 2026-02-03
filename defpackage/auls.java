package defpackage;

import android.database.sqlite.SQLiteException;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;
import io.grpc.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auls {
    public static emcn a(Throwable th) {
        return (!(th instanceof ExecutionException) || th.getCause() == null) ? b(th) : b(th.getCause());
    }

    private static emcn b(Throwable th) {
        if (th instanceof IllegalArgumentException) {
            return emcn.ILLEGAL_ARGUMENT;
        }
        if (th instanceof IllegalStateException) {
            return emcn.ILLEGAL_STATE;
        }
        if (th instanceof UnsupportedOperationException) {
            return emcn.UNSUPPORTED_OPERATION;
        }
        if (th instanceof NullPointerException) {
            return emcn.NULL_POINTER;
        }
        if (th instanceof fbtf) {
            Status.Code code = Status.Code.OK;
            eycw eycwVar = eycw.BAD_URL;
            int iOrdinal = ((fbtf) th).a.getCode().ordinal();
            return iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? iOrdinal != 6 ? iOrdinal != 7 ? iOrdinal != 9 ? iOrdinal != 16 ? iOrdinal != 13 ? iOrdinal != 14 ? emcn.SERVER_STATUS_OTHER : emcn.SERVER_STATUS_UNAVAILABLE : emcn.SERVER_STATUS_INTERNAL : emcn.SERVER_STATUS_UNAUTHENTICATED : emcn.SERVER_STATUS_FAILED_PRECONDITION : emcn.SERVER_STATUS_PERMISSION_DENIED : emcn.SERVER_STATUS_ALREADY_EXISTS : emcn.SERVER_STATUS_NOT_FOUND : emcn.SERVER_STATUS_DEADLINE_EXCEEDED : emcn.SERVER_STATUS_INVALID_ARGUMENT;
        }
        if (th instanceof SQLiteException) {
            return emcn.SQLITE_EXCEPTION;
        }
        if (!(th instanceof cpza)) {
            if (th instanceof ExecutionException) {
                return emcn.EXECUTION_EXCEPTION;
            }
            if (!(th instanceof eycx)) {
                return emcn.INTERNAL;
            }
            Status.Code code2 = Status.Code.OK;
            eycw eycwVar2 = eycw.BAD_URL;
            int iOrdinal2 = ((eycx) th).a.ordinal();
            if (iOrdinal2 == 0) {
                return emcn.MEDIA_UPLOAD_TRANSFER_EXCEPTION_BAD_URL;
            }
            if (iOrdinal2 == 1) {
                return emcn.MEDIA_UPLOAD_TRANSFER_EXCEPTION_CANCELED;
            }
            if (iOrdinal2 == 2) {
                return emcn.MEDIA_UPLOAD_TRANSFER_EXCEPTION_REQUEST_BODY_READ_ERROR;
            }
            if (iOrdinal2 == 3) {
                return emcn.MEDIA_UPLOAD_TRANSFER_EXCEPTION_CONNECTION_ERROR;
            }
            if (iOrdinal2 == 4) {
                return emcn.MEDIA_UPLOAD_TRANSFER_EXCEPTION_SERVER_ERROR;
            }
            if (iOrdinal2 == 5) {
                return emcn.INTERNAL;
            }
            throw new AssertionError("should not reach here.");
        }
        Status.Code code3 = Status.Code.OK;
        eycw eycwVar3 = eycw.BAD_URL;
        int i = ((cpza) th).c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return emcn.ACCOUNT_NOT_LINKED;
            case 1:
                return emcn.CMS_CIPHER_EXCEPTION;
            case 2:
                return emcn.SMS_NOTIFICATION_NOT_FOUND;
            case 3:
                return emcn.MMS_NOTIFICATION_NOT_FOUND;
            case 4:
                return emcn.MMS_TRANSACTION_ID_FORMAT;
            case 5:
                return emcn.CMS_DEVICE_NOT_ALLOWED;
            case 6:
                return emcn.BACKUP_ITEM_SKIPPED;
            case 7:
                return emcn.BACKUP_ITEM_SKIPPED_EMPTY;
            case 8:
                return emcn.BACKUP_ITEM_SKIPPED_EXCLUDED;
            case 9:
                return emcn.BACKUP_ITEM_FAILED_REQUEST_VALIDATION;
            case 10:
                return emcn.LOCAL_ROW_MISSING;
            case 11:
                return emcn.CMS_DEPENDENCY_MISSING;
            case 12:
                return emcn.BACKUP_REACHES_MAX_RETRY;
            case 13:
                return emcn.CMS_ID_SAVE_FAILURE;
            case 14:
                return emcn.CMS_ENTITY_ALREADY_EXISTS;
            case 15:
                return emcn.WORK_ITEM_ID_MISSING;
            case 16:
                return emcn.PARTICIPANT_HAS_EMPTY_NORM_DEST;
            case 17:
                return emcn.PARTICIPANT_HAS_EMPTY_NORM_AND_SEND_DEST;
            case 18:
                return emcn.PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_ID;
            case 19:
                return emcn.PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_CORRELATION_ID;
            case 20:
                return emcn.CONVERSATION_RCS_GROUP_ID_IS_NULL;
            case 21:
                return emcn.BACKUP_ENCOUNTERED_FORKED_CONVERSATION;
            case 22:
                return emcn.UPDATE_CONVERSATION_ALREADY_EXISTS;
            case 23:
                return emcn.FOUND_NO_SELF_PARTICIPANT;
            case 24:
                return emcn.SERVER_RETURNED_INCOMPLETE_DATA_FOR_BATCH;
            case 25:
                return emcn.EXISTING_ID_LOOKUP_FAILED;
            case 26:
                return emcn.EXISTING_CONVERSATION_ID_LOOKUP_FAILED;
            case 27:
                return emcn.OPT_IN_STEP_IS_UNSPECIFIED;
            case 28:
                return emcn.OPT_IN_INVALID_FEATURE_STATE;
            case 29:
                return emcn.OPT_IN_STEP_NOT_FOUND;
            case 30:
                return emcn.OPT_IN_STEP_EXCEEDS_MAX_RETRY;
            case 31:
                return emcn.OPT_IN_STEP_NOT_HAVE_FEATURE;
            case 32:
                return emcn.OPT_IN_STEP_HAS_UNDEFINED_FEATURE;
            case 33:
                return emcn.OPT_OUT_STEP_IS_UNSPECIFIED;
            case 34:
                return emcn.OPT_OUT_INVALID_FEATURE_STATE;
            case 35:
                return emcn.OPT_OUT_STEP_NOT_FOUND;
            case 36:
                return emcn.OPT_OUT_STEP_EXCEEDS_MAX_RETRY;
            case 37:
                return emcn.OPT_OUT_STEP_NOT_HAVE_FEATURE;
            case 38:
                return emcn.OPT_OUT_STEP_HAS_UNDEFINED_FEATURE;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return emcn.MESSAGE_MODEL_MISSING;
            case 40:
                return emcn.FREQ_CHANGED_MESSAGE_FIELDS_MISSING;
            case 41:
                return emcn.CMS_DECRYPTION_EXCEPTION;
            case 42:
                return emcn.INVALID_PROTO;
            case 43:
                return emcn.SQLITE_EXCEPTION;
            case 44:
                return emcn.RESTORE_EMPTY_CMS_ID;
            case 45:
                return emcn.BACKUP_KEY_NOT_FOUND;
            case 46:
                return emcn.ENCRYPTION_KEY_NOT_FOUND;
            case 47:
                return emcn.ENCRYPTION_KEY_NOT_FOUND_FROM_CACHE_WHEN_DECRYPT;
            case 48:
                return emcn.ENCRYPTION_KEY_NOT_FOUND_WHEN_CREATE_CACHE;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return emcn.ENCRYPTION_KEY_NOT_FOUND_INITIAL_BACKUP;
            case 50:
                return emcn.ENCRYPTION_KEY_NOT_FOUND_INCREMENTAL_BACKUP;
            case 51:
                return emcn.RESTORE_CONV_MISSING_RCS_GRP_CONTRIBUTION_ID;
            case 52:
                return emcn.RESTORE_CONV_WRONG_CODE_PATH;
            case 53:
                return emcn.RESTORE_CONV_CONVERSATION_WITH_EMPTY_PARTICIPANTS;
            case 54:
                return emcn.RESTORE_CONV_PARTICIPANT_NOT_FOUND;
            case 55:
                return emcn.RESTORE_CONV_EMPTY_NORMALIZED_DESTINATION;
            case 56:
                return emcn.RESTORE_MSG_EMPTY_TELEPHONY_URI;
            case 57:
                return emcn.RESTORE_MSG_MSG_WITH_TELEPHONY_URI_NOT_FOUND;
            case 58:
                return emcn.RESTORE_MSG_CONVERSATION_MISSING;
            case 59:
                return emcn.RESTORE_MSG_DUPLICATE_MSG_ID_MISSING;
            case 60:
                return emcn.RESTORE_MSG_PARTICIPANT_MISSING;
            case 61:
                return emcn.RESTORE_MSG_SMS_WITH_EMPTY_TEXT;
            case 62:
                return emcn.RESTORE_MSG_MMS_TEXT_WITH_EMPTY_TEXT;
            case Function.ALT_CONVENTION /* 63 */:
                return emcn.RESTORE_MSG_DELETE_FAILED_BEFORE_INSERT;
            case 64:
                return emcn.RESTORE_MSG_DELETE_FAILED_AFTER_INSERT;
            case 65:
                return emcn.RESTORE_MSG_TELEPHONY_INSERT_FAILURE;
            case 66:
                return emcn.KEY_SYNC_STEP_NOT_FOUND;
            case 67:
                return emcn.KEY_SYNC_STEP_IS_UNSPECIFIED;
            case 68:
                return emcn.KEY_SYNC_STEP_EXCEEDS_MAX_RETRY;
            case 69:
                return emcn.KEY_SYNC_KEY_NOT_READY_BEFORE_SYNC;
            case 70:
                return emcn.KEY_SYNC_MORE_THAN_ONE_KEY;
            case 71:
                return emcn.KEY_SYNC_NO_HANDLER;
            case 72:
                return emcn.KEY_SYNC_NO_FOLSOM_KEYS;
            case 73:
                return emcn.KEY_SYNC_CANNOT_INSTANTIATE_GMS_CRYPTOR;
            case 74:
                return emcn.KEY_SYNC_NO_BACKUP_KEY;
            case 75:
                return emcn.KEY_SYNC_FAILED_TO_ENCRYPT_BACKUP_KEY;
            case 76:
                return emcn.NO_SQS_STORAGE_QUOTA_FOR_MEDIA;
            case 77:
                return emcn.NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE;
            case 78:
                return emcn.RESTORE_MSG_BUGLEDB_BULK_INSERT_MESSAGE_IDS_FAILURE;
            case 79:
                return emcn.RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_FAILURE;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return emcn.RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_LENGTH_FAILURE;
            case 81:
                return emcn.KEY_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 82:
                return emcn.PARTICIPANT_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 83:
                return emcn.CONVERSATION_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 84:
                return emcn.MESSAGE_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 85:
                return emcn.PAGE_TOKEN_CYCLE_EXCEPTION;
            default:
                throw new IllegalArgumentException("Code not expected to exit exhaustive switch statement");
        }
    }
}
