package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyb {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public oyb(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void b() {
        if (this.f) {
            return;
        }
        int i = this.a;
        int iF = kzb.f(-1, i, 4.5f);
        int iF2 = kzb.f(-1, i, 3.0f);
        if (iF != -1 && iF2 != -1) {
            this.h = kzb.h(-1, iF);
            this.g = kzb.h(-1, iF2);
            this.f = true;
            return;
        }
        int iF3 = kzb.f(-16777216, i, 4.5f);
        int iF4 = kzb.f(-16777216, i, 3.0f);
        if (iF3 == -1 || iF4 == -1) {
            this.h = iF != -1 ? kzb.h(-1, iF) : kzb.h(-16777216, iF3);
            this.g = iF2 != -1 ? kzb.h(-1, iF2) : kzb.h(-16777216, iF4);
            this.f = true;
        } else {
            this.h = kzb.h(-16777216, iF3);
            this.g = kzb.h(-16777216, iF4);
            this.f = true;
        }
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        kzb.i(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oyb oybVar = (oyb) obj;
            if (this.b == oybVar.b && this.a == oybVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(a()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        b();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        b();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
