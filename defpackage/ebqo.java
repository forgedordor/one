package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqo {
    private static final byte[] f = new byte[0];
    public byte[] a;
    public String b;
    public String c;
    public String d;
    public String e;

    public ebqo() {
        this.a = f;
    }

    public static ebqo[] d(String str, String str2) {
        return str == null ? new ebqo[0] : e(str.getBytes("utf-8"), str2);
    }

    public static ebqo[] e(byte[] bArr, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Content-Type MUST not be null");
        }
        if (bArr == null || bArr.length == 0) {
            return new ebqo[0];
        }
        if (!str.startsWith("multipart/")) {
            return new ebqo[]{new ebqo(bArr, str)};
        }
        ArrayList arrayList = new ArrayList();
        String strA = dfpy.a(str);
        if (strA == null) {
            throw new IllegalArgumentException("No boundary specified in content type header");
        }
        try {
            dfpy.b(new ByteArrayInputStream(bArr), strA, new ebqn(arrayList));
            return (ebqo[]) arrayList.toArray(new ebqo[arrayList.size()]);
        } catch (dfpz e) {
            throw new IOException(e.getMessage());
        }
    }

    public final InputStream a() {
        byte[] bArr = this.a;
        return bArr == null ? new ByteArrayInputStream(f) : new ByteArrayInputStream(bArr);
    }

    public final String b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public final String c() {
        String strC;
        int length;
        byte[] bArr = this.a;
        if (bArr != null) {
            boolean zEqualsIgnoreCase = this.b.equalsIgnoreCase("application/sdp");
            length = bArr.length;
            if (zEqualsIgnoreCase) {
                Scanner scanner = new Scanner(new String(this.a));
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    String strNextLine = scanner.nextLine();
                    if (strNextLine.startsWith("o=") || strNextLine.startsWith("c=") || strNextLine.startsWith("a=path")) {
                        strNextLine = "(redacted)";
                    }
                    sb.append(strNextLine);
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                scanner.close();
                strC = sb.toString();
            } else {
                strC = this.e;
                if (strC == null) {
                    strC = dhiz.GENERIC.c(new String(this.a));
                }
            }
        } else {
            strC = "Null";
            length = 0;
        }
        return "Content ID: " + this.d + "\r\nContent disposition: " + this.c + "\r\nContent type: " + this.b + "\r\nContent length " + length + "\r\nContent: " + strC;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebqo)) {
            return false;
        }
        ebqo ebqoVar = (ebqo) obj;
        return TextUtils.equals(this.c, ebqoVar.c) && TextUtils.equals(this.d, ebqoVar.d) && TextUtils.equals(this.b, ebqoVar.b) && Arrays.equals(this.a, ebqoVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.b, this.a});
    }

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr != null ? bArr.length : 0;
        return "Content ID: " + this.d + ", content disposition: " + this.c + ", content type: " + this.b + ", content length " + length;
    }

    public ebqo(byte[] bArr) {
        this.a = bArr;
        this.b = "application/resource-lists+xml";
        this.c = "recipient-list";
    }

    public ebqo(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public ebqo(String str, String str2) {
        this.a = f;
        try {
            this.a = str.getBytes("utf-8");
            this.b = str2;
        } catch (UnsupportedEncodingException unused) {
        }
    }
}
