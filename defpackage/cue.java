package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cue extends csz {
    public cue() {
        super(16);
    }

    public final void d(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        int length = fArr.length;
        if (length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (length * 3) / 2));
            fArrCopyOf.getClass();
            this.a = fArrCopyOf;
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public cue(int i) {
        super(i);
    }
}
