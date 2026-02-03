package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.cvia;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileAttachmentView extends cvia {
    public FileAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.layout.file_attachment_view);
    }

    public FileAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), i, this);
        context.getColor(R.color.primary_color);
    }
}
