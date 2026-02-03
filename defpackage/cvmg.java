package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvmg extends View.AccessibilityDelegate {
    final /* synthetic */ cvmj a;

    public cvmg(cvmj cvmjVar) {
        this.a = cvmjVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 2) {
            accessibilityEvent.getText().clear();
            cvmj cvmjVar = this.a;
            if (true != cvmjVar.u()) {
                return;
            }
            accessibilityEvent.getText().add(cvmjVar.ab.getResources().getText(R.string.send_button_long_click_description_no_sim_selector));
            accessibilityEvent.setEventType(16384);
        }
    }
}
