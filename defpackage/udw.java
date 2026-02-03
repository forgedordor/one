package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.contacts.corp.CorpContactsRefreshWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udw extends cmwg {
    public static final cqce a = cqce.g("Bugle", "CorpContactsRefreshStartupTask");
    public final Context b;
    private final eosc c;

    public udw(Context context, eosc eoscVar) {
        this.b = context;
        this.c = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("CorpContactsRefreshStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: udv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) cqjg.b.e()).booleanValue();
                cqbd cqbdVarA = udw.a.a();
                cqbdVarA.I("Executing CorpContactsRefreshStartupTask.");
                cqbdVarA.B("isEnabled", zBooleanValue);
                cqbdVarA.r();
                udw udwVar = this.a;
                if (!zBooleanValue) {
                    qbq.a(udwVar.b).b("corp_contacts_refresh_worker");
                    return;
                }
                qbr qbrVarA = qbq.a(udwVar.b);
                pzy pzyVar = pzy.b;
                qbg qbgVar = new qbg(CorpContactsRefreshWorker.class, CorpContactsRefreshWorker.g.toMillis(), TimeUnit.MILLISECONDS);
                pzh pzhVar = new pzh();
                pzhVar.a = true;
                pzhVar.c(3);
                qbgVar.g(pzhVar.a());
                qbrVarA.f("corp_contacts_refresh_worker", pzyVar, (qbh) qbgVar.b());
            }
        }, this.c);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
