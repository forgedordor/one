package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ff implements adi {
    final /* synthetic */ fr a;

    public ff(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        adh adhVar = (adh) obj;
        fr frVar = this.a;
        fk fkVar = (fk) frVar.t.pollLast();
        if (fkVar == null) {
            toString();
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        ge geVar = frVar.b;
        String str = fkVar.a;
        ea eaVarC = geVar.c(str);
        if (eaVarC == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            eaVarC.af(fkVar.b, adhVar.a, adhVar.b);
        }
    }
}
