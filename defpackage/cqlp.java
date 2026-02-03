package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqlp extends cqls {
    public final byte[] a;
    public final bajj b;
    public final String c;

    public cqlp(byte[] bArr, bajj bajjVar, String str) {
        this.a = bArr;
        this.b = bajjVar;
        this.c = str;
    }

    @Override // defpackage.cqls
    public final bajj a() {
        return this.b;
    }

    @Override // defpackage.cqls
    public final String b() {
        return this.c;
    }

    @Override // defpackage.cqls
    public final byte[] c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqls) {
            cqls cqlsVar = (cqls) obj;
            if (Arrays.equals(this.a, cqlsVar instanceof cqlp ? ((cqlp) cqlsVar).a : cqlsVar.c()) && this.b.equals(cqlsVar.a()) && this.c.equals(cqlsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        bajj bajjVar = this.b;
        return "DittoScannedCode{retrievalToken=" + Arrays.toString(this.a) + ", encryptionKeys=" + bajjVar.toString() + ", originalQrCode=" + this.c + "}";
    }
}
