package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxko extends ContentObserver {
    public final Context a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public volatile dzub d;
    private final fcsu e;

    public bxko(Context context, fcsu fcsuVar) {
        super(null);
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.a = context;
        this.e = fcsuVar;
        bxkp.d.p("ContactContentObserver created");
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        bxkp.d.p("Contacts changed");
        if (this.b.compareAndSet(false, true)) {
            this.d = ((ajfo) this.e.b()).a();
        }
    }
}
