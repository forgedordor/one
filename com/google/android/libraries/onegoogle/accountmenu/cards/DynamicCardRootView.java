package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import defpackage.dyyb;
import defpackage.dyyh;
import defpackage.ejud;
import defpackage.ejwi;
import defpackage.ekfw;
import defpackage.ekgb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DynamicCardRootView extends ConstraintLayout implements dyyh {
    public ejwi i;
    public ejwi j;
    public boolean k;

    public DynamicCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        if (this.i.g()) {
            dyybVar.b(this, ((Integer) this.i.c()).intValue());
        }
        this.k = true;
    }

    public final ekgb f() {
        ekfw ekfwVar = new ekfw();
        dyyh dyyhVar = (dyyh) findViewById(R.id.og_text_card_root);
        if (dyyhVar != null) {
            ekfwVar.h(dyyhVar);
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        this.k = false;
        if (this.i.g()) {
            dyybVar.e(this);
        }
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ejud ejudVar = ejud.a;
        this.i = ejudVar;
        this.j = ejudVar;
    }
}
