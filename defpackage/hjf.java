package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjf {
    public static final int a(iyl iylVar) {
        if (iylVar != null) {
            return iylVar.b;
        }
        return 0;
    }

    public static final int b(iyl iylVar) {
        if (iylVar != null) {
            return iylVar.a;
        }
        return 0;
    }

    public static final int c(int i, int i2) {
        return i == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : fddu.f(i - i2, 0);
    }

    public static final Object d(ivt ivtVar) {
        Object objF = ivtVar.f();
        iwc iwcVar = objF instanceof iwc ? (iwc) objF : null;
        if (iwcVar != null) {
            return iwcVar.e();
        }
        return null;
    }
}
