package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhij {
    public static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = inputStream.read();
        do {
            if (i == 13) {
                i = inputStream.read();
            } else {
                if (i == 10) {
                    return new String(byteArrayOutputStream.toByteArray(), "utf-8");
                }
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
        } while (i > 0);
        throw new dhii("0d0a sequence not read before InputStream EOF.");
    }
}
