package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyr extends cvjc {
    final /* synthetic */ ZeroStateSearchBox a;

    public czyr(ZeroStateSearchBox zeroStateSearchBox) {
        this.a = zeroStateSearchBox;
    }

    @Override // defpackage.cvjc, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView;
        ViewPropertyAnimator viewPropertyAnimator;
        final ZeroStateSearchBox zeroStateSearchBox = this.a;
        if (zeroStateSearchBox.a != null && (spannedMultiAutoCompleteTextView = zeroStateSearchBox.d) != null) {
            if (TextUtils.isEmpty(spannedMultiAutoCompleteTextView.getText()) || zeroStateSearchBox.a.getVisibility() == 8) {
                if (TextUtils.isEmpty(zeroStateSearchBox.d.getText())) {
                    zeroStateSearchBox.c = true;
                    zeroStateSearchBox.b = zeroStateSearchBox.a.animate();
                    zeroStateSearchBox.b.alpha(0.0f).withEndAction(new Runnable() { // from class: czyh
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZeroStateSearchBox zeroStateSearchBox2 = zeroStateSearchBox;
                            zeroStateSearchBox2.c = false;
                            zeroStateSearchBox2.a.setVisibility(8);
                        }
                    });
                } else {
                    zeroStateSearchBox.a.setVisibility(0);
                    zeroStateSearchBox.a.setAlpha(0.0f);
                    zeroStateSearchBox.b = zeroStateSearchBox.a.animate();
                    zeroStateSearchBox.b.alpha(1.0f);
                }
            } else if (zeroStateSearchBox.c && (viewPropertyAnimator = zeroStateSearchBox.b) != null) {
                viewPropertyAnimator.cancel();
                zeroStateSearchBox.a.setAlpha(1.0f);
            }
        }
        if (zeroStateSearchBox.e == null) {
            return;
        }
        Editable editableText = zeroStateSearchBox.d.getEditableText();
        int length = editableText.length();
        String string = editableText.subSequence(zeroStateSearchBox.d.d.findTokenStart(editableText, length), length).toString();
        zeroStateSearchBox.e.t(string);
        zeroStateSearchBox.n = !zeroStateSearchBox.n && i3 < i2 && TextUtils.isEmpty(string);
    }
}
