package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaur extends eavt {
    private final List a;
    private final List b;

    public eaur(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.eavt
    public final List a() {
        return this.a;
    }

    @Override // defpackage.eavt
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavt) {
            eavt eavtVar = (eavt) obj;
            if (this.a.equals(eavtVar.a()) && ((list = this.b) != null ? list.equals(eavtVar.b()) : eavtVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        List list = this.b;
        return (iHashCode * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List list = this.b;
        return "SearchByTextResponse{places=" + this.a.toString() + ", routingSummaries=" + String.valueOf(list) + "}";
    }
}
