package defpackage;

import android.provider.ContactsContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cywg {
    public final egxv a;
    public final Executor b;
    public final cden c;

    public cywg(egxv egxvVar, Executor executor, cden cdenVar) {
        this.a = egxvVar;
        this.b = executor;
        this.c = cdenVar;
    }

    public final eijs a(long j, String str, String[] strArr) {
        return new eijs(this.a.b(ContactsContract.Data.CONTENT_URI, strArr, a.a(str, "contact_id=? AND mimetype='", "'"), new String[]{String.valueOf(j)}, null));
    }

    public final eiju b(eiju eijuVar) {
        return eijuVar.f(Throwable.class, new eooz() { // from class: cywb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cywg cywgVar = this.a;
                return cywgVar.c.b((Throwable) obj).h(new ejvr() { // from class: cyvz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ekon.a;
                    }
                }, cywgVar.b);
            }
        }, this.b);
    }
}
