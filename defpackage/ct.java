package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ct {
    public final hi a;

    public ct(hi hiVar) {
        this.a = hiVar;
    }

    public final boolean b() {
        hi hiVar = this.a;
        View view = hiVar.a.Q;
        int iB = view != null ? hg.b(view) : 0;
        int i = hiVar.h;
        if (iB != i) {
            return (iB == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
