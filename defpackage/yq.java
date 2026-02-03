package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yq extends Property {
    public yq(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).j);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).i(((Float) obj2).floatValue());
    }
}
