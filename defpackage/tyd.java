package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.media.CmsMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyd {
    public final ProgressBar a;

    public tyd(CmsMediaAttachmentView cmsMediaAttachmentView, cvjl cvjlVar) {
        View.inflate(cmsMediaAttachmentView.getContext(), R.layout.cms_click_to_download_view, cmsMediaAttachmentView);
        this.a = (ProgressBar) cmsMediaAttachmentView.findViewById(R.id.progress);
        ViewGroup viewGroup = (ViewGroup) cmsMediaAttachmentView.findViewById(R.id.icon_container);
        viewGroup.setBackground(cvjlVar.e());
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: tyc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.setVisibility(0);
            }
        });
    }
}
