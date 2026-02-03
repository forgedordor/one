package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cpbd extends cpbc {
    public RoundedImageView a;
    protected boolean b;
    protected int c;

    public cpbd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ehqu ehquVarP = ehqs.c(this).c().p(rqi.b());
        if (cqbe.j()) {
            ehquVarP.V(rrb.b, true);
        }
        int i = this.c;
        if (i >= 0) {
            this.a.v = i;
        }
        if (this.b) {
            this.a.getLayoutParams().width = -1;
            this.a.getLayoutParams().height = -1;
            this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.setOnLongClickListener(onLongClickListener);
    }
}
