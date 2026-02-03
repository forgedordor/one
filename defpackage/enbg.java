package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.sun.jna.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbg implements evsv {
    static final evsv a = new enbg();

    private enbg() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enbh enbhVar;
        switch (i) {
            case 0:
                enbhVar = enbh.MLS_ERROR_UNKNOWN;
                break;
            case 1:
                enbhVar = enbh.MLS_ERROR_IDENTITY_PROVIDER_ERROR;
                break;
            case 2:
                enbhVar = enbh.MLS_ERROR_CRYPTO_PROVIDER_ERROR;
                break;
            case 3:
                enbhVar = enbh.MLS_ERROR_KEY_PACKAGE_REPO_ERROR;
                break;
            case 4:
                enbhVar = enbh.MLS_ERROR_GROUP_STORAGE_ERROR;
                break;
            case 5:
                enbhVar = enbh.MLS_ERROR_PSK_STORE_ERROR;
                break;
            case 6:
                enbhVar = enbh.MLS_ERROR_MLS_RULES_ERROR;
                break;
            case 7:
                enbhVar = enbh.MLS_ERROR_SERIALIZATION_ERROR;
                break;
            case 8:
                enbhVar = enbh.MLS_ERROR_EXTENSION_ERROR;
                break;
            case 9:
                enbhVar = enbh.MLS_ERROR_CIPHER_SUITE_MISMATCH;
                break;
            case 10:
                enbhVar = enbh.MLS_ERROR_COMMIT_MISSING_PATH;
                break;
            case 11:
                enbhVar = enbh.MLS_ERROR_INVALID_EPOCH;
                break;
            case 12:
                enbhVar = enbh.MLS_ERROR_INVALID_SIGNATURE;
                break;
            case 13:
                enbhVar = enbh.MLS_ERROR_INVALID_CONFIRMATION_TAG;
                break;
            case 14:
                enbhVar = enbh.MLS_ERROR_INVALID_MEMBERSHIP_TAG;
                break;
            case 15:
                enbhVar = enbh.MLS_ERROR_INVALID_TREE_KEM_PRIVATE_KEY;
                break;
            case 16:
                enbhVar = enbh.MLS_ERROR_WELCOME_KEY_PACKAGE_NOT_FOUND;
                break;
            case 17:
                enbhVar = enbh.MLS_ERROR_LEAF_NOT_FOUND;
                break;
            case 18:
                enbhVar = enbh.MLS_ERROR_CANT_PROCESS_MESSAGE_FROM_SELF;
                break;
            case 19:
                enbhVar = enbh.MLS_ERROR_COMMIT_REQUIRED;
                break;
            case 20:
                enbhVar = enbh.MLS_ERROR_RATCHET_TREE_NOT_FOUND;
                break;
            case 21:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_SENDER_CANNOT_COMMIT;
                break;
            case 22:
                enbhVar = enbh.MLS_ERROR_UNSUPPORTED_PROTOCOL_VERSION;
                break;
            case 23:
                enbhVar = enbh.MLS_ERROR_PROTOCOL_VERSION_MISMATCH;
                break;
            case 24:
                enbhVar = enbh.MLS_ERROR_UNSUPPORTED_CIPHER_SUITE;
                break;
            case 25:
                enbhVar = enbh.MLS_ERROR_UNKNOWN_SIGNING_IDENTITY_FOR_EXTERNAL_SENDER;
                break;
            case 26:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_PROPOSALS_DISABLED;
                break;
            case 27:
                enbhVar = enbh.MLS_ERROR_INVALID_EXTERNAL_SIGNING_IDENTITY;
                break;
            case 28:
                enbhVar = enbh.MLS_ERROR_MISSING_EXTERNAL_PUB_EXTENSION;
                break;
            case 29:
                enbhVar = enbh.MLS_ERROR_EPOCH_NOT_FOUND;
                break;
            case 30:
                enbhVar = enbh.MLS_ERROR_UNENCRYPTED_APPLICATION_MESSAGE;
                break;
            case 31:
                enbhVar = enbh.MLS_ERROR_EXPECTED_COMMIT_FOR_NEW_MEMBER_COMMIT;
                break;
            case 32:
                enbhVar = enbh.MLS_ERROR_EXPECTED_ADD_PROPOSAL_FOR_NEW_MEMBER_PROPOSAL;
                break;
            case 33:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_COMMIT_MISSING_EXTERNAL_INIT;
                break;
            case 34:
                enbhVar = enbh.MLS_ERROR_GROUP_USED_AFTER_RE_INIT;
                break;
            case 35:
                enbhVar = enbh.MLS_ERROR_PENDING_RE_INIT_NOT_FOUND;
                break;
            case 36:
                enbhVar = enbh.MLS_ERROR_RE_INIT_EXTENSIONS_MISMATCH;
                break;
            case 37:
                enbhVar = enbh.MLS_ERROR_SIGNER_NOT_FOUND;
                break;
            case 38:
                enbhVar = enbh.MLS_ERROR_EXISTING_PENDING_COMMIT;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                enbhVar = enbh.MLS_ERROR_PENDING_COMMIT_NOT_FOUND;
                break;
            case 40:
                enbhVar = enbh.MLS_ERROR_UNEXPECTED_MESSAGE_TYPE;
                break;
            case 41:
                enbhVar = enbh.MLS_ERROR_MEMBERSHIP_TAG_FOR_NON_MEMBER;
                break;
            case 42:
                enbhVar = enbh.MLS_ERROR_MEMBER_NOT_FOUND;
                break;
            case 43:
                enbhVar = enbh.MLS_ERROR_GROUP_NOT_FOUND;
                break;
            case 44:
                enbhVar = enbh.MLS_ERROR_UNEXPECTED_PSK_ID;
                break;
            case 45:
                enbhVar = enbh.MLS_ERROR_INVALID_SENDER;
                break;
            case 46:
                enbhVar = enbh.MLS_ERROR_GROUP_ID_MISMATCH;
                break;
            case 47:
                enbhVar = enbh.MLS_ERROR_NON_ZERO_RETENTION_REQUIRED;
                break;
            case 48:
                enbhVar = enbh.MLS_ERROR_TOO_MANY_PSK_IDS;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                enbhVar = enbh.MLS_ERROR_MISSING_REQUIRED_PSK;
                break;
            case 50:
                enbhVar = enbh.MLS_ERROR_OLD_GROUP_STATE_NOT_FOUND;
                break;
            case 51:
                enbhVar = enbh.MLS_ERROR_INVALID_LEAF_CONSUMPTION;
                break;
            case 52:
                enbhVar = enbh.MLS_ERROR_KEY_MISSING;
                break;
            case 53:
                enbhVar = enbh.MLS_ERROR_INVALID_FUTURE_GENERATION;
                break;
            case 54:
                enbhVar = enbh.MLS_ERROR_LEAF_NODE_NO_CHILDREN;
                break;
            case 55:
                enbhVar = enbh.MLS_ERROR_LEAF_NODE_NO_PARENT;
                break;
            case 56:
                enbhVar = enbh.MLS_ERROR_INVALID_TREE_INDEX;
                break;
            case 57:
                enbhVar = enbh.MLS_ERROR_TIME_OVERFLOW;
                break;
            case 58:
                enbhVar = enbh.MLS_ERROR_INVALID_LEAF_NODE_SOURCE;
                break;
            case 59:
                enbhVar = enbh.MLS_ERROR_INVALID_LIFETIME;
                break;
            case 60:
                enbhVar = enbh.MLS_ERROR_REQUIRED_EXTENSION_NOT_FOUND;
                break;
            case 61:
                enbhVar = enbh.MLS_ERROR_REQUIRED_PROPOSAL_NOT_FOUND;
                break;
            case 62:
                enbhVar = enbh.MLS_ERROR_REQUIRED_CREDENTIAL_NOT_FOUND;
                break;
            case Function.ALT_CONVENTION /* 63 */:
                enbhVar = enbh.MLS_ERROR_EXTENSION_NOT_IN_CAPABILITIES;
                break;
            case 64:
                enbhVar = enbh.MLS_ERROR_EXPECTED_NODE;
                break;
            case 65:
                enbhVar = enbh.MLS_ERROR_INVALID_NODE_INDEX;
                break;
            case 66:
                enbhVar = enbh.MLS_ERROR_UNEXPECTED_EMPTY_NODE;
                break;
            case 67:
                enbhVar = enbh.MLS_ERROR_DUPLICATE_LEAF_DATA;
                break;
            case 68:
                enbhVar = enbh.MLS_ERROR_IN_USE_CREDENTIAL_TYPE_UNSUPPORTED_BY_NEW_LEAF;
                break;
            case 69:
                enbhVar = enbh.MLS_ERROR_CREDENTIAL_TYPE_OF_NEW_LEAF_IS_UNSUPPORTED;
                break;
            case 70:
                enbhVar = enbh.MLS_ERROR_WRONG_PATH_LEN;
                break;
            case 71:
                enbhVar = enbh.MLS_ERROR_SAME_HPKE_KEY;
                break;
            case 72:
                enbhVar = enbh.MLS_ERROR_INVALID_INIT_KEY;
                break;
            case 73:
                enbhVar = enbh.MLS_ERROR_INIT_LEAF_KEY_EQUALITY;
                break;
            case 74:
                enbhVar = enbh.MLS_ERROR_DIFFERENT_IDENTITY_IN_UPDATE;
                break;
            case 75:
                enbhVar = enbh.MLS_ERROR_PUB_KEY_MISMATCH;
                break;
            case 76:
                enbhVar = enbh.MLS_ERROR_TREE_HASH_MISMATCH;
                break;
            case 77:
                enbhVar = enbh.MLS_ERROR_UPDATE_ERROR_NO_SECRET_KEY;
                break;
            case 78:
                enbhVar = enbh.MLS_ERROR_LCA_NOT_FOUND_IN_DIRECT_PATH;
                break;
            case 79:
                enbhVar = enbh.MLS_ERROR_PARENT_HASH_MISMATCH;
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                enbhVar = enbh.MLS_ERROR_UNMERGED_LEAVES_MISMATCH;
                break;
            case 81:
                enbhVar = enbh.MLS_ERROR_UNEXPECTED_EMPTY_TREE;
                break;
            case 82:
                enbhVar = enbh.MLS_ERROR_UNEXPECTED_TRAILING_BLANKS;
                break;
            case 83:
                enbhVar = enbh.MLS_ERROR_INVALID_COMMIT_SELF_UPDATE;
                break;
            case 84:
                enbhVar = enbh.MLS_ERROR_INVALID_TYPE_OR_USAGE_IN_PRE_SHARED_KEY_PROPOSAL;
                break;
            case 85:
                enbhVar = enbh.MLS_ERROR_INVALID_PSK_NONCE_LENGTH;
                break;
            case 86:
                enbhVar = enbh.MLS_ERROR_INVALID_PROTOCOL_VERSION_IN_RE_INIT;
                break;
            case 87:
                enbhVar = enbh.MLS_ERROR_MORE_THAN_ONE_PROPOSAL_FOR_LEAF;
                break;
            case 88:
                enbhVar = enbh.MLS_ERROR_MORE_THAN_ONE_GROUP_CONTEXT_EXTENSIONS_PROPOSAL;
                break;
            case 89:
                enbhVar = enbh.MLS_ERROR_INVALID_PROPOSAL_TYPE_FOR_SENDER;
                break;
            case 90:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_COMMIT_MUST_HAVE_EXACTLY_ONE_EXTERNAL_INIT;
                break;
            case 91:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_COMMIT_MUST_HAVE_NEW_LEAF;
                break;
            case 92:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_COMMIT_REMOVES_OTHER_IDENTITY;
                break;
            case 93:
                enbhVar = enbh.MLS_ERROR_EXTERNAL_COMMIT_WITH_MORE_THAN_ONE_REMOVE;
                break;
            case 94:
                enbhVar = enbh.MLS_ERROR_DUPLICATE_PSK_IDS;
                break;
            case 95:
                enbhVar = enbh.MLS_ERROR_INVALID_PROPOSAL_TYPE_IN_EXTERNAL_COMMIT;
                break;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                enbhVar = enbh.MLS_ERROR_COMMITTER_SELF_REMOVAL;
                break;
            case 97:
                enbhVar = enbh.MLS_ERROR_ONLY_MEMBERS_CAN_COMMIT_PROPOSALS_BY_REF;
                break;
            case 98:
                enbhVar = enbh.MLS_ERROR_OTHER_PROPOSAL_WITH_RE_INIT;
                break;
            case 99:
                enbhVar = enbh.MLS_ERROR_UNSUPPORTED_GROUP_EXTENSION;
                break;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                enbhVar = enbh.MLS_ERROR_UNSUPPORTED_CUSTOM_PROPOSAL;
                break;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                enbhVar = enbh.MLS_ERROR_PROPOSAL_NOT_FOUND;
                break;
            case 102:
                enbhVar = enbh.MLS_ERROR_REMOVING_NON_EXISTING_MEMBER;
                break;
            case 103:
                enbhVar = enbh.MLS_ERROR_INVALID_SUCCESSOR;
                break;
            case 104:
                enbhVar = enbh.MLS_ERROR_UPDATING_NON_EXISTING_MEMBER;
                break;
            case 105:
                enbhVar = enbh.MLS_ERROR_FAILED_GENERATING_PATH_SECRET;
                break;
            case 106:
                enbhVar = enbh.MLS_ERROR_INVALID_GROUP_INFO;
                break;
            case 107:
                enbhVar = enbh.MLS_ERROR_INVALID_WELCOME_MESSAGE;
                break;
            case 108:
                enbhVar = enbh.MLS_ERROR_EXPORTER_DELETED;
                break;
            default:
                enbhVar = null;
                break;
        }
        return enbhVar != null;
    }
}
