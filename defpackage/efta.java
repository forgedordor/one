package defpackage;

import android.content.Context;
import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efta implements efsy {
    public final TemplateLayout a;
    public final Window b;
    public final boolean c;
    final boolean d;
    public int e = 0;

    public efta(TemplateLayout templateLayout, Window window) {
        this.a = templateLayout;
        this.b = window;
        efrl efrlVar = (efrl) templateLayout;
        this.c = efrlVar.e();
        this.d = efrlVar.f();
    }

    public final void a(int i) {
        Window window = this.b;
        if (window != null) {
            if (this.c && !this.d) {
                Context context = this.a.getContext();
                i = efsj.h(context).c(context, efsh.CONFIG_NAVIGATION_BAR_BG_COLOR);
            }
            window.setNavigationBarColor(i);
        }
    }
}
