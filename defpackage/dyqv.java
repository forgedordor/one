package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyqv {
    public static dyqv e(Context context) {
        return f(context, ejud.a);
    }

    public static dyqv f(Context context, ejwi ejwiVar) {
        boolean zG = g(context);
        ekgp ekgpVarH = h(context, ejwiVar);
        ekgi ekgiVar = new ekgi();
        for (dyqt dyqtVar : dyqt.values()) {
            ekgiVar.i(dyqtVar, Integer.valueOf(context.getColor(zG ? dyqtVar.e : dyqtVar.f)));
        }
        return new dypx(zG, ekgpVarH, ekgiVar.c());
    }

    public static boolean g(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    /* JADX WARN: Finally extract failed */
    private static ekgp h(Context context, ejwi ejwiVar) {
        dyqu[] dyquVarArrValues = dyqu.values();
        int length = dyquVarArrValues.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = dyquVarArrValues[i].g;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(dyqu.class);
        for (int i2 = 0; i2 < dyquVarArrValues.length; i2++) {
            try {
                try {
                    dyqu dyquVar = dyquVarArrValues[i2];
                    enumMap.put((EnumMap) dyquVar, (dyqu) Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i2, context.getResources().getColor(dyquVar.h))));
                } catch (UnsupportedOperationException e) {
                    if (!ejwiVar.g()) {
                        throw e;
                    }
                    Object objC = ejwiVar.c();
                    final String packageName = context.getPackageName();
                    final boolean zC = dyqx.c(context);
                    final boolean zF = dypw.f(context);
                    final boolean zG = g(context);
                    final int iMin = Math.min(i2, 3);
                    final boolean zI = i(i2 + 1, typedArrayObtainStyledAttributes, context);
                    final dyws dywsVar = (dyws) objC;
                    ((dyws) objC).a(new Runnable() { // from class: dywr
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ecoe) ((dyxi) dywsVar.a.get()).k.get()).a(packageName, Boolean.valueOf(zC), Boolean.valueOf(zF), Boolean.valueOf(zG), Integer.valueOf(iMin), Boolean.valueOf(zI));
                        }
                    });
                    throw e;
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return ekmi.c(enumMap);
    }

    private static boolean i(int i, TypedArray typedArray, Context context) {
        dyqu[] dyquVarArrValues = dyqu.values();
        if (i == dyquVarArrValues.length) {
            return false;
        }
        try {
            typedArray.getColor(i, context.getResources().getColor(dyquVarArrValues[i].h));
            return false;
        } catch (UnsupportedOperationException unused) {
            return true;
        }
    }

    public abstract ekgp a();

    public abstract ekgp b();

    public abstract boolean c();

    public final int d(dyqt dyqtVar) {
        Integer num = (Integer) b().get(dyqtVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unsupported GoogleColors value");
    }
}
