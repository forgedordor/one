package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyq {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final List f;
    public final String g;
    public final boolean h;
    private final String i;
    private final String j;
    private final String k;

    public feyq(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        this.b = str;
        this.i = str2;
        this.j = str3;
        this.c = str4;
        this.d = i;
        this.e = list;
        this.f = list2;
        this.k = str5;
        this.g = str6;
        this.h = fdbq.f(str, "https");
    }

    public final String a() {
        if (this.j.length() == 0) {
            return "";
        }
        String str = this.g;
        String strSubstring = str.substring(fdgn.N(str, ':', this.b.length() + 3, 4) + 1, fdgn.N(str, '@', 0, 6));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String b() {
        int length = this.b.length();
        String str = this.g;
        int iN = fdgn.N(str, '/', length + 3, 4);
        String strSubstring = str.substring(iN, fezr.b(str, "?#", iN, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String c() {
        if (this.f == null) {
            return null;
        }
        String str = this.g;
        int iN = fdgn.N(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iN, fezr.a(str, '#', iN, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String d() {
        if (this.i.length() == 0) {
            return "";
        }
        String str = this.b;
        String str2 = this.g;
        int length = str.length() + 3;
        String strSubstring = str2.substring(length, fezr.b(str2, ":@", length, str2.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String e() {
        feyo feyoVarI = i("/...");
        feyoVarI.getClass();
        feyoVarI.b = feyp.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        feyoVarI.c = feyp.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return feyoVarI.a().g;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof feyq) && fdbq.f(((feyq) obj).g, this.g);
    }

    public final URI f() {
        String strSubstring;
        feyo feyoVar = new feyo();
        String str = this.b;
        feyoVar.a = str;
        feyoVar.b = d();
        feyoVar.c = a();
        feyoVar.d = this.c;
        int i = this.d;
        if (i == feyp.a(str)) {
            i = -1;
        }
        feyoVar.e = i;
        List list = feyoVar.f;
        list.clear();
        list.addAll(h());
        feyoVar.b(c());
        if (this.k == null) {
            strSubstring = null;
        } else {
            String str2 = this.g;
            strSubstring = str2.substring(fdgn.N(str2, '#', 0, 6) + 1);
            strSubstring.getClass();
        }
        feyoVar.h = strSubstring;
        String str3 = feyoVar.d;
        feyoVar.d = str3 != null ? new fdgl("[\"<>^`{|}]").b(str3, "") : null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.set(i2, feyp.e((String) list.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        List list2 = feyoVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) list2.get(i3);
                list2.set(i3, str4 != null ? feyp.e(str4, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str5 = feyoVar.h;
        feyoVar.h = str5 != null ? feyp.e(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = feyoVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new fdgl("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL g() {
        try {
            return new URL(this.g);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final List h() {
        int length = this.b.length();
        String str = this.g;
        int iN = fdgn.N(str, '/', length + 3, 4);
        int iB = fezr.b(str, "?#", iN, str.length());
        ArrayList arrayList = new ArrayList();
        while (iN < iB) {
            int i = iN + 1;
            int iA = fezr.a(str, '/', i, iB);
            String strSubstring = str.substring(i, iA);
            strSubstring.getClass();
            arrayList.add(strSubstring);
            iN = iA;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final feyo i(String str) {
        try {
            feyo feyoVar = new feyo();
            feyoVar.c(this, str);
            return feyoVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final feyq j(String str) {
        str.getClass();
        feyo feyoVarI = i(str);
        if (feyoVarI != null) {
            return feyoVarI.a();
        }
        return null;
    }

    public final String toString() {
        return this.g;
    }
}
