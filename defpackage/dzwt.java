package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwt {
    private volatile dejx b;
    public final AtomicReference a = new AtomicReference();
    private final AtomicBoolean c = new AtomicBoolean(false);

    public final ListenableFuture a(Context context, boolean z, boolean z2) {
        if (!z) {
            return eork.i(true);
        }
        Boolean bool = (Boolean) this.a.get();
        if (bool != null) {
            return eork.i(bool);
        }
        dejx dejxVar = this.b;
        if (dejxVar == null) {
            synchronized (this) {
                dejxVar = this.b;
                if (dejxVar == null) {
                    dejx dejxVarA = dejv.a(context);
                    this.b = dejxVarA;
                    dejxVar = dejxVarA;
                }
            }
        }
        if (z2 && !this.c.getAndSet(true)) {
            dejxVar.c(new dejw() { // from class: dzwq
                @Override // defpackage.dejw
                public final void a() {
                    this.a.a.set(null);
                }
            });
        }
        eoqt eoqtVarT = eoqt.t(drgi.a(dejxVar.b()));
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: dzwr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int iA = ((dejq) obj).a();
                boolean z3 = true;
                if (iA != 1 && iA != 3) {
                    z3 = false;
                }
                AtomicReference atomicReference = this.a.a;
                Boolean boolValueOf = Boolean.valueOf(z3);
                atomicReference.set(boolValueOf);
                return boolValueOf;
            }
        });
        eoqg eoqgVar = eoqg.a;
        return eooh.f(eooq.f(eoqtVarT, ejvrVarA, eoqgVar), Throwable.class, new ejvr() { // from class: dzws
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            }
        }, eoqgVar);
    }
}
