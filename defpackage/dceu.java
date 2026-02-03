package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.dcfc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dceu<T extends dcfc, O> extends dcfb<T, O> {
    public dcfc a(Context context, Looper looper, dcke dckeVar, Object obj, dcgy dcgyVar, dcii dciiVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public dcfc b(Context context, Looper looper, dcke dckeVar, Object obj, dcfo dcfoVar, dcfp dcfpVar) {
        return a(context, looper, dckeVar, obj, dcfoVar, dcfpVar);
    }
}
