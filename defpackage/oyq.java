package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oyq implements DialogInterface.OnClickListener {
    final /* synthetic */ oyr a;

    public oyq(oyr oyrVar) {
        this.a = oyrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        oyr oyrVar = this.a;
        oyrVar.ag = i;
        ((ozf) oyrVar).ak = -1;
        dialogInterface.dismiss();
    }
}
