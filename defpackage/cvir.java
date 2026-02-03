package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvir {
    public Uri a;
    public final ListenableFuture b = null;
    public final VideoAttachmentView c;
    public final RoundedImageView d;
    public final VideoOverlayView e;
    public final boolean f;
    public final boolean g;
    private final Context h;

    public cvir(VideoAttachmentView videoAttachmentView, TypedArray typedArray, fcsu fcsuVar, fcsu fcsuVar2) {
        int dimensionPixelSize;
        this.c = videoAttachmentView;
        Context context = videoAttachmentView.getContext();
        this.h = context;
        context.getColor(R.color.message_video_selected_tint);
        ehqs.c(videoAttachmentView).c().p(rqi.b());
        View.inflate(context, R.layout.video_attachment_view_inline, videoAttachmentView);
        int dimensionPixelSize2 = 0;
        if (typedArray == null) {
            this.f = false;
            this.g = false;
            dimensionPixelSize = -1;
        } else {
            int[] iArr = cvin.a;
            this.f = typedArray.getBoolean(1, false);
            this.g = typedArray.getBoolean(3, false);
            dimensionPixelSize = typedArray.getDimensionPixelSize(4, -1);
            dimensionPixelSize2 = typedArray.getDimensionPixelSize(2, 0);
        }
        RoundedImageView roundedImageView = (RoundedImageView) videoAttachmentView.findViewById(R.id.video_thumbnail_image);
        this.d = roundedImageView;
        if (dimensionPixelSize >= 0) {
            roundedImageView.v = dimensionPixelSize;
        }
        VideoOverlayView videoOverlayView = (VideoOverlayView) videoAttachmentView.findViewById(R.id.video_overlay);
        this.e = videoOverlayView;
        if (dimensionPixelSize2 > 0) {
            videoOverlayView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        }
        if (this.f) {
            videoOverlayView.setVisibility(8);
        } else {
            roundedImageView.setOnClickListener(((cvjo) fcsuVar2.b()).a(new View.OnClickListener() { // from class: cviq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }));
        }
        if (this.g) {
            roundedImageView.getLayoutParams().width = -1;
            roundedImageView.getLayoutParams().height = -1;
            roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
