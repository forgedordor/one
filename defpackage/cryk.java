package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cryk {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcyh n;

    public cryk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar13.getClass();
        fcyhVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.k = fcsuVar9;
        this.l = fcsuVar10;
        this.m = fcsuVar11;
        this.g = fcsuVar12;
        this.h = fcsuVar13;
        this.n = fcyhVar;
    }

    public static final void j(cryl crylVar, final ConversationIdType conversationIdType) {
        if (crylVar.b != null) {
            return;
        }
        bqqz bqqzVarA = bqrg.a();
        bqqzVarA.A("SpamLoggingMetadata#cacheClassification");
        bqqzVarA.c(new Function() { // from class: cryf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqrf bqrfVar = (bqrf) obj;
                bqrfVar.b(conversationIdType);
                return bqrfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqqzVarA.D((String) DesugarArrays.stream(new bqqw[]{new bqqw(bqrg.b.h)}).map(new Function() { // from class: bqqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqqw) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        crylVar.b = bqqzVarA.b().z();
    }

    public final cryl a(csdr csdrVar) {
        ecem.b();
        cryl crylVar = new cryl(((cogw) this.g.b()).f().toEpochMilli());
        cspl csplVar = (cspl) csdrVar;
        ConversationIdType conversationIdType = csplVar.d;
        j(crylVar, conversationIdType);
        i(crylVar, csplVar.h, conversationIdType);
        e(crylVar, conversationIdType);
        crylVar.d = csdrVar;
        return crylVar;
    }

    public final cryl b(ParticipantsTable.BindData bindData, bvdk bvdkVar) {
        ecem.b();
        cryl crylVar = new cryl(((cogw) this.g.b()).f().toEpochMilli());
        crylVar.f = ((csqi) this.j.b()).a(bindData);
        crylVar.g = bvdkVar;
        return crylVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eofc r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, defpackage.cryl r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryk.c(eofc, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, cryl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eofc r7, defpackage.csnx r8, defpackage.cryl r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryk.d(eofc, csnx, cryl, fcxy):java.lang.Object");
    }

    public final void e(cryl crylVar, ConversationIdType conversationIdType) {
        bvdk bvdkVarS;
        if (crylVar.g == null && (bvdkVarS = ((bakt) this.l.b()).s(conversationIdType)) != null) {
            crylVar.g = bvdkVarS;
        }
    }

    public final void f(cryl crylVar, ConversationIdType conversationIdType) {
        if (crylVar.c != null) {
            return;
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("SpamLoggingMetadata#cacheLatestMessages");
        brdrVarD.g(baxe.E(conversationIdType));
        brdrVarD.d(new brdo(MessagesTable.c.i, false));
        Object objE = crtr.g.e();
        objE.getClass();
        brdrVarD.y(((Number) objE).intValue());
        ekgb<MessagesTable.BindData> ekgbVarA = brdrVarD.b().z().a();
        ekgbVarA.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarA, 10));
        for (MessagesTable.BindData bindData : ekgbVarA) {
            cspm cspmVar = (cspm) this.i.b();
            bindData.getClass();
            arrayList.add(cspmVar.b(bindData));
        }
        crylVar.c = arrayList;
    }

    public final void g(cryl crylVar, ConversationIdType conversationIdType) {
        if (crylVar.e != null) {
            return;
        }
        crylVar.e = ((bakt) this.l.b()).K(conversationIdType);
    }

    public final void h(cryl crylVar, MessageIdType messageIdType, ConversationIdType conversationIdType) {
        MessageCoreData messageCoreDataA;
        if (crylVar.d != null) {
            return;
        }
        f(crylVar, conversationIdType);
        List list = crylVar.c;
        list.getClass();
        Object obj = null;
        if (messageIdType != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (fdbq.f(((csdr) next).d(), messageIdType)) {
                    obj = next;
                    break;
                }
            }
            crylVar.d = (csdr) obj;
            if (crylVar.d != null || (messageCoreDataA = ((baxe) this.m.b()).A(messageIdType)) == null) {
                return;
            }
            crylVar.d = ((cspm) this.i.b()).a(messageCoreDataA);
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (((csdr) objPrevious).i()) {
                obj = objPrevious;
                break;
            }
        }
        crylVar.d = (csdr) obj;
        if (crylVar.d == null) {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("SpamLoggingMetadata#cacheTargetMessage");
            brec brecVarE = baxe.E(conversationIdType);
            brecVarE.aj(100, 117);
            brdrVarD.g(brecVarE);
            brdrVarD.d(new brdo(MessagesTable.c.i, false));
            brdrVarD.y(1);
            ekgb ekgbVarZ = brdrVarD.b().z();
            ekgbVarZ.getClass();
            MessagesTable.BindData bindData = (MessagesTable.BindData) fcva.Y(ekgbVarZ);
            if (bindData != null) {
                crylVar.d = ((cspm) this.i.b()).b(bindData);
            }
        }
    }

    public final void i(cryl crylVar, String str, ConversationIdType conversationIdType) {
        Object next;
        ParticipantsTable.BindData bindDataB;
        if (crylVar.f != null) {
            return;
        }
        g(crylVar, conversationIdType);
        List list = crylVar.e;
        list.getClass();
        Object obj = null;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (fdbq.f(((ParticipantsTable.BindData) next2).R(), str)) {
                    obj = next2;
                    break;
                }
            }
            bindDataB = (ParticipantsTable.BindData) obj;
            if (bindDataB == null) {
                bindDataB = ((bbca) this.k.b()).b(str);
            }
        } else {
            f(crylVar, conversationIdType);
            List list2 = crylVar.c;
            list2.getClass();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((csdr) next).i()) {
                        break;
                    }
                }
            }
            csdr csdrVar = (csdr) next;
            String strG = csdrVar != null ? csdrVar.g() : null;
            if (strG != null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (fdbq.f(((ParticipantsTable.BindData) next3).R(), strG)) {
                        obj = next3;
                        break;
                    }
                }
                bindDataB = (ParticipantsTable.BindData) obj;
                if (bindDataB == null) {
                    bindDataB = (ParticipantsTable.BindData) fcva.P(list);
                }
            } else {
                bindDataB = (ParticipantsTable.BindData) fcva.P(list);
            }
        }
        if (bindDataB != null) {
            crylVar.f = ((csqi) this.j.b()).a(bindDataB);
        }
    }

    public final Object k(MessageIdType messageIdType, ConversationIdType conversationIdType, csnx csnxVar, cryl crylVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new cryh(null, csnxVar, this, crylVar, conversationIdType, messageIdType), fcxyVar);
    }
}
