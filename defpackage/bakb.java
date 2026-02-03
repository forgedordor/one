package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bakb extends baks {
    private final int a;
    private final boolean b;

    public bakb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.baks
    public final int a() {
        return this.a;
    }

    @Override // defpackage.baks
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baks) {
            baks baksVar = (baks) obj;
            if (this.a == baksVar.a() && this.b == baksVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ConversationTypeInfo{type=" + this.a + ", hasRbmRecipient=" + this.b + "}";
    }
}
