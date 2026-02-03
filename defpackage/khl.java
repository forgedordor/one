package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khl {
    public static final khl a = new khl(0);
    public static final khl b = new khl(1);
    public static final khl c = new khl(2);
    public final int d;

    public khl(int i) {
        this.d = i;
    }

    public final boolean a(khl khlVar) {
        int i = this.d;
        return (khlVar.d | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khl) && this.d == ((khl) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        int i = this.d;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((b.d & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + kjw.d(arrayList, ", ", null, 62) + ']';
    }
}
