package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akit extends fcyz implements fdat {
    int a;
    final /* synthetic */ akiu b;
    final /* synthetic */ ajts c;
    final /* synthetic */ cbqz d;
    final /* synthetic */ aoer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akit(akiu akiuVar, ajts ajtsVar, cbqz cbqzVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akiuVar;
        this.c = ajtsVar;
        this.d = cbqzVar;
        this.e = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akit) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        aoer aoerVarH = this.e;
        this.a = 1;
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("EncryptionStateManagerImpl.setEncryptionProtocol");
        try {
            if (ajtsVar.z()) {
                zValueOf = false;
                fczl.a(eieuVarH, null);
            } else {
                if (aoerVarH == null && (aoerVarH = ajtsVar.h()) == null) {
                    throw new IllegalStateException("Cannot remove encryption protocol to a conversation without a self identity.");
                }
                Optional optionalO = aoerVarH.o();
                final fdap fdapVar = new fdap() { // from class: akio
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return ((alqm) obj2).e();
                    }
                };
                Optional optionalFlatMap = optionalO.flatMap(new Function() { // from class: akip
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
                if (cbqzVar.e() && ajtsVar.j().e()) {
                    akiuVar.b.e("Bugle.Mls.ConversationDowngrade.Target", (true != ajtsVar.j().b(cbqzVar).f() ? 3 : 2) - 1);
                }
                cbqj cbqjVar = akiuVar.a;
                ConversationId conversationIdD = ajtsVar.d();
                conversationIdD.getClass();
                zValueOf = Boolean.valueOf(cbqjVar.h(((BugleConversationId) conversationIdD).a, aubqVar, aoerVarH.h(), cbqzVar));
                fczl.a(eieuVarH, null);
            }
            return zValueOf == fcylVar ? fcylVar : zValueOf;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akit(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
