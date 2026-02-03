package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efpb implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoveUserFromGroupRequest apply(cjkc cjkcVar) {
        efcp efcpVar = new efcp();
        d(efcpVar);
        if ((cjkcVar.b & 4) != 0) {
            ejvj ejvjVar = efqx.a;
            cjgr cjgrVar = cjkcVar.d;
            if (cjgrVar == null) {
                cjgrVar = cjgr.a;
            }
            efcpVar.b((Conversation) ejvjVar.fM(cjgrVar));
        }
        c(cjkcVar, efcpVar);
        b(cjkcVar, efcpVar);
        return efcpVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjkc cjkcVar, effl efflVar);

    public abstract void c(cjkc cjkcVar, effl efflVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(effl efflVar);
}
