package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwup extends dwvk {
    private final byte[] a;
    private final dwqf b;
    private final String c;
    private final dwjr d;

    public dwup(byte[] bArr, dwqf dwqfVar, String str, dwjr dwjrVar) {
        this.a = bArr;
        this.b = dwqfVar;
        this.c = str;
        this.d = dwjrVar;
    }

    @Override // defpackage.dwvk
    public final dwjr a() {
        return this.d;
    }

    @Override // defpackage.dwvk
    public final dwqf b() {
        return this.b;
    }

    @Override // defpackage.dwvk
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dwvk
    @Deprecated
    public final byte[] d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvk) {
            dwvk dwvkVar = (dwvk) obj;
            if (Arrays.equals(this.a, dwvkVar instanceof dwup ? ((dwup) dwvkVar).a : dwvkVar.d()) && this.b.equals(dwvkVar.b()) && this.c.equals(dwvkVar.c()) && this.d.equals(dwvkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dwjr dwjrVar = this.d;
        dwqf dwqfVar = this.b;
        return "VerticalLayoutButton{icon=" + Arrays.toString(this.a) + ", lighterIcon=" + dwqfVar.toString() + ", displayText=" + this.c + ", action=" + dwjrVar.toString() + "}";
    }
}
