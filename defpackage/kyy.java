package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyy {
    private static final ThreadLocal c = new ThreadLocal();
    public static final WeakHashMap a = new WeakHashMap(0);
    public static final Object b = new Object();

    public static float a(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return resources.getFloat(i);
        }
        TypedValue typedValueC = c();
        resources.getValue(i, typedValueC, true);
        if (typedValueC.type == 4) {
            return typedValueC.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueC.type) + " is not valid");
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i, new TypedValue(), 0, null, false, false);
    }

    public static TypedValue c() {
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void d(Context context, int i, kyw kywVar) {
        if (context.isRestricted()) {
            kywVar.c(-4);
        } else {
            e(context, i, new TypedValue(), 0, kywVar, false, false);
        }
    }

    public static Typeface e(Context context, int i, TypedValue typedValue, int i2, kyw kywVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceF = f(context, resources, typedValue, i, i2, kywVar, z, z2);
        if (typefaceF != null || kywVar != null || z2) {
            return typefaceF;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a A[Catch: IOException -> 0x0262, XmlPullParserException -> 0x0265, TryCatch #6 {IOException -> 0x0262, XmlPullParserException -> 0x0265, blocks: (B:30:0x0083, B:34:0x00b1, B:36:0x00b8, B:37:0x00bc, B:39:0x00c2, B:41:0x00cc, B:84:0x019a, B:86:0x01a1, B:88:0x01a6, B:90:0x01ac, B:92:0x01b2, B:95:0x01b9, B:97:0x01c6, B:102:0x01d2, B:105:0x01d8, B:112:0x01e4, B:114:0x01e8, B:116:0x01f6, B:118:0x0215, B:125:0x0235, B:117:0x0208, B:119:0x021d, B:122:0x022b, B:123:0x022f, B:42:0x00dc, B:43:0x00e1, B:45:0x00e8, B:47:0x00ef, B:49:0x00fb, B:52:0x010f, B:56:0x011f, B:60:0x012b, B:63:0x0134, B:67:0x013d, B:71:0x0150, B:72:0x015b, B:74:0x0162, B:75:0x0166, B:76:0x0172, B:77:0x0179, B:80:0x0180, B:81:0x018f, B:131:0x0245), top: B:162:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6 A[Catch: IOException -> 0x0262, XmlPullParserException -> 0x0265, TryCatch #6 {IOException -> 0x0262, XmlPullParserException -> 0x0265, blocks: (B:30:0x0083, B:34:0x00b1, B:36:0x00b8, B:37:0x00bc, B:39:0x00c2, B:41:0x00cc, B:84:0x019a, B:86:0x01a1, B:88:0x01a6, B:90:0x01ac, B:92:0x01b2, B:95:0x01b9, B:97:0x01c6, B:102:0x01d2, B:105:0x01d8, B:112:0x01e4, B:114:0x01e8, B:116:0x01f6, B:118:0x0215, B:125:0x0235, B:117:0x0208, B:119:0x021d, B:122:0x022b, B:123:0x022f, B:42:0x00dc, B:43:0x00e1, B:45:0x00e8, B:47:0x00ef, B:49:0x00fb, B:52:0x010f, B:56:0x011f, B:60:0x012b, B:63:0x0134, B:67:0x013d, B:71:0x0150, B:72:0x015b, B:74:0x0162, B:75:0x0166, B:76:0x0172, B:77:0x0179, B:80:0x0180, B:81:0x018f, B:131:0x0245), top: B:162:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface f(android.content.Context r33, android.content.res.Resources r34, android.util.TypedValue r35, int r36, int r37, defpackage.kyw r38, boolean r39, boolean r40) throws org.xmlpull.v1.XmlPullParserException, java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyy.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, kyw, boolean, boolean):android.graphics.Typeface");
    }
}
