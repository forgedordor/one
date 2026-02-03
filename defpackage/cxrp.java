package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrp extends cqdj {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Optional a;
    final /* synthetic */ cxsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxrp(cxsa cxsaVar, Optional optional) {
        super("Bugle.Async.markLastConversationNotYetDelivered.Duration");
        this.a = optional;
        this.b = cxsaVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        final ConversationIdType conversationIdType = (ConversationIdType) this.a.map(new Function() { // from class: cxrn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bact) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: cxro
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = cxrp.c;
                return cxsa.f();
            }
        });
        if (conversationIdType.b()) {
            return new Pair(barn.a, basd.a);
        }
        cxsa cxsaVar = this.b;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getLastUndeliveredRcsMessage");
        brdrVarD.h(new Function() { // from class: cxmb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                ekrg ekrgVar = cxsa.c;
                brecVar.m(conversationIdType);
                brecVar.J(3);
                brecVar.ae(1);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.f(new Function() { // from class: cxmc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = cxsa.c;
                return ((bran) obj).C;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.y(1);
        brap brapVar = (brap) brdrVarD.b().p();
        try {
            MessageCoreData messageCoreDataX = brapVar.moveToFirst() ? ((baxe) cxsaVar.E.b()).x(brapVar.r()) : null;
            brapVar.close();
            messageCoreDataX.getClass();
            basd basdVarF = messageCoreDataX.F();
            if (basd.j(basdVarF)) {
                return new Pair(conversationIdType, basd.a);
            }
            if (((chwq) cxsaVar.w.b()).i(basdVarF) != chwp.NONE) {
                ((axsf) cxsaVar.i.b()).a(basdVarF, false).s();
            } else {
                ekrw ekrwVarJ = cxsa.c.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl$5", "doInBackgroundTimed", 5450, "DebugUtilsImpl.java")).q("client side fallback is disabled.");
            }
            return new Pair(conversationIdType, basdVarF);
        } catch (Throwable th) {
            try {
                brapVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        if (pair.first == null) {
            ((dakl) this.b.Y.b()).j("failed to find 1:1 RCS conversation");
            return;
        }
        if (pair.second == null) {
            ((dakl) this.b.Y.b()).j("last 1:1 RCS conversation doesn't have any undelivered");
            return;
        }
        ((dakl) this.b.Y.b()).j("marking rcs message " + basd.c((basd) pair.second) + " in conversation " + String.valueOf(pair.first) + " as not delivered");
    }
}
