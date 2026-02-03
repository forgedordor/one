package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwh implements Serializable, dlwf {
    private static final long serialVersionUID = -8713434243256937394L;
    private final String a;

    public dlwh(String str) {
        this.a = str;
    }

    private static void c(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    @Override // defpackage.dlwf
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dlwf.class;
    }

    @Override // defpackage.dlwf
    public final String b() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dlwf) {
            dlwf dlwfVar = (dlwf) obj;
            if (this.a.equals(dlwfVar.b()) && dlwfVar.a() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ 428460789) + 1704546089;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.libraries.compose.attachments.serialization.annotations.AttachmentDeserializerKey(");
        sb.append("name=\"");
        int i = 0;
        while (true) {
            String str = this.a;
            if (i >= str.length()) {
                sb.append("\", version=1)");
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
                c(sb, Integer.toOctalString(cCharAt), 3);
            } else if (cCharAt < 127 || Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append("\\u");
                c(sb, Integer.toHexString(cCharAt), 4);
            }
            i++;
        }
    }
}
