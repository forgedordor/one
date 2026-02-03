package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axgb extends lzn implements bacg {
    private static final cqce j = cqce.g("BugleDataModel", "BoundTypedCursorLoader");
    private final String k;
    private final lcj l;
    private final Uri m;
    private final eigp n;
    private final eidm o;
    private final ContentObserver p;
    private dqqj q;

    public axgb(eigp eigpVar, eidm eidmVar, String str, Context context, Uri uri, lcj lcjVar) {
        super(context);
        j.q("onCreate: ".concat(String.valueOf(String.valueOf(uri))));
        this.k = str;
        this.l = lcjVar;
        this.m = uri;
        this.n = eigpVar;
        this.o = eidmVar;
        this.p = new lzo(this);
    }

    @Override // defpackage.lzn
    protected final /* bridge */ /* synthetic */ Object b() {
        eieh eiehVarC = this.n.c("BoundTypedCursorLoader#onLoadInBackground", "com/google/android/apps/messaging/shared/datamodel/BoundTypedCursorLoader", "onLoadInBackground", 160);
        try {
            dqqj dqqjVarA = a();
            eiehVarC.close();
            return dqqjVarA;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lzn
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        dqqj dqqjVar = (dqqj) obj;
        if (dqqjVar == null || dqqjVar.isClosed()) {
            return;
        }
        dqqjVar.close();
    }

    @Override // defpackage.lzp
    public final void l() {
        h();
        dqqj dqqjVar = this.q;
        if (dqqjVar != null && !dqqjVar.isClosed()) {
            this.q.close();
        }
        this.q = null;
    }

    @Override // defpackage.lzp
    protected final void m() {
        dqqj dqqjVar = this.q;
        if (dqqjVar != null) {
            j(dqqjVar);
        }
        if (q() || this.q == null) {
            f();
        }
    }

    @Override // defpackage.lzp
    protected final void n() {
        h();
    }

    @Override // defpackage.lzn
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final dqqj a() {
        try {
            dqwl dqwlVar = (dqwl) this.l.a();
            dqqj dqqjVarP = dqwlVar.p();
            dqqjVarP.a().setNotificationUri(this.c.getContentResolver(), this.m);
            dqqjVarP.a().registerContentObserver(this.p);
            cqbd cqbdVarA = j.a();
            cqbdVarA.I("Load query in background:");
            cqbdVarA.I(dqwlVar);
            cqbdVarA.r();
            return dqqjVarP;
        } catch (SecurityException e) {
            cqbd cqbdVarB = j.b();
            cqbdVarB.I("Failed to load cursor for");
            cqbdVarB.I(this.m);
            cqbdVarB.s(e);
            return null;
        }
    }

    @Override // defpackage.bacg
    public final String t() {
        return this.k;
    }

    @Override // defpackage.lzp
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void j(dqqj dqqjVar) {
        eifp eifpVarA = this.o.a("BoundTypedCursorLoader#deliverResult");
        try {
            if (this.f) {
                j.p("Loader is reset, not delivering result");
                if (dqqjVar != null) {
                    dqqjVar.close();
                }
            } else {
                dqqj dqqjVar2 = this.q;
                this.q = dqqjVar;
                if (this.d) {
                    super.j(this.q);
                } else {
                    j.p("Loader is not started, not delivering result");
                }
                if (dqqjVar2 != null && dqqjVar2 != dqqjVar && !dqqjVar2.isClosed()) {
                    dqqjVar2.close();
                }
            }
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
