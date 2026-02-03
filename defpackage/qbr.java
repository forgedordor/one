package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qbr {
    public abstract qba a(String str);

    public abstract qba b(String str);

    public abstract qba c(UUID uuid);

    public final qba d(qbu qbuVar) {
        return e(fcva.b(qbuVar));
    }

    public abstract qba e(List list);

    public abstract qba f(String str, pzy pzyVar, qbh qbhVar);

    public final qba g(String str, pzz pzzVar, qav qavVar) {
        str.getClass();
        pzzVar.getClass();
        return h(str, pzzVar, fcva.b(qavVar));
    }

    public abstract qba h(String str, pzz pzzVar, List list);

    public abstract qba i();

    public final qbk j(String str, pzz pzzVar, qav qavVar) {
        pzzVar.getClass();
        return k(str, pzzVar, fcva.b(qavVar));
    }

    public abstract qbk k(String str, pzz pzzVar, List list);

    public abstract ListenableFuture l(qbs qbsVar);
}
