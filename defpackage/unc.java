package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unc extends wv implements ufe {
    public final umu s;
    public final IllustrationViewStub t;
    public boolean u;
    public final TextView v;

    public unc(umu umuVar, View view) {
        super(view);
        this.u = false;
        this.s = umuVar;
        this.t = (IllustrationViewStub) view.findViewById(R.id.reaction);
        this.v = (TextView) view.findViewById(R.id.reaction_count);
    }

    @Override // defpackage.ufe
    public final uer a() {
        return uer.REACTION_BADGE;
    }

    @Override // defpackage.ufe
    public final void b() {
        IllustrationViewStub illustrationViewStub = this.t;
        View view = illustrationViewStub.e;
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(illustrationViewStub.e);
        viewGroup.removeViewInLayout(illustrationViewStub.e);
        ViewGroup.LayoutParams layoutParams = illustrationViewStub.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(illustrationViewStub, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(illustrationViewStub, iIndexOfChild);
        }
        illustrationViewStub.e = null;
        this.u = false;
    }
}
