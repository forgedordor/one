package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkc implements efze, efzf {
    public final ecjh a;
    public final String b;
    public final egcd c;
    public final ejwi d;

    public egkc(Context context, ecjh ecjhVar, egcd egcdVar, ejwi ejwiVar) {
        this.a = ecjhVar;
        this.b = context.getPackageName();
        this.c = egcdVar;
        this.d = ejwiVar;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        eieu eieuVarK = eiiy.k("Get Default Account");
        try {
            ListenableFuture listenableFutureD = d();
            eieuVarK.b(listenableFutureD);
            eieuVarK.close();
            return listenableFutureD;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        return eork.i(null);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }

    public final ListenableFuture d() {
        return eooq.f(this.a.a(), eiid.a(new ejvr() { // from class: egjx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egkf egkfVar = (egkf) obj;
                String str = this.a.b;
                str.getClass();
                if (!egkfVar.b.containsKey(str)) {
                    return null;
                }
                str.getClass();
                evub evubVar = egkfVar.b;
                if (evubVar.containsKey(str)) {
                    return efwo.b(((Integer) evubVar.get(str)).intValue());
                }
                throw new IllegalArgumentException();
            }
        }), eoqg.a);
    }
}
