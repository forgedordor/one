package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqov implements esoa {
    private final dzfh b = dzfh.a(eqqu.a, new dzfh("BatchCreateConversations"));
    private final ekhx c = new ekph("https://www.googleapis.com/auth/carrier-message-store");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? eqqu.ae.ag : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
