package defpackage;

import j$.util.Objects;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agl extends ajn {
    public final List a;
    public final List b;
    public final ajr c;
    public List d;
    public Set e;
    private Integer f;

    public agl(List list, List list2, ajr ajrVar) {
        list.getClass();
        this.a = list;
        list2.getClass();
        this.b = list2;
        this.c = ajrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof agl)) {
            return false;
        }
        agl aglVar = (agl) obj;
        return Objects.equals(this.a, aglVar.a) && Objects.equals(this.b, aglVar.b) && Objects.equals(this.c, aglVar.c);
    }

    public final int hashCode() {
        if (this.f == null) {
            this.f = Integer.valueOf(Objects.hash(this.a, this.b, this.c));
        }
        return this.f.intValue();
    }
}
