package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmb implements yis {
    public final cwui a;
    public final fdae b;
    public final fdae c;
    private final MessageId d;
    private final String e;

    public zmb(MessageId messageId, cwui cwuiVar, fdae fdaeVar, fdae fdaeVar2) {
        this.d = messageId;
        this.a = cwuiVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        String strA = messageId.a();
        strA.getClass();
        this.e = strA;
    }

    @Override // defpackage.yis
    public final MessageId a() {
        return this.d;
    }

    @Override // defpackage.dkfe
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmb)) {
            return false;
        }
        zmb zmbVar = (zmb) obj;
        return fdbq.f(this.d, zmbVar.d) && fdbq.f(this.a, zmbVar.a) && fdbq.f(this.b, zmbVar.b) && fdbq.f(this.c, zmbVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        cwui cwuiVar = this.a;
        return ((((iHashCode + (cwuiVar == null ? 0 : cwuiVar.hashCode())) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BugleToolstoneUiData(messageId=" + this.d + ", contentUiData=" + this.a + ", onCloseClick=" + this.b + ", onLinkClick=" + this.c + ")";
    }
}
