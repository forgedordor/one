package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chia {
    public final String a;
    public final alqm b;
    public final Instant c;
    public final Instant d;
    public final chjn e;
    public final int f;
    private final axcm g;

    public chia(axcm axcmVar, String str, alqm alqmVar, Instant instant, Instant instant2, int i, chjn chjnVar) {
        this.g = axcmVar;
        this.a = str;
        this.b = alqmVar;
        this.c = instant;
        this.d = instant2;
        this.f = i;
        this.e = chjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chia)) {
            return false;
        }
        chia chiaVar = (chia) obj;
        return fdbq.f(this.g, chiaVar.g) && fdbq.f(this.a, chiaVar.a) && fdbq.f(this.b, chiaVar.b) && fdbq.f(this.c, chiaVar.c) && fdbq.f(this.d, chiaVar.d) && this.f == chiaVar.f && fdbq.f(this.e, chiaVar.e);
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ParsedSmsData(myIdentity=" + this.g + ", messageText=" + this.a + ", sender=" + this.b + ", messageSentTimestamp=" + this.c + ", messageReceivedTimestamp=" + this.d + ", messageClass=" + ((Object) elpc.b(this.f)) + ", telephonyData=" + this.e + ")";
    }
}
