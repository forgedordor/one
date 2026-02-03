package com.google.android.libraries.messaging.lighter.ui.conversationheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.dwyc;
import defpackage.dwyh;
import defpackage.dxbc;
import defpackage.dxbd;
import defpackage.dxbk;
import defpackage.eedc;
import defpackage.eehg;
import defpackage.fbfm;
import defpackage.kyy;
import defpackage.zh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationHeaderView extends eedc implements dxbd {
    private final Toolbar g;
    private final dwyc h;
    private final TextView i;
    private final float j;
    private final float k;
    private Integer l;

    public ConversationHeaderView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dxbc dxbcVar = (dxbc) obj;
        View.OnClickListener onClickListener = fbfm.j() ? new View.OnClickListener() { // from class: dxbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxbcVar.a();
            }
        } : new View.OnClickListener() { // from class: dxbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxbcVar.b();
            }
        };
        Toolbar toolbar = this.g;
        toolbar.t(onClickListener);
        toolbar.x = new zh() { // from class: dxbj
            @Override // defpackage.zh
            public final boolean a(MenuItem menuItem) {
                return true;
            }
        };
    }

    @Override // defpackage.eedc
    public final void fF(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    @Override // defpackage.eecr
    public final void gR(AppBarLayout appBarLayout, int i) {
        float fIntValue;
        Integer numValueOf = Integer.valueOf(appBarLayout.h());
        this.l = numValueOf;
        if (numValueOf.intValue() > 0) {
            fIntValue = (this.l.intValue() + i) / this.l.intValue();
        } else {
            fIntValue = 1.0f;
        }
        dwyc dwycVar = this.h;
        float f = this.k;
        dwycVar.b((int) (f + (fIntValue * (this.j - f))));
    }

    public ConversationHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        this.l = null;
        inflate(getContext(), R.layout.conversation_header_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.g = toolbar;
        Drawable drawableF = toolbar.f();
        if (drawableF != null) {
            drawableF.setColorFilter(eehg.b(this, R.attr.colorOnSurfaceVariant), PorterDuff.Mode.SRC_IN);
        }
        Drawable drawableE = toolbar.e();
        if (drawableE != null) {
            drawableE.setColorFilter(eehg.b(this, R.attr.colorOnSurfaceVariant), PorterDuff.Mode.SRC_IN);
        }
        findViewById(R.id.avatar_group);
        dwyc dwycVar = (dwyc) findViewById(R.id.conversation_avatar);
        this.h = dwycVar;
        TextView textView = (TextView) findViewById(R.id.header_subtitle);
        this.i = textView;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dxbk.a);
        try {
            this.j = typedArrayObtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.default_avatar_expanded_size));
            this.k = typedArrayObtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.default_avatar_minimized_size));
            getResources().getDimension(R.dimen.default_toolbar_button_icon_width);
            getResources().getDimension(R.dimen.default_toolbar_button_icon_height);
            typedArrayObtainStyledAttributes.recycle();
            setBackgroundColor(eehg.b(this, R.attr.colorSurface));
            dwycVar.d();
            findViewById(R.id.header_contents).bringToFront();
            textView.setTypeface(kyy.b(getContext(), R.font.google_sans_text));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
