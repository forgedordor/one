package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbo implements evsv {
    static final evsv a = new enbo();

    private enbo() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enbp enbpVar;
        switch (i) {
            case 0:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_UNKNOWN;
                break;
            case 1:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_AES_KEY_CONVERSION;
                break;
            case 2:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_BUFFER_LENGTH_HINT_EXCEEDED;
                break;
            case 3:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_CORRUPTED_STATE;
                break;
            case 4:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_EMPTY_BUFFER;
                break;
            case 5:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_FILE_EXCEEDS_MAX_LENGTH;
                break;
            case 6:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_FILE_LENGTH_MISMATCH;
                break;
            case 7:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_HKDF_SALT_DECODING;
                break;
            case 8:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_HMAC_VERIFICATION;
                break;
            case 9:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_BUFFER_LENGTH;
                break;
            case 10:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_INITIALIZATION_VECTOR_LENGTH;
                break;
            case 11:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_KEY_LENGTH;
                break;
            case 12:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_SUFFIX_FILE_LENGTH;
                break;
            case 13:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_SUFFIX_FORMAT;
                break;
            case 14:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_SUFFIX_PAD_LENGTH;
                break;
            case 15:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_TAG_LENGTH;
                break;
            case 16:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_INVALID_TAG_LENGTH_THIS_SHOULD_NEVER_HAPPEN;
                break;
            case 17:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_KEYSTREAM_APPLICATION;
                break;
            case 18:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_MAC_KEY_CONVERSION;
                break;
            case 19:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_NON_ZERO_PADDING;
                break;
            case 20:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_OUT_LENGTH_SHOULD_BE_ZERO;
                break;
            case 21:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_PADDING_LENGTH_MISMATCH;
                break;
            case 22:
                enbpVar = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_PARTIAL_SUFFIX;
                break;
            default:
                enbpVar = null;
                break;
        }
        return enbpVar != null;
    }
}
