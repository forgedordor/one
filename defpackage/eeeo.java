package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeeo implements lhs {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public eeeo(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.lhs
    public final boolean a(View view) throws Resources.NotFoundException {
        this.b.E(this.a);
        return true;
    }
}
