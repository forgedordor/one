package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cpyj {
    UNDEFINED(0),
    MEDIA(1),
    PROFILE_PHOTO(2),
    COMPRESSED_IMAGE(3);

    public final int e;

    cpyj(int i) {
        this.e = i;
    }

    public static cpyj a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? UNDEFINED : COMPRESSED_IMAGE : PROFILE_PHOTO : MEDIA;
    }

    public static emcd b(cpyj cpyjVar) {
        int iOrdinal = cpyjVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? emcd.UNSPECIFIED_BACKUP_TYPE : emcd.MEDIA_COMPRESSED_SIZE_BACKUP : emcd.MEDIA_PROFILE_PHOTO_BACKUP : emcd.MEDIA_FULL_SIZE_BACKUP;
    }

    public final String c() {
        int iOrdinal = ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "UNDEFINED" : "COMPRESSED_IMAGE" : "PROFILE_PHOTO" : "MEDIA";
    }
}
