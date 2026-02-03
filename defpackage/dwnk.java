package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwnk extends dwqf {
    private final byte[] a;
    private final int b;
    private final int c;
    private final ejwi d;
    private final String e;

    public dwnk(byte[] bArr, int i, int i2, ejwi ejwiVar, String str) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = ejwiVar;
        this.e = str;
    }

    @Override // defpackage.dwqf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dwqf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dwqf
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dwqf
    public final String d() {
        return this.e;
    }

    @Override // defpackage.dwqf
    public final byte[] e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqf) {
            dwqf dwqfVar = (dwqf) obj;
            if (Arrays.equals(this.a, dwqfVar instanceof dwnk ? ((dwnk) dwqfVar).a : dwqfVar.e()) && this.b == dwqfVar.b() && this.c == dwqfVar.a() && this.d.equals(dwqfVar.c()) && this.e.equals(dwqfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.d;
        return "LighterIcon{icon=" + Arrays.toString(this.a) + ", width=" + this.b + ", height=" + this.c + ", color=" + String.valueOf(ejwiVar) + ", talkBackDescription=" + this.e + "}";
    }
}
