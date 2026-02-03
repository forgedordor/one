package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chft {
    public final chfi a;
    public final axcm b;
    public final awjl c;
    public final awpx d;
    public final chfg e;
    public final chfo f;
    public final basd g;
    public final fhaz h;
    public final eyga i;
    public final int j;

    public chft(chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, int i, chfg chfgVar, chfo chfoVar, basd basdVar, fhaz fhazVar, eyga eygaVar) {
        chfiVar.getClass();
        axcmVar.getClass();
        awjlVar.getClass();
        if (i == 0) {
            throw null;
        }
        chfgVar.getClass();
        chfoVar.getClass();
        basdVar.getClass();
        fhazVar.getClass();
        eygaVar.getClass();
        this.a = chfiVar;
        this.b = axcmVar;
        this.c = awjlVar;
        this.d = awpxVar;
        this.j = 1;
        this.e = chfgVar;
        this.f = chfoVar;
        this.g = basdVar;
        this.h = fhazVar;
        this.i = eygaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chft)) {
            return false;
        }
        chft chftVar = (chft) obj;
        if (!fdbq.f(this.a, chftVar.a) || !fdbq.f(this.b, chftVar.b) || !fdbq.f(this.c, chftVar.c) || !fdbq.f(this.d, chftVar.d)) {
            return false;
        }
        int i = chftVar.j;
        return fdbq.f(this.e, chftVar.e) && fdbq.f(this.f, chftVar.f) && fdbq.f(this.g, chftVar.g) && fdbq.f(this.h, chftVar.h) && fdbq.f(this.i, chftVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        awpx awpxVar = this.d;
        return (((((((((((((iHashCode * 31) + (awpxVar == null ? 0 : awpxVar.hashCode())) * 31) + 1) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "SendingMessageData(messageToken=" + this.a + ", from=" + this.b + ", destinationToken=" + this.c + ", groupToken=" + this.d + ", protocol=RCS, messagePayload=" + this.e + ", sendingConfiguration=" + this.f + ", rcsMessageId=" + this.g + ", traceId=" + this.h + ", customHeaders=" + this.i + ")";
    }
}
