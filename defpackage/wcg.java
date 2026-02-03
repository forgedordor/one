package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcg {
    public final String a;
    public final djrr b;
    public final List c;

    public wcg(String str, djrr djrrVar, List list) {
        djrrVar.getClass();
        list.getClass();
        this.a = str;
        this.b = djrrVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcg)) {
            return false;
        }
        wcg wcgVar = (wcg) obj;
        return fdbq.f(this.a, wcgVar.a) && this.b == wcgVar.b && fdbq.f(this.c, wcgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DirectSendHeaderUiData(title=" + this.a + ", navigationIcon=" + this.b + ", toolbarActions=" + this.c + ")";
    }
}
