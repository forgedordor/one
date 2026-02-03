package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uzj extends fcyz implements fdat {
    int a;
    final /* synthetic */ uzk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzj(uzk uzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uzj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vbv vbvVar = (vbv) this.b.b.b();
            this.a = 1;
            obj = fdin.a(eicg.a(vbvVar.b), new vbl(null, vbvVar), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long jIntValue = ((Number) obj).intValue();
        final uzk uzkVar = this.b;
        if (jIntValue >= ((Number) uzkVar.g.b()).longValue()) {
            crqv crqvVar = (crqv) uzkVar.e.b();
            ea eaVar = uzkVar.a;
            crqvVar.h(eaVar.Y(R.string.mc_enabled_pref_key), false);
            Snackbar snackbarQ = Snackbar.q(eaVar.N(), eaVar.Y(R.string.magic_compose_disabled_toast), 0);
            snackbarQ.s(eaVar.Y(R.string.magic_compose_manage_in_settings), new View.OnClickListener() { // from class: uzi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uzk uzkVar2 = uzkVar;
                    ((aijh) uzkVar2.c.b()).h(uzkVar2.a.A());
                }
            });
            snackbarQ.i();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uzj(this.b, fcxyVar);
    }
}
