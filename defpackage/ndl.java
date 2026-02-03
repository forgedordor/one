package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndl extends IOException {
    public ndl(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ndl(int i, long j, long j2) {
        String strF;
        if (i != 0) {
            if (i != 1) {
                mee.c((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                strF = a.F(j2, j, "start exceeds end. Start time: ", ", End time: ");
            } else {
                strF = "not seekable to start";
            }
        } else {
            strF = "invalid period count";
        }
        super("Illegal clipping: ".concat(strF));
    }
}
