package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.baea;
import defpackage.bxoz;
import defpackage.bxqj;
import defpackage.cqaz;
import defpackage.cqce;
import defpackage.cwou;
import defpackage.cwpc;
import defpackage.cwpd;
import defpackage.cwpg;
import defpackage.ehqs;
import defpackage.elha;
import defpackage.fcsu;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RichCardMediaAttachmentView extends cwou implements cwpg, bxqj {
    public static final cqce a = cqce.g("BugleRbmRichCard", "RichCardMediaAttachmentView");
    public ImageView b;
    public fcsu c;
    public int d;
    public cwpd e;
    public int f;
    private RichCardMediaDownloadOverlayView g;
    private ImageView h;
    private final int i;

    public RichCardMediaAttachmentView(Context context) throws Resources.NotFoundException {
        super(context);
        this.i = 3622735;
        this.f = 1;
        this.d = -1;
        n();
    }

    private final void n() throws Resources.NotFoundException {
        inflate(getContext(), R.layout.rich_card_media_attachment_view, this);
        this.b = (ImageView) findViewById(R.id.rich_card_thumbnail_image);
        this.g = (RichCardMediaDownloadOverlayView) findViewById(R.id.rich_card_media_download_overlay);
        this.h = (ImageView) findViewById(R.id.rich_card_media_placeholder_icon);
        setBackgroundColor(this.i);
        RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView = this.g;
        richCardMediaDownloadOverlayView.a = this;
        richCardMediaDownloadOverlayView.c();
        this.h.setTag(R.id.rich_card_media_icon_tag, cwpc.NONE);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: cwpb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        getResources().getInteger(R.integer.rich_card_media_cross_fade_duration);
        ehqs.c(this).c().ax();
    }

    @Override // defpackage.bxqj
    public final void a(String str) {
        l(str);
    }

    @Override // defpackage.bxqj
    public final void b(String str) {
        l(str);
    }

    @Override // defpackage.bxqj
    public final void c(String str, long j, long j2) {
        l(str);
    }

    @Override // defpackage.bxqj
    public final void e(String str, Uri uri) {
        l(str);
    }

    @Override // defpackage.cwpg
    public final int h() {
        return this.d;
    }

    @Override // defpackage.cwpg
    public final long i() {
        if (this.e == null) {
            cqaz.c("Total media size was requested but RichCardMediaAttachmentHost was null.");
            return -1L;
        }
        cqaz.c("Media size was requested but no media is present.");
        return -1L;
    }

    @Override // defpackage.cwpg
    public final void j() {
        if (this.e != null) {
            throw null;
        }
        cqaz.c("A download cancellation was requested but the RichCardMediaAttachmentHost was null for this view.");
    }

    @Override // defpackage.cwpg
    public final void k() {
        cwpd cwpdVar = this.e;
        if (cwpdVar == null) {
            cqaz.c("A download cancellation was requested but the RichCardMediaAttachmentHost was null for this view.");
            return;
        }
        baea baeaVar = ((ConversationRichCardView) cwpdVar).g;
        elha elhaVar = elha.RICH_CARD_MEDIA;
        List list = baeaVar.g;
        MessagePartCoreData messagePartCoreData = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it.next();
                if (messagePartCoreData2.K() == elhaVar && messagePartCoreData2.a() == 0) {
                    messagePartCoreData = messagePartCoreData2;
                    break;
                }
            }
        }
        if (messagePartCoreData == null) {
            a.n("Requested download of media but there is no associated media message part data");
            return;
        }
        ((bxoz) this.c.b()).a(messagePartCoreData, this);
        this.f = 3;
        this.g.c();
    }

    protected final boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.e != null) {
            throw null;
        }
        cqaz.c("The current media uri string was requested from the rich card but the RichCardMediaAttachmentHost was null.");
        return false;
    }

    @Override // defpackage.cwpg
    public final int m() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.round(Math.max(getResources().getDimension(R.dimen.rich_card_min_height), View.MeasureSpec.getSize(i2))), 1073741824));
    }

    public RichCardMediaAttachmentView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.i = 3622735;
        this.f = 1;
        this.d = -1;
        n();
    }

    @Override // defpackage.bxqj
    public final void d(String str) {
    }
}
