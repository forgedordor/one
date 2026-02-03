package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uop implements egyi {
    public final cogw a;
    public final eosc b;
    public final ajln c;
    public final fcsu d;
    public final fcsu e;
    public final ekgb f;
    public final AtomicReference g = new AtomicReference(egyh.a);
    private final eosc h;
    private final Optional i;

    public uop(cogw cogwVar, eosc eoscVar, eosc eoscVar2, ajln ajlnVar, fcsu fcsuVar, fcsu fcsuVar2, ekgb ekgbVar, Optional optional) {
        this.a = cogwVar;
        this.b = eoscVar;
        this.h = eoscVar2;
        this.c = ajlnVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = ekgbVar;
        this.i = optional;
        ejwl.b(!ekgbVar.isEmpty(), "Unable to create a conversation with empty Recipients.");
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eieu eieuVarK = eiiy.k("MessageDataSource#CreateConversationDatasource#LoadData");
        try {
            eopy eopyVar = new eopy(eork.i((egyh) this.g.get()));
            eieuVarK.a(eopyVar);
            eieuVarK.close();
            return eopyVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        eieu eieuVarK = eiiy.k("MessageDataSource#CreateConversationDatasource#FetchAndStoreData");
        try {
            eiju eijuVarI = ((eiju) this.i.map(new Function() { // from class: uom
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bbdl) this.a.d.b()).f(((Integer) obj).intValue()).f();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: uon
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aofc) this.a.e.b()).e((SelfIdentityId) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(eijx.e(Optional.empty()))).i(new eooz() { // from class: uoo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final uop uopVar = this.a;
                    return uopVar.c.o((Optional) obj, uopVar.f, null).h(new ejvr() { // from class: uol
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            uop uopVar2 = uopVar;
                            uopVar2.g.getAndSet(egyh.a((Conversation) obj2, uopVar2.a.f()));
                            return null;
                        }
                    }, uopVar.b);
                }
            }, this.h);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final /* synthetic */ Object c() {
        return "create_conversation_data_source";
    }
}
