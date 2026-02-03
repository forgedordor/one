package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface aymn {
    public static final long a = TimeUnit.MINUTES.toMillis(30);

    PendingIntent a(Context context, Action action, int i, boolean z, Uri uri);

    eiju b(Action action);

    ListenableFuture c(Action action, cldb cldbVar, int i);

    ListenableFuture d(Action action);

    ListenableFuture e(Action action);

    void f(Action action, int i);

    void g(Action action, int i, long j);

    void h(Action action, Action action2);

    ayno i(Action action, long j);
}
