package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dywe extends dyws {
    public dywe(final Context context, final ScheduledExecutorService scheduledExecutorService) {
        super(new ejxr() { // from class: dywd
            @Override // defpackage.ejxr
            public final Object get() {
                Context context2 = context;
                return new dyxi(scheduledExecutorService, new ecod(context2, "STREAMZ_ONEGOOGLE_ANDROID"), context2 instanceof Application ? (Application) context2 : null);
            }
        });
    }
}
