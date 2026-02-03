package defpackage;

import android.view.View;
import android.widget.CheckBox;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dris implements View.OnClickListener {
    final /* synthetic */ CheckBox a;

    public dris(CheckBox checkBox) {
        this.a = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.performClick();
    }
}
