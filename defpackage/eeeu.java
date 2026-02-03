package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeeu implements ldn {
    final /* synthetic */ eefa a;

    public eeeu(eefa eefaVar) {
        this.a = eefaVar;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        eefa eefaVar = this.a;
        eeez eeezVar = eefaVar.h;
        if (eeezVar != null) {
            eefaVar.c.D.remove(eeezVar);
        }
        eefaVar.h = new eeez(eefaVar.d, lgtVar);
        eefaVar.h.d(eefaVar.getWindow());
        eefaVar.c.w(eefaVar.h);
        return lgtVar;
    }
}
