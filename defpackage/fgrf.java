package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrf implements Map.Entry<String, String>, Cloneable {
    private static final String[] c = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern d;
    private static final Pattern e;
    public final String a;
    fgrh b;
    private String f;

    static {
        Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        Pattern.compile("[^-a-zA-Z0-9_:.]");
        d = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
        e = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    }

    public fgrf(String str, String str2, fgrh fgrhVar) {
        fgqz.g(str);
        String strTrim = str.trim();
        fgqz.e(strTrim);
        this.a = strTrim;
        this.f = str2;
        this.b = fgrhVar;
    }

    static void c(String str, String str2, Appendable appendable, fgrl fgrlVar) throws IOException {
        appendable.append(str);
        int i = fgrlVar.g;
        if (str2 != null) {
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(c, fgrb.a(str)) >= 0) {
                return;
            }
            appendable.append("=\"");
            fgru.a(appendable, fgrh.c(str2), fgrlVar, true, false, false, false);
            appendable.append('\"');
        }
    }

    public static String d(String str) {
        Pattern pattern = d;
        if (pattern.matcher(str).matches()) {
            return str;
        }
        String strReplaceAll = e.matcher(str).replaceAll("");
        if (pattern.matcher(strReplaceAll).matches()) {
            return strReplaceAll;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String getValue() {
        return fgrh.c(this.f);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fgrf clone() {
        try {
            return (fgrf) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fgrf fgrfVar = (fgrf) obj;
        String str = this.a;
        if (str == null ? fgrfVar.a != null : !str.equals(fgrfVar.a)) {
            return false;
        }
        String str2 = this.f;
        return str2 != null ? str2.equals(fgrfVar.f) : fgrfVar.f == null;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ String getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String setValue(String str) {
        String str2;
        int iA;
        String str3 = str;
        String strD = this.f;
        fgrh fgrhVar = this.b;
        if (fgrhVar != null && (iA = fgrhVar.a((str2 = this.a))) != -1) {
            strD = this.b.d(str2);
            this.b.c[iA] = str3;
        }
        this.f = str3;
        return fgrh.c(strD);
    }

    public final String toString() {
        StringBuilder sbE = fgre.e();
        try {
            fgrl fgrlVar = new fgrm("").b;
            String str = this.a;
            String str2 = this.f;
            int i = fgrlVar.g;
            String strD = d(str);
            if (strD != null) {
                c(strD, str2, sbE, fgrlVar);
            }
            return fgre.c(sbE);
        } catch (IOException e2) {
            throw new fgqv(e2);
        }
    }
}
