package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydb {
    public final long a;
    public final long b;
    public final ejwi c;
    private final MessageDigest d = null;
    private final boolean e = false;

    public eydb(eyda eydaVar) {
        this.a = eydaVar.a;
        this.b = eydaVar.b;
        this.c = eydaVar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eydb)) {
            return false;
        }
        eydb eydbVar = (eydb) obj;
        if (this.a != eydbVar.a || this.b != eydbVar.b) {
            return false;
        }
        MessageDigest messageDigest = eydbVar.d;
        if (!Objects.equals(null, null) || !this.c.equals(eydbVar.c)) {
            return false;
        }
        boolean z = eydbVar.e;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), null, this.c, false});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, crc32c=%s, forceMultipart=%s]", Long.valueOf(this.a), Long.valueOf(this.b), null, ejud.a, false);
    }
}
