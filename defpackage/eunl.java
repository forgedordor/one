package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunl implements PopupWindow.OnDismissListener {
    private final TextView a;
    private final ViewTreeObserver b;
    private final eunm c;
    private final euni d;
    private final euni e;

    public eunl(TextView textView, eunm eunmVar, euni euniVar, euni euniVar2) {
        this.a = textView;
        ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        this.b = viewTreeObserver;
        this.c = eunmVar;
        viewTreeObserver.addOnPreDrawListener(eunmVar);
        viewTreeObserver.addOnWindowFocusChangeListener(eunmVar);
        viewTreeObserver.addOnGlobalFocusChangeListener(eunmVar);
        viewTreeObserver.addOnWindowAttachListener(eunmVar);
        this.d = euniVar;
        this.e = euniVar2;
        textView.setCustomSelectionActionModeCallback(euniVar);
        textView.setCustomInsertionActionModeCallback(euniVar2);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        TextView textView = this.a;
        eunn.d(textView);
        ViewTreeObserver viewTreeObserver = this.b;
        eunm eunmVar = this.c;
        viewTreeObserver.removeOnPreDrawListener(eunmVar);
        viewTreeObserver.removeOnWindowFocusChangeListener(eunmVar);
        viewTreeObserver.removeOnGlobalFocusChangeListener(eunmVar);
        viewTreeObserver.removeOnWindowAttachListener(eunmVar);
        euni euniVar = this.d;
        if (euniVar == textView.getCustomSelectionActionModeCallback()) {
            textView.setCustomSelectionActionModeCallback(euniVar.a);
        }
        euni euniVar2 = this.e;
        if (euniVar2 == textView.getCustomInsertionActionModeCallback()) {
            textView.setCustomInsertionActionModeCallback(euniVar2.a);
        }
    }
}
