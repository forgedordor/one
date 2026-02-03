package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.main.MainActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afjc implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ afjl a;
    final /* synthetic */ int b;

    public afjc(afjl afjlVar, int i) {
        this.a = afjlVar;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        afjl afjlVar = this.a;
        MainActivity mainActivity = afjlVar.b;
        if (mainActivity.findViewById(R.id.contact_picker_fragment_container) != null) {
            mainActivity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            afjlVar.t(this.b);
        }
    }
}
