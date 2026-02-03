package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuom implements DialogInterface.OnClickListener {
    final /* synthetic */ cuoo a;

    public cuom(cuoo cuooVar) {
        this.a = cuooVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(i);
        dialogInterface.dismiss();
    }
}
