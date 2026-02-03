package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbk implements evsv {
    static final evsv a = new enbk();

    private enbk() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enbl enblVar;
        switch (i) {
            case 0:
                enblVar = enbl.ZINNIA_ERROR_UNKNOWN;
                break;
            case 1:
                enblVar = enbl.ZINNIA_ERROR_MISSING_MESSAGE;
                break;
            case 2:
                enblVar = enbl.ZINNIA_ERROR_MISSING_GROUP_ID;
                break;
            case 3:
                enblVar = enbl.ZINNIA_ERROR_MISSING_MESSAGE_ID;
                break;
            case 4:
                enblVar = enbl.ZINNIA_ERROR_CREATE_GROUP_ERROR;
                break;
            case 5:
                enblVar = enbl.ZINNIA_ERROR_JOIN_GROUP_ERROR;
                break;
            case 6:
                enblVar = enbl.ZINNIA_ERROR_ENCRYPT_MESSAGE_ERROR;
                break;
            case 7:
                enblVar = enbl.ZINNIA_ERROR_DECRYPT_MESSAGE_ERROR;
                break;
            case 8:
                enblVar = enbl.ZINNIA_ERROR_MESSAGE_ID_MISMATCH;
                break;
            case 9:
                enblVar = enbl.ZINNIA_ERROR_CLIENT_CREATION_ERROR;
                break;
            case 10:
                enblVar = enbl.ZINNIA_ERROR_REMOVE_FROM_GROUP_ERROR;
                break;
            case 11:
                enblVar = enbl.ZINNIA_ERROR_PROPOSE_REMOVE_SELF_FROM_GROUP_ERROR;
                break;
            case 12:
                enblVar = enbl.ZINNIA_ERROR_ADD_TO_GROUP_ERROR;
                break;
            case 13:
                enblVar = enbl.ZINNIA_ERROR_KEY_PACKAGE_DATA_SERIALIZATION_ERROR;
                break;
            case 14:
                enblVar = enbl.ZINNIA_ERROR_KEY_PACKAGE_STORAGE_ERROR;
                break;
            case 15:
                enblVar = enbl.ZINNIA_ERROR_GROUP_STATE_SERIALIZATION_ERROR;
                break;
            case 16:
                enblVar = enbl.ZINNIA_ERROR_EPOCH_RECORD_SERIALIZATION_ERROR;
                break;
            case 17:
                enblVar = enbl.ZINNIA_ERROR_GROUP_STATE_STORAGE_WRITE_ERROR;
                break;
            case 18:
                enblVar = enbl.ZINNIA_ERROR_GROUP_INFO_MESSAGE_EXPECTED;
                break;
            case 19:
                enblVar = enbl.ZINNIA_ERROR_GROUP_INFO_EXPIRED;
                break;
            case 20:
                enblVar = enbl.ZINNIA_ERROR_STORAGE_TRAIT_ERROR;
                break;
            case 21:
                enblVar = enbl.ZINNIA_ERROR_ZINNIA_STATE_SERIALIZATION_ERROR;
                break;
            case 22:
                enblVar = enbl.ZINNIA_ERROR_ZINNIA_STATE_DESERIALIZATION_ERROR;
                break;
            case 23:
                enblVar = enbl.ZINNIA_ERROR_INVALID_WIRE_FORMAT;
                break;
            case 24:
                enblVar = enbl.ZINNIA_ERROR_MISSING_REQUIRED_GROUP_ID;
                break;
            case 25:
                enblVar = enbl.ZINNIA_ERROR_MISSING_REQUIRED_EPOCH;
                break;
            case 26:
                enblVar = enbl.ZINNIA_ERROR_INVALID_GROUP_ID;
                break;
            case 27:
                enblVar = enbl.ZINNIA_ERROR_OUT_OF_ORDER_COMMIT;
                break;
            case 28:
                enblVar = enbl.ZINNIA_ERROR_MISSING_DB_PATH;
                break;
            case 29:
                enblVar = enbl.ZINNIA_ERROR_MISSING_SIGNATURE_KEY_PAIR;
                break;
            case 30:
                enblVar = enbl.ZINNIA_ERROR_MISSING_KEY_PACKAGES;
                break;
            case 31:
                enblVar = enbl.ZINNIA_ERROR_MISSING_MEMBERS_TO_REMOVE;
                break;
            case 32:
                enblVar = enbl.ZINNIA_ERROR_DELIVERY_RECEIPT_VALIDATION_ERROR;
                break;
            case 33:
                enblVar = enbl.ZINNIA_ERROR_DISPLAY_RECEIPT_VALIDATION_ERROR;
                break;
            case 34:
                enblVar = enbl.ZINNIA_ERROR_MISSING_DELIVERY_RECEIPT_METADATA;
                break;
            case 35:
                enblVar = enbl.ZINNIA_ERROR_MISSING_DISPLAY_RECEIPT_METADATA;
                break;
            case 36:
                enblVar = enbl.ZINNIA_ERROR_KILL_SELF_HEAL_REQUEST_ALREADY_NONE;
                break;
            case 37:
                enblVar = enbl.ZINNIA_ERROR_KILL_SELF_HEAL_REQUEST_ALREADY_FAILED;
                break;
            case 38:
                enblVar = enbl.ZINNIA_ERROR_INVALID_AUTHENTICATED_DATA_VERSION;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                enblVar = enbl.ZINNIA_ERROR_INVALID_SECRET_PAYLOAD_VERSION;
                break;
            case 40:
                enblVar = enbl.ZINNIA_ERROR_INVALID_SECRET_PAYLOAD_TYPE;
                break;
            case 41:
                enblVar = enbl.ZINNIA_ERROR_VALIDATING_NEGATIVE_DELIVERY_RECEIPT_IN_POSITIVE_FLOW;
                break;
            case 42:
                enblVar = enbl.ZINNIA_ERROR_RECEIVER_INDEX_MISMATCH;
                break;
            case 43:
                enblVar = enbl.ZINNIA_ERROR_GROUP_CONTEXT_EXTENSION_PROPOSAL_CHANGES_ERA_ERROR;
                break;
            case 44:
                enblVar = enbl.ZINNIA_ERROR_GROUP_CONTEXT_EXTENSION_PROPOSAL_REMOVES_ERA_ERROR;
                break;
            case 45:
                enblVar = enbl.ZINNIA_ERROR_RATCHET_TREE_SERIALIZATION_ERROR;
                break;
            case 46:
                enblVar = enbl.ZINNIA_ERROR_INVALID_SELF_HEAL_STATUS;
                break;
            case 47:
                enblVar = enbl.ZINNIA_ERROR_EXPECTED_SELF_HEAL_TO_BE_ONGOING;
                break;
            case 48:
                enblVar = enbl.ZINNIA_ERROR_INVALID_PROPOSALS_IN_EXTERNAL_COMMIT;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                enblVar = enbl.ZINNIA_ERROR_MISSING_SELF_REMOVE_IN_EXTERNAL_COMMIT;
                break;
            case 50:
                enblVar = enbl.ZINNIA_ERROR_MISSING_EXTERNAL_INIT_IN_EXTERNAL_COMMIT;
                break;
            case 51:
                enblVar = enbl.ZINNIA_ERROR_REPLAYED_MESSAGE;
                break;
            case 52:
                enblVar = enbl.ZINNIA_ERROR_FILE_DECRYPTOR_MISSING_CONTEXT;
                break;
            case 53:
                enblVar = enbl.ZINNIA_ERROR_FILE_ENCRYPTOR_MISSING_CONTEXT;
                break;
            case 54:
                enblVar = enbl.ZINNIA_ERROR_INVALID_DELIVERY_NOTIFICATION_STATUS;
                break;
            case 55:
                enblVar = enbl.ZINNIA_ERROR_INVALID_DISPLAY_NOTIFICATION_STATUS;
                break;
            case 56:
                enblVar = enbl.ZINNIA_ERROR_INVALID_MLS_CLIENT_FAILURE_REASON;
                break;
            case 57:
                enblVar = enbl.ZINNIA_ERROR_INVALID_DERIVED_CONTENT_VERSION;
                break;
            case 58:
                enblVar = enbl.ZINNIA_ERROR_MISSING_EPOCH_FIELD;
                break;
            case 59:
                enblVar = enbl.ZINNIA_ERROR_ENDING_MLS_NOT_SELF_HEALING;
                break;
            case 60:
                enblVar = enbl.ZINNIA_ERROR_INCORRECT_EXPECTED_COMMIT_KIND;
                break;
            case 61:
                enblVar = enbl.ZINNIA_ERROR_INVALID_END_MLS_PROPOSAL;
                break;
            case 62:
                enblVar = enbl.ZINNIA_ERROR_MISSING_EPOCH_IN_MESSAGE_STORAGE;
                break;
            case Function.ALT_CONVENTION /* 63 */:
                enblVar = enbl.ZINNIA_ERROR_INVALID_PARTICIPANT_PROTO;
                break;
            case 64:
                enblVar = enbl.ZINNIA_ERROR_NO_MEMBERS_MATCHING_SELECTOR;
                break;
            case 65:
                enblVar = enbl.ZINNIA_ERROR_INVALID_END_MLS_REVIVAL_COMMIT;
                break;
            case 66:
                enblVar = enbl.ZINNIA_ERROR_INVALID_OPERATION_END_MLS_ACTIVE;
                break;
            case 67:
                enblVar = enbl.ZINNIA_ERROR_GROUP_ALREADY_EXISTS_ERROR;
                break;
            case 68:
                enblVar = enbl.ZINNIA_ERROR_EXPECTED_SELF_HEAL_TO_BE_REQUESTED;
                break;
            case 69:
                enblVar = enbl.ZINNIA_ERROR_VALIDATING_NEGATIVE_DELIVERY_RECEIPT_IN_NEGATIVE_FLOW;
                break;
            case 70:
                enblVar = enbl.ZINNIA_ERROR_EXISTING_PENDING_COMMIT;
                break;
            case 71:
                enblVar = enbl.ZINNIA_ERROR_MISSING_PAYLOAD;
                break;
            case 72:
                enblVar = enbl.ZINNIA_ERROR_NON_PROPOSAL_MESSAGE_IN_PROPOSAL_LIST;
                break;
            case 73:
                enblVar = enbl.ZINNIA_ERROR_INVALID_COMMIT_LIST;
                break;
            case 74:
                enblVar = enbl.ZINNIA_ERROR_ILLEGAL_MLS_HEALTH_STATUS_TRANSITION;
                break;
            case 75:
                enblVar = enbl.ZINNIA_ERROR_INVALID_KEY_UPDATE_TIMESTAMP;
                break;
            case 76:
                enblVar = enbl.ZINNIA_ERROR_INVALID_CLIENT_ID_STRING;
                break;
            case 77:
                enblVar = enbl.ZINNIA_ERROR_INVALID_CERTIFICATE;
                break;
            case 78:
                enblVar = enbl.ZINNIA_ERROR_INVALID_KEY_PACKAGE_DATA;
                break;
            case 79:
                enblVar = enbl.ZINNIA_ERROR_TIME_RETRIEVAL_FAILURE;
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                enblVar = enbl.ZINNIA_ERROR_SENDER_MISMATCH;
                break;
            case 81:
                enblVar = enbl.ZINNIA_ERROR_MISSING_ROOT_CERTIFICATES;
                break;
            case 82:
                enblVar = enbl.ZINNIA_ERROR_MEMBERSHIP_HISTORY_NOT_FOUND;
                break;
            case 83:
                enblVar = enbl.ZINNIA_ERROR_EPOCH_ALREADY_PROCESSED;
                break;
            default:
                enblVar = null;
                break;
        }
        return enblVar != null;
    }
}
