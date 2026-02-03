package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aasz extends aaul {
    private final aauu a;
    private final int b;
    private final int c;

    public aasz(aauu aauuVar, int i, int i2) {
        if (aauuVar == null) {
            throw new NullPointerException("Null messageList");
        }
        this.a = aauuVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aaul
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aaul
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aaul
    public final aauu c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaul) {
            aaul aaulVar = (aaul) obj;
            if (this.a.equals(aaulVar.c()) && this.b == aaulVar.b() && this.c == aaulVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "EditTextEvent{messageList=" + this.a.toString() + ", messageListIndex=" + this.b + ", messageIndex=" + this.c + "}";
    }
}
