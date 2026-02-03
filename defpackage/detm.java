package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class detm {
    public static Status a(int i) {
        String strA;
        switch (i) {
            case 4000:
                strA = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strA = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strA = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strA = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strA = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strA = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strA = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strA = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strA = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strA = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strA = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                strA = dcfi.a(i);
                break;
            case 4012:
                strA = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                strA = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                strA = "FEATURE_DISABLED";
                break;
            case 4015:
                strA = "WIFI_CONNECTION_FAILED";
                break;
        }
        return new Status(i, strA);
    }
}
