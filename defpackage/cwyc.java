package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwyc implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
        View viewFindViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(viewFindViewById);
        bottomSheetBehaviorV.E(3);
        bottomSheetBehaviorV.C(false);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(viewFindViewById.getContext().getDrawable(R.drawable.fasttrack_bottom_sheet_background));
        }
    }
}
