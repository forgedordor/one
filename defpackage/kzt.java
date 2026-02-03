package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzt {
    public static int a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getResId();
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public static int b(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getType();
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e3);
            return -1;
        }
    }

    public static Icon c(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        switch (iconCompat.b) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.j(), iconCompat.f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(iconCompat.d());
                    break;
                } else {
                    if (context == null) {
                        Uri uriD = iconCompat.d();
                        Objects.toString(uriD);
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(uriD)));
                    }
                    Uri uriD2 = iconCompat.d();
                    String scheme = uriD2.getScheme();
                    InputStream inputStreamOpenInputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriD2);
                        } catch (Exception e) {
                            Objects.toString(uriD2);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(uriD2)), e);
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.c));
                        } catch (FileNotFoundException e2) {
                            Objects.toString(uriD2);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(uriD2)), e2);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        Uri uriD3 = iconCompat.d();
                        Objects.toString(uriD3);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(uriD3)));
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static Uri d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getUri();
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static IconCompat e(Object obj) {
        lcg.i(obj);
        int iB = b(obj);
        if (iB == 2) {
            return IconCompat.i(null, f(obj), a(obj));
        }
        if (iB == 4) {
            Uri uriD = d(obj);
            lca.a(uriD);
            String string = uriD.toString();
            lca.a(string);
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.c = string;
            return iconCompat;
        }
        if (iB != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.c = obj;
            return iconCompat2;
        }
        Uri uriD2 = d(obj);
        lca.a(uriD2);
        String string2 = uriD2.toString();
        lca.a(string2);
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.c = string2;
        return iconCompat3;
    }

    public static String f(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getResPackage();
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }
}
