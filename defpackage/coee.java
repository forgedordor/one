package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coee implements cnos {
    public static final /* synthetic */ int a = 0;
    private static final cqce b = cqce.g("Bugle", "CopyFileTelephonyPartsCallback");
    private static final cqbr c = new cqbr(TimeUnit.SECONDS.toMillis(10));
    private static final cczi d = cdag.j(cdag.b, "delete_message_part_batch_size", 50);
    private final coej e;
    private final coeq f;
    private final fcsu g;

    public coee(coej coejVar, coeq coeqVar, fcsu fcsuVar) {
        this.e = coejVar;
        this.f = coeqVar;
        this.g = fcsuVar;
    }

    private final void e(bsgt bsgtVar) {
        if (bsgtVar.getCount() > ((Integer) d.e()).intValue()) {
            cqbd cqbdVarC = b.c();
            cqbdVarC.I("Requested to delete more than 50 messages. Dividing work into batches of 50 messages.");
            cqbdVarC.y("Total message count", bsgtVar.getCount());
            cqbdVarC.r();
        }
        cnlt cnltVar = (cnlt) cnlw.a.createBuilder();
        while (bsgtVar.moveToNext()) {
            String strQ = bsgtVar.q();
            if (strQ != null) {
                cnlu cnluVar = (cnlu) cnlv.a.createBuilder();
                String strP = bsgtVar.p();
                cnluVar.copyOnWrite();
                cnlv cnlvVar = (cnlv) cnluVar.instance;
                strP.getClass();
                cnlvVar.b = strP;
                cnluVar.copyOnWrite();
                ((cnlv) cnluVar.instance).c = strQ;
                cnltVar.copyOnWrite();
                cnlw cnlwVar = (cnlw) cnltVar.instance;
                cnlv cnlvVar2 = (cnlv) cnluVar.build();
                cnlvVar2.getClass();
                evtg evtgVar = cnlwVar.b;
                if (!evtgVar.c()) {
                    cnlwVar.b = evsn.mutableCopy(evtgVar);
                }
                cnlwVar.b.add(cnlvVar2);
                if (((cnlw) cnltVar.instance).b.size() == 100 || bsgtVar.isLast()) {
                    ((cazj) this.e.a.b()).a(cbcu.f("delete_parts_work_item", (cnlw) cnltVar.build()));
                    cnltVar.clear();
                }
            }
        }
    }

    @Override // defpackage.cnos
    public final void a(final ConversationIdType conversationIdType) {
        cqbd cqbdVarC = b.c();
        cqbdVarC.I("onDeletingConversation");
        cqbdVarC.A("conversationId", conversationIdType);
        cqbdVarC.r();
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("onDeletingConversation");
        bsjeVarC.h(new Function() { // from class: cody
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                int i = coee.a;
                final ConversationIdType conversationIdType2 = conversationIdType;
                bsjlVar.i(conversationIdType2);
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.f(new Function() { // from class: coea
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = coee.a;
                        return ((bran) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.h(new Function() { // from class: coeb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar = (brec) obj2;
                        int i2 = coee.a;
                        brecVar.m(conversationIdType2);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsjlVar.o(brdrVarD.b());
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.e(new Function() { // from class: codz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsgr bsgrVar = (bsgr) obj;
                int i = coee.a;
                return new bsgs[]{bsgrVar.a, bsgrVar.T};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
        try {
            e(bsgtVar);
            bsgtVar.close();
        } catch (Throwable th) {
            try {
                bsgtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cnos
    public final void b(final ConversationIdType conversationIdType, final List list) {
        cqbd cqbdVarC = b.c();
        cqbdVarC.I("App is deleting messages. Deleting related files from disk.");
        cqbdVarC.A("conversationId", conversationIdType);
        cqbdVarC.r();
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("+onDeletingMessages");
        bsjeVarC.h(new Function() { // from class: coec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                int i = coee.a;
                bsjlVar.i(conversationIdType);
                bsjlVar.p(list);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.e(new Function() { // from class: coed
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsgr bsgrVar = (bsgr) obj;
                int i = coee.a;
                return new bsgs[]{bsgrVar.a, bsgrVar.T};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
        try {
            e(bsgtVar);
            bsgtVar.close();
        } catch (Throwable th) {
            try {
                bsgtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cnos
    public final void c(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.W() == null) {
            cqbd cqbdVarE = b.e();
            cqbdVarE.I("Invoked telephony callback. Part does not have id yet");
            cqbdVarE.A("part.getMessageId", messagePartCoreData.B());
            cqbdVarE.K(c, "missing_id");
            cqbdVarE.r();
            return;
        }
        Uri uriT = messagePartCoreData.t();
        if (uriT == null) {
            cqbd cqbdVarC = b.c();
            cqbdVarC.I("Inserted part has no URI, not copying to local cache");
            cqbdVarC.A("partId", messagePartCoreData.W());
            cqbdVarC.K(c, "content_uri_null");
            cqbdVarC.r();
            return;
        }
        if (!"mms".equals(uriT.getAuthority())) {
            cqbd cqbdVarC2 = b.c();
            cqbdVarC2.I("Ignoring on part inserted. It was not inserting to telephony.");
            cqbdVarC2.A("messagePart.getContentUri().getAuthority()", uriT.getAuthority());
            cqbdVarC2.A("part.getMessageId", messagePartCoreData.B());
            cqbdVarC2.r();
            return;
        }
        cqbd cqbdVarC3 = b.c();
        cqbdVarC3.I("Invoked telephony callback. Scheduling update.");
        cqbdVarC3.A("part.getContentUri().getAuthority()", uriT.getAuthority());
        cqbdVarC3.A("part.getMessageId", messagePartCoreData.B());
        cqbdVarC3.A("part.getPartId()", messagePartCoreData.W());
        cqbdVarC3.K(c, "scheduling");
        cqbdVarC3.r();
        coeq coeqVar = this.f;
        String strW = messagePartCoreData.W();
        cnlp cnlpVar = (cnlp) cnls.a.createBuilder();
        cnlq cnlqVar = (cnlq) cnlr.a.createBuilder();
        cnlqVar.copyOnWrite();
        cnlr cnlrVar = (cnlr) cnlqVar.instance;
        strW.getClass();
        cnlrVar.b = strW;
        String string = uriT.toString();
        cnlqVar.copyOnWrite();
        cnlr cnlrVar2 = (cnlr) cnlqVar.instance;
        string.getClass();
        cnlrVar2.c = string;
        cnlpVar.copyOnWrite();
        cnls cnlsVar = (cnls) cnlpVar.instance;
        cnlr cnlrVar3 = (cnlr) cnlqVar.build();
        cnlrVar3.getClass();
        evtg evtgVar = cnlsVar.b;
        if (!evtgVar.c()) {
            cnlsVar.b = evsn.mutableCopy(evtgVar);
        }
        cazj cazjVar = coeqVar.a;
        cnlsVar.b.add(cnlrVar3);
        cazjVar.a(cbcu.f("CopyFileTelephonyPartHandler", cnlpVar.build()));
    }

    @Override // defpackage.cnos
    public final void d(String str) {
        MessagePartCoreData messagePartCoreDataA = ((bbae) this.g.b()).a(str);
        if (messagePartCoreDataA != null) {
            c(messagePartCoreDataA);
            return;
        }
        cqbd cqbdVarB = b.b();
        cqbdVarB.I("Unable to store attachment copy for non-existent part");
        cqbdVarB.A("partId", str);
        cqbdVarB.r();
    }
}
