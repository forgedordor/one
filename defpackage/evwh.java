package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evwh {
    DOUBLE(evwi.DOUBLE, 1),
    FLOAT(evwi.FLOAT, 5),
    INT64(evwi.LONG, 0),
    UINT64(evwi.LONG, 0),
    INT32(evwi.INT, 0),
    FIXED64(evwi.LONG, 1),
    FIXED32(evwi.INT, 5),
    BOOL(evwi.BOOLEAN, 0),
    STRING(evwi.STRING, 2),
    GROUP(evwi.MESSAGE, 3),
    MESSAGE(evwi.MESSAGE, 2),
    BYTES(evwi.BYTE_STRING, 2),
    UINT32(evwi.INT, 0),
    ENUM(evwi.ENUM, 0),
    SFIXED32(evwi.INT, 5),
    SFIXED64(evwi.LONG, 1),
    SINT32(evwi.INT, 0),
    SINT64(evwi.LONG, 0);

    public final evwi s;
    public final int t;

    evwh(evwi evwiVar, int i) {
        this.s = evwiVar;
        this.t = i;
    }
}
