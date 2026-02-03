package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhh extends dqpi {
    public static final /* synthetic */ int b = 0;
    public final fdap a;
    private final dqsn c;
    private final arxr d;
    private final Set e;

    public anhh(dqsn dqsnVar, arxr arxrVar, fdap fdapVar) {
        Set linkedHashSet;
        this.c = dqsnVar;
        this.d = arxrVar;
        this.a = fdapVar;
        if (((eoth) ((arxk) arxrVar).a.b()).a("bugle.use_concurrent_hash_map_for_impacted_messages")) {
            linkedHashSet = ConcurrentHashMap.newKeySet();
            linkedHashSet.getClass();
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        this.e = linkedHashSet;
    }

    private final void f(brdr brdrVar, final dqxe dqxeVar) throws IOException {
        brdrVar.e(new Function() { // from class: anhd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                int i = anhh.b;
                return new brao[]{branVar.a, branVar.b, branVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.h(new Function() { // from class: anhe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = anhh.b;
                brecVar.A(false);
                brecVar.s(dqxeVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = brdrVar.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            while (brapVar.moveToNext()) {
                Set set = this.e;
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(brapVar.q(), -1L);
                BugleConversationId bugleConversationId = new BugleConversationId(brapVar.p());
                Instant instantOfEpochMilli = Instant.ofEpochMilli(brapVar.l());
                instantOfEpochMilli.getClass();
                set.add(new angw(coreBugleMessageId, bugleConversationId, instantOfEpochMilli));
            }
            fczl.a(dqqjVarP, null);
        } finally {
        }
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        dqpd dqpdVarB = dqsdVar.b();
        if (dqpdVarB != null) {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("ReactionsChangeQueryListener#onChangeInTransaction-messages1");
            f(brdrVarD, new dqxl("($V)", new Object[]{((bqit) dqpdVarB).k().b()}));
        }
        Set set = this.e;
        if (set.isEmpty()) {
            return;
        }
        final ekgb ekgbVarA = ekfv.a(set);
        this.c.g(new dqsm() { // from class: anhb
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = anhh.b;
                return eiiy.a("RCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(ekgbVarA.hashCode()), new Runnable() { // from class: anhc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.invoke(ekgbVarA);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        this.e.clear();
        dqyd dqydVarC = dqsdVar.c();
        if (dqydVarC != null) {
            bqkg bqkgVarA = bqkl.a();
            bqkgVarA.e(new Function() { // from class: anhf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = anhh.b;
                    return ((bqjp) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekqh it = dqydVarC.e.iterator();
            while (it.hasNext()) {
                dqyj dqyjVar = (dqyj) it.next();
                dqyjVar.getClass();
                bqkgVarA.k((bqkj) dqyjVar);
            }
            bqkf bqkfVarB = bqkgVarA.b();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("ReactionsChangeQueryListener#preChangeInTransaction-messages1");
            f(brdrVarD, bqkfVarB);
        }
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD != null) {
            bqkg bqkgVarA2 = bqkl.a();
            bqkgVarA2.e(new Function() { // from class: anhg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = anhh.b;
                    return ((bqjp) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqkgVarA2.k((bqkj) dqyjVarD);
            bqkf bqkfVarB2 = bqkgVarA2.b();
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("ReactionsChangeQueryListener#preChangeInTransaction-messages2");
            f(brdrVarD2, bqkfVarB2);
        }
    }
}
