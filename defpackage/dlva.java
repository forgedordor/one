package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlva implements Serializable, dluy {
    private static final long serialVersionUID = -4358096871166435211L;
    private final String a;

    public dlva(String str) {
        this.a = str;
    }

    private static void b(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    @Override // defpackage.dluy
    public final String a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dluy.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dluy) {
            return this.a.equals(((dluy) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 454102470;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.libraries.compose.attachments.resolver.AttachmentTypeSpecificResolver.TypeKey(");
        sb.append("type=\"");
        int i = 0;
        while (true) {
            String str = this.a;
            if (i >= str.length()) {
                sb.append("\")");
                return sb.toString();
            }
            char cCharAt = str.charAt(i);
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
            i++;
        }
    }
}
