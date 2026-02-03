package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwzd {
    public static final cwze a(long j) {
        cwze cwzeVar;
        cwze[] cwzeVarArrValues = cwze.values();
        int length = cwzeVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cwzeVar = null;
                break;
            }
            cwzeVar = cwzeVarArrValues[i];
            if (cwzeVar.e == j) {
                break;
            }
            i++;
        }
        return cwzeVar == null ? cwze.a : cwzeVar;
    }
}
