package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.media.CmsBrokenMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txy {
    private final CmsBrokenMediaAttachmentView a;

    public txy(CmsBrokenMediaAttachmentView cmsBrokenMediaAttachmentView) {
        this.a = cmsBrokenMediaAttachmentView;
        View.inflate(cmsBrokenMediaAttachmentView.getContext(), R.layout.cms_broken_media_attachment_view, cmsBrokenMediaAttachmentView);
        View viewFindViewById = cmsBrokenMediaAttachmentView.findViewById(R.id.cms_broken_media_icon_imageview);
        viewFindViewById.getClass();
    }
}
