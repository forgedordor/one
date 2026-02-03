package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepm extends Property {
    public eepm(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = eepn.f;
        return Float.valueOf(((eepn) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        eepn eepnVar = (eepn) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        eepnVar.e = fFloatValue;
        List list = eepnVar.k;
        ((eepf) list.get(0)).a = 0.0f;
        eepf eepfVar = (eepf) list.get(0);
        eepf eepfVar2 = (eepf) list.get(1);
        lud ludVar = eepnVar.a;
        float f = eepn.f((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = ludVar.getInterpolation(f);
        eepfVar2.a = interpolation;
        eepfVar.b = interpolation;
        eepf eepfVar3 = (eepf) list.get(1);
        eepf eepfVar4 = (eepf) list.get(2);
        float interpolation2 = ludVar.getInterpolation(f + 0.49925038f);
        eepfVar4.a = interpolation2;
        eepfVar3.b = interpolation2;
        ((eepf) list.get(2)).b = 1.0f;
        if (eepnVar.d && ((eepf) list.get(1)).b < 1.0f) {
            ((eepf) list.get(2)).c = ((eepf) list.get(1)).c;
            ((eepf) list.get(1)).c = ((eepf) list.get(0)).c;
            ((eepf) list.get(0)).c = eepnVar.b.e[eepnVar.c];
            eepnVar.d = false;
        }
        eepnVar.j.invalidateSelf();
    }
}
