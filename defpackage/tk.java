package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tk {
    public static final Field a;

    static {
        NoSuchFieldException e;
        Field declaredField;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            try {
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                e = e2;
                e.printStackTrace();
                a = declaredField;
            }
        } catch (NoSuchFieldException e3) {
            e = e3;
            declaredField = null;
        }
        a = declaredField;
    }
}
