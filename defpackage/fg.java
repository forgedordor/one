package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fg implements adi {
    final /* synthetic */ fr a;

    public fg(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        adh adhVar = (adh) obj;
        fr frVar = this.a;
        fk fkVar = (fk) frVar.t.pollFirst();
        if (fkVar == null) {
            toString();
            Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
            return;
        }
        ge geVar = frVar.b;
        String str = fkVar.a;
        ea eaVarC = geVar.c(str);
        if (eaVarC == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            eaVarC.af(fkVar.b, adhVar.a, adhVar.b);
        }
    }
}
