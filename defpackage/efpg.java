package defpackage;

import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efpg implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateGroupRequest apply(cjma cjmaVar) {
        efda efdaVar = new efda();
        c(efdaVar);
        if ((cjmaVar.b & 4) != 0) {
            ejvj ejvjVar = efrc.a;
            cjgr cjgrVar = cjmaVar.d;
            if (cjgrVar == null) {
                cjgrVar = cjgr.a;
            }
            efdaVar.b((Conversation) ejvjVar.fM(cjgrVar));
        }
        if ((cjmaVar.b & 8) != 0) {
            efdaVar.e(cjmaVar.e);
        }
        b(cjmaVar, efdaVar);
        return efdaVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjma cjmaVar, efgj efgjVar);

    public abstract void c(efgj efgjVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
