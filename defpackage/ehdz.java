package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdz implements Serializable, ehhz {
    private static final long serialVersionUID = -4770846455854161599L;
    private final String a = "com.google.android.apps.messaging.auto";

    private static void b(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    @Override // defpackage.ehhz
    public final String a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ehhz.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehhz) {
            return this.a.equals(((ehhz) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 1335633679;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.apps.tiktok.experiments.phenotype.PhenotypeApplicationSpecificProperties(");
        sb.append('\"');
        for (int i = 0; i < 38; i++) {
            char cCharAt = "com.google.android.apps.messaging.auto".charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"' || cCharAt == '\'' || cCharAt == '\\') {
                sb.append('\\');
                sb.append(cCharAt);
            } else if (cCharAt < ' ') {
                sb.append('\\');
                b(sb, Integer.toOctalString(cCharAt), 3);
            } else if (cCharAt < 127 || Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append("\\u");
                b(sb, Integer.toHexString(cCharAt), 4);
            }
        }
        sb.append("\")");
        return sb.toString();
    }
}
