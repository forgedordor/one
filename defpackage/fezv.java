package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezv {
    public static final String a(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        return str2;
    }

    public static final void b(fezu fezuVar, fezx fezxVar, String str) {
        Logger logger = ffaa.b;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        logger.fine(fezxVar.b + " " + str2 + ": " + fezuVar.a);
    }
}
