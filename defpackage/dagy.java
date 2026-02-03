package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dagy extends wv {
    public lvv s;
    public final lvz t;
    public final View u;
    public final ImageView v;
    public final cpdw w;
    public final cpdw x;
    public final VideoOverlayView y;

    public dagy(View view) {
        super(view);
        this.u = view;
        this.v = (ImageView) view.findViewById(R.id.zero_state_search_thumbnail);
        this.w = new cpdw(view, R.id.zero_state_search_video_star_icon, R.id.zero_state_search_video_star_icon);
        cpdw cpdwVar = new cpdw(view, R.id.zero_state_search_video_play_icon, R.id.zero_state_search_video_play_icon);
        this.x = cpdwVar;
        VideoOverlayView videoOverlayView = (VideoOverlayView) view.findViewById(R.id.search_video_overlay);
        this.y = videoOverlayView;
        if (videoOverlayView.a != 2) {
            cqaz.d(2, 0, 2);
            videoOverlayView.a = 2;
            videoOverlayView.requestLayout();
        }
        cpdwVar.b();
        this.t = new lvz() { // from class: dagx
            @Override // defpackage.lvz
            public final void a(Object obj) {
                Long l = (Long) obj;
                this.a.y.e(l != null ? l.longValue() : 0L);
            }
        };
    }
}
