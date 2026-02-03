package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oeu {
    public static float a(ekgb ekgbVar, mau mauVar) {
        int i = mauVar.A % 180;
        int i2 = i == 0 ? mauVar.v : mauVar.w;
        int i3 = i == 0 ? mauVar.w : mauVar.v;
        float f = 0.0f;
        for (int i4 = 0; i4 < ekgbVar.size(); i4++) {
            map mapVar = (map) ekgbVar.get(i4);
            if (!(mapVar instanceof mme)) {
                return -1.0f;
            }
            mme mmeVar = (mme) mapVar;
            if (mapVar instanceof mnq) {
                mnq mnqVar = (mnq) mapVar;
                float f2 = mnqVar.a;
                float f3 = mnqVar.b;
                float f4 = mnqVar.c;
                if (f4 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f += f4;
                float f5 = f % 180.0f;
                i2 = f5 == 0.0f ? mauVar.v : mauVar.w;
                i3 = f5 == 0.0f ? mauVar.w : mauVar.v;
            } else if (!mmeVar.c(i2, i3)) {
                return -1.0f;
            }
        }
        float f6 = f % 360.0f;
        if (f6 % 90.0f == 0.0f) {
            return f6;
        }
        return -1.0f;
    }

    public static int b(String str) {
        int iB = mbw.b(str);
        if (iB == 4) {
            return 2;
        }
        return iB;
    }

    public static mag c(mag magVar, boolean z) {
        return (z && mag.i(magVar)) ? mag.a : magVar;
    }

    public static mag d(mag magVar) {
        return (magVar == null || !magVar.g()) ? mag.a : magVar;
    }

    public static String e(Context context, mbo mboVar) {
        mbl mblVar = mboVar.b;
        if (mblVar == null) {
            return null;
        }
        String str = mblVar.b;
        if (str == null) {
            Uri uri = mblVar.a;
            if (Objects.equals(uri.getScheme(), "content")) {
                return context.getContentResolver().getType(uri);
            }
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            int iLastIndexOf = path.lastIndexOf(".");
            if (iLastIndexOf >= 0) {
                if (iLastIndexOf < path.length() - 1) {
                    switch (ejuf.c(path.substring(iLastIndexOf + 1))) {
                        case "bmp":
                        case "dib":
                            return "image/bmp";
                        case "heif":
                            return "image/heif";
                        case "heic":
                            return "image/heic";
                        case "jpg":
                        case "jpeg":
                        case "jpe":
                        case "jif":
                        case "jfif":
                        case "jfi":
                            return "image/jpeg";
                        case "png":
                            return "image/png";
                        case "webp":
                            return "image/webp";
                        case "gif":
                            return "image/gif";
                        case "tiff":
                        case "tif":
                            return "image/tiff";
                        case "raw":
                        case "arw":
                        case "cr2":
                        case "k25":
                            return "image/raw";
                        case "svg":
                        case "svgz":
                            return "image/svg+xml";
                        case "ico":
                            return "image/x-icon";
                        case "avif":
                            return "image/avif";
                        default:
                            return null;
                    }
                }
            }
        }
        return str;
    }

    public static boolean f(Context context, mbo mboVar) {
        String strE = e(context, mboVar);
        return strE != null && mbw.j(strE);
    }
}
