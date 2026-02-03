package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GalleryDeviceCameraItemView extends LinearLayout {
    public GalleryDeviceCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.device_camera_picture_button);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: czal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        View viewFindViewById2 = findViewById(R.id.device_camera_video_button);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: czam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        viewFindViewById.setClipToOutline(true);
        viewFindViewById2.setClipToOutline(true);
    }
}
