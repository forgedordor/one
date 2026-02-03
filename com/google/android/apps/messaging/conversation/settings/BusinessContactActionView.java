package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import defpackage.ajhd;
import defpackage.cpby;
import defpackage.cqaz;
import defpackage.dakl;
import defpackage.upq;
import defpackage.uqp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BusinessContactActionView extends uqp {
    public ajhd a;
    public dakl b;

    public BusinessContactActionView(Context context) {
        super(context);
    }

    public final void a(final cpby cpbyVar, String str, String str2, boolean z) throws Resources.NotFoundException {
        upq upqVar = (upq) getTag();
        if (upqVar == null) {
            setVisibility(8);
            cqaz.c("Cant't render business contact action: null view holder.");
            return;
        }
        TextView textView = upqVar.a;
        TextView textView2 = upqVar.b;
        ImageView imageView = upqVar.c;
        View view = upqVar.d;
        View view2 = upqVar.e;
        textView.setText(str);
        if (cpbyVar == null) {
            imageView.setVisibility(4);
        } else {
            imageView.setImageDrawable(cpbyVar.f(getContext().getColor(R.color.info_and_options_contact_action_icon_tint_m2)));
            imageView.setVisibility(0);
            if (TextUtils.isEmpty(str2)) {
                str2 = cpbyVar.a.getResources().getString(cpbyVar.a());
            }
            view2.setContentDescription(cpbyVar.g(str2));
        }
        textView2.setText(str2);
        view2.setOnClickListener(new View.OnClickListener() { // from class: upp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BusinessContactActionView businessContactActionView = this.a;
                cpby cpbyVar2 = cpbyVar;
                if (cpbyVar2 == null) {
                    businessContactActionView.a.ak(1, 3, null);
                    businessContactActionView.b.i(R.string.business_action_failed_to_launch);
                } else {
                    if (!cpbyVar2.i()) {
                        businessContactActionView.b.i(R.string.business_action_failed_to_launch);
                    }
                    businessContactActionView.a.ak(cpbyVar2.j(), 3, cpbyVar2.h());
                }
            }
        });
        view.setVisibility(true == z ? 0 : 8);
    }

    public BusinessContactActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
