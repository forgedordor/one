package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxc implements dpxp {
    public final List a;
    public final Integer b;
    private final int c;
    private final boolean d;

    public doxc(List list, Integer num) {
        list.getClass();
        this.a = list;
        this.c = R.drawable.shortcut_icon_shape;
        this.b = num;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doxc)) {
            return false;
        }
        doxc doxcVar = (doxc) obj;
        if (!fdbq.f(this.a, doxcVar.a)) {
            return false;
        }
        int i = doxcVar.c;
        if (!fdbq.f(this.b, doxcVar.b)) {
            return false;
        }
        boolean z = doxcVar.d;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((((iHashCode + R.drawable.shortcut_icon_shape) * 31) + (num == null ? 0 : num.hashCode())) * 31) + 1237;
    }

    public final String toString() {
        String string;
        String string2 = Integer.toString(R.drawable.shortcut_icon_shape, 16);
        string2.getClass();
        Integer num = this.b;
        if (num != null) {
            num.intValue();
            string = Integer.toString(R.drawable.shortcuts_screen_background, 16);
            string.getClass();
        } else {
            string = null;
        }
        return "ShortcutsConfiguration(shortcuts=" + this.a + ", shapeDrawable=0x" + string2 + ", backgroundDrawable=" + string + ", stretchOnExpand=false)";
    }
}
