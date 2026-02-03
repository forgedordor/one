package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.sun.jna.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elgl implements evsv {
    static final evsv a = new elgl();

    private elgl() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elgm elgmVar;
        switch (i) {
            case -1:
                elgmVar = elgm.TEST_ACTION;
                break;
            case 0:
                elgmVar = elgm.UNKNOWN;
                break;
            case 1:
                elgmVar = elgm.GET_OR_CREATE_CONVERSATION_ACTION;
                break;
            case 2:
                elgmVar = elgm.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION;
                break;
            case 3:
                elgmVar = elgm.HANDLE_ASSISTANT_REQUESTION_TIMEOUT_ACTION;
                break;
            case 4:
                elgmVar = elgm.REPORT_SPAM_ACTION;
                break;
            case 5:
                elgmVar = elgm.SEND_MESSAGE_ACTION;
                break;
            case 6:
                elgmVar = elgm.READ_DRAFT_ACTION;
                break;
            case 7:
                elgmVar = elgm.HANDLE_LOW_STORAGE_ACTION;
                break;
            case 8:
                elgmVar = elgm.TWINNED_STATUS_CHANGE_ACTION;
                break;
            case 9:
                elgmVar = elgm.PROCESS_USER_ALERT_ACTION;
                break;
            case 10:
                elgmVar = elgm.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION;
                break;
            case 11:
                elgmVar = elgm.CHANGE_PARTICIPANTS_ACTION;
                break;
            case 12:
                elgmVar = elgm.MIGRATE_BLOCKED_CONTACTS_ACTION;
                break;
            case 13:
                elgmVar = elgm.FIXUP_MESSAGES_ON_STARTUP_ACTION;
                break;
            case 14:
                elgmVar = elgm.DELETE_MESSAGE_ACTION;
                break;
            case 15:
                elgmVar = elgm.REPORT_TO_SPAM_SERVICE_ACTION;
                break;
            case 16:
                elgmVar = elgm.INITIAL_ETOUFFEE_PROVISIONING;
                break;
            case 17:
                elgmVar = elgm.PARTICIPANT_BLOCK_STATUS_REFRESH_ACTION;
                break;
            case 18:
                elgmVar = elgm.RECEIVE_MMS_MESSAGE_ACTION;
                break;
            case 19:
                elgmVar = elgm.PROCESS_INCOMING_RCS_FILE_TRANSFER_COMPLETED_ACTION;
                break;
            case 20:
                elgmVar = elgm.LOG_SCOOBY_METADATA_ACTION;
                break;
            case 21:
                elgmVar = elgm.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION;
                break;
            case 22:
                elgmVar = elgm.UPDATE_PARTICIPANT_COLOR_ACTION;
                break;
            case 23:
                elgmVar = elgm.PARTICIPANT_FULL_REFRESH_ACTION;
                break;
            case 24:
                elgmVar = elgm.CLEAR_SESSION_IDS_ACTION;
                break;
            case 25:
                elgmVar = elgm.UPDATE_CONVERSATION_ADD_CONTACT_BANNER_STATUS_ACTION;
                break;
            case 26:
                elgmVar = elgm.PROCESS_SETTINGS_UPDATE_ACTION;
                break;
            case 27:
                elgmVar = elgm.UPDATE_CLOUD_SYNC_MESSAGE_ACTION;
                break;
            case 28:
                elgmVar = elgm.CREATE_P2P_CONVERSATION_TRAINING_EXAMPLE_ACTION;
                break;
            case 29:
                elgmVar = elgm.RECEIVE_SMS_MESSAGE_ACTION;
                break;
            case 30:
            default:
                elgmVar = null;
                break;
            case 31:
                elgmVar = elgm.RECEIVE_RCS_FILE_TRANSFER_ACTION;
                break;
            case 32:
                elgmVar = elgm.INSERT_ENRICHED_CALL_ENTRY_ACTION;
                break;
            case 33:
                elgmVar = elgm.REQUEST_MORE_MESSAGES_ACTION;
                break;
            case 34:
                elgmVar = elgm.UPDATE_PARTICIPANT_SPAM_STATUS_ACTION;
                break;
            case 35:
                elgmVar = elgm.PAUSE_RCS_FILE_TRANSFER_ACTION;
                break;
            case 36:
                elgmVar = elgm.RESUME_RCS_FILE_TRANSFER_ACTION;
                break;
            case 37:
                elgmVar = elgm.REFRESH_NOTIFICATION_IF_OTP_FOUND_ACTION;
                break;
            case 38:
                elgmVar = elgm.SYNC_NOTIFICATION_CHANNEL_ACTION;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                elgmVar = elgm.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION;
                break;
            case 40:
                elgmVar = elgm.ADD_MEMBERS_TO_RCS_CONVERSATION_ACTION;
                break;
            case 41:
                elgmVar = elgm.INITIATE_CLIENT_SIDE_FALLBACK_ACTION;
                break;
            case 42:
                elgmVar = elgm.REQUEST_MESSAGE_DECORATOR_ACTION;
                break;
            case 43:
                elgmVar = elgm.RECURRING_TELEMETRY_UPLOADER_ACTION;
                break;
            case 44:
                elgmVar = elgm.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION;
                break;
            case 45:
                elgmVar = elgm.UPDATE_CONVERSATION_XMS_LATCH_ACTION;
                break;
            case 46:
                elgmVar = elgm.PROCESS_PENDING_MESSAGES_ACTION;
                break;
            case 47:
                elgmVar = elgm.GET_FRECENT_CONVERSATIONS_ACTION;
                break;
            case 48:
                elgmVar = elgm.PROCESS_FILE_TRANSFER_METADATA_UPDATE_ACTION;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                elgmVar = elgm.CHECK_PHONE_CONFIG_ACTION;
                break;
            case 50:
                elgmVar = elgm.MARK_AS_READ_ACTION;
                break;
            case 51:
                elgmVar = elgm.GET_MEDIA_DURATION_ACTION;
                break;
            case 52:
                elgmVar = elgm.LEAVE_RCS_CONVERSATION_ACTION;
                break;
            case 53:
                elgmVar = elgm.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION;
                break;
            case 54:
                elgmVar = elgm.SYNC_MESSAGES_ACTION;
                break;
            case 55:
                elgmVar = elgm.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION;
                break;
            case 56:
                elgmVar = elgm.UPDATE_RBM_BOT_PARTICIPANT_ACTION;
                break;
            case 57:
                elgmVar = elgm.DELETE_CONVERSATION_ACTION;
                break;
            case 58:
                elgmVar = elgm.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION;
                break;
            case 59:
                elgmVar = elgm.PROCESS_FILE_TRANSFER_ACTION;
                break;
            case 60:
                elgmVar = elgm.DOWNLOAD_MMS_ACTION;
                break;
            case 61:
                elgmVar = elgm.RECEIVE_RCS_MESSAGE_ACTION;
                break;
            case 62:
                elgmVar = elgm.RECEIVE_RBM_PAYMENT_RECEIPT_ACTION;
                break;
            case Function.ALT_CONVENTION /* 63 */:
                elgmVar = elgm.FALLBACK_TO_XMS_ACTION;
                break;
            case 64:
                elgmVar = elgm.RBM_GET_MEDIA_DURATION_ACTION;
                break;
            case 65:
                elgmVar = elgm.UPDATE_CONVERSATION_OPEN_COUNT_ACTION;
                break;
            case 66:
                elgmVar = elgm.LOG_TELEPHONY_DATABASE_ACTION;
                break;
            case 67:
                elgmVar = elgm.CLEAR_CLOUD_SYNC_MESSAGES_ACTION;
                break;
            case 68:
                elgmVar = elgm.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION;
                break;
            case 69:
                elgmVar = elgm.SYNC_TELEPHONY_THREADS_ACTION;
                break;
            case 70:
                elgmVar = elgm.UPDATE_MESSAGE_PART_SIZE_ACTION;
                break;
            case 71:
                elgmVar = elgm.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION;
                break;
            case 72:
                elgmVar = elgm.COMMMIT_PHENOTYPE_ACTION;
                break;
            case 73:
                elgmVar = elgm.MARK_AS_NOTIFIED_ACTION;
                break;
            case 74:
                elgmVar = elgm.PROCESS_PENDING_REVOCATIONS_ACTION;
                break;
            case 75:
                elgmVar = elgm.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION;
                break;
            case 76:
                elgmVar = elgm.SANITIZE_PARTICIPANTS_ACTION;
                break;
            case 77:
                elgmVar = elgm.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION;
                break;
            case 78:
                elgmVar = elgm.UPDATE_CONVERSATION_ARCHIVE_STATUS_ACTION;
                break;
            case 79:
                elgmVar = elgm.DELETE_SCRATCH_FILE_ACTION;
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                elgmVar = elgm.CLEAN_TELEPHONY_RAW_MESSAGES_ACTION;
                break;
            case 81:
                elgmVar = elgm.PAIRED_DESKTOP_SCAN_ACTION;
                break;
            case 82:
                elgmVar = elgm.UPDATE_DESTINATION_BLOCKED_ACTION;
                break;
            case 83:
                elgmVar = elgm.RELOAD_CEQUINT_PARTICIPANT_ACTION;
                break;
            case 84:
                elgmVar = elgm.INSERT_NEW_MESSAGE_ACTION;
                break;
            case 85:
                elgmVar = elgm.WRITE_WATCH_VERSION_ACTION;
                break;
            case 86:
                elgmVar = elgm.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION;
                break;
            case 87:
                elgmVar = elgm.WRITE_DRAFT_MESSAGE_ACTION;
                break;
            case 88:
                elgmVar = elgm.PROCESS_REVOCATION_SENT_ACTION;
                break;
            case 89:
                elgmVar = elgm.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION;
                break;
            case 90:
                elgmVar = elgm.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION;
                break;
            case 91:
                elgmVar = elgm.DEFER_BACKGROUND_WORK_ACTION;
                break;
            case 92:
                elgmVar = elgm.UPDATE_RCS_FILE_TRANSFER_PREVIEW_ACTION;
                break;
            case 93:
                elgmVar = elgm.REQUEST_LINK_PREVIEW_ACTION;
                break;
            case 94:
                elgmVar = elgm.PROCESS_CONVERSATION_PARTICIPANTS_UPDATE_ACTION;
                break;
            case 95:
                elgmVar = elgm.PROCESS_CONVERSATION_UPDATE_ACTION;
                break;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                elgmVar = elgm.PROCESS_MESSAGE_UPDATE_ACTION;
                break;
            case 97:
                elgmVar = elgm.DUMP_DATABASE_ACTION;
                break;
            case 98:
                elgmVar = elgm.PROCESS_RCS_DELIVERY_REPORT_ACTION;
                break;
            case 99:
                elgmVar = elgm.CHECK_WEARABLE_APP_VERSION_ACTION;
                break;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                elgmVar = elgm.SETUP_EXPRESSIVE_STICKERS_ACTION;
                break;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                elgmVar = elgm.PROCESS_DOWNLOADED_MMS_ACTION;
                break;
            case 102:
                elgmVar = elgm.PROCESS_SENT_MESSAGE_ACTION;
                break;
            case 103:
                elgmVar = elgm.UPDATE_CONVERSATION_SPAM_DISMISS_STATUS_ACTION;
                break;
            case 104:
                elgmVar = elgm.PROCESS_DELIVERY_REPORT_ACTION;
                break;
            case 105:
                elgmVar = elgm.SET_DITTO_SESSION_INACTIVE_ACTION;
                break;
            case 106:
                elgmVar = elgm.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION;
                break;
            case 107:
                elgmVar = elgm.REPLACE_SMS_MESSAGE_ACTION;
                break;
            case 108:
                elgmVar = elgm.SEND_REPORT_ACTION;
                break;
            case 109:
                elgmVar = elgm.UPDATE_CONVERSATION_OPTIONS_ACTION;
                break;
            case 110:
                elgmVar = elgm.UPDATE_CONTACT_DISAMBIGUATION_ACTION;
                break;
            case 111:
                elgmVar = elgm.FILL_PART_SIZE_ACTION;
                break;
            case 112:
                elgmVar = elgm.RESEND_MESSAGE_ACTION;
                break;
            case 113:
                elgmVar = elgm.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION;
                break;
            case 114:
                elgmVar = elgm.REDOWNLOAD_MESSAGE_ACTION;
                break;
            case 115:
                elgmVar = elgm.FIX_CONVERSATION_TYPE_ACTION;
                break;
            case 116:
                elgmVar = elgm.NO_CONFIRMATION_MESSAGE_SEND_ACTION;
                break;
            case 117:
                elgmVar = elgm.FAILED_REPORT_ACTION;
                break;
            case 118:
                elgmVar = elgm.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION;
                break;
            case 119:
                elgmVar = elgm.SELF_PARTICIPANTS_REFRESH_ACTION;
                break;
            case 120:
                elgmVar = elgm.UPDATE_UNREAD_COUNTER_ACTION;
                break;
            case 121:
                elgmVar = elgm.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
                break;
            case 122:
                elgmVar = elgm.SYNC_DATA_TO_WEARABLE_APP_ACTION;
                break;
            case 123:
                elgmVar = elgm.GENERIC_WORKER_QUEUE_ACTION;
                break;
            case 124:
                elgmVar = elgm.REBUILD_SHORTCUTS_ACTION;
                break;
            case 125:
                elgmVar = elgm.PROCESS_TELEPHONY_CHANGE_ACTION;
                break;
            case 126:
                elgmVar = elgm.COUNTRY_CODE_DETECTOR_ACTION;
                break;
            case 127:
                elgmVar = elgm.ENSURE_CONNECTIVITY_STABILIZED_ACTION;
                break;
            case 128:
                elgmVar = elgm.GET_RCS_AVAILABLE_ACTION;
                break;
            case 129:
                elgmVar = elgm.UPLOAD_KEYS_ACTION;
                break;
            case 130:
                elgmVar = elgm.LOG_MESSAGE_SENT_OR_RECEIVED;
                break;
            case 131:
                elgmVar = elgm.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION;
                break;
            case 132:
                elgmVar = elgm.RESET_GROUP_RCS_SESSION_ID_ACTION;
                break;
            case 133:
                elgmVar = elgm.HANDLE_INCOMING_RCS_GROUP_CHAT_INVITATION_ACTION;
                break;
            case 134:
                elgmVar = elgm.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION;
                break;
            case 135:
                elgmVar = elgm.MIGRATE_RCS_CONFERENCE_INFO_INTO_BUGLE_DB_ACTION;
                break;
            case 136:
                elgmVar = elgm.HANDLE_RCS_GROUP_NOTIFY_UPDATE_ACTION;
                break;
            case 137:
                elgmVar = elgm.DO_NOTHING_ACTION;
                break;
        }
        return elgmVar != null;
    }
}
