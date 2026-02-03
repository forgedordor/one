package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpn extends mbz {
    public final int c;
    public final String d;
    public final int e;
    public final mau f;
    public final int g;
    public final nen h;
    final boolean i;

    public mpn(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, null, false);
    }

    final mpn a(nen nenVar) {
        String message = getMessage();
        String str = mgb.a;
        return new mpn(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, nenVar, this.b, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mpn(int i, Throwable th, int i2, String str, int i3, mau mauVar, int i4, nen nenVar, boolean z) {
        String str2;
        int i5;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            string = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(mauVar);
            String str4 = mgb.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str2, i5, mauVar, i4, nenVar, SystemClock.elapsedRealtime(), z);
    }

    private mpn(String str, Throwable th, int i, int i2, String str2, int i3, mau mauVar, int i4, nen nenVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        mee.a(z2);
        mee.a(th != null);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = mauVar;
        this.g = i4;
        this.h = nenVar;
        this.i = z;
    }
}
