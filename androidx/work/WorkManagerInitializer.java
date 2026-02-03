package androidx.work;

import android.content.Context;
import defpackage.pko;
import defpackage.pzb;
import defpackage.pzd;
import defpackage.qas;
import defpackage.qbq;
import defpackage.qbr;
import defpackage.qee;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements pko<qbr> {
    private static final String a = qas.d("WrkMgrInitializer");

    @Override // defpackage.pko
    public final /* synthetic */ Object a(Context context) {
        qas.c().a(a, "Initializing WorkManager with default configuration.");
        pzd pzdVar = new pzd(new pzb());
        context.getClass();
        qee.n(context, pzdVar);
        return qbq.a(context);
    }

    @Override // defpackage.pko
    public final List b() {
        return Collections.EMPTY_LIST;
    }
}
