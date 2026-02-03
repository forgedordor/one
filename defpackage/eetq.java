package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eetq {
    public int a;
    public boolean b;
    final /* synthetic */ SideSheetBehavior c;
    private final Runnable d = new Runnable() { // from class: eetp
        @Override // java.lang.Runnable
        public final void run() {
            eetq eetqVar = this.a;
            eetqVar.b = false;
            SideSheetBehavior sideSheetBehavior = eetqVar.c;
            ljn ljnVar = sideSheetBehavior.d;
            if (ljnVar != null && ljnVar.l()) {
                eetqVar.a(eetqVar.a);
            } else if (sideSheetBehavior.c == 2) {
                sideSheetBehavior.w(eetqVar.a);
            }
        }
    };

    public eetq(SideSheetBehavior sideSheetBehavior) {
        this.c = sideSheetBehavior;
    }

    public final void a(int i) {
        SideSheetBehavior sideSheetBehavior = this.c;
        WeakReference weakReference = sideSheetBehavior.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) sideSheetBehavior.j.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
