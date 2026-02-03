package com.google.android.libraries.user.profile.photopicker.art.home.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.dsvh;
import defpackage.dsvx;
import defpackage.dswb;
import defpackage.ecyn;
import defpackage.edbg;
import defpackage.eddy;
import defpackage.eygk;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SuggestedCollectionsSectionView extends edbg {
    public eddy b;
    public dswb c;
    public dsvx d;
    public dsvh e;
    public final ViewGroup f;
    public ecyn g;

    public SuggestedCollectionsSectionView(Context context) {
        this(context, null);
    }

    public SuggestedCollectionsSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        Object baseContext = context;
        if (!this.a) {
            while (!(baseContext instanceof eygk) && (baseContext instanceof ContextWrapper)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            ((eygk) baseContext).ab().a(this);
        }
        inflate(getContext(), R.layout.photo_picker_suggested_collections_section, this);
        this.d.b(this, this.c.a(124723));
        this.f = (ViewGroup) findViewById(R.id.photo_picker_collections_mixed_grid);
        for (int i = 0; i < this.f.getChildCount(); i++) {
            View childAt = this.f.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                this.d.b(childAt, this.c.a(124724));
            }
        }
    }
}
