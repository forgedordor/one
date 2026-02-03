package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anbb implements AutoCloseable, ajlz {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler");
    public final fdvc c;
    private final fduf f;
    private final cquc g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final Object a = new Object();
    public final List b = new ArrayList();

    public anbb(ajma ajmaVar) {
        fduf fdufVarA = fdvf.a(0);
        this.f = fdufVarA;
        this.c = new fduh(fdufVarA);
        this.g = ajmaVar.c(this);
    }

    @Override // defpackage.ajlz
    public final void a() {
        Object objC;
        if (this.e.get()) {
            ekrw ekrwVarH = d.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "invalidate", 381, "OptimisticMessagePager.kt")).q("skipping invalidate since the handler is closed.");
        } else {
            fduf fdufVar = this.f;
            do {
                objC = fdufVar.c();
            } while (!fdufVar.g(objC, Integer.valueOf(((Number) objC).intValue() + 1)));
        }
    }

    @Override // defpackage.ajlz
    public final void b(ajle ajleVar, ajly ajlyVar) {
        ajleVar.getClass();
        a();
    }

    public final void c(boolean z) {
        List listAo;
        if (this.e.get()) {
            ekrw ekrwVarH = d.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "propagateChange", 399, "OptimisticMessagePager.kt")).q("skipping propagateChange since the handler is closed.");
        } else if (z && ((Number) this.f.c()).intValue() == 0) {
            ekrw ekrwVarH2 = d.h();
            ekrwVarH2.X(eksq.a, "BugleMapi");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "propagateChange", 404, "OptimisticMessagePager.kt")).q("skipping propagateChange since the underlying data didn't change.");
        } else {
            synchronized (this.a) {
                listAo = fcva.ao(this.b);
            }
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                ((ajlz) it.next()).a();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.set(true);
        cqub.a(this.g);
    }
}
