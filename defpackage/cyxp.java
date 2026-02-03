package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cyxp extends SelectableContentItemView {
    private boolean a;

    public cyxp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        a();
    }

    @Override // defpackage.czer
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((cyxo) bb()).G((ExpressiveStickerContentItemView) this);
    }
}
