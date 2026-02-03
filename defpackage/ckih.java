package defpackage;

import android.util.LruCache;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckih extends LruCache implements dggy, cqci {
    private final fcsu a;

    public ckih(fcsu fcsuVar) {
        super(2);
        this.a = fcsuVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        return ((dggz) this.a.b()).i((String) obj);
    }

    @Override // defpackage.dggy
    public final void gg(final String str, final Optional optional) {
        optional.ifPresent(new Consumer() { // from class: ckig
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.put(str, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        trimToSize(0);
    }
}
