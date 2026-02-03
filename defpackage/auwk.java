package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auwk {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final eosc c;
    public final Function d;

    public auwk(eosc eoscVar, Function function) {
        this.c = eoscVar;
        this.d = function;
    }

    public final eiju a(final Object obj) {
        synchronized (this.a) {
            HashMap map = this.b;
            if (map.containsKey(obj)) {
                return (eiju) map.get(obj);
            }
            eiju eijuVarH = eijs.e(new eopk() { // from class: auwi
                @Override // defpackage.eopk
                public final eopy a(eopt eoptVar) {
                    final auwk auwkVar = this.a;
                    final Object obj2 = obj;
                    eoptVar.a(new AutoCloseable() { // from class: auwj
                        @Override // java.lang.AutoCloseable
                        public final void close() {
                            auwk auwkVar2 = auwkVar;
                            Object obj3 = auwkVar2.a;
                            Object obj4 = obj2;
                            synchronized (obj3) {
                                auwkVar2.b.remove(obj4);
                            }
                        }
                    }, auwkVar.c);
                    return eijs.c((ListenableFuture) auwkVar.d.apply(obj2)).a;
                }
            }, this.c).h();
            map.put(obj, eijuVarH);
            return eijuVarH;
        }
    }
}
