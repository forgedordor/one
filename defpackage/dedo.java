package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedo implements dcfa {
    public static final dedo a = new dedo();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final String f = null;
    private final String g = null;
    private final Long i = null;
    private final Long j = null;

    private dedo() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dedo)) {
            return false;
        }
        dedo dedoVar = (dedo) obj;
        boolean z = dedoVar.b;
        boolean z2 = dedoVar.c;
        String str = dedoVar.d;
        if (dclc.a(null, null)) {
            boolean z3 = dedoVar.e;
            boolean z4 = dedoVar.h;
            String str2 = dedoVar.f;
            if (dclc.a(null, null)) {
                String str3 = dedoVar.g;
                if (dclc.a(null, null)) {
                    Long l = dedoVar.i;
                    if (dclc.a(null, null)) {
                        Long l2 = dedoVar.j;
                        if (dclc.a(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
