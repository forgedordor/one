package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbe implements evsv {
    static final evsv a = new enbe();

    private enbe() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enbf enbfVar;
        switch (i) {
            case 0:
                enbfVar = enbf.MLS_CODEC_ERROR_UNKNOWN;
                break;
            case 1:
                enbfVar = enbf.MLS_CODEC_ERROR_VAR_INT_OUT_OF_RANGE;
                break;
            case 2:
                enbfVar = enbf.MLS_CODEC_ERROR_INVALID_VAR_INT_PREFIX;
                break;
            case 3:
                enbfVar = enbf.MLS_CODEC_ERROR_VAR_INT_MINIMUM_LENGTH_ENCODING;
                break;
            case 4:
                enbfVar = enbf.MLS_CODEC_ERROR_UNEXPECTED_EOF;
                break;
            case 5:
                enbfVar = enbf.MLS_CODEC_ERROR_OPTION_OUT_OF_RANGE;
                break;
            case 6:
                enbfVar = enbf.MLS_CODEC_ERROR_UNSUPPORTED_ENUM_DISCRIMINANT;
                break;
            case 7:
                enbfVar = enbf.MLS_CODEC_ERROR_UTF8;
                break;
            case 8:
                enbfVar = enbf.MLS_CODEC_ERROR_CUSTOM;
                break;
            default:
                enbfVar = null;
                break;
        }
        return enbfVar != null;
    }
}
