package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctva {
    public final ChipData a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public ctva(ChipData chipData, boolean z, boolean z2, boolean z3) {
        chipData.getClass();
        this.a = chipData;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctva)) {
            return false;
        }
        ctva ctvaVar = (ctva) obj;
        return fdbq.f(this.a, ctvaVar.a) && this.b == ctvaVar.b && this.c == ctvaVar.c && this.d == ctvaVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((iHashCode + ctuz.a(this.b)) * 31) + ctuz.a(this.c)) * 31) + ctuz.a(z);
    }

    public final String toString() {
        return "GroupChatCapability(chipData=" + this.a + ", hasRcs=" + this.b + ", hasScytaleE2ee=" + this.c + ", hasMlsE2ee=" + this.d + ")";
    }
}
