package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrz implements dsop {
    public final dsah a;
    public final eosc b;
    public final dsom c;
    public final eezg d;
    private final eosc e;

    public dsrz(eezg eezgVar, eosc eoscVar, dsom dsomVar, dsah dsahVar, eosc eoscVar2) {
        this.d = eezgVar;
        this.e = eoscVar;
        this.c = dsomVar;
        this.a = dsahVar;
        this.b = eoscVar2;
    }

    @Override // defpackage.dsop
    public final View a(eg egVar, etnj etnjVar) {
        return null;
    }

    @Override // defpackage.dsop
    public final void b(final eg egVar, View view, final dsbi dsbiVar, etns etnsVar) {
        defn defnVarB;
        eeza eezaVar = eezl.a;
        eezl eezlVar = this.d.a;
        eezaVar.d("requestInAppReview (%s)", eezlVar.c);
        if (eezlVar.b == null) {
            eezaVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            defnVarB = degc.b(new eezc());
        } else {
            defr defrVar = new defr();
            eezlVar.b.b(new eezi(eezlVar, defrVar, defrVar), defrVar);
            defnVarB = defrVar.a;
        }
        defnVarB.o(this.e, new defb() { // from class: dsrx
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                defn defnVarC;
                final dsrz dsrzVar = this.a;
                final dsbi dsbiVar2 = dsbiVar;
                if (!defnVar.m()) {
                    dsrzVar.c.b(dsbiVar2, dsoo.FAILED_UNKNOWN);
                    return;
                }
                eeze eezeVar = (eeze) defnVar.i();
                etnj etnjVar = dsbiVar2.c().f;
                if (etnjVar == null) {
                    etnjVar = etnj.a;
                }
                if (etnjVar.f) {
                    dsrzVar.c.b(dsbiVar2, dsoo.SUCCESS);
                    return;
                }
                dsrzVar.a.i(dsbiVar2);
                eezg eezgVar = dsrzVar.d;
                if (eezeVar.b()) {
                    defnVarC = degc.c(null);
                } else {
                    eg egVar2 = egVar;
                    Intent intent = new Intent(egVar2, (Class<?>) PlayCoreDialogWrapperActivity.class);
                    intent.putExtra("confirmation_intent", eezeVar.a());
                    intent.putExtra("window_flags", egVar2.getWindow().getDecorView().getWindowSystemUiVisibility());
                    defr defrVar2 = new defr();
                    intent.putExtra("result_receiver", new eezf(eezgVar.b, defrVar2));
                    egVar2.startActivity(intent);
                    defnVarC = defrVar2.a;
                }
                defnVarC.o(eoqg.a, new defb() { // from class: dsry
                    @Override // defpackage.defb
                    public final void a(defn defnVar2) {
                        final dsrz dsrzVar2 = dsrzVar;
                        final dsbi dsbiVar3 = dsbiVar2;
                        if (defnVar2.m()) {
                            eooq.g(dsrzVar2.c.b(dsbiVar3, dsoo.SUCCESS), new eooz() { // from class: dsrw
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    return dsrzVar2.c.a(dsbiVar3, null);
                                }
                            }, dsrzVar2.b);
                        } else {
                            dsrzVar2.c.b(dsbiVar3, dsoo.FAILED_UNKNOWN);
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.dsop
    public final boolean c(etni etniVar) {
        return etniVar == etni.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
    }
}
