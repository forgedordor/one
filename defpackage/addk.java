package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addk implements DialogInterface.OnClickListener {
    final /* synthetic */ addl a;

    public addk(addl addlVar) {
        this.a = addlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.e = i;
    }
}
