package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drre implements View.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ drrf b;

    public drre(drrf drrfVar, Context context) {
        this.a = context;
        this.b = drrfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        drrf drrfVar = this.b;
        drrfVar.j = !drrfVar.j;
        drrfVar.c.removeViews(1, drrfVar.f);
        for (int i = 0; i < drrfVar.f; i++) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            for (int i2 = 0; i2 < drrfVar.e; i2++) {
                drrfVar.b(i, i2, drrfVar.j, linearLayout);
            }
            drrfVar.c.addView(linearLayout);
        }
    }
}
