package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class annh extends dqpi {
    public static final /* synthetic */ int c = 0;
    public final fdap a;
    public final List b;
    private final dqsn d;

    public annh(dqsn dqsnVar, fdap fdapVar) {
        List arrayList;
        this.d = dqsnVar;
        this.a = fdapVar;
        if (((Boolean) ((cczi) crbf.bv.get()).e()).booleanValue()) {
            arrayList = DesugarCollections.synchronizedList(new ArrayList());
            arrayList.getClass();
        } else {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
    }

    private static final List f(ajle ajleVar, brap brapVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (brapVar.moveToNext()) {
            try {
                MessagesTable.BindData bindData = (MessagesTable.BindData) brapVar.cQ();
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.E(), -1L);
                ConversationIdType conversationIdTypeD = bindData.D();
                if (conversationIdTypeD == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ajle ajleVar2 = ajleVar;
                arrayList.add(new anap(ajleVar2, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(bindData.w()), 0));
                ajleVar = ajleVar2;
            } finally {
            }
        }
        fczl.a(brapVar, null);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        dqqj dqqjVarP;
        List arrayList;
        Iterable arrayList2;
        List arrayList3;
        final brlo brloVar = (brlo) dqsdVar.b();
        if (brloVar == null) {
            arrayList = new ArrayList();
        } else {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("SuggestionShortcutChangeQueryListener#onChangeInTransaction#insert");
            brdrVarD.e(new Function() { // from class: annd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = annh.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: anne
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = annh.c;
                    brecVar.p(brloVar.k());
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqqjVarP = brdrVarD.b().p();
            try {
                List listF = f(ajle.INSERT, (brap) dqqjVarP);
                fczl.a(dqqjVarP, null);
                arrayList = listF;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        List list = this.b;
        fcva.y(list, arrayList);
        dqpd[] dqpdVarArrA = dqsdVar.a();
        if (dqpdVarArrA != null) {
            final ArrayList arrayList4 = new ArrayList();
            for (dqpd dqpdVar : dqpdVarArrA) {
                if (dqpdVar instanceof brlo) {
                    arrayList4.add(dqpdVar);
                }
            }
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("SuggestionShortcutChangeQueryListener#onChangeInTransaction#bulkInsert");
            brdrVarD2.e(new Function() { // from class: anmx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = annh.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD2.h(new Function() { // from class: anmy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = annh.c;
                    List list2 = arrayList4;
                    ArrayList arrayList5 = new ArrayList(fcva.p(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((brlo) it.next()).k());
                    }
                    brecVar.t(fcva.av(arrayList5));
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqqjVarP = brdrVarD2.b().p();
            try {
                arrayList2 = f(ajle.INSERT, (brap) dqqjVarP);
                fczl.a(dqqjVarP, null);
            } finally {
            }
        } else {
            arrayList2 = new ArrayList();
        }
        fcva.y(list, arrayList2);
        List list2 = this.b;
        brnb brnbVar = (brnb) dqsdVar.c();
        if (brnbVar == null) {
            arrayList3 = new ArrayList();
        } else {
            brna brnaVarA = brnk.a();
            brnaVarA.A("SuggestionShortcutChangeQueryListener#onChangeInTransaction#update");
            brnaVarA.c(new Function() { // from class: annb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brmj brmjVar = (brmj) obj;
                    int i = annh.c;
                    return new brmk[]{brmjVar.b, brmjVar.e, brmjVar.d, brmjVar.g};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekqh it = brnbVar.e.iterator();
            while (it.hasNext()) {
                dqyj dqyjVar = (dqyj) it.next();
                dqyjVar.getClass();
                brnaVarA.k((brnd) dqyjVar);
            }
            brdr brdrVarD3 = MessagesTable.d();
            brdrVarD3.A("SuggestionShortcutChangeQueryListener#onChangeInTransaction#update2");
            brdrVarD3.e(new Function() { // from class: annc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = annh.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD3.G(dqts.i(brnaVarA.b(), brnk.c.b, MessagesTable.c.a));
            dqqjVarP = brdrVarD3.b().p();
            try {
                List listF2 = f(ajle.UPDATE, (brap) dqqjVarP);
                fczl.a(dqqjVarP, null);
                arrayList3 = listF2;
            } finally {
            }
        }
        fcva.y(list2, arrayList3);
        List list3 = this.b;
        if (list3.isEmpty()) {
            return;
        }
        this.d.g(new dqsm() { // from class: anmz
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = annh.c;
                return eiiy.a("SuggestionShortcutChangeQueryListener::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(list3.hashCode()), new Runnable() { // from class: anna
            @Override // java.lang.Runnable
            public final void run() {
                annh annhVar = this.a;
                annhVar.a.invoke(ekfv.a(annhVar.b));
            }
        });
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        List arrayList;
        this.b.clear();
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD == null) {
            arrayList = new ArrayList();
        } else {
            brna brnaVarA = brnk.a();
            brnaVarA.A("SuggestionShortcutChangeQueryListener#onChangeInTransaction#delete");
            brnaVarA.c(new Function() { // from class: annf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brmj brmjVar = (brmj) obj;
                    int i = annh.c;
                    return new brmk[]{brmjVar.b, brmjVar.e, brmjVar.d, brmjVar.g};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brnaVarA.k((brnd) dqyjVarD);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("SuggestionShortcutChangeQueryListener#onChangeInTransaction#delete2");
            brdrVarD.e(new Function() { // from class: anng
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = annh.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.G(dqts.i(brnaVarA.b(), brnk.c.b, MessagesTable.c.a));
            dqqj dqqjVarP = brdrVarD.b().p();
            try {
                List listF = f(ajle.DELETE, (brap) dqqjVarP);
                fczl.a(dqqjVarP, null);
                arrayList = listF;
            } finally {
            }
        }
        fcva.y(this.b, arrayList);
    }
}
