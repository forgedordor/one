package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plo extends Property {
    public plo(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        plv plvVar = (plv) obj;
        PointF pointF = (PointF) obj2;
        plvVar.a = Math.round(pointF.x);
        plvVar.b = Math.round(pointF.y);
        int i = plvVar.e + 1;
        plvVar.e = i;
        if (i == plvVar.f) {
            plvVar.a();
        }
    }
}
