package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatd extends aava {
    private final boolean a;

    public aatd(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aava
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aava) && this.a == ((aava) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "UpdateUiDuringDonationEvent{donating=" + this.a + "}";
    }
}
