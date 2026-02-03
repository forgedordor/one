package defpackage;

import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eetb {
    final int a;
    public final eesj b;
    final int[][] c;
    final eesj[] d;

    public eetb(eeta eetaVar) {
        this.a = eetaVar.a;
        this.b = eetaVar.b;
        this.c = eetaVar.c;
        this.d = eetaVar.d;
    }

    public final int a(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }
}
