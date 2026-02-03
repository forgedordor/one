package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sbf {
    public static final String a(BufferedInputStream bufferedInputStream, StringBuilder sb, sbe sbeVar) throws IOException {
        while (true) {
            int i = bufferedInputStream.read();
            if (i < 0) {
                return null;
            }
            char c = (char) i;
            int i2 = sbeVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalArgumentException("Unknown state: " + sbeVar.a);
                    }
                    if (c == '\r') {
                        sbeVar.a = 2;
                        c = '\r';
                        i2 = 2;
                    } else {
                        sbeVar.a = 1;
                    }
                } else if (c == '\n') {
                    sbeVar.a = 3;
                    i2 = 3;
                } else {
                    sbeVar.a = 1;
                }
                i2 = 1;
            } else if (c == '\r') {
                sbeVar.a = 2;
                c = '\r';
                i2 = 2;
            }
            if (i2 == 1) {
                sb.append(c);
            } else if (i2 == 3) {
                String string = sb.toString();
                sb.setLength(0);
                return string;
            }
        }
    }
}
