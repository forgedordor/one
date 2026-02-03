package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwd extends dhvz {
    public final List a;
    public final List b;
    public final evqs c;
    public final List d;
    private final fdap e;

    public dhwd() {
        fcvo fcvoVar = fcvo.a;
        evqs evqsVar = evqs.b;
        evqsVar.getClass();
        this.e = null;
        this.a = fcvoVar;
        this.b = fcvoVar;
        this.c = evqsVar;
        this.d = fcvoVar;
    }

    @Override // defpackage.dhvz
    public final evqs a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhwd)) {
            return false;
        }
        dhwd dhwdVar = (dhwd) obj;
        fdap fdapVar = dhwdVar.e;
        return fdbq.f(null, null) && fdbq.f(this.a, dhwdVar.a) && fdbq.f(this.b, dhwdVar.b) && fdbq.f(this.c, dhwdVar.c) && fdbq.f(this.d, dhwdVar.d);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 992) * 31) + 1;
    }
}
