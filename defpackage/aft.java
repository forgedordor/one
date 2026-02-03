package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aft extends ajn {
    public final float[] a;
    public final String b;
    private Integer c;

    public aft(float[] fArr, String str) {
        lcg.i(fArr);
        this.a = fArr;
        if (fArr.length == 0) {
            throw new IllegalArgumentException("Embedding values cannot be empty.");
        }
        lcg.i(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aft)) {
            return false;
        }
        aft aftVar = (aft) obj;
        return Arrays.equals(this.a, aftVar.a) && this.b.equals(aftVar.b);
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = Integer.valueOf(Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b));
        }
        return this.c.intValue();
    }
}
