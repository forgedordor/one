package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomp implements Comparable, Serializable {
    private static final long serialVersionUID = -1105194233979842380L;
    public final String a;
    public transient Charset b;
    public volatile transient eomr c;
    volatile transient String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public eomp(String str, String str2, String str3, String str4, String str5, Charset charset, String str6) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.a = str4;
        this.h = str5;
        this.b = charset;
        this.d = str6;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    private static String c(String str, String str2) {
        return str != null ? str2 : "";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.b = Charset.forName((String) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b.name());
    }

    public final eomi a() {
        char cCharAt;
        String str = this.f;
        ejwl.p(!ejwk.c(str), "Uri has no authority: %s", this);
        str.getClass();
        int iIndexOf = str.indexOf("@") + 1;
        int iIndexOf2 = str.indexOf(58, iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = str.length();
        } else {
            int i = iIndexOf2 + 1;
            int i2 = i;
            while (i2 < str.length() && (cCharAt = str.charAt(i2)) >= '0' && cCharAt <= '9') {
                i2++;
            }
            ejwl.p(i2 == str.length() && i2 > i, "Authority doesn't match web pattern: %s", this);
        }
        String strSubstring = str.substring(iIndexOf, iIndexOf2);
        try {
            strSubstring.getClass();
            return new eomi(strSubstring);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Invalid domain '" + strSubstring + "' found in URI '" + toString() + "'", e);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        eomp eompVar = (eomp) obj;
        eompVar.getClass();
        return toString().compareTo(eompVar.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eomp) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (this.d != null) {
            return this.d;
        }
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.a;
        String str5 = this.h;
        String str6 = ejwk.b(str) + c(str, ":") + c(str2, "//") + ejwk.b(str2) + ejwk.b(str3) + c(str4, "?") + ejwk.b(str4) + c(str5, "#") + ejwk.b(str5);
        this.d = str6;
        return str6;
    }

    public eomp(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.e = b(str);
        this.f = str2;
        this.g = str3;
        this.a = str4;
        this.h = str5;
        this.b = charset;
    }
}
