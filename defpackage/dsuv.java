package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuv extends dsuq {
    public final Context a;
    public final eosc b;
    public final fcsu c;
    public volatile dzwt d;
    dbyl e;
    dbyl f;

    public dsuv(Context context, fcsu fcsuVar, eosc eoscVar) {
        this.a = context;
        this.c = fcsuVar;
        this.b = eoscVar;
    }

    @Override // defpackage.dsuq
    public final ListenableFuture a(final dsup dsupVar, ListenableFuture listenableFuture) {
        return eooh.g(eooq.g(listenableFuture, new eooz() { // from class: dsus
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ListenableFuture listenableFutureA;
                final dsty dstyVar = (dsty) obj;
                int i = dstyVar.b;
                final dsuv dsuvVar = this.a;
                if (i == 1) {
                    listenableFutureA = eork.i(true);
                } else {
                    dzwt dzwtVar = dsuvVar.d;
                    if (dzwtVar == null) {
                        synchronized (dsuvVar) {
                            dzwtVar = dsuvVar.d;
                            if (dzwtVar == null) {
                                dzwtVar = new dzwt();
                                dsuvVar.d = dzwtVar;
                            }
                        }
                    }
                    listenableFutureA = dzwtVar.a(dsuvVar.a, ((Boolean) dsuvVar.c.b()).booleanValue(), true);
                }
                final dsup dsupVar2 = dsupVar;
                return eooq.g(listenableFutureA, new eooz() { // from class: dsur
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
                    @Override // defpackage.eooz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r8) {
                        /*
                            Method dump skipped, instructions count: 257
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsur.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, dsuvVar.b);
            }
        }, this.b), dcff.class, new eooz() { // from class: dsut
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws dcff {
                dcff dcffVar = (dcff) obj;
                int iA = dcffVar.a();
                if (iA != 17 && iA != 31003) {
                    throw dcffVar;
                }
                if (Log.isLoggable("Logging.Clearcut", 3)) {
                    Log.d("Logging.Clearcut", "Could not log data.", dcffVar);
                }
                return eorv.a;
            }
        }, eoqg.a);
    }

    public final synchronized dbyl b(dsty dstyVar) {
        int i = dstyVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.e == null) {
                Context context = this.a;
                List list = dbyl.m;
                this.e = new dbyi(context, "NOOP_LOG_SOURCE_NAME").c();
            }
            return this.e;
        }
        if (i != 2) {
            return null;
        }
        if (this.f == null) {
            this.f = dbyl.l(this.a, "NOOP_LOG_SOURCE_NAME");
        }
        return this.f;
    }
}
