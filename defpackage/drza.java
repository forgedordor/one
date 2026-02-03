package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class drza extends RecyclerView {
    public drza(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void Y(int i) {
        if (i == 1) {
            drzb.a(this, true);
        } else if (i != 2) {
            drzb.a(this, false);
        }
    }

    public drza(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public drza(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
