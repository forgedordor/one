package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeev implements View.OnClickListener {
    final /* synthetic */ eefa a;

    public eeev(eefa eefaVar) {
        this.a = eefaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eefa eefaVar = this.a;
        if (eefaVar.e && eefaVar.isShowing()) {
            if (!eefaVar.g) {
                TypedArray typedArrayObtainStyledAttributes = eefaVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                eefaVar.f = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                eefaVar.g = true;
            }
            if (eefaVar.f) {
                eefaVar.cancel();
            }
        }
    }
}
