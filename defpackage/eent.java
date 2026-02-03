package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eent implements View.OnClickListener {
    final /* synthetic */ eenu a;

    public eent(eenu eenuVar) {
        this.a = eenuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        of ofVar = ((eenp) view).f;
        eenu eenuVar = this.a;
        boolean zA = eenuVar.G.a.A(ofVar, eenuVar.F, 0);
        if (ofVar == null || !ofVar.isCheckable()) {
            return;
        }
        if (!zA || ofVar.isChecked()) {
            eenuVar.f(ofVar);
        }
    }
}
