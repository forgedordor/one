package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aymj;
import defpackage.cqca;
import defpackage.cqmz;
import defpackage.cwow;
import defpackage.cwpj;
import defpackage.cwpl;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RichCardVideoOverlayView extends cwow implements aymj<Long> {
    protected final TextView a;
    public fcsu b;

    public RichCardVideoOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.rich_card_video_overlay_view, this);
        onFinishInflate();
        this.a = (TextView) findViewById(R.id.duration);
        setOnClickListener(new View.OnClickListener() { // from class: cwpi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cqca.i("Bugle", "failed to get duration for this uri");
        e(0L);
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void b(Action action, Object obj) {
        if (this.a != null) {
            cqca.c("BugleRbmRichCard", "ignoring duration because a newer uri is associated with this view, or the view was destroyed");
            e(0L);
        }
    }

    public final void e(long j) {
        TextView textView = this.a;
        textView.setText((CharSequence) null);
        textView.setContentDescription(getContext().getString(R.string.video_attachment_content_description));
        textView.requestLayout();
    }

    /* compiled from: PG */
    public static class GetMediaDurationAction extends Action<Long> {
        public static final Parcelable.Creator<Action<Long>> CREATOR = new cwpj();
        private final Context a;

        /* compiled from: PG */
        public interface a {
            cwpl da();
        }

        public GetMediaDurationAction(Context context, Uri uri) {
            super(elgm.RBM_GET_MEDIA_DURATION_ACTION);
            this.v.v("source_uri", uri.toString());
            this.a = context;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final eieu a() {
            return eiiy.k("GetMediaDurationAction");
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final /* bridge */ /* synthetic */ Object b() {
            return Long.valueOf(cqmz.b(this.a, Uri.parse(this.v.l("source_uri"))));
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final String c() {
            return "Bugle.DataModel.Action.GetMediaDurationAction.ExecuteAction.Latency";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C(parcel, i);
        }

        public GetMediaDurationAction(Context context, Parcel parcel) {
            super(parcel, elgm.RBM_GET_MEDIA_DURATION_ACTION);
            this.a = context;
        }
    }
}
