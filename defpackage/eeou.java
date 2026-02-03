package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeou extends Property {
    public eeou(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = eeov.a;
        return Float.valueOf(((eeov) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = eeov.a;
        ((eeov) obj).g = fFloatValue;
    }
}
