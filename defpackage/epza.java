package defpackage;

import com.sun.jna.IntegerType;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epza extends IntegerType {
    private final long a;

    public epza() {
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
    public final long m437getValuesVKNKU() {
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
    public final long m438toULongsVKNKU() {
        return longValue();
    }

    public /* synthetic */ epza(long j, int i, fdbk fdbkVar) {
        this(1 == (i & 1) ? 0L : j, null);
    }

    public /* synthetic */ epza(long j, fdbk fdbkVar) {
        super(Native.SIZE_T_SIZE, j, true);
        this.a = j;
    }
}
