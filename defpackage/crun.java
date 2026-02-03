package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crun {
    public final eykc a;
    public final csdn b;
    public final String c;

    public crun(eykc eykcVar, csdn csdnVar, String str) {
        eykcVar.getClass();
        this.a = eykcVar;
        this.b = csdnVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crun)) {
            return false;
        }
        crun crunVar = (crun) obj;
        return this.a == crunVar.a && fdbq.f(this.b, crunVar.b) && fdbq.f(this.c, crunVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Action(type=" + this.a + ", contributorsClassificationSources=" + this.b + ", spamPolicyConfigId=" + this.c + ")";
    }
}
