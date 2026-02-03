package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgv {
    public final CardView a;
    public final Dialog b;
    public final drih c;
    public final boolean d;

    public drgv(CardView cardView, Dialog dialog, drih drihVar, boolean z) {
        this.a = cardView;
        this.b = dialog;
        this.c = drihVar;
        this.d = z;
    }

    public final Resources a() {
        return this.a.getContext().getResources();
    }
}
