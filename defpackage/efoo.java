package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efoo implements Function {
    public abstract void a(cjgh cjghVar, efbb efbbVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjgh cjghVar, efbb efbbVar);

    public abstract void c(efbb efbbVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AddUserToGroupRequest apply(cjgh cjghVar) {
        efbl efblVar = new efbl();
        c(efblVar);
        if ((cjghVar.b & 4) != 0) {
            ejvj ejvjVar = efon.a;
            cjgr cjgrVar = cjghVar.d;
            if (cjgrVar == null) {
                cjgrVar = cjgr.a;
            }
            efblVar.b((Conversation) ejvjVar.fM(cjgrVar));
        }
        b(cjghVar, efblVar);
        a(cjghVar, efblVar);
        return efblVar.a();
    }
}
