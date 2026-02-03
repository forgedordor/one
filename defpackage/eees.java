package defpackage;

import android.content.res.Resources;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eees implements Runnable {
    final /* synthetic */ eeet a;

    public eees(eeet eeetVar) {
        this.a = eeetVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        eeet eeetVar = this.a;
        eeetVar.b = false;
        BottomSheetBehavior bottomSheetBehavior = eeetVar.c;
        ljn ljnVar = bottomSheetBehavior.y;
        if (ljnVar != null && ljnVar.l()) {
            eeetVar.a(eeetVar.a);
        } else if (bottomSheetBehavior.x == 2) {
            bottomSheetBehavior.F(eeetVar.a);
        }
    }
}
