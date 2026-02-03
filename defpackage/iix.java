package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iix {
    public static /* synthetic */ iiy a(List list, float f, float f2, int i) {
        return new ijt(list, null, (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static /* synthetic */ iiy b(List list, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            j = 0;
        }
        return new ijt(list, null, j, j3);
    }

    public static /* synthetic */ iiy c(List list, long j, float f, int i) {
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        if ((i & 2) != 0) {
            j = 9205357640488583168L;
        }
        return new ikg(list, j, f);
    }

    public static /* synthetic */ iiy d(List list, float f, float f2, int i) {
        return new ijt(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) & 4294967295L));
    }

    public static /* synthetic */ iiy e(fcti[] fctiVarArr) {
        fcti[] fctiVarArr2 = (fcti[]) Arrays.copyOf(fctiVarArr, fctiVarArr.length);
        long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
        ArrayList arrayList = new ArrayList(fctiVarArr2.length);
        for (fcti fctiVar : fctiVarArr2) {
            arrayList.add(new ije(((ije) fctiVar.b).i));
        }
        ArrayList arrayList2 = new ArrayList(fctiVarArr2.length);
        for (fcti fctiVar2 : fctiVarArr2) {
            arrayList2.add(Float.valueOf(((Number) fctiVar2.a).floatValue()));
        }
        return new ijt(arrayList, arrayList2, (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L));
    }
}
