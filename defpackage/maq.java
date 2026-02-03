package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class maq {
    private final SparseBooleanArray a = new SparseBooleanArray();
    private boolean b;

    public final mar a() {
        mee.c(!this.b);
        this.b = true;
        return new mar(this.a);
    }

    public final void b(int i) {
        mee.c(!this.b);
        this.a.append(i, true);
    }
}
