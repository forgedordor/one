package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrs implements Runnable {
    final /* synthetic */ wrt a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fdap c;

    public wrs(wrt wrtVar, fdap fdapVar, fdap fdapVar2) {
        this.a = wrtVar;
        this.b = fdapVar;
        this.c = fdapVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = bpcy.a;
        bpcv bpcvVar = new bpcv();
        bpcvVar.ap("ConversationDraftPersistence.updateSync");
        this.b.invoke(bpcvVar);
        wrt wrtVar = this.a;
        ConversationIdType conversationIdTypeB = barn.b(wrtVar.b.b());
        bpcx bpcxVar = new bpcx();
        bpcxVar.b(conversationIdTypeB);
        if (bpcvVar.aj(new bpcw(bpcxVar), "drafts-buildAndUpdateForConversationId")) {
            return;
        }
        if (dqru.c.v()) {
            wrtVar.a(this.c).k(4);
            return;
        }
        bpbj bpbjVarA = wrtVar.a(this.c);
        final dqsy dqsyVarB = bpcy.b();
        dqru.b(bpcy.b(), "drafts", bpbjVarA, new Function() { // from class: bpbg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("drafts", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bpbh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
