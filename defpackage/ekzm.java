package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzm implements Serializable {
    public static final ekgb a;
    public final int d;
    private final int e = 0;
    public final int b = 30;
    public final int c = 1;

    static {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < 6; i2++) {
            ekfwVar.h(new ekxo(ekxp.r(i2)));
        }
        a = ekfwVar.g();
    }

    public ekzm(ekzi ekziVar) {
        this.d = ekziVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekzm) {
            ekzm ekzmVar = (ekzm) obj;
            int i = ekzmVar.e;
            int i2 = ekzmVar.b;
            int i3 = ekzmVar.c;
            if (this.d == ekzmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, 30, 1, Integer.valueOf(this.d)});
    }
}
