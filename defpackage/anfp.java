package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anfp extends dqpi {
    public static final /* synthetic */ int c = 0;
    public final fdap a;
    public final List b = new ArrayList();
    private final dqsn d;

    public anfp(dqsn dqsnVar, fdap fdapVar) {
        this.d = dqsnVar;
        this.a = fdapVar;
    }

    private static final List f(ajle ajleVar, brap brapVar) {
        ArrayList arrayList = new ArrayList();
        while (brapVar.moveToNext()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) brapVar.cQ();
            CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.E(), -1L);
            ConversationIdType conversationIdTypeD = bindData.D();
            if (conversationIdTypeD == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(new anap(ajleVar, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(bindData.w()), 0));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        dqqj dqqjVarP;
        List arrayList;
        Iterable arrayList2;
        List arrayList3;
        final bpvd bpvdVar = (bpvd) dqsdVar.b();
        if (bpvdVar == null) {
            arrayList = new ArrayList();
        } else {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("PreviewMessageChangeQueryListener#onChangeInTransaction#insert");
            brdrVarD.e(new Function() { // from class: anfh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = anfp.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: anfi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = anfp.c;
                    brecVar.p(bpvdVar.m());
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
        dqpd[] dqpdVarArrA = dqsdVar.a();
        if (dqpdVarArrA != null) {
            final ArrayList arrayList4 = new ArrayList();
            for (dqpd dqpdVar : dqpdVarArrA) {
                if (dqpdVar instanceof bpvd) {
                    arrayList4.add(dqpdVar);
                }
            }
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("PreviewMessageChangeQueryListener#onChangeInTransaction#bulkInsert");
            brdrVarD2.e(new Function() { // from class: anfj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = anfp.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD2.h(new Function() { // from class: anfk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = anfp.c;
                    List list = arrayList4;
                    ArrayList arrayList5 = new ArrayList(fcva.p(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((bpvd) it.next()).m());
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
        List listAh = fcva.ah(arrayList, arrayList2);
        bpxf bpxfVar = (bpxf) dqsdVar.c();
        if (bpxfVar == null) {
            arrayList3 = new ArrayList();
        } else {
            bpxe bpxeVarB = bpxj.b();
            bpxeVarB.A("PreviewMessageChangeQueryListener#onChangeInTransaction#update");
            bpxeVarB.d(new Function() { // from class: anfl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = anfp.c;
                    return new bpwj[]{((bpwi) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekqh it = bpxfVar.e.iterator();
            while (it.hasNext()) {
                dqyj dqyjVar = (dqyj) it.next();
                dqyjVar.getClass();
                bpxeVarB.k((bpxh) dqyjVar);
            }
            brdr brdrVarD3 = MessagesTable.d();
            brdrVarD3.A("PreviewMessageChangeQueryListener#onChangeInTransaction#update2");
            brdrVarD3.e(new Function() { // from class: anfm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = anfp.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD3.G(dqts.i(bpxeVarB.b(), bpxj.c.b, MessagesTable.c.a));
            dqqjVarP = brdrVarD3.b().p();
            try {
                List listF2 = f(ajle.UPDATE, (brap) dqqjVarP);
                fczl.a(dqqjVarP, null);
                arrayList3 = listF2;
            } finally {
            }
        }
        List list = this.b;
        fcva.y(list, fcva.ah(listAh, arrayList3));
        if (list.isEmpty()) {
            return;
        }
        this.d.g(new dqsm() { // from class: anfn
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = anfp.c;
                return eiiy.a("PMCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(list.hashCode()), new Runnable() { // from class: anfo
            @Override // java.lang.Runnable
            public final void run() {
                anfp anfpVar = this.a;
                anfpVar.a.invoke(ekfv.a(anfpVar.b));
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
            bpxe bpxeVarB = bpxj.b();
            bpxeVarB.A("PreviewMessageChangeQueryListener#onChangeInTransaction#delete");
            bpxeVarB.d(new Function() { // from class: anff
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = anfp.c;
                    return new bpwj[]{((bpwi) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bpxeVarB.k((bpxh) dqyjVarD);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("PreviewMessageChangeQueryListener#onChangeInTransaction#delete2");
            brdrVarD.e(new Function() { // from class: anfg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = anfp.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.G(dqts.i(bpxeVarB.b(), bpxj.c.b, MessagesTable.c.a));
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
