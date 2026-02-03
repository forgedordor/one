package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djki {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public djki() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djki)) {
            return false;
        }
        djki djkiVar = (djki) obj;
        return this.a == djkiVar.a && this.b == djkiVar.b && this.c == djkiVar.c;
    }

    public final int hashCode() {
        return (((djkh.a(this.a) * 31) + djkh.a(this.b)) * 31) + djkh.a(this.c);
    }

    public final String toString() {
        return "Flags(enableStartChatCoolRanchPhase3=" + this.a + ", enablePhoneNumberLtrFormatting=" + this.b + ", enablePreviewBackspaceEvent=" + this.c + ")";
    }

    public djki(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ djki(byte[] bArr) {
        this(false, false, false);
    }
}
