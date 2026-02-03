package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehth<T> extends ehtg<T> {
    protected ehth(Class cls) {
        super(cls, false);
    }

    @Override // defpackage.ehtg
    protected final ListenableFuture d(Context context, Intent intent, Class cls) {
        try {
            return eork.i(ehli.a(context, cls));
        } catch (IllegalStateException e) {
            return eork.h(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
        }
    }
}
