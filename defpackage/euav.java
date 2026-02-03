package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euav implements esoa {
    private final dzfh b = dzfh.a(eucc.a, new dzfh("RevokePhoneSharingConsent"));
    private final ekhx c = new ekph("https://www.googleapis.com/auth/myphonenumbers");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? eucc.M.O : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
