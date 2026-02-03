package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyg extends euyj {
    private final List a;
    private final int b;
    private final Optional c;

    public euyg(List list, int i, Optional optional) {
        if (list == null) {
            throw new NullPointerException("Null categories");
        }
        this.a = list;
        this.b = i;
        this.c = optional;
    }

    @Override // defpackage.euyj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.euyj
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.euyj
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euyj) {
            euyj euyjVar = (euyj) obj;
            if (this.a.equals(euyjVar.c()) && this.b == euyjVar.a() && this.c.equals(euyjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "Classifications{categories=" + this.a.toString() + ", headIndex=" + this.b + ", headName=" + optional.toString() + "}";
    }
}
