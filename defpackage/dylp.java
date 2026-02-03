package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dylp {
    public final String a;
    public final String b;
    public int c;
    public int d;
    public boolean e;

    public dylp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dylp)) {
            return false;
        }
        dylp dylpVar = (dylp) obj;
        return this.c == dylpVar.c && this.d == dylpVar.d && this.e == dylpVar.e && ejwh.a(this.a, dylpVar.a) && ejwh.a(this.b, dylpVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("educationName", this.a);
        ejwfVarB.b("highlightId", this.b);
        ejwfVarB.f("numImpressions", this.c);
        ejwfVarB.f("numInteractions", this.d);
        ejwfVarB.h("completed", this.e);
        return ejwfVarB.toString();
    }
}
