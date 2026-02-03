package defpackage;

import android.util.SparseBooleanArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyc {
    public static final oya a = new oxy();
    public final List b;
    public final List c;
    public final oyb f;
    public final SparseBooleanArray e = new SparseBooleanArray();
    public final cvw d = new cvw();

    public oyc(List list, List list2) {
        this.b = list;
        this.c = list2;
        int size = list.size();
        oyb oybVar = null;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            oyb oybVar2 = (oyb) this.b.get(i2);
            int i3 = oybVar2.b;
            oybVar = i3 > i ? oybVar2 : oybVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.f = oybVar;
    }

    public final oyb a(oyd oydVar) {
        return (oyb) this.d.get(oydVar);
    }
}
