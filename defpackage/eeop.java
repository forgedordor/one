package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeop extends Property {
    public eeop(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = eeoq.a;
        return Float.valueOf(((eeoq) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = eeoq.a;
        ((eeoq) obj).h = fFloatValue;
    }
}
