package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eyhj implements eyhx {
    private volatile Object a;
    private final Object b = new Object();
    private final ea c;
    private final eyhl d;

    /* compiled from: PG */
    public interface a {
        ahhx aJ();
    }

    public eyhj(ea eaVar) {
        this.c = eaVar;
        this.d = new eyhl(eaVar);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void e(ea eaVar) {
        if (eaVar.m == null) {
            eaVar.at(new Bundle());
        }
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    ea eaVar = this.c;
                    eyhz.c(eaVar.X(), "Hilt Fragments must be attached before creating the component.");
                    eyhz.a(eaVar.X() instanceof eyhx, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", eaVar.X().getClass());
                    c(eaVar);
                    ahhx ahhxVarAJ = ((a) eygm.a(eaVar.X(), a.class)).aJ();
                    ahhxVarAJ.e = this.d.bb();
                    ahhxVarAJ.d = eaVar;
                    eyij.a(ahhxVarAJ.d, ea.class);
                    eyij.a(ahhxVarAJ.e, eygq.class);
                    this.a = new ahib(ahhxVarAJ.a, ahhxVarAJ.b, ahhxVarAJ.c, ahhxVarAJ.d);
                }
            }
        }
        return this.a;
    }

    protected void c(ea eaVar) {
    }
}
