package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.cqsu;
import defpackage.cvib;
import defpackage.cvjl;
import defpackage.eehg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileIcon extends cvib {
    ImageView a;
    final String b;

    public FileIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "*/*";
    }

    public void a() {
        this.a.setBackground(cvjl.c(getContext()));
        ImageView imageView = this.a;
        Context context = getContext();
        imageView.setImageDrawable(cqsu.i(context, context.getResources().getDrawable(cvjl.a(this.b)), eehg.d(context, R.attr.colorOnPrimaryBrandIcon, "ConversationDrawables")));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.file_image);
        a();
    }
}
