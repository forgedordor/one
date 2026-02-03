package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amjy extends dqpi {
    public static final /* synthetic */ int c = 0;
    public final fdap a;
    public final List b = new ArrayList();
    private final dqsn d;

    public amjy(dqsn dqsnVar, fdap fdapVar) {
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
        final VmtTable.BindData bindData = (VmtTable.BindData) dqsdVar.b();
        if (bindData == null) {
            arrayList = new ArrayList();
        } else {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#insert");
            brdrVarD.e(new Function() { // from class: amjq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = amjy.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.e(new Function() { // from class: amjr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsgr bsgrVar = (bsgr) obj;
                    int i = amjy.c;
                    return new bsgs[]{bsgrVar.a, bsgrVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjeVarC.h(new Function() { // from class: amjs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    int i = amjy.c;
                    bsjlVar.j(bindData.n());
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.H(dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a).g());
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
                if (dqpdVar instanceof VmtTable.BindData) {
                    arrayList4.add(dqpdVar);
                }
            }
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#bulkInsert");
            brdrVarD2.e(new Function() { // from class: amjt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = amjy.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsje bsjeVarC2 = PartsTable.c();
            bsjeVarC2.e(new Function() { // from class: amju
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsgr bsgrVar = (bsgr) obj;
                    int i = amjy.c;
                    return new bsgs[]{bsgrVar.a, bsgrVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjeVarC2.h(new Function() { // from class: amjv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    int i = amjy.c;
                    List list = arrayList4;
                    ArrayList arrayList5 = new ArrayList(fcva.p(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((VmtTable.BindData) it.next()).n());
                    }
                    bsjlVar.k(fcva.av(arrayList5));
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD2.H(dqts.i(bsjeVarC2.b(), PartsTable.d.b, MessagesTable.c.a).g());
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
        bvcz bvczVar = (bvcz) dqsdVar.c();
        if (bvczVar == null) {
            arrayList3 = new ArrayList();
        } else {
            String[] strArr = VmtTable.a;
            bvcy bvcyVar = new bvcy(VmtTable.a);
            bvcyVar.A("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#update");
            ekqh it = bvczVar.e.iterator();
            while (it.hasNext()) {
                dqyj dqyjVar = (dqyj) it.next();
                dqyjVar.getClass();
                bvcyVar.k((bvdb) dqyjVar);
            }
            brdr brdrVarD3 = MessagesTable.d();
            brdrVarD3.A("PreviewMessageChangeQueryListener#onChangeInTransaction#update3");
            brdrVarD3.e(new Function() { // from class: amjn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = amjy.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsje bsjeVarC3 = PartsTable.c();
            bsjeVarC3.e(new Function() { // from class: amjo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsgr bsgrVar = (bsgr) obj;
                    int i = amjy.c;
                    return new bsgs[]{bsgrVar.a, bsgrVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bvcx bvcxVarB = bvcyVar.b();
            bvcn bvcnVar = VmtTable.c.a;
            bsgr bsgrVar = PartsTable.d;
            bsjeVarC3.H(dqts.i(bvcxVarB, bvcnVar, bsgrVar.a).g());
            brdrVarD3.H(dqts.i(bsjeVarC3.b(), bsgrVar.b, MessagesTable.c.a).g());
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
        this.d.g(new dqsm() { // from class: amjm
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = amjy.c;
                return eiiy.a("VTCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(list.hashCode()), new Runnable() { // from class: amjp
            @Override // java.lang.Runnable
            public final void run() {
                amjy amjyVar = this.a;
                amjyVar.a.invoke(ekfv.a(amjyVar.b));
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
            String[] strArr = VmtTable.a;
            bvcy bvcyVar = new bvcy(VmtTable.a);
            bvcyVar.A("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#delete");
            bvcyVar.k((bvdb) dqyjVarD);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#delete2");
            brdrVarD.e(new Function() { // from class: amjw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = amjy.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.e(new Function() { // from class: amjx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsgr bsgrVar = (bsgr) obj;
                    int i = amjy.c;
                    return new bsgs[]{bsgrVar.a, bsgrVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bvcx bvcxVarB = bvcyVar.b();
            bvcn bvcnVar = VmtTable.c.a;
            bsgr bsgrVar = PartsTable.d;
            bsjeVarC.H(dqts.i(bvcxVarB, bvcnVar, bsgrVar.a).g());
            brdrVarD.H(dqts.i(bsjeVarC.b(), bsgrVar.b, MessagesTable.c.a).g());
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
