package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeoo extends Property {
    public eeoo(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = eeoq.a;
        return Float.valueOf(((eeoq) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        eeoq eeoqVar = (eeoq) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        eeoqVar.g = fFloatValue;
        float f = fFloatValue * 5400.0f;
        List list = eeoqVar.k;
        eepf eepfVar = (eepf) list.get(0);
        float f2 = eeoqVar.g * 1520.0f;
        eepfVar.a = (-20.0f) + f2;
        eepfVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float f3 = eeoq.f(i, eeoq.a[i2], 667);
            float f4 = eepfVar.b;
            lud ludVar = eeoqVar.d;
            eepfVar.b = f4 + (ludVar.getInterpolation(f3) * 250.0f);
            eepfVar.a += ludVar.getInterpolation(eeoq.f(i, eeoq.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f5 = eepfVar.a;
        float f6 = eepfVar.b;
        float f7 = f5 + ((f6 - f5) * eeoqVar.h);
        eepfVar.a = f7;
        eepfVar.a = f7 / 360.0f;
        eepfVar.b = f6 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float f8 = eeoq.f(i, eeoq.c[i3], 333);
            if (f8 > 0.0f && f8 < 1.0f) {
                int i4 = i3 + eeoqVar.f;
                int[] iArr = eeoqVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((eepf) list.get(0)).c = eecf.a(eeoqVar.d.getInterpolation(f8), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        eeoqVar.j.invalidateSelf();
    }
}
