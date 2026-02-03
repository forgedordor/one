package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtr {
    public final boolean a;
    public final int b;
    private final dnkf c;

    public vtr(dnkf dnkfVar, int i, boolean z) {
        this.c = dnkfVar;
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtr)) {
            return false;
        }
        vtr vtrVar = (vtr) obj;
        return fdbq.f(this.c, vtrVar.c) && this.b == vtrVar.b && this.a == vtrVar.a;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.b) * 31) + (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        CharSequence charSequenceC = cqcy.c(this.c.a());
        StringBuilder sb = new StringBuilder("EmojiUsage(emoji=");
        sb.append((Object) charSequenceC);
        sb.append(", source=");
        int i = this.b;
        sb.append((Object) (i != 2 ? i != 3 ? i != 4 ? i != 5 ? "EXTERNAL" : "GBOARD" : "SEARCH" : "COLLECTION" : "RECENTS"));
        sb.append(", fromVariantPicker=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
