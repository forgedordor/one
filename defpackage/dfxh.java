package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxh implements eora {
    public static final dhip a = new dhip("SendFileOverMsrpOperationResultProcessor");
    private final efft b;
    private final fcsu c;
    private final eosc d;
    private final deza e;
    private final efpp f;
    private final efqv g;
    private final dfux h;

    public dfxh(efft efftVar, efpp efppVar, efqv efqvVar, fcsu fcsuVar, eosc eoscVar, deza dezaVar, dfux dfuxVar) {
        this.b = efftVar;
        this.f = efppVar;
        this.g = efqvVar;
        this.c = fcsuVar;
        this.d = eoscVar;
        this.e = dezaVar;
        this.h = dfuxVar;
    }

    private final void c(MessagingOperationResult messagingOperationResult) {
        efct efctVar = (efct) this.b;
        evqs evqsVar = efctVar.d;
        if (evqsVar.H()) {
            throw new IllegalStateException("opaqueData is not present");
        }
        cjkt cjktVar = (cjkt) cjku.a.createBuilder();
        cjgr cjgrVar = (cjgr) this.f.fH().fM(efctVar.a);
        cjktVar.copyOnWrite();
        cjku cjkuVar = (cjku) cjktVar.instance;
        cjgrVar.getClass();
        cjkuVar.g = cjgrVar;
        cjkuVar.b |= 16;
        cjjb cjjbVarA = this.g.apply(messagingOperationResult.a());
        cjktVar.copyOnWrite();
        cjku cjkuVar2 = (cjku) cjktVar.instance;
        cjjbVarA.getClass();
        cjkuVar2.e = cjjbVarA;
        cjkuVar2.b |= 4;
        cjjv cjjvVar = (cjjv) cjjw.a.createBuilder();
        String strF = efctVar.b.f();
        cjjvVar.copyOnWrite();
        cjjw cjjwVar = (cjjw) cjjvVar.instance;
        cjjwVar.b |= 1;
        cjjwVar.c = strF;
        cjktVar.copyOnWrite();
        cjku cjkuVar3 = (cjku) cjktVar.instance;
        cjjw cjjwVar2 = (cjjw) cjjvVar.build();
        cjjwVar2.getClass();
        cjkuVar3.f = cjjwVar2;
        cjkuVar3.b |= 8;
        cjll cjllVar = (cjll) cjlm.a.createBuilder();
        String strA = efctVar.c.a();
        cjllVar.copyOnWrite();
        cjlm cjlmVar = (cjlm) cjllVar.instance;
        cjlmVar.b |= 1;
        cjlmVar.c = strA;
        cjktVar.copyOnWrite();
        cjku cjkuVar4 = (cjku) cjktVar.instance;
        cjlm cjlmVar2 = (cjlm) cjllVar.build();
        cjlmVar2.getClass();
        cjkuVar4.d = cjlmVar2;
        cjkuVar4.b |= 2;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = evqsVar;
        cjktVar.copyOnWrite();
        cjku cjkuVar5 = (cjku) cjktVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        cjkuVar5.c = evqeVar;
        cjkuVar5.b |= 1;
        cjku cjkuVar6 = (cjku) cjktVar.build();
        cjim cjimVar = (cjim) this.c.b();
        eork.r(fcrw.a(cjimVar.a.a(cjip.g(), cjimVar.b), cjkuVar6), new dfxg(cjkuVar6), this.d);
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
        messagingOperationResult.getClass();
        String strC = messagingOperationResult.c();
        dhja.l(a, "[%s] Messaging operation completed, %s", strC, messagingOperationResult.a().e());
        c(messagingOperationResult);
        if (((Boolean) deza.b.a()).booleanValue()) {
            this.e.e((fhaz) this.h.fM(((efct) this.b).c), strC);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        efft efftVar = this.b;
        dhip dhipVar = a;
        efct efctVar = (efct) efftVar;
        efiw efiwVar = efctVar.b;
        dhja.j(th, dhipVar, "[%s] Messaging operation failed: %s", efiwVar.f(), th.getMessage());
        effe effeVarD = MessagingResult.d();
        effeVarD.c(16);
        effeVarD.b(7);
        MessagingResult messagingResultE = effeVarD.e();
        Conversation conversation = efctVar.a;
        effc effcVarE = MessagingOperationResult.e();
        effcVarE.b(conversation);
        effcVarE.d(efiwVar.f());
        effcVarE.e(messagingResultE);
        effcVarE.c(false);
        c(effcVarE.a());
        if (((Boolean) deza.b.a()).booleanValue()) {
            this.e.d((fhaz) this.h.fM(efctVar.c), efiwVar.f());
        }
    }
}
