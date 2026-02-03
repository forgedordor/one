package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajfd extends fcyz implements fdat {
    final /* synthetic */ ajfe a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajfd(ajfe ajfeVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ajfeVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajfd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object next;
        fctl.b(obj);
        final MessageCoreData messageCoreData = this.b;
        if (!ajfe.b.contains(Integer.valueOf(messageCoreData.d())) || messageCoreData.cB() || messageCoreData.k() != 100 || messageCoreData.at().length() <= 0) {
            return Optional.empty();
        }
        final List listG = messageCoreData.d() == 3 ? fcva.g(new Integer(0), new Integer(1)) : fcva.b(new Integer(3));
        long jO = messageCoreData.o();
        ajfe ajfeVar = this.a;
        Object objB = ajfeVar.d.b();
        objB.getClass();
        final long millis = jO - evxd.c((evrj) objB).toMillis();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("findDuplicateMessageIdAsync");
        brdrVarD.h(new Function() { // from class: ajev
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.m(messageCoreData.A());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.W(messageCoreData.aB());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajex
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.ae(100);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajey
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.ap(new dqpm("messages.message_protocol", 3, brec.as(listG), true));
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajez
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.M(0);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajfa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.V(((SelfIdentityIdImpl) messageCoreData.v()).a);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajfb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.T(messageCoreData.o());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ajfc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.Q(millis);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        Iterator<E> it = ekgbVarZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MessageCoreData messageCoreDataW = ((baxe) ajfeVar.c.b()).w(((MessagesTable.BindData) next).E());
            if (messageCoreDataW != null && messageCoreDataW.c() == messageCoreData.c() && fdbq.f(messageCoreDataW.at(), messageCoreData.at())) {
                break;
            }
        }
        MessagesTable.BindData bindData = (MessagesTable.BindData) next;
        if (bindData == null) {
            return Optional.empty();
        }
        ekrw ekrwVarH = ajfe.a.h();
        ekrwVarH.X(eksq.a, "BugleUsageStatistics");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.b, bindData.E());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/analytics/statistics/DuplicateMessageChecker$findDuplicateMessageIdAsync$1", "invokeSuspend", 84, "DuplicateMessageChecker.kt")).q("Found a duplicate message.");
        return Optional.of(new Long(bindData.B()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajfd(this.a, this.b, fcxyVar);
    }
}
