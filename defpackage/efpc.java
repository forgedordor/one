package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efpc implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final efft apply(cjky cjkyVar) {
        efiw efiwVar;
        TraceId traceId;
        evqs evqsVar;
        efcs efcsVar = new efcs();
        efcsVar.a(TraceId.b().d());
        if ((cjkyVar.b & 4) != 0) {
            ejvj ejvjVar = efqy.c;
            cjgr cjgrVar = cjkyVar.e;
            if (cjgrVar == null) {
                cjgrVar = cjgr.a;
            }
            Conversation conversation = (Conversation) ejvjVar.fM(cjgrVar);
            if (conversation == null) {
                throw new NullPointerException("Null conversation");
            }
            efcsVar.a = conversation;
        }
        if ((cjkyVar.b & 8) != 0) {
            ejvj ejvjVar2 = efqy.b;
            cjhi cjhiVar = cjkyVar.f;
            if (cjhiVar == null) {
                cjhiVar = cjhi.b;
            }
            efiw efiwVar2 = (efiw) ejvjVar2.fM(cjhiVar);
            if (efiwVar2 == null) {
                throw new NullPointerException("Null message");
            }
            efcsVar.b = efiwVar2;
        }
        if ((cjkyVar.b & 2) != 0) {
            ejvj ejvjVar3 = efqy.a;
            cjlm cjlmVar = cjkyVar.d;
            if (cjlmVar == null) {
                cjlmVar = cjlm.a;
            }
            efcsVar.a((TraceId) ejvjVar3.fM(cjlmVar));
        }
        b(cjkyVar, efcsVar);
        Conversation conversation2 = efcsVar.a;
        if (conversation2 != null && (efiwVar = efcsVar.b) != null && (traceId = efcsVar.c) != null && (evqsVar = efcsVar.d) != null) {
            return new efct(conversation2, efiwVar, traceId, evqsVar);
        }
        StringBuilder sb = new StringBuilder();
        if (efcsVar.a == null) {
            sb.append(" conversation");
        }
        if (efcsVar.b == null) {
            sb.append(" message");
        }
        if (efcsVar.c == null) {
            sb.append(" traceId");
        }
        if (efcsVar.d == null) {
            sb.append(" opaqueData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjky cjkyVar, effs effsVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
