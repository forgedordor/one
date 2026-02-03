package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.CenterFitVideoView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czly {
    public cyqr a;
    public boolean b;
    public CenterFitVideoView c;
    public ZoomableImageView d;
    public long e;
    public final czln g;
    public final fcsu h;
    public czlw i;
    public final Point f = new Point();
    private final Runnable j = new czlx(this);

    public czly(czln czlnVar, fcsu fcsuVar) {
        this.g = czlnVar;
        this.h = fcsuVar;
    }

    static czln h(Uri uri, String str, int i) {
        czln czlnVarF = czln.f();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        bundle.putString("content_type", str);
        bundle.putInt("starting_view_state", i - 1);
        czlnVarF.at(bundle);
        return czlnVarF;
    }

    public final Rect a() {
        if (!g()) {
            return new Rect();
        }
        d();
        this.d.c();
        return this.d.a();
    }

    public final void b() {
        this.e = -1L;
        CenterFitVideoView centerFitVideoView = this.c;
        if (centerFitVideoView != null) {
            centerFitVideoView.removeCallbacks(this.j);
        }
    }

    public final void c() {
        if (this.c.isPlaying()) {
            this.c.postDelayed(this.j, 250L);
        }
    }

    public final void d() {
        czln czlnVar = this.g;
        if (czlnVar == null) {
            return;
        }
        Resources resourcesB = czlnVar.B();
        int dimension = (int) resourcesB.getDimension(R.dimen.media_viewer_edit_horizontal_padding);
        int dimension2 = (int) resourcesB.getDimension(R.dimen.media_viewer_edit_vertical_padding);
        int dimension3 = (int) resourcesB.getDimension(R.dimen.media_viewer_edit_corner_radius);
        this.d.e(dimension, dimension2, dimension, dimension2);
        this.d.d(dimension3);
    }

    public final void e() {
        czlw czlwVar;
        long currentPosition = this.c.getCurrentPosition() / 1000;
        if (this.e == currentPosition || (czlwVar = this.i) == null) {
            return;
        }
        this.e = currentPosition;
        Context contextZ = this.g.z();
        ((czmx) czlwVar).B.setText(String.format("%s/%s", cqbj.a(contextZ, this.c.getCurrentPosition()), cqbj.a(contextZ, this.c.getDuration())));
    }

    public final void f() {
        Point point = this.f;
        CenterFitVideoView centerFitVideoView = this.c;
        int i = point.x;
        int i2 = point.y;
        ViewGroup viewGroup = (ViewGroup) centerFitVideoView.getParent();
        float f = i;
        float f2 = i2;
        float fMin = Math.min(viewGroup.getWidth() / f, viewGroup.getHeight() / f2);
        float f3 = f * fMin;
        float f4 = f2 * fMin;
        ViewGroup.LayoutParams layoutParams = centerFitVideoView.getLayoutParams();
        layoutParams.width = (int) f3;
        layoutParams.height = (int) f4;
        centerFitVideoView.setLayoutParams(layoutParams);
    }

    public final boolean g() {
        return this.g != null && this.d.getVisibility() == 0;
    }
}
