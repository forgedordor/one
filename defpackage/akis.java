package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akis extends fcyz implements fdat {
    int a;
    final /* synthetic */ akiu b;
    final /* synthetic */ ajts c;
    final /* synthetic */ cbqz d;
    final /* synthetic */ cbqx e;
    final /* synthetic */ aoer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akis(akiu akiuVar, ajts ajtsVar, cbqz cbqzVar, cbqx cbqxVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akiuVar;
        this.c = ajtsVar;
        this.d = cbqzVar;
        this.e = cbqxVar;
        this.f = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akis) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean zValueOf;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akiu akiuVar = this.b;
        ajts ajtsVar = this.c;
        cbqz cbqzVar = this.d;
        cbqx cbqxVar = this.e;
        aoer aoerVar = this.f;
        this.a = 1;
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("EncryptionStateManagerImpl.addEncryptionProtocol");
        try {
            if (ajtsVar.z()) {
                zValueOf = false;
                fczl.a(eieuVarH, null);
            } else {
                cbqzVar.e();
                Optional optionalO = aoerVar.o();
                final fdap fdapVar = new fdap() { // from class: akiq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return ((alqm) obj2).e();
                    }
                };
                Optional optionalFlatMap = optionalO.flatMap(new Function() { // from class: akir
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return fdapVar.invoke(obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                optionalFlatMap.getClass();
                aubq aubqVar = (aubq) fdct.b(optionalFlatMap);
                if (aubqVar == null) {
                    throw new IllegalArgumentException("Self identity does not have a chat endpoint.");
                }
                cbqj cbqjVar = akiuVar.a;
                ConversationId conversationIdD = ajtsVar.d();
                conversationIdD.getClass();
                zValueOf = Boolean.valueOf(cbqjVar.f(((BugleConversationId) conversationIdD).a, ajtsVar.G(), aubqVar, cbqzVar, aoerVar.h(), cbqxVar));
                fczl.a(eieuVarH, null);
            }
            return zValueOf == fcylVar ? fcylVar : zValueOf;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akis(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
