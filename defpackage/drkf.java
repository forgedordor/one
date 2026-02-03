package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drkf extends qya {
    public final String a;
    public final long b;

    public drkf(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drkf)) {
            return false;
        }
        drkf drkfVar = (drkf) obj;
        return this.b == drkfVar.b && Objects.equals(this.a, drkfVar.a);
    }

    public final int hashCode() {
        long j = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("OS", this.a);
        ejwfVarB.b("versionCode", this.b + (true != drxm.a ? "" : " (.apk's timestamp is used as versionCode for DEV flavor)"));
        return ejwfVarB.toString();
    }
}
