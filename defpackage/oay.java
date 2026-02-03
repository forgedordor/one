package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oay {
    public final ekgb a;
    public final mcv b;
    public final oca c;
    public final int d;
    public final boolean e;

    public oay(List list, mcv mcvVar, oca ocaVar, int i, boolean z) {
        boolean z2 = true;
        mee.b(true, "Audio transmuxing and audio track forcing are not allowed together.");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            boolean z3 = ((obv) it.next()).b;
        } else {
            z2 = false;
        }
        mee.b(z2, "Composition must have at least one non-looping sequence.");
        this.a = ekgb.n(list);
        this.b = mcvVar;
        this.c = ocaVar;
        this.d = i;
        this.e = z;
    }
}
