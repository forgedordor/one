package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnl {
    public final int a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public dlnl() {
        this(0, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlnl)) {
            return false;
        }
        dlnl dlnlVar = (dlnl) obj;
        return this.a == dlnlVar.a && this.b == dlnlVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Flags(conversationScreenMonogramSizeDp=" + this.a + ", enablePhoneNumberLtrFormatting=" + this.b + ")";
    }

    public /* synthetic */ dlnl(int i, boolean z, int i2) {
        this.a = 1 == (i2 & 1) ? 36 : i;
        this.b = ((i2 & 2) == 0) & z;
    }
}
