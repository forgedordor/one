package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elhc implements evst {
    UNKNOWN_BUGLE_CONTENT_TYPE(0),
    TEXT(1),
    IMAGE(2),
    VIDEO(3),
    AUDIO(4),
    VCARD(5),
    PDF(6),
    CALENDAR(7),
    DOC(8),
    PPT(9),
    XLS(10),
    TXT(11),
    HTML(12),
    COMPRESSED(13),
    APPLICATION(14),
    APPLICATION_XML(15),
    APPLICATION_RTF(16),
    APPLICATION_JSON(17),
    APPLICATION_BINARY(18),
    UNRECOGNIZED(-1);

    private final int v;

    elhc(int i) {
        this.v = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.v;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
