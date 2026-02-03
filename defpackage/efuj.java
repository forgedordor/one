package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuj implements efsy {
    public final TemplateLayout a;
    public final boolean b;
    private final boolean c;

    public efuj(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, eftq.p, i, 0);
            z = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
            typedArrayObtainStyledAttributes.recycle();
            ProgressBar progressBarA = a();
            if (progressBarA != null) {
                if (this.c) {
                    progressBarA.setVisibility(8);
                } else {
                    progressBarA.setVisibility(true == this.b ? 4 : 8);
                }
            }
        }
        this.b = z;
        this.c = efsj.r(templateLayout.getContext());
    }

    public final ProgressBar a() {
        if (this.c) {
            return (LinearProgressIndicator) this.a.g(R.id.sud_layout_progress_indicator);
        }
        return (ProgressBar) this.a.g(true != this.b ? R.id.sud_layout_progress : R.id.sud_glif_progress_bar);
    }
}
