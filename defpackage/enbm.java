package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbm implements evsv {
    static final evsv a = new enbm();

    private enbm() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enbn enbnVar;
        switch (i) {
            case 0:
                enbnVar = enbn.UNKNOWN_ERROR;
                break;
            case 1:
                enbnVar = enbn.MLS_ERROR;
                break;
            case 2:
                enbnVar = enbn.SQLITE_ERROR;
                break;
            case 3:
                enbnVar = enbn.MLS_EXTENSION_ERROR;
                break;
            case 4:
                enbnVar = enbn.SERIALIZE_ERROR;
                break;
            case 5:
                enbnVar = enbn.UTF8_ERROR;
                break;
            case 6:
                enbnVar = enbn.PARSE_ERROR;
                break;
            case 7:
                enbnVar = enbn.ZINNIA_ERROR;
                break;
            case 8:
                enbnVar = enbn.MLS_CODEC_ERROR;
                break;
            case 9:
                enbnVar = enbn.MISSING_TLS_STRUCT_DATA_ERROR;
                break;
            case 10:
                enbnVar = enbn.ERA_ERROR;
                break;
            case 11:
                enbnVar = enbn.ZINNIA_FILE_ENCRYPTION_ERROR;
                break;
            default:
                enbnVar = null;
                break;
        }
        return enbnVar != null;
    }
}
