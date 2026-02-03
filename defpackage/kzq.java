package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzq {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long g(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object h(Object[] objArr, int i, kzp kzpVar) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i3 = i & 1;
            boolean z = (i & 2) != 0;
            int iAbs = Math.abs(kzpVar.a(obj2) - (1 != i3 ? 400 : 700));
            int i4 = iAbs + iAbs + (kzpVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i4) {
                i2 = i4;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, kyl kylVar, Resources resources, int i) throws NoSuchFieldException {
        kym kymVar = (kym) h(kylVar.a, i, new kzo());
        if (kymVar == null) {
            return null;
        }
        Typeface typefaceA = kzi.a(context, resources, kymVar.f, kymVar.a, 0, i);
        long jG = g(typefaceA);
        if (jG != 0) {
            this.a.put(Long.valueOf(jG), kylVar);
        }
        return typefaceA;
    }

    public Typeface b(Context context, lbd[] lbdVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (lbdVarArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(m(lbdVarArr, i).a);
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceL = l(context, inputStreamOpenInputStream);
            kzr.b(inputStreamOpenInputStream);
            return typefaceL;
        } catch (IOException unused2) {
            kzr.b(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            kzr.b(inputStream);
            throw th;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileA = kzr.a(context);
        Typeface typefaceCreateFromFile = null;
        if (fileA == null) {
            return null;
        }
        try {
            if (kzr.d(fileA, resources, i)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileA.delete();
            throw th;
        }
        fileA.delete();
        return typefaceCreateFromFile;
    }

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface l(Context context, InputStream inputStream) {
        File fileA = kzr.a(context);
        Typeface typefaceCreateFromFile = null;
        if (fileA == null) {
            return null;
        }
        try {
            if (kzr.c(fileA, inputStream)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileA.delete();
            throw th;
        }
        fileA.delete();
        return typefaceCreateFromFile;
    }

    protected lbd m(lbd[] lbdVarArr, int i) {
        return (lbd) h(lbdVarArr, i, new kzn());
    }
}
