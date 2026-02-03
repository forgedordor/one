package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dafz extends eefb {
    public boolean ao = false;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View viewInflate = layoutInflater.inflate(aX(), viewGroup, false);
        Dialog dialog = this.d;
        dialog.getClass();
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dafw
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View viewFindViewById = ((eefa) dialogInterface).findViewById(R.id.design_bottom_sheet);
                viewFindViewById.getClass();
                Context context = viewFindViewById.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.zero_state_search_location_dialog_height) + dakl.a(context);
                viewFindViewById.getLayoutParams().height = dimensionPixelSize;
                BottomSheetBehavior.v(viewFindViewById).D(dimensionPixelSize);
                viewFindViewById.requestLayout();
                final dafz dafzVar = this.a;
                dafzVar.aY().i().f(dafzVar, new lvz() { // from class: dafx
                    @Override // defpackage.lvz
                    public final void a(Object obj) {
                        dafz dafzVar2 = dafzVar;
                        if (dafzVar2.ao || !dafzVar2.bd()) {
                            return;
                        }
                        dafzVar2.ao = true;
                        dafzVar2.aY().g().l(dafzVar2);
                        dafzVar2.aY().i().l(dafzVar2);
                    }
                });
                dafzVar.aY().g().f(dafzVar, new lvz() { // from class: dafy
                    @Override // defpackage.lvz
                    public final void a(Object obj) {
                        dafz dafzVar2 = dafzVar;
                        if (dafzVar2.ao || !dafzVar2.bd()) {
                            return;
                        }
                        dafzVar2.ao = true;
                        dafzVar2.aY().g().l(dafzVar2);
                        dafzVar2.aY().i().l(dafzVar2);
                    }
                });
                dafzVar.aZ(viewInflate);
            }
        });
        return viewInflate;
    }

    public abstract int aX();

    public abstract dacu aY();

    public abstract void aZ(View view);

    public abstract boolean bd();

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        aY().u(null);
    }
}
