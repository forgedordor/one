package defpackage;

import android.content.Context;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdr {
    public static final Object a = new Object();
    public static dfdp b;

    public static dfdp a(Context context) {
        dfdp dfdpVar;
        synchronized (a) {
            if (b == null) {
                b(context);
                eyik eyikVar = dfdo.a;
                context.getClass();
                b = new dfdn(context);
            }
            dfdpVar = b;
            dfdpVar.getClass();
        }
        return dfdpVar;
    }

    public static void b(final Context context) {
        eotp.a = context;
        dfds.a.set(new Supplier() { // from class: dfdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return dfdr.a(context);
            }
        });
    }
}
