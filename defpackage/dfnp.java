package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfnp extends dheg<Void> {
    public final List a = new CopyOnWriteArrayList();
    private final Context b;
    private boolean c;
    private final deyx d;

    public dfnp(Context context, deyx deyxVar) {
        this.b = context;
        this.d = deyxVar;
    }

    public final synchronized void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(RcsIntents.ACTION_CSLIB_FLAGS_UPDATED);
        kxj.g(this.b, this, intentFilter);
        this.c = true;
    }

    public final synchronized void b() {
        if (this.c) {
            this.b.unregisterReceiver(this);
            this.c = false;
        }
    }

    @Override // defpackage.dheg
    protected final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (intent == null) {
            dhja.c("Intent is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        dhja.c("Received: %s", action);
        if (RcsIntents.ACTION_CSLIB_FLAGS_UPDATED.equals(action)) {
            dfoc.m();
            dfaq.J(context);
            this.d.d(context, dfaq.E().F());
            dhja.c("Notify carrierservices_library phenotype update listeners", new Object[0]);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((dfno) it.next()).onCsLibPhenotypeUpdated();
            }
        }
    }
}
