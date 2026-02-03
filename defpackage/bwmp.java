package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwmp extends cayv {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;

    public bwmp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = fcsuVar3;
        this.c = fcsuVar4;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UndeliveredMessageFallbackHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bwmr.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final bwmr bwmrVar = (bwmr) evuhVar;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(baui.b);
        ekfwVar.j(baui.a);
        final ekgb ekgbVarG = ekfwVar.g();
        return eijx.g(new Callable() { // from class: bwmo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConversationIdType conversationIdTypeB = barn.b(bwmrVar.b);
                bwmp bwmpVar = this.a;
                ekgb ekgbVarD = ((bvus) bwmpVar.a.b()).d(conversationIdTypeB, ekgbVarG);
                ajrc ajrcVar = (ajrc) bwmpVar.c.b();
                Stream map = Collection.EL.stream(ekgbVarD).map(new Function() { // from class: bwmn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessagesTable.BindData) obj).E();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = ekgb.d;
                Iterable iterable = (Iterable) map.collect(ekcv.a);
                ajsk ajskVarE = ajsl.e();
                ajskVarE.c(21);
                ajskVarE.b(embo.MESSAGE_TO_NON_ENCRYPTED_RECIPIENT);
                int iB = ajrcVar.b(iterable, ajskVarE.a());
                if (ekgbVarD.size() != iB) {
                    cqbd cqbdVarE = bwmp.E.e();
                    cqbdVarE.y("messagesSize", ekgbVarD.size());
                    cqbdVarE.y("updateCount", iB);
                    cqbdVarE.I("messages which failed to reach recipient who lost e2ee may already have been manually deleted");
                    cqbdVarE.r();
                }
                int size = ekgbVarD.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) ekgbVarD.get(i3);
                    bwey bweyVar = (bwey) bwmpVar.b.b();
                    basd basdVarI = bindData.I();
                    if (bweyVar.c.a()) {
                        ((cbqh) bweyVar.b.b()).c(basdVarI, basd.a, 4, 27, 44);
                    } else {
                        bweyVar.f(basdVarI, basd.a, 4, 27, 44);
                    }
                }
                return cbcw.i();
            }
        }, (Executor) this.d.b());
    }
}
