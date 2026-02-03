package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekwz {
    static byte a(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return (byte) (i & 255);
        }
        throw new IOException("EOF");
    }
}
