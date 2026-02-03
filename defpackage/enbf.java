package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enbf implements evst {
    MLS_CODEC_ERROR_UNKNOWN(0),
    MLS_CODEC_ERROR_VAR_INT_OUT_OF_RANGE(1),
    MLS_CODEC_ERROR_INVALID_VAR_INT_PREFIX(2),
    MLS_CODEC_ERROR_VAR_INT_MINIMUM_LENGTH_ENCODING(3),
    MLS_CODEC_ERROR_UNEXPECTED_EOF(4),
    MLS_CODEC_ERROR_OPTION_OUT_OF_RANGE(5),
    MLS_CODEC_ERROR_UNSUPPORTED_ENUM_DISCRIMINANT(6),
    MLS_CODEC_ERROR_UTF8(7),
    MLS_CODEC_ERROR_CUSTOM(8);

    public final int j;

    enbf(int i) {
        this.j = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
