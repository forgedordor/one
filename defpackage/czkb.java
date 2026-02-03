package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czkb extends Property {
    final /* synthetic */ View a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czkb(Class cls, View view) {
        super(cls, "scale");
        this.a = view;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getScaleX());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        float fFloatValue = f.floatValue();
        View view = this.a;
        view.setScaleX(fFloatValue);
        view.setScaleY(f.floatValue());
    }
}
