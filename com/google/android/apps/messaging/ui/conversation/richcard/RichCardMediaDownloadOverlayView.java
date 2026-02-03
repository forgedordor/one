package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cqaz;
import defpackage.cwov;
import defpackage.cwpf;
import defpackage.cwpg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RichCardMediaDownloadOverlayView extends cwov {
    public cwpg a;
    protected final ImageView b;
    private final ProgressBar c;
    private final TextView d;
    private final LinearLayout e;
    private final Drawable f;
    private final Drawable g;

    public RichCardMediaDownloadOverlayView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Drawable drawable = getResources().getDrawable(R.drawable.rich_card_download_progress_background);
        this.f = drawable;
        this.g = getResources().getDrawable(R.drawable.rich_card_download_progress_retry_background);
        inflate(context, R.layout.rich_card_media_download_overlay_view, this);
        this.b = (ImageView) findViewById(R.id.rich_card_media_download_status_icon);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.rich_card_media_download_progress_bar);
        this.c = progressBar;
        this.d = (TextView) findViewById(R.id.rich_card_media_size);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.media_download_container);
        this.e = linearLayout;
        linearLayout.setBackground(drawable);
        progressBar.setMax(100);
        setOnClickListener(new cwpf(this));
    }

    private final void e() {
        LinearLayout linearLayout = this.e;
        if (linearLayout.getPaddingStart() == 0 && linearLayout.getPaddingEnd() == 0) {
            return;
        }
        linearLayout.setPaddingRelative(0, linearLayout.getPaddingTop(), 0, linearLayout.getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r11 = this;
            int r0 = r11.d()
            r1 = 8
            r2 = 1
            if (r0 == r2) goto Le2
            int r0 = r11.d()
            r3 = 5
            if (r0 != r3) goto L12
            goto Le2
        L12:
            int r0 = r11.getVisibility()
            r3 = 0
            if (r0 != r1) goto L1c
            r11.setVisibility(r3)
        L1c:
            r11.setVisibility(r3)
            android.widget.TextView r0 = r11.d
            r0.setVisibility(r1)
            int r4 = r11.d()
            int r5 = r4 + (-1)
            r6 = 0
            if (r4 == 0) goto Le1
            java.lang.String r4 = ""
            r7 = 2
            r8 = 4
            r9 = 3
            if (r5 == 0) goto L81
            if (r5 == r2) goto L63
            if (r5 == r7) goto L50
            if (r5 == r9) goto L3d
            if (r5 == r8) goto L81
            goto L84
        L3d:
            android.widget.ImageView r0 = r11.b
            r1 = 2131232208(0x7f0805d0, float:1.8080519E38)
            r0.setImageResource(r1)
            android.widget.LinearLayout r0 = r11.e
            android.graphics.drawable.Drawable r1 = r11.g
            r0.setBackground(r1)
            r11.e()
            goto L84
        L50:
            android.widget.ImageView r0 = r11.b
            r1 = 2131231766(0x7f080416, float:1.8079622E38)
            r0.setImageResource(r1)
            android.widget.LinearLayout r0 = r11.e
            android.graphics.drawable.Drawable r1 = r11.f
            r0.setBackground(r1)
            r11.e()
            goto L84
        L63:
            android.widget.ImageView r5 = r11.b
            r10 = 2131232252(0x7f0805fc, float:1.8080608E38)
            r5.setImageResource(r10)
            android.widget.LinearLayout r5 = r11.e
            android.graphics.drawable.Drawable r10 = r11.f
            r5.setBackground(r10)
            cwpg r5 = r11.a
            r5.i()
            r0.setText(r4)
            r0.setVisibility(r1)
            r11.e()
            goto L84
        L81:
            r11.setVisibility(r1)
        L84:
            int r0 = r11.d()
            int r1 = r0 + (-1)
            if (r0 == 0) goto Le0
            if (r1 == 0) goto Lb5
            if (r1 == r2) goto La6
            if (r1 == r7) goto L97
            if (r1 == r9) goto La6
            if (r1 == r8) goto Lb5
            goto Lb8
        L97:
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2132087866(0x7f15143a, float:1.9816E38)
            java.lang.String r0 = r0.getString(r1)
            r11.setContentDescription(r0)
            goto Lb8
        La6:
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2132085560(0x7f150b38, float:1.9811322E38)
            java.lang.String r0 = r0.getString(r1)
            r11.setContentDescription(r0)
            goto Lb8
        Lb5:
            r11.setContentDescription(r4)
        Lb8:
            int r0 = r11.d()
            if (r0 == r9) goto Lc4
            android.widget.ProgressBar r0 = r11.c
            r0.setVisibility(r8)
            return
        Lc4:
            cwpg r0 = r11.a
            int r0 = r0.h()
            if (r0 >= 0) goto Ld2
            android.widget.ProgressBar r0 = r11.c
            r0.setIndeterminate(r2)
            goto Lda
        Ld2:
            android.widget.ProgressBar r1 = r11.c
            r1.setIndeterminate(r3)
            defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r1, r0, r2)
        Lda:
            android.widget.ProgressBar r0 = r11.c
            r0.setVisibility(r3)
            return
        Le0:
            throw r6
        Le1:
            throw r6
        Le2:
            r11.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaDownloadOverlayView.c():void");
    }

    public final int d() {
        cwpg cwpgVar = this.a;
        if (cwpgVar != null) {
            return cwpgVar.m();
        }
        cqaz.c("A download status was requested but the RichCardMediaTransferHost has not been set for this view.");
        return 5;
    }
}
