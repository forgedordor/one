package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luy {
    public static final lwp a(pix pixVar, lvc lvcVar, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        lwp lwpVar = new lwp(str, lwl.a(pixVar.a(str), bundle));
        lwpVar.b(pixVar, lvcVar);
        c(pixVar, lvcVar);
        return lwpVar;
    }

    public static final void b(lxd lxdVar, pix pixVar, lvc lvcVar) throws NoSuchMethodException, SecurityException {
        pixVar.getClass();
        lvcVar.getClass();
        lwp lwpVar = (lwp) lxdVar.fy("androidx.lifecycle.savedstate.vm.tag");
        if (lwpVar == null || lwpVar.b) {
            return;
        }
        lwpVar.b(pixVar, lvcVar);
        c(pixVar, lvcVar);
    }

    private static final void c(pix pixVar, lvc lvcVar) throws NoSuchMethodException, SecurityException {
        lvb lvbVarA = lvcVar.a();
        if (lvbVarA == lvb.b || lvbVarA.a(lvb.d)) {
            pixVar.c(luw.class);
        } else {
            lvcVar.c(new lux(lvcVar, pixVar));
        }
    }
}
