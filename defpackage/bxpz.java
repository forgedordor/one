package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxpz extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ bxqa f;
    final /* synthetic */ MessageId g;
    final /* synthetic */ coik h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxpz(bxqa bxqaVar, MessageId messageId, coik coikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = bxqaVar;
        this.g = messageId;
        this.h = coikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxpz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        feav feavVar;
        Object obj3;
        MessageId messageId;
        fcyl fcylVar = fcyl.a;
        if (this.e != 0) {
            obj2 = this.d;
            Object obj4 = this.c;
            Object obj5 = this.b;
            Object obj6 = this.a;
            fctl.b(obj);
            messageId = obj4;
            obj3 = obj5;
            feavVar = obj6;
        } else {
            fctl.b(obj);
            bxqa bxqaVar = this.f;
            MessageId messageId2 = this.g;
            final fdap fdapVar = new fdap() { // from class: bxpw
                @Override // defpackage.fdap
                public final Object invoke(Object obj7) {
                    return new feaz();
                }
            };
            feav feavVar2 = (feav) ConcurrentMap.EL.computeIfAbsent(bxqaVar.e, messageId2, new Function() { // from class: bxpx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj7) {
                    return fdapVar.invoke(obj7);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            feavVar2.getClass();
            coik coikVar = this.h;
            this.a = feavVar2;
            this.b = bxqaVar;
            this.c = messageId2;
            this.d = coikVar;
            this.e = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj2 = coikVar;
            messageId = messageId2;
            obj3 = bxqaVar;
            feavVar = feavVar2;
        }
        final MessageId messageId3 = messageId;
        feav feavVar3 = feavVar;
        try {
            Duration duration = bxqa.a;
            ((bxqa) obj3).c.put(messageId3, obj2);
            ((bxqa) obj3).f.c(new Supplier() { // from class: bxpy
                @Override // java.util.function.Supplier
                public final Object get() {
                    return messageId3;
                }
            }, "RichCardMediaTransferProgressManager::Notify");
            ConcurrentHashMap concurrentHashMap = ((bxqa) obj3).d;
            fdlr fdlrVar = (fdlr) concurrentHashMap.get(messageId3);
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            ConcurrentHashMap concurrentHashMap2 = ((bxqa) obj3).e;
            final fdap fdapVar2 = new fdap() { // from class: bxpr
                @Override // defpackage.fdap
                public final Object invoke(Object obj7) {
                    Duration duration2 = bxqa.a;
                    ((MessageId) obj7).getClass();
                    return new feaz();
                }
            };
            concurrentHashMap.put(messageId3, auvw.k(((bxqa) obj3).b, null, null, new bxpv((feav) ConcurrentMap.EL.computeIfAbsent(concurrentHashMap2, messageId3, new Function() { // from class: bxps
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj7) {
                    Duration duration2 = bxqa.a;
                    return fdapVar2.invoke(obj7);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (bxqa) obj3, messageId3, (coik) obj2, null), 3));
            feavVar3.d();
            return fctx.a;
        } catch (Throwable th) {
            feavVar3.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxpz(this.f, this.g, this.h, fcxyVar);
    }
}
