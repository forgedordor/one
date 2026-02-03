package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehro {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxChecker");
    private final dejx c;
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicBoolean d = new AtomicBoolean(false);

    public ehro(dejx dejxVar) {
        this.c = dejxVar;
    }

    public final ListenableFuture a() {
        if (!this.d.getAndSet(true)) {
            this.c.c(new dejw() { // from class: ehrl
                @Override // defpackage.dejw
                public final void a() {
                    this.a.b.set(null);
                }
            });
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            return eork.i(bool);
        }
        eoqt eoqtVarT = eoqt.t(drgi.a(this.c.b()));
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: ehrm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean z = ((dejq) obj).a() == 1;
                AtomicReference atomicReference = this.a.b;
                Boolean boolValueOf = Boolean.valueOf(z);
                atomicReference.set(boolValueOf);
                return boolValueOf;
            }
        });
        eoqg eoqgVar = eoqg.a;
        return eooh.f(eooq.f(eoqtVarT, ejvrVarA, eoqgVar), Throwable.class, new ejvr() { // from class: ehrn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) ehro.a.j()).g((Throwable) obj)).h("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxChecker", "shouldLog", 'M', "TikTokCheckboxChecker.java")).q("fetching usage reporting opt-in failed");
                this.a.b.set(false);
                return false;
            }
        }, eoqgVar);
    }
}
