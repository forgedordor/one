package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esvr implements eora {
    final /* synthetic */ eswn a;
    final /* synthetic */ esvs b;

    public esvr(esvs esvsVar, eswn eswnVar) {
        this.a = eswnVar;
        this.b = esvsVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dbyl dbylVarC;
        String str = (String) obj;
        eswn eswnVar = this.a;
        eoid eoidVar = eswnVar.g;
        if (eoidVar == null) {
            eoidVar = eoid.a;
        }
        esvs esvsVar = this.b;
        String str2 = eoidVar.j;
        Charset charset = esvk.a;
        int i = elcz.a;
        int iA = eldm.a.c(str2, esvk.a).a();
        esvt esvtVar = esvsVar.c;
        fcsu fcsuVar = esvtVar.b.a;
        boolean zG = ((ejwi) fcsuVar.b()).g();
        Context context = esvtVar.a;
        if (zG) {
            List list = dbyl.m;
            dbyi dbyiVar = new dbyi(context, "CLIENT_LOGGING_PROD");
            dbym dbymVar = (dbym) ((ejwi) fcsuVar.b()).f();
            if (dbymVar != null) {
                dbyiVar.c = dbymVar;
            }
            if (str != null) {
                dbyiVar.f = str;
            }
            dbylVarC = dbyiVar.c();
        } else {
            dbylVarC = new dbyl(context, "CLIENT_LOGGING_PROD", str);
        }
        dbyk dbykVarK = dbylVarC.k(eswnVar, dqnz.b(context, new eyjw()));
        dbykVarK.j(iA);
        ListenableFuture listenableFutureA = drgi.a(dbykVarK.c());
        ejvt ejvtVar = new ejvt(null);
        eoqg eoqgVar = eoqg.a;
        final ListenableFuture listenableFutureF = eooq.f(listenableFutureA, ejvtVar, eoqgVar);
        listenableFutureF.b(new Runnable() { // from class: esvo
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = esvt.c;
                if (listenableFutureF.isCancelled()) {
                    Log.d("ClientLoggingBackend", "Log cancelled. The app has crashed.");
                }
            }
        }, eoqgVar);
        eooh.f(listenableFutureF, Exception.class, eiid.a(new ejvr() { // from class: esvp
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                int i2 = esvt.c;
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj2);
                return null;
            }
        }), eoqgVar);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }
}
