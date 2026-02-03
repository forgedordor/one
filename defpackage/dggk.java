package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggk {
    public final String a;

    public dggk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dggk) && fdbq.f(this.a, ((dggk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FormattedE164PhoneNumber(e164FormattedNumber=" + this.a + ")";
    }
}
