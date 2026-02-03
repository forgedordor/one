package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enbn implements evst {
    UNKNOWN_ERROR(0),
    MLS_ERROR(1),
    SQLITE_ERROR(2),
    MLS_EXTENSION_ERROR(3),
    SERIALIZE_ERROR(4),
    UTF8_ERROR(5),
    PARSE_ERROR(6),
    ZINNIA_ERROR(7),
    MLS_CODEC_ERROR(8),
    MISSING_TLS_STRUCT_DATA_ERROR(9),
    ERA_ERROR(10),
    ZINNIA_FILE_ENCRYPTION_ERROR(11);

    public final int m;

    enbn(int i) {
        this.m = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
