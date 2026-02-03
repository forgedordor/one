package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmml extends cmnt {
    public final String a;
    public final byte[] b;

    public cmml(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.cmnt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cmnt
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmnt) {
            cmnt cmntVar = (cmnt) obj;
            if (this.a.equals(cmntVar.a())) {
                if (Arrays.equals(this.b, cmntVar instanceof cmml ? ((cmml) cmntVar).b : cmntVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "CustomRcsReport{mimeType=" + this.a + ", customReport=" + Arrays.toString(this.b) + "}";
    }
}
