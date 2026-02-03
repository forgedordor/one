package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehsx<T> extends ehtg<T> {

    /* compiled from: PG */
    public interface a {
        efyt eb();

        egif ee();
    }

    protected ehsx(Class cls) {
        super(cls, true);
    }

    @Override // defpackage.ehtg
    protected final ListenableFuture d(final Context context, Intent intent, final Class cls) {
        a aVar = (a) ehli.a(context, a.class);
        egif egifVarEe = aVar.ee();
        final Bundle extras = intent.getExtras() == null ? Bundle.EMPTY : intent.getExtras();
        ejwl.m(extras.containsKey("account_id"), "Missing AccountId. Did you forget to add the account id to the Intent?");
        int i = extras.getInt("account_id", -1);
        final efwo efwoVarB = i != -1 ? efwo.b(i) : null;
        ListenableFuture listenableFutureF = eork.f(egifVarEe.c.c(efwoVarB), egifVarEe.a());
        ejvr ejvrVar = new ejvr() { // from class: egie
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                egbe egbeVar = (egbe) list.get(0);
                long jLongValue = ((Long) list.get(1)).longValue();
                Bundle bundle = extras;
                int i2 = bundle.getInt("account_external_version", -1);
                String string = bundle.getString("account_user_id");
                string.getClass();
                long j = bundle.getLong("account_instance", 0L);
                if (i2 != 1) {
                    throw new IllegalArgumentException("Unknown external account version");
                }
                if (!egbeVar.b().c.equals(string)) {
                    throw new egdj("The user id sent with the intent does not match the current user id!");
                }
                if (jLongValue == j) {
                    return efwoVarB;
                }
                throw new egdj("The account sent with the intent is from a previous installation of the app.");
            }
        };
        eoqg eoqgVar = eoqg.a;
        ListenableFuture listenableFutureF2 = eooq.f(listenableFutureF, ejvrVar, eoqgVar);
        final efyt efytVarEb = aVar.eb();
        efytVarEb.getClass();
        return eooq.f(eooq.g(listenableFutureF2, eiid.d(new eooz() { // from class: ehsv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return efytVarEb.a((efwo) obj);
            }
        }), eoqgVar), eiid.a(new ejvr() { // from class: ehsw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                try {
                    return ehlh.a(context, cls, (efwo) obj);
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
        }), eoqgVar);
    }
}
