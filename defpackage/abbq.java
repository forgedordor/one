package defpackage;

import android.app.Dialog;
import android.content.Context;
import defpackage.abbp;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abbq implements eind {
    final /* synthetic */ abbp a;

    public abbq(abbp abbpVar) {
        this.a = abbpVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        abbi abbiVar = (abbi) ((abbp.a) einbVar).a();
        int i = abbiVar.c - 1;
        abbp abbpVar = this.a;
        if (i != 0) {
            abbv abbvVar = abbpVar.a;
            Dialog dialog = abbpVar.b.d;
            if (dialog != null) {
                dialog.dismiss();
            }
            abbvVar.c.ao(6);
            abbv.a.m("User canceled taking a bug report");
        } else {
            final abbv abbvVar2 = abbpVar.a;
            abbn abbnVar = abbpVar.b;
            final aazs aazsVar = abbiVar.a;
            String str = abbiVar.b;
            Context contextZ = abbnVar.z();
            Dialog dialog2 = abbnVar.d;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            if (aazsVar == null) {
                abbv.a.r("No category is selected, skip taking bug report");
            } else {
                abbvVar2.c.ap(4, aazsVar.a());
                achu achuVar = abbvVar2.b;
                String str2 = aazsVar.b;
                defn defnVarB = achuVar.b(contextZ, str2, str);
                final Runnable runnableK = eiid.k(new Runnable() { // from class: abbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        abbvVar2.c.ap(5, aazsVar.a());
                        abbv.a.m("Successfully uploaded the bug report");
                    }
                });
                defnVarB.a(new defh() { // from class: abbt
                    @Override // defpackage.defh
                    public final void e(Object obj) {
                        runnableK.run();
                    }
                });
                defnVarB.t(new defe() { // from class: abbu
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        cqbd cqbdVarE = abbv.a.e();
                        cqbdVarE.I("Failed to upload the bug report");
                        cqbdVarE.s(exc);
                    }
                });
                cqbd cqbdVarD = abbv.a.d();
                cqbdVarD.I("User took bug report");
                cqbdVarD.A("Category", str2);
                cqbdVarD.A("Comment", str);
                cqbdVarD.r();
            }
        }
        return eine.a;
    }
}
