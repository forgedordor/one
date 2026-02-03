package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czjy extends wv implements View.OnAttachStateChangeListener {
    private final int A;
    private RecyclerView B;
    private final wg C;
    public final View s;
    public final TextView t;
    public final int u;
    public final int v;
    public int w;
    public final int x;
    public final int y;
    private final int z;

    public czjy(View view) {
        super(view);
        this.C = new czjx(this);
        this.s = view;
        view.setClipToOutline(true);
        this.t = (TextView) view.findViewById(R.id.label);
        int iD = eehg.d(view.getContext(), R.attr.colorOnSurfaceInverseLight, "ModeViewHolder");
        this.u = iD;
        this.v = eehg.d(view.getContext(), R.attr.colorOnBackgroundLight, "ModeViewHolder");
        this.z = view.getContext().getColor(R.color.camera_ui_shadow_color);
        this.A = view.getContext().getColor(R.color.camera_ui_shadow_gone_color);
        this.x = eehg.d(view.getContext(), R.attr.colorBackgroundLight, "ModeViewHolder");
        this.y = eehg.d(view.getContext(), R.attr.colorSurfaceInverseLight, "ModeViewHolder");
        this.w = iD;
    }

    public final void C(int i) {
        ((GradientDrawable) ((LayerDrawable) this.s.getBackground()).getDrawable(0)).setColor(i);
    }

    public final void D(float f) {
        TextView textView = this.t;
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), kzb.e(this.z, this.A, f));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.s;
        if (view2.getParent() != null) {
            RecyclerView recyclerView = (RecyclerView) view2.getParent();
            this.B = recyclerView;
            recyclerView.y(this.C);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView = this.B;
        if (recyclerView != null) {
            recyclerView.ah(this.C);
        }
    }
}
