package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekx extends lcl {
    final /* synthetic */ CheckableImageButton a;

    public eekx(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.lcl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        CheckableImageButton checkableImageButton = this.a;
        lhgVar.q(checkableImageButton.b);
        lhgVar.r(checkableImageButton.a);
    }
}
