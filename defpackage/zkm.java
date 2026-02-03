package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkm implements yis {
    public final dlky a;
    public final dkol b;
    private final MessageId c;
    private final String d;

    public zkm(MessageId messageId, dlky dlkyVar, dkol dkolVar) {
        this.c = messageId;
        this.a = dlkyVar;
        this.b = dkolVar;
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
        if (!(obj instanceof zkm)) {
            return false;
        }
        zkm zkmVar = (zkm) obj;
        return fdbq.f(this.c, zkmVar.c) && fdbq.f(this.a, zkmVar.a) && fdbq.f(this.b, zkmVar.b);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        dkol dkolVar = this.b;
        return (iHashCode * 31) + (dkolVar == null ? 0 : dkolVar.hashCode());
    }

    public final String toString() {
        return "BugleTombstoneUiData(messageId=" + this.c + ", contentUiData=" + this.a + ", separators=" + this.b + ")";
    }
}
