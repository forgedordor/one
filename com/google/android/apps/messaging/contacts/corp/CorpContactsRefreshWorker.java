package com.google.android.apps.messaging.contacts.corp;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.brvp;
import defpackage.bxkp;
import defpackage.cdag;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqiz;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejxr;
import defpackage.eosc;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.qaq;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CorpContactsRefreshWorker extends qaq {
    public static final ejxr e = cdag.v("block_ditto_content_observer_if_large_updates");
    public static final cqce f = cqce.g("Bugle", "CorpContactsRefreshWorker");
    public static final Duration g = Duration.ofHours(24);
    public final cqiz h;
    public final fcsu i;
    public final cogw j;
    public final bxkp k;
    public final eygg l;
    public final fcsu m;
    public final fcsu n;
    public long o;
    private final ains p;
    private final eosc q;
    private final eigp r;

    /* compiled from: PG */
    public interface a {
        eosc A();

        eygg B();

        fcsu C();

        fcsu D();

        fcsu E();

        eigp b();

        ains w();

        bxkp x();

        cogw y();

        cqiz z();
    }

    public CorpContactsRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.h = aVar.z();
        this.i = aVar.C();
        this.p = aVar.w();
        this.j = aVar.y();
        this.k = aVar.x();
        this.q = aVar.A();
        this.r = aVar.b();
        this.l = aVar.B();
        this.m = aVar.D();
        this.n = aVar.E();
        cqbd cqbdVarA = f.a();
        cqbdVarA.I("Created CorpContactsRefreshWorker.");
        cqbdVarA.r();
    }

    public static String c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        eieh eiehVarC = this.r.c("CorpContactsRefreshWorker#startWork", "com/google/android/apps/messaging/contacts/corp/CorpContactsRefreshWorker", "startWork", 160);
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: udy
                /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 640
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.udy.call():java.lang.Object");
                }
            }, this.q);
            eiehVarC.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qaq
    public final void d() {
        cqbd cqbdVarA = f.a();
        cqbdVarA.I("Execution of CorpContactsRefreshWorker was stopped.");
        cqbdVarA.r();
        k("Bugle.CorpContactsRefreshWorker.Stopped.Latency");
    }

    public final void k(String str) {
        this.p.g(str, this.j.a() - this.o);
    }

    public final boolean l(brvp brvpVar) {
        if (brvpVar.r == null || brvpVar.q != -2) {
            return false;
        }
        brvpVar.u(null);
        brvpVar.D(null);
        brvpVar.N(null);
        brvpVar.p(-1L);
        this.k.b(brvpVar.a());
        return true;
    }
}
