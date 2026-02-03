package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpha implements DialogInterface.OnClickListener {
    final /* synthetic */ fdis a;

    public dpha(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.w(false);
    }
}
