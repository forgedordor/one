package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccah extends ccan {
    public final ccam a;
    private final cbwd b;
    private final aubt c;

    public ccah(cbwd cbwdVar, aubt aubtVar, ccam ccamVar) {
        cbwdVar.getClass();
        aubtVar.getClass();
        ccamVar.getClass();
        this.b = cbwdVar;
        this.c = aubtVar;
        this.a = ccamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccah)) {
            return false;
        }
        ccah ccahVar = (ccah) obj;
        return fdbq.f(this.b, ccahVar.b) && fdbq.f(this.c, ccahVar.c) && this.a == ccahVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "DecryptedMessage(mlsContext=" + this.b + ", decryptedMessageContent=" + this.c + ", unencryptedMessageWorkResult=" + this.a + ")";
    }
}
