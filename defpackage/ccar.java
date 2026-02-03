package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccar {
    public final aubq a;
    public final basd b;
    public final aubt c;
    public final asrg d;
    public final aufx e;
    public final eyga f;

    public ccar(aubq aubqVar, basd basdVar, aubt aubtVar, asrg asrgVar, aufx aufxVar, eyga eygaVar) {
        basdVar.getClass();
        asrgVar.getClass();
        eygaVar.getClass();
        this.a = aubqVar;
        this.b = basdVar;
        this.c = aubtVar;
        this.d = asrgVar;
        this.e = aufxVar;
        this.f = eygaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccar)) {
            return false;
        }
        ccar ccarVar = (ccar) obj;
        return fdbq.f(this.a, ccarVar.a) && fdbq.f(this.b, ccarVar.b) && fdbq.f(this.c, ccarVar.c) && fdbq.f(this.d, ccarVar.d) && fdbq.f(this.e, ccarVar.e) && fdbq.f(this.f, ccarVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "OutgoingMlsRcsMessage(sender=" + this.a + ", rcsMessageId=" + this.b + ", chatMessageContent=" + this.c + ", recipientsDescriptor=" + this.d + ", messageClass=" + this.e + ", customCpimHeaders=" + this.f + ")";
    }
}
