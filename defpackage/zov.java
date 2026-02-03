package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zov {
    public final List a;
    public final djpe b;

    public zov(List list, djpe djpeVar) {
        this.a = list;
        this.b = djpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zov)) {
            return false;
        }
        zov zovVar = (zov) obj;
        return fdbq.f(this.a, zovVar.a) && fdbq.f(this.b, zovVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ScheduledMessagesListUiData(listItemsUiData=" + this.a + ", listButtonUiData=" + this.b + ")";
    }
}
