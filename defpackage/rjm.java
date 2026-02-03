package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjm {
    public final int a;
    public final int b;
    public final int c;
    private final Context d;

    public rjm(rjk rjkVar) {
        this.d = rjkVar.a;
        int i = true != rjkVar.b.isLowRamDevice() ? 4194304 : 2097152;
        this.c = i;
        int iRound = Math.round(r2.getMemoryClass() * 1048576 * (true != rjkVar.b.isLowRamDevice() ? 0.4f : 0.33f));
        float f = rjkVar.d.a.widthPixels * rjkVar.d.a.heightPixels * 4;
        int iRound2 = Math.round(rjkVar.c * f);
        int iRound3 = Math.round(f + f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.b = iRound3;
            this.a = iRound2;
        } else {
            float f2 = i2 / (rjkVar.c + 2.0f);
            this.b = Math.round(f2 + f2);
            this.a = Math.round(f2 * rjkVar.c);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String strA = a(this.b);
            String strA2 = a(this.a);
            String strA3 = a(i);
            boolean z = i3 > iRound;
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + strA + ", pool size: " + strA2 + ", byte array size: " + strA3 + ", memory class limited? " + z + ", max size: " + a(iRound) + ", memoryClass: " + rjkVar.b.getMemoryClass() + ", isLowMemoryDevice: " + rjkVar.b.isLowRamDevice());
        }
    }

    private final String a(int i) {
        return Formatter.formatFileSize(this.d, i);
    }
}
