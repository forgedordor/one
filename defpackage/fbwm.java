package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbwm {
    public static final Logger a = Logger.getLogger(fbwm.class.getName());
    public static final fbwi c = new Object() { // from class: fbwi
    };
    protected final IBinder b;

    protected fbwm(IBinder iBinder) {
        this.b = iBinder;
    }

    public static fbwm b(IBinder iBinder, Executor executor) {
        return iBinder instanceof Binder ? new fbwk(iBinder, executor) : new fbwl(iBinder);
    }

    public abstract void a(int i, fbwq fbwqVar);

    protected final boolean c(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
