package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeot extends Property {
    public eeot(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = eeov.a;
        return Float.valueOf(((eeov) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        eeov eeovVar = (eeov) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        eeovVar.f = fFloatValue;
        float f = fFloatValue * 6000.0f;
        List list = eeovVar.k;
        eepf eepfVar = (eepf) list.get(0);
        float f2 = eeovVar.f * 1080.0f;
        int[] iArr = eeov.a;
        int length = iArr.length;
        int i2 = 0;
        float interpolation = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            interpolation += eeovVar.c.getInterpolation(eeov.f(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        eepfVar.g = f2 + interpolation;
        TimeInterpolator timeInterpolator = eeovVar.c;
        float interpolation2 = timeInterpolator.getInterpolation(eeov.f(i, 0, 3000)) - timeInterpolator.getInterpolation(eeov.f(i, 3000, 3000));
        eepfVar.a = 0.0f;
        float[] fArr = eeov.b;
        float fA = eemr.a(fArr[0], fArr[1], interpolation2);
        eepfVar.b = fA;
        float f3 = eeovVar.g;
        if (f3 > 0.0f) {
            eepfVar.b = fA * (1.0f - f3);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float f4 = eeov.f(i, iArr[i3], 100);
            if (f4 >= 0.0f && f4 <= 1.0f) {
                int i4 = i3 + eeovVar.e;
                int[] iArr2 = eeovVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((eepf) list.get(0)).c = eecf.a(timeInterpolator.getInterpolation(f4), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        eeovVar.j.invalidateSelf();
    }
}
