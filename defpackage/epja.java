package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epja implements esoa {
    private final dzfh b = dzfh.a(epjc.a, new dzfh("SmarterReplies"));
    private final ekhx c = new ekph("https://www.googleapis.com/auth/mdi.aratea");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? epjc.e.g : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
