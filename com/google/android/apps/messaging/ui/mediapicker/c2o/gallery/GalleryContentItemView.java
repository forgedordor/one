package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import defpackage.czar;
import defpackage.czbb;
import defpackage.eifs;
import defpackage.eigp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GalleryContentItemView extends czar {
    public ImageView a;
    public VideoOverlayView b;
    public czbb c;
    public final boolean d;
    public eigp e;

    public GalleryContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.gallery_content_async_image);
        this.b = (VideoOverlayView) findViewById(R.id.gallery_content_video_overlay);
        String str = "com/google/android/apps/messaging/ui/mediapicker/c2o/gallery/GalleryContentItemView";
        setOnClickListener(new eifs(this.e, str, "onFinishInflate", 45, "GalleryContentItemView::onClick", this.o));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (true != this.d) {
            i = i2;
        }
        super.onMeasure(i, i);
    }
}
