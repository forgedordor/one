package defpackage;

import android.os.Bundle;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.NamedVariant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufv {
    public static Bundle a(NamedVariant[] namedVariantArr) {
        if (namedVariantArr == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (NamedVariant namedVariant : namedVariantArr) {
            if (namedVariant != null) {
                switch (namedVariant.b) {
                    case 1:
                        bundle.putInt(namedVariant.a, namedVariant.c);
                        break;
                    case 2:
                        bundle.putLong(namedVariant.a, namedVariant.d);
                        break;
                    case 3:
                        bundle.putFloat(namedVariant.a, namedVariant.e);
                        break;
                    case 4:
                        bundle.putDouble(namedVariant.a, namedVariant.f);
                        break;
                    case 5:
                        bundle.putBoolean(namedVariant.a, namedVariant.g);
                        break;
                    case 6:
                        bundle.putString(namedVariant.a, namedVariant.h);
                        break;
                    case 7:
                        bundle.putStringArray(namedVariant.a, namedVariant.i);
                        break;
                    case 8:
                        bundle.putFloatArray(namedVariant.a, namedVariant.j);
                        break;
                    case 9:
                        bundle.putIntArray(namedVariant.a, namedVariant.k);
                        break;
                    default:
                        bundle.putBundle(namedVariant.a, a(namedVariant.l));
                        break;
                }
            }
        }
        return bundle;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final defpackage.ekgb b(com.google.knowledge.cerebra.sense.textclassifier.lib3.RemoteActionTemplate[] r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eufv.b(com.google.knowledge.cerebra.sense.textclassifier.lib3.RemoteActionTemplate[]):ekgb");
    }
}
