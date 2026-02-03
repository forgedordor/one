package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extp extends IOException {
    public extp(String str) {
        super(str);
    }

    public extp(Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
