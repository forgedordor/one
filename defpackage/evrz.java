package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evrz {
    DOUBLE(0, 1, evtl.DOUBLE),
    FLOAT(1, 1, evtl.FLOAT),
    INT64(2, 1, evtl.LONG),
    UINT64(3, 1, evtl.LONG),
    INT32(4, 1, evtl.INT),
    FIXED64(5, 1, evtl.LONG),
    FIXED32(6, 1, evtl.INT),
    BOOL(7, 1, evtl.BOOLEAN),
    STRING(8, 1, evtl.STRING),
    MESSAGE(9, 1, evtl.MESSAGE),
    BYTES(10, 1, evtl.BYTE_STRING),
    UINT32(11, 1, evtl.INT),
    ENUM(12, 1, evtl.ENUM),
    SFIXED32(13, 1, evtl.INT),
    SFIXED64(14, 1, evtl.LONG),
    SINT32(15, 1, evtl.INT),
    SINT64(16, 1, evtl.LONG),
    GROUP(17, 1, evtl.MESSAGE),
    DOUBLE_LIST(18, 2, evtl.DOUBLE),
    FLOAT_LIST(19, 2, evtl.FLOAT),
    INT64_LIST(20, 2, evtl.LONG),
    UINT64_LIST(21, 2, evtl.LONG),
    INT32_LIST(22, 2, evtl.INT),
    FIXED64_LIST(23, 2, evtl.LONG),
    FIXED32_LIST(24, 2, evtl.INT),
    BOOL_LIST(25, 2, evtl.BOOLEAN),
    STRING_LIST(26, 2, evtl.STRING),
    MESSAGE_LIST(27, 2, evtl.MESSAGE),
    BYTES_LIST(28, 2, evtl.BYTE_STRING),
    UINT32_LIST(29, 2, evtl.INT),
    ENUM_LIST(30, 2, evtl.ENUM),
    SFIXED32_LIST(31, 2, evtl.INT),
    SFIXED64_LIST(32, 2, evtl.LONG),
    SINT32_LIST(33, 2, evtl.INT),
    SINT64_LIST(34, 2, evtl.LONG),
    DOUBLE_LIST_PACKED(35, 3, evtl.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, evtl.FLOAT),
    INT64_LIST_PACKED(37, 3, evtl.LONG),
    UINT64_LIST_PACKED(38, 3, evtl.LONG),
    INT32_LIST_PACKED(39, 3, evtl.INT),
    FIXED64_LIST_PACKED(40, 3, evtl.LONG),
    FIXED32_LIST_PACKED(41, 3, evtl.INT),
    BOOL_LIST_PACKED(42, 3, evtl.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, evtl.INT),
    ENUM_LIST_PACKED(44, 3, evtl.ENUM),
    SFIXED32_LIST_PACKED(45, 3, evtl.INT),
    SFIXED64_LIST_PACKED(46, 3, evtl.LONG),
    SINT32_LIST_PACKED(47, 3, evtl.INT),
    SINT64_LIST_PACKED(48, 3, evtl.LONG),
    GROUP_LIST(49, 2, evtl.MESSAGE),
    MAP(50, 4, evtl.VOID);

    private static final evrz[] aa;
    public final int Z;

    static {
        evrz[] evrzVarArrValues = values();
        aa = new evrz[evrzVarArrValues.length];
        for (evrz evrzVar : evrzVarArrValues) {
            aa[evrzVar.Z] = evrzVar;
        }
    }

    evrz(int i, int i2, evtl evtlVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = evtlVar.k;
        }
        if (i2 == 1) {
            evtl evtlVar2 = evtl.VOID;
            evtlVar.ordinal();
        }
    }
}
