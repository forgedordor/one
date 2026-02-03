package defpackage;

import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepq extends Property {
    public eepq(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = eepr.a;
        return Float.valueOf(((eepr) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        List list;
        eepr eeprVar = (eepr) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        eeprVar.g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = eeprVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            eepf eepfVar = (eepf) list.get(i);
            int[] iArr = eepr.b;
            int i3 = i + i;
            int i4 = iArr[i3];
            int[] iArr2 = eepr.a;
            float f2 = eepr.f(i2, i4, iArr2[i3]);
            Interpolator[] interpolatorArr = eeprVar.c;
            eepfVar.a = kzz.a(interpolatorArr[i3].getInterpolation(f2), 0.0f, 1.0f);
            int i5 = i3 + 1;
            eepfVar.b = kzz.a(interpolatorArr[i5].getInterpolation(eepr.f(i2, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            i++;
        }
        if (eeprVar.f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((eepf) it.next()).c = eeprVar.d.e[eeprVar.e];
            }
            eeprVar.f = false;
        }
        eeprVar.j.invalidateSelf();
    }
}
