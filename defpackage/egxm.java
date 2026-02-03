package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egxm extends ContentObserver {
    private final eigp a;
    private final String b;
    private final Executor c;

    protected egxm(eigp eigpVar, String str, Executor executor) {
        super(null);
        this.a = eigpVar;
        this.b = str;
        this.c = executor;
    }

    private final void b(final Uri uri) {
        this.c.execute(eiid.k(new Runnable() { // from class: egxl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(uri);
            }
        }));
    }

    public abstract void a(Uri uri);

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (eidc.v()) {
            b(null);
            return;
        }
        eieh eiehVarD = this.a.d("com/google/apps/tiktok/dataservice/AsyncContentObserver", "onChange", 51, this.b);
        try {
            b(null);
            eiehVarD.close();
        } catch (Throwable th) {
            try {
                eiehVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (eidc.v()) {
            b(uri);
            return;
        }
        eieh eiehVarD = this.a.d("com/google/apps/tiktok/dataservice/AsyncContentObserver", "onChange", 64, this.b);
        try {
            b(uri);
            eiehVarD.close();
        } catch (Throwable th) {
            try {
                eiehVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
