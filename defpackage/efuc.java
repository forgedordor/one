package defpackage;

import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuc implements efsy {
    public final TemplateLayout a;
    boolean b = false;
    public int c = 0;

    public efuc(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    private final Button c() {
        Button button = (Button) this.a.g(R.id.sud_floating_back_button);
        if (button == null) {
            Log.w("FloatingBackButtonMixin", "Can't find the back button.");
        }
        return button;
    }

    public final Button a() {
        Button buttonC = c();
        if (buttonC != null) {
            return buttonC;
        }
        if (!this.b) {
            this.b = true;
            TemplateLayout templateLayout = this.a;
            ViewStub viewStub = (ViewStub) templateLayout.g(R.id.sud_floating_back_button_stub);
            if (viewStub != null) {
                try {
                    viewStub.setLayoutInflater(LayoutInflater.from(templateLayout.getContext()));
                    viewStub.inflate();
                } catch (InflateException e) {
                    Log.w("FloatingBackButtonMixin", "Incorrect theme:".concat(String.valueOf(e.toString())));
                    return null;
                }
            }
        }
        return c();
    }

    public final FrameLayout b() {
        return (FrameLayout) this.a.g(R.id.sud_layout_floating_back_button_container);
    }
}
