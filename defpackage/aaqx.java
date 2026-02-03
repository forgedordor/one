package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqx extends aarh {
    public final ekgb a;

    public aaqx(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.aarh
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aarh) {
            return ekjz.h(this.a, ((aarh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DonationConversation{messages=" + String.valueOf(this.a) + "}";
    }
}
