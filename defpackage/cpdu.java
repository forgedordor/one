package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cpdu {
    public static final /* synthetic */ int a = 0;
    private static Typeface b;
    private static Typeface c;
    private static Typeface d;
    private static Typeface e;
    private static Typeface f;
    private static final eksp g = eksp.c("Bugle");

    @Deprecated
    public static synchronized Typeface a(Context context) {
        if (((Boolean) ccze.ab.e()).booleanValue()) {
            return Typeface.create("sans-serif", 0);
        }
        try {
            if (d == null) {
                d = kyy.b(context, R.font.google_sans);
            }
            return d;
        } catch (Exception unused) {
            return c();
        }
    }

    @Deprecated
    public static synchronized Typeface b() {
        if (b == null) {
            b = Typeface.create(Typeface.SANS_SERIF, 1);
        }
        return b;
    }

    @Deprecated
    public static synchronized Typeface c() {
        if (c == null) {
            c = Typeface.create(Typeface.SANS_SERIF, 0);
        }
        return c;
    }

    public static synchronized Typeface d(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.themeFontFamilyContent, typedValue, true);
        try {
            if (e == null) {
                e = Typeface.create(kyy.b(context, typedValue.resourceId), 1);
            }
        } catch (Exception unused) {
            eksl ekslVar = (eksl) g.j();
            ekslVar.W();
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/ui/util/Typefaces", "getThemeFontContentBold", 111, "Typefaces.java")).q("ThemeFontContentBold could not be created. Fallback to Roboto bold.");
            return b();
        }
        return e;
    }

    public static synchronized Typeface e(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.themeFontFamilyContent, typedValue, true);
        try {
            if (f == null) {
                f = Typeface.create(kyy.b(context, typedValue.resourceId), 0);
            }
        } catch (Exception unused) {
            eksl ekslVar = (eksl) g.j();
            ekslVar.W();
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/ui/util/Typefaces", "getThemeFontContentNormal", 129, "Typefaces.java")).q("ThemeFontContentNormal could not be created. Fallback to Roboto normal.");
            return c();
        }
        return f;
    }
}
