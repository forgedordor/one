package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepd extends Property {
    public eepd(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((eepe) obj).f());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((eepe) obj).i(((Float) obj2).floatValue());
    }
}
