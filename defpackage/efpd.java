package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efpd implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SendMessageRequest apply(cjlg cjlgVar) {
        effw effwVarJ = SendMessageRequest.j();
        c(effwVarJ);
        if ((cjlgVar.b & 4) != 0) {
            ejvj ejvjVar = efqz.d;
            cjgr cjgrVar = cjlgVar.e;
            if (cjgrVar == null) {
                cjgrVar = cjgr.a;
            }
            effwVarJ.b((Conversation) ejvjVar.fM(cjgrVar));
        }
        if ((cjlgVar.b & 8) != 0) {
            ejvj ejvjVar2 = efqz.c;
            cjib cjibVar = cjlgVar.f;
            if (cjibVar == null) {
                cjibVar = cjib.b;
            }
            effwVarJ.d((Message) ejvjVar2.fM(cjibVar));
        }
        if ((cjlgVar.b & 16) != 0) {
            ejvj ejvjVar3 = efqz.b;
            cjih cjihVar = cjlgVar.g;
            if (cjihVar == null) {
                cjihVar = cjih.a;
            }
            effwVarJ.e((MessageClass) ejvjVar3.fM(cjihVar));
        }
        if ((cjlgVar.b & 2) != 0) {
            ejvj ejvjVar4 = efqz.a;
            cjlm cjlmVar = cjlgVar.d;
            if (cjlmVar == null) {
                cjlmVar = cjlm.a;
            }
            effwVarJ.h((TraceId) ejvjVar4.fM(cjlmVar));
        }
        b(cjlgVar, effwVarJ);
        if ((cjlgVar.b & 32) != 0) {
            ejvj ejvjVar5 = efqz.e;
            cjix cjixVarB = cjix.b(cjlgVar.h);
            if (cjixVarB == null) {
                cjixVarB = cjix.MESSAGING_METHOD_UNKNOWN;
            }
            effwVarJ.f((efkm) ejvjVar5.fM(cjixVarB));
        }
        return effwVarJ.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjlg cjlgVar, effw effwVar);

    public abstract void c(effw effwVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
