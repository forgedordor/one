package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnt extends dwqn {
    public final String a;
    public final byte[] b;

    public dwnt(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.dwqn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dwqn
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqn) {
            dwqn dwqnVar = (dwqn) obj;
            if (this.a.equals(dwqnVar.a())) {
                if (Arrays.equals(this.b, dwqnVar instanceof dwnt ? ((dwnt) dwqnVar).b : dwqnVar.b())) {
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
        return "CustomMessage{type=" + this.a + ", content=" + Arrays.toString(this.b) + "}";
    }
}
