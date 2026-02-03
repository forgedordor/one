package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgsd {
    public static final void a(final Context context, final String str) {
        ecem.e(new Runnable() { // from class: cgsc
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, str, 1).show();
            }
        });
    }
}
