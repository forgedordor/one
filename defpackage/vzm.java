package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzm {
    public final vzz a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public vzm(vzz vzzVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = vzzVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzm)) {
            return false;
        }
        vzm vzmVar = (vzm) obj;
        return fdbq.f(this.a, vzmVar.a) && this.b == vzmVar.b && this.c == vzmVar.c && this.d == vzmVar.d && this.e == vzmVar.e && this.f == vzmVar.f && this.g == vzmVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.e;
        boolean z4 = this.d;
        return ((((((((((iHashCode + vzl.a(this.b)) * 31) + vzl.a(this.c)) * 31) + vzl.a(z4)) * 31) + vzl.a(z3)) * 31) + vzl.a(z2)) * 31) + vzl.a(z);
    }

    public final String toString() {
        return "SendIconData(sendIcon=" + this.a + ", isScheduledMessage=" + this.b + ", isEditMessage=" + this.c + ", processingAttachment=" + this.d + ", editMessageTextChanged=" + this.e + ", hasSendableContent=" + this.f + ", disableSendDueToTextLength=" + this.g + ")";
    }
}
