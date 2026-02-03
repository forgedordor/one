package defpackage;

import com.sun.jna.IntegerType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzb extends IntegerType {
    private final long a;

    public epzb() {
        this(0L, null);
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return toByte();
    }

    @Override // com.sun.jna.IntegerType, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return toDouble();
    }

    @Override // com.sun.jna.IntegerType, java.lang.Number
    public final /* bridge */ float floatValue() {
        return toFloat();
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m439getValuesVKNKU() {
        return this.a;
    }

    @Override // com.sun.jna.IntegerType, java.lang.Number
    public final /* bridge */ int intValue() {
        return toInt();
    }

    @Override // com.sun.jna.IntegerType, java.lang.Number
    public final /* bridge */ long longValue() {
        return toLong();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return toShort();
    }

    public byte toByte() {
        return (byte) longValue();
    }

    public char toChar() {
        return (char) longValue();
    }

    public /* bridge */ double toDouble() {
        return super.doubleValue();
    }

    public /* bridge */ float toFloat() {
        return super.floatValue();
    }

    public /* bridge */ int toInt() {
        return super.intValue();
    }

    public /* bridge */ long toLong() {
        return super.longValue();
    }

    public short toShort() {
        return (short) longValue();
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    public final long m440toULongsVKNKU() {
        return longValue();
    }

    public /* synthetic */ epzb(long j, int i, fdbk fdbkVar) {
        this(1 == (i & 1) ? 0L : j, null);
    }

    public /* synthetic */ epzb(long j, fdbk fdbkVar) {
        super(8, j, true);
        this.a = j;
    }
}
