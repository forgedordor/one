package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oyu implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ oyv a;

    public oyu(oyv oyvVar) {
        this.a = oyvVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        oyv oyvVar = this.a;
        if (z) {
            oyvVar.ah = oyvVar.ag.add(oyvVar.aj[i].toString()) | oyvVar.ah;
        } else {
            oyvVar.ah = oyvVar.ag.remove(oyvVar.aj[i].toString()) | oyvVar.ah;
        }
    }
}
