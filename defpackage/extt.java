package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extt extends extv {
    private final String a;

    public extt(String str) {
        this.a = str;
    }

    @Override // defpackage.extv
    protected final int a() {
        return c((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        extv extvVar = (extv) obj;
        if (a() != extvVar.a()) {
            length2 = a();
            length = extvVar.a();
        } else {
            String str = this.a;
            String str2 = ((extt) extvVar).a;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((extt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        return "\"" + this.a + "\"";
    }
}
