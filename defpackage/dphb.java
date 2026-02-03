package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphb implements DialogInterface.OnCancelListener {
    final /* synthetic */ fdis a;

    public dphb(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.h(null);
    }
}
