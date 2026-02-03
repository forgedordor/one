package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmp {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof hzy) {
            hzy hzyVar = (hzy) obj;
            if (hzyVar.f() != hpb.a && hzyVar.f() != hsi.a && hzyVar.f() != hqr.a) {
                return false;
            }
            Object objA = hzyVar.a();
            if (objA == null) {
                return true;
            }
            return a(objA);
        }
        if ((obj instanceof fcsy) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = b;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
