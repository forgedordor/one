package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aha extends ajn {
    public final int[] a;
    private Integer b;

    static {
        afb afbVar = new afb("VisibilityPermissionType");
        afj afjVar = new afj("allRequiredPermissions");
        afjVar.b(1);
        afbVar.c(afjVar.a());
        afbVar.a();
    }

    public aha(Set set) {
        int[] iArr = new int[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aha) {
            return Arrays.equals(this.a, ((aha) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == null) {
            this.b = Integer.valueOf(Arrays.hashCode(this.a));
        }
        return this.b.intValue();
    }
}
