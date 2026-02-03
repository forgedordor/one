package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ziu implements yis {
    public final dizb a;
    public final diyr b;
    private final MessageId c;
    private final String d;

    public ziu(dizb dizbVar, diyr diyrVar, MessageId messageId) {
        this.a = dizbVar;
        this.b = diyrVar;
        this.c = messageId;
        String strA = messageId.a();
        strA.getClass();
        this.d = strA;
    }

    @Override // defpackage.yis
    public final MessageId a() {
        return this.c;
    }

    @Override // defpackage.dkfe
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziu)) {
            return false;
        }
        ziu ziuVar = (ziu) obj;
        return fdbq.f(this.a, ziuVar.a) && fdbq.f(this.b, ziuVar.b) && fdbq.f(this.c, ziuVar.c);
    }

    public final int hashCode() {
        dizb dizbVar = this.a;
        int iHashCode = dizbVar == null ? 0 : dizbVar.hashCode();
        diyr diyrVar = this.b;
        return (((iHashCode * 31) + (diyrVar != null ? diyrVar.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CardstoneUiData(cardstoneUiData=" + this.a + ", cardUiData=" + this.b + ", messageId=" + this.c + ")";
    }
}
