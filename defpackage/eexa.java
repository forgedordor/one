package defpackage;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexa implements Runnable {
    final /* synthetic */ TextInputLayout a;

    public eexa(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckableImageButton checkableImageButton = this.a.b.d;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }
}
