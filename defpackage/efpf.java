package defpackage;

import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efpf implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TriggerGroupNotificationRequest apply(cjls cjlsVar) {
        efcy efcyVar = new efcy();
        c(efcyVar);
        if ((cjlsVar.b & 4) != 0) {
            ejvj ejvjVar = efrb.a;
            cjgr cjgrVar = cjlsVar.d;
            if (cjgrVar == null) {
                cjgrVar = cjgr.a;
            }
            efcyVar.b((Conversation) ejvjVar.fM(cjgrVar));
        }
        b(cjlsVar, efcyVar);
        return efcyVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjls cjlsVar, efge efgeVar);

    public abstract void c(efge efgeVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
