package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espo {
    public static fbtz a(final Context context, ekhx ekhxVar, Executor executor) {
        return new espn(new ejxr() { // from class: espj
            @Override // defpackage.ejxr
            public final Object get() {
                return dcer.c(context);
            }
        }, context.getPackageManager(), ekhxVar, executor);
    }

    @Deprecated
    public static fbur b(Context context) {
        return new espk(dcer.c(context));
    }

    @Deprecated
    public static fbur c(Context context, ekhx ekhxVar) {
        return new espl(context.getPackageManager(), ekhxVar, dcer.c(context));
    }
}
