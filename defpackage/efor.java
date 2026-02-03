package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efor implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CreateGroupRequest apply(cjgx cjgxVar) {
        efbr efbrVar = new efbr();
        d(efbrVar);
        if ((cjgxVar.b & 4) != 0) {
            b(cjgxVar, efbrVar);
        }
        if ((cjgxVar.b & 8) != 0) {
            efbrVar.f(cjgxVar.e);
        }
        ekfw ekfwVarD = ekgb.d(cjgxVar.f.size());
        Iterator<E> it = cjgxVar.f.iterator();
        while (it.hasNext()) {
            ekfwVarD.h((RcsDestinationId) efpq.a.fM((cjju) it.next()));
        }
        efbrVar.d(ekfwVarD.g());
        c(cjgxVar, efbrVar);
        return efbrVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjgx cjgxVar, efdl efdlVar);

    public abstract void c(cjgx cjgxVar, efdl efdlVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(efdl efdlVar);
}
