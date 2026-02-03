package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgc extends lgh {
    private static Field a = null;
    private static boolean c = false;
    private static Constructor d = null;
    private static boolean e = false;
    private WindowInsets f;
    private kzc g;

    public lgc() {
        this.f = i();
    }

    private static WindowInsets i() {
        if (!c) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            c = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!e) {
            try {
                d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            e = true;
        }
        Constructor constructor = d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.lgh
    public lgt a() {
        h();
        lgt lgtVarO = lgt.o(this.f);
        lgtVarO.r(this.b);
        lgtVarO.b.s(this.g);
        return lgtVarO;
    }

    @Override // defpackage.lgh
    public void b(kzc kzcVar) {
        this.g = kzcVar;
    }

    @Override // defpackage.lgh
    public void c(kzc kzcVar) {
        WindowInsets windowInsets = this.f;
        if (windowInsets != null) {
            this.f = windowInsets.replaceSystemWindowInsets(kzcVar.b, kzcVar.c, kzcVar.d, kzcVar.e);
        }
    }

    public lgc(lgt lgtVar) {
        super(lgtVar);
        this.f = lgtVar.e();
    }
}
