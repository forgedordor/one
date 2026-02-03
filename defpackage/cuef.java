package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuef implements cuec {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/startchat/tracker/SelectedSelfIdentityTrackerImpl");
    public final fcsu b;
    private final fdjx c;
    private final fduf d;
    private final AtomicBoolean e;
    private final fdvc f;

    public cuef(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.c = fdjxVar;
        this.b = fcsuVar;
        fduf fdufVarA = fdvf.a(null);
        this.d = fdufVarA;
        this.e = new AtomicBoolean(false);
        this.f = new fduh(fdufVarA);
    }

    @Override // defpackage.cuec
    public final fdvc a() {
        return this.f;
    }

    @Override // defpackage.cuec
    public final void b() {
        if (this.e.getAndSet(true)) {
            return;
        }
        auvw.k(this.c, null, null, new cued(this, null), 3);
    }

    @Override // defpackage.cuec
    public final void c(SelfIdentityId selfIdentityId) {
        auvw.k(this.c, null, null, new cuee(this, selfIdentityId, null), 3);
    }

    @Override // defpackage.cuec
    public final void d(aoer aoerVar) {
        fduf fdufVar;
        Object objC;
        do {
            fdufVar = this.d;
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, aoerVar));
    }
}
