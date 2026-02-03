package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqm {
    public static final int a(eykc eykcVar) {
        int iOrdinal = eykcVar.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        Objects.toString(eykcVar);
        throw new IllegalArgumentException("Unexpected action type ".concat(eykcVar.toString()));
    }

    public static final int b(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1 || i == 2) {
            return 4;
        }
        return i != 3 ? 1 : 5;
    }
}
