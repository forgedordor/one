package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plp extends Property {
    public plp(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        plv plvVar = (plv) obj;
        PointF pointF = (PointF) obj2;
        plvVar.c = Math.round(pointF.x);
        plvVar.d = Math.round(pointF.y);
        int i = plvVar.f + 1;
        plvVar.f = i;
        if (plvVar.e == i) {
            plvVar.a();
        }
    }
}
