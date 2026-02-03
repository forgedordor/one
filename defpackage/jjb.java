package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjb {
    public static final jjb a = new jjb();

    private jjb() {
    }

    public static final PointerIcon b(Context context, isa isaVar) {
        if (!(isaVar instanceof irb)) {
            return isaVar instanceof irc ? PointerIcon.getSystemIcon(context, ((irc) isaVar).a) : PointerIcon.getSystemIcon(context, 1000);
        }
        throw null;
    }

    public final void a(View view, isa isaVar) {
        PointerIcon pointerIconB = b(view.getContext(), isaVar);
        if (fdbq.f(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }
}
