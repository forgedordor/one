package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.cvbb;
import defpackage.cvbn;
import defpackage.eehg;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SwipeActionPreference extends Preference {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private cvbb g;

    public SwipeActionPreference(Context context) {
        super(context);
        this.g = cvbb.ARCHIVE;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        VectorDrawable vectorDrawable;
        ImageView imageView;
        View viewFindViewById;
        View viewFindViewById2;
        int i;
        super.a(pabVar);
        View view = pabVar.a;
        view.setClickable(true);
        TextView textView = (TextView) view.findViewById(R.id.swipe_action_title);
        if (textView != null) {
            textView.setText(t());
        }
        TextView textView2 = (TextView) view.findViewById(R.id.swipe_action_summary);
        if (textView2 != null) {
            textView2.setText(m());
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.swipe_action_view_stub);
        if (viewStub != null && (i = this.b) > 0) {
            viewStub.setLayoutResource(i);
            viewStub.inflate();
        }
        cvbb cvbbVar = this.g;
        cvbb cvbbVar2 = cvbb.DELETE;
        int i2 = cvbbVar == cvbbVar2 ? R.drawable.quantum_gm_ic_delete_vd_theme_24 : cvbbVar == cvbb.ARCHIVE ? R.drawable.quantum_gm_ic_archive_vd_theme_24 : cvbbVar == cvbb.MARK_AS_READ_OR_UNREAD ? R.drawable.messages_unread_chat_icon : 0;
        GradientDrawable gradientDrawable = null;
        if (i2 == 0) {
            vectorDrawable = null;
        } else {
            vectorDrawable = (VectorDrawable) view.getContext().getDrawable(i2);
            int iB = cvbbVar == cvbbVar2 ? eehg.b(view, R.attr.colorOnError) : (cvbbVar == cvbb.ARCHIVE || cvbbVar == cvbb.MARK_AS_READ_OR_UNREAD) ? eehg.b(view, R.attr.colorOnPrimary) : 0;
            if (vectorDrawable != null && iB != 0) {
                vectorDrawable = (VectorDrawable) vectorDrawable.mutate();
                vectorDrawable.setTint(iB);
                vectorDrawable.setTintMode(PorterDuff.Mode.SRC_IN);
            }
        }
        cvbb cvbbVar3 = this.g;
        if (this.c != 0) {
            gradientDrawable = (GradientDrawable) view.getContext().getDrawable(this.c);
            int iB2 = cvbbVar3 == cvbbVar2 ? eehg.b(view, R.attr.colorError) : (cvbbVar3 == cvbb.ARCHIVE || cvbbVar3 == cvbb.MARK_AS_READ_OR_UNREAD) ? eehg.b(view, R.attr.colorPrimary) : 0;
            if (gradientDrawable != null && iB2 != 0) {
                gradientDrawable.setColor(iB2);
            }
        }
        int i3 = this.f;
        if (i3 > 0 && (viewFindViewById2 = view.findViewById(i3)) != null) {
            viewFindViewById2.setVisibility(vectorDrawable == null ? 8 : 0);
        }
        int i4 = this.d;
        if (i4 > 0 && (viewFindViewById = view.findViewById(i4)) != null && gradientDrawable != null) {
            viewFindViewById.setBackground(gradientDrawable);
        }
        int i5 = this.e;
        if (i5 <= 0 || (imageView = (ImageView) view.findViewById(i5)) == null || vectorDrawable == null) {
            return;
        }
        imageView.setImageDrawable(vectorDrawable);
    }

    public final void k(cvbb cvbbVar) {
        this.g = cvbbVar;
        d();
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        return cvbn.e(this.j, this.g);
    }

    @Override // androidx.preference.Preference
    public final CharSequence t() {
        int i = this.a;
        if (i != 0) {
            return this.j.getString(i);
        }
        return null;
    }

    public SwipeActionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = cvbb.ARCHIVE;
    }

    public SwipeActionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = cvbb.ARCHIVE;
    }
}
