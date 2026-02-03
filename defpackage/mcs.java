package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcs {
    public static final mcs a;
    public final ekgb b;

    static {
        int i = ekgb.d;
        a = new mcs(ekoe.a);
        mgb.O(0);
    }

    public mcs(List list) {
        this.b = ekgb.n(list);
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i2 >= ekgbVar.size()) {
                return false;
            }
            mcr mcrVar = (mcr) ekgbVar.get(i2);
            boolean[] zArr = mcrVar.d;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (mcrVar.a() == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ekjz.h(this.b, ((mcs) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
