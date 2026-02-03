package com.google.android.libraries.onegoogle.accountmenu.viewproviders;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import defpackage.dydh;
import defpackage.dyre;
import defpackage.dyyb;
import defpackage.dyyh;
import defpackage.ekgb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MyAccountChip<T> extends Chip implements dyyh {
    public static final /* synthetic */ int c = 0;
    public final dyre a;
    public dydh b;

    public MyAccountChip(Context context) {
        super(context, null);
        this.a = new dyre(this);
        l();
    }

    private final void l() {
        Resources resources = getResources();
        this.a.a(ekgb.t(resources.getString(R.string.og_my_account_desc_long_length), resources.getString(R.string.og_my_account_desc_meduim_length), resources.getString(R.string.og_my_account_desc_short_length)));
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        dyybVar.c(this, 90139);
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        dyybVar.e(this);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new dyre(this);
        l();
    }

    public MyAccountChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new dyre(this);
        l();
    }
}
