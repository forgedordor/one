package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import defpackage.dyez;
import defpackage.dyre;
import defpackage.dyyb;
import defpackage.dyyh;
import defpackage.ejud;
import defpackage.ejwi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TextualCardRootView extends FrameLayout implements dyyh {
    public dyre a;
    public dyre b;
    public ejwi c;
    private Chip d;
    private Chip e;
    private int f;

    public TextualCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        if (this.c.g()) {
            dyybVar.b(this.d, ((dyez) this.c.c()).b);
            dyybVar.b(this.e, ((dyez) this.c.c()).c);
        }
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        if (this.c.g()) {
            dyybVar.e(this.d);
            dyybVar.e(this.e);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (Chip) findViewById(R.id.og_text_card_action);
        this.e = (Chip) findViewById(R.id.og_text_card_secondary_action);
        this.a = new dyre(this.d);
        this.b = new dyre(this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f) {
            this.f = size;
            this.a.b(size);
            this.b.b(this.f);
        }
        super.onMeasure(i, i2);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = ejud.a;
    }
}
