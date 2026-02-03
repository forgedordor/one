package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxa {
    public final int a;
    public final dowz b;
    public final List c;
    public final fdap d;
    private final dowz e;

    public /* synthetic */ doxa(int i, dowz dowzVar, List list, fdap fdapVar, int i2) {
        list = (i2 & 8) != 0 ? fcvo.a : list;
        dowzVar.getClass();
        list.getClass();
        this.a = i;
        this.b = dowzVar;
        this.e = null;
        this.c = list;
        this.d = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doxa)) {
            return false;
        }
        doxa doxaVar = (doxa) obj;
        if (this.a != doxaVar.a || !fdbq.f(this.b, doxaVar.b)) {
            return false;
        }
        dowz dowzVar = doxaVar.e;
        return fdbq.f(null, null) && fdbq.f(this.c, doxaVar.c) && fdbq.f(this.d, doxaVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 961) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String string = Integer.toString(this.a, 16);
        string.getClass();
        return "HugoShortcut(title=0x" + string + ", icon=" + this.b + ", badgeIcon=null, permissions=" + this.c + ")";
    }
}
