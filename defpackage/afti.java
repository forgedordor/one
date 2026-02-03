package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afti {
    public final ekgb a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public afti() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afti)) {
            return false;
        }
        afti aftiVar = (afti) obj;
        return fdbq.f(this.a, aftiVar.a) && this.b == aftiVar.b && this.c == aftiVar.c && this.d == aftiVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((iHashCode + afth.a(this.b)) * 31) + afth.a(this.c)) * 31) + afth.a(z);
    }

    public final String toString() {
        return "ConversationsResultState(conversations=" + this.a + ", loaded=" + this.b + ", isLoadMoreVisible=" + this.c + ", isLoadMoreText=" + this.d + ")";
    }

    public afti(ekgb ekgbVar, boolean z, boolean z2, boolean z3) {
        ekgbVar.getClass();
        this.a = ekgbVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afti(byte[] bArr) {
        this(ekoe.a, false, false, false);
        int i = ekgb.d;
    }
}
