package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dylo implements Cloneable {
    public final String a;
    public boolean b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public boolean h;

    public dylo(String str) {
        this.a = str;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dylo)) {
            return false;
        }
        dylo dyloVar = (dylo) obj;
        return this.b == dyloVar.b && this.c == dyloVar.c && this.d == dyloVar.d && this.e == dyloVar.e && this.f == dyloVar.f && this.g == dyloVar.g && this.h == dyloVar.h && ejwh.a(this.a, dyloVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("name", this.a);
        ejwfVarB.h("enabled", this.b);
        ejwfVarB.f("numImpressions", this.c);
        ejwfVarB.f("numInteractions", this.d);
        ejwfVarB.g("activatedTimestampMs", this.e);
        ejwfVarB.g("lastImpressionTimestampMs", this.f);
        ejwfVarB.g("lastInteractionTimestampMs", this.g);
        ejwfVarB.h("completed", this.h);
        return ejwfVarB.toString();
    }
}
