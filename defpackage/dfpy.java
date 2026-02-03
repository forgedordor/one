package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpy {
    public static String a(String str) {
        int iIndexOf = str.indexOf("boundary=");
        if (iIndexOf < 0) {
            return null;
        }
        int i = iIndexOf + 9;
        int iIndexOf2 = str.indexOf(59, i);
        String strSubstring = iIndexOf2 < i ? str.substring(i) : str.substring(i, iIndexOf2);
        if (strSubstring.startsWith("\"")) {
            strSubstring = strSubstring.substring(1, strSubstring.length());
        }
        return strSubstring.endsWith("\"") ? strSubstring.substring(0, strSubstring.length() - 1) : strSubstring;
    }

    public static void b(InputStream inputStream, String str, dfpw dfpwVar) throws IOException {
        int i;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, str.length() + 4);
        }
        byte[] bytes = str.getBytes();
        while (true) {
            if (dfqa.a(inputStream, bytes) || inputStream.read() == -1) {
                dfqa.b(inputStream);
                long length = bytes.length + 2;
                if (inputStream.skip(length) < length) {
                    return;
                }
                dfqa.b(inputStream);
                char c = 2;
                inputStream.mark(2);
                try {
                    if (inputStream.read() == 45 && inputStream.read() == 45) {
                        return;
                    }
                    inputStream.reset();
                    dfpwVar.a();
                    for (String strC = dfqa.c(inputStream); !dhim.d(strC); strC = dfqa.c(inputStream)) {
                        if (dhim.d(strC)) {
                            throw new IllegalArgumentException("Line must not be null");
                        }
                        int iIndexOf = strC.indexOf(58);
                        if (iIndexOf == -1) {
                            throw new dfpz("Illegal header: ".concat(strC));
                        }
                        if (iIndexOf == strC.length()) {
                            throw new dfpz("Illegal header: ".concat(strC));
                        }
                        dfpx dfpxVar = new dfpx();
                        dfpxVar.a = strC.substring(0, iIndexOf);
                        dfpxVar.b = strC.substring(iIndexOf + 1, strC.length()).trim();
                        dfpwVar.d(dfpxVar);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    while (!dfqa.a(inputStream, bytes)) {
                        try {
                            if (c == 3) {
                                i = -1;
                            } else if (dfqa.a(inputStream, bytes)) {
                                c = 3;
                                i = -1;
                            } else {
                                i = inputStream.read();
                            }
                            byteArrayOutputStream.write(i);
                        } catch (Throwable th) {
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    int length2 = byteArray.length;
                    dfpwVar.b(byteArray);
                    dfpwVar.c();
                } finally {
                    inputStream.reset();
                }
            }
        }
    }
}
