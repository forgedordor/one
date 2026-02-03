package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akol implements aknm {
    public static final akzh a;
    private static final cczv e = cdag.m(cdag.b, "use_guessed_min_match_value", false);
    public final fcsu b;
    public final fcsu c;
    public final Locale d;
    private final Context f;
    private final fdjx g;
    private final fdjx h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final eksp m;

    static {
        String[] strArr = akzi.a;
        akzh akzhVar = new akzh();
        Function[] functionArr = {new Function() { // from class: aknv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                akzh akzhVar2 = (akzh) obj;
                akzh akzhVar3 = akol.a;
                int iIntValue = akzi.c().intValue();
                if (iIntValue < 10007) {
                    dqru.x("conv_type", iIntValue);
                }
                akzhVar2.ap(new dqty("conversations.conv_type", 2, 2));
                return akzhVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: aknw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                akzh akzhVar2 = (akzh) obj;
                akzh akzhVar3 = akol.a;
                int iIntValue = akzi.c().intValue();
                if (iIntValue < 10006) {
                    dqru.x("join_state", iIntValue);
                }
                akzhVar2.ap(new dqty("conversations.join_state", 1, 0));
                return akzhVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        akzh[] akzhVarArr = new akzh[2];
        for (int i = 0; i < 2; i++) {
            akzhVarArr[i] = (akzh) functionArr[i].apply(new akzh());
        }
        akzhVar.aq(akzhVarArr);
        a = akzhVar;
    }

    public akol(Context context, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.f = context;
        this.g = fdjxVar;
        this.h = fdjxVar2;
        this.b = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fcsuVar5;
        this.c = fcsuVar6;
        this.d = craf.c(context);
        this.m = eksp.c("BugleConversation");
    }

    private final eiju e(ekgb ekgbVar, Optional optional, boolean z, boolean z2, Integer num, boolean z3, boolean z4) throws IOException {
        eieu eieuVarH = eiiy.h("ConversationSearcherImpl#findConversationExactMatch");
        try {
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
            Iterator<E> it = ekgbVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((Recipient) it.next()).g());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String strN = ((alqm) it2.next()).n();
                if (strN != null) {
                    arrayList2.add(strN);
                }
            }
            ekgb ekgbVarA = ekfv.a(arrayList2);
            eksp ekspVar = this.m;
            ((eksl) ekspVar.e()).u("requiredDestination size is: %s, requiredRecipient size is: %s", ekgbVarA.size(), ekgbVar.size());
            if (!ekgbVarA.isEmpty()) {
                eiju eijuVarC = auvw.c(this.g, fcyi.a, fdjz.a, new akoi(this, ekgbVarA, optional, z, z2, num, z3, z4, null));
                fczl.a(eieuVarH, null);
                return eijuVarC;
            }
            ((eksl) ekspVar.j()).q("Unable to findConversationExactMatch: Empty destination list.");
            eiju eijuVarD = eijx.d(new IllegalArgumentException("Unable to findConversationExactMatch: Empty destination list."));
            eijuVarD.getClass();
            fczl.a(eieuVarH, null);
            return eijuVarD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.aknm
    public final eiju a(akzk akzkVar) throws IOException {
        eieu eieuVarH;
        int i = akzkVar.h - 1;
        if (i == 0) {
            return e(akzkVar.a, akzkVar.c, akzkVar.d, true, akzkVar.e, akzkVar.f, akzkVar.g);
        }
        if (i == 1) {
            ekgb ekgbVar = akzkVar.a;
            ekgb ekgbVar2 = akzkVar.b;
            Optional optional = akzkVar.c;
            boolean z = akzkVar.d;
            Integer num = akzkVar.e;
            boolean z2 = akzkVar.f;
            boolean z3 = akzkVar.g;
            eieuVarH = eiiy.h("ConversationSearcherImpl#findConversationPartialMatch");
            try {
                ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
                Iterator<E> it = ekgbVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Recipient) it.next()).g());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String strN = ((alqm) it2.next()).n();
                    if (strN != null) {
                        arrayList2.add(strN);
                    }
                }
                ekgb ekgbVarA = ekfv.a(arrayList2);
                ArrayList arrayList3 = new ArrayList(fcva.p(ekgbVar2, 10));
                Iterator<E> it3 = ekgbVar2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Recipient) it3.next()).g());
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    String strN2 = ((alqm) it4.next()).n();
                    if (strN2 != null) {
                        arrayList4.add(strN2);
                    }
                }
                ekgb ekgbVarA2 = ekfv.a(arrayList4);
                eksp ekspVar = this.m;
                ((eksl) ekspVar.e()).J("requiredDestination size is: %s, requiredRecipient size is: %s, optionalDestination size is: %s, optionalRecipient size is: %s", Integer.valueOf(ekgbVarA.size()), Integer.valueOf(ekgbVar.size()), Integer.valueOf(ekgbVarA2.size()), Integer.valueOf(ekgbVar2.size()));
                if (!ekgbVarA.isEmpty() || !ekgbVarA2.isEmpty() || optional.isPresent()) {
                    eiju eijuVarC = auvw.c(this.g, fcyi.a, fdjz.a, new akoj(this, ekgbVarA, ekgbVarA2, optional, z, num, z2, z3, null));
                    fczl.a(eieuVarH, null);
                    return eijuVarC;
                }
                ((eksl) ekspVar.j()).q("Unable to findConversationPartialMatch: Empty destination list and name.");
                eiju eijuVarD = eijx.d(new IllegalArgumentException("Unable to findConversationPartialMatch: Empty destination list and name."));
                eijuVarD.getClass();
                fczl.a(eieuVarH, null);
                return eijuVarD;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        if (i != 2) {
            return e(akzkVar.a, akzkVar.c, akzkVar.d, false, null, akzkVar.f, akzkVar.g);
        }
        ekgb ekgbVar3 = akzkVar.a;
        boolean z4 = akzkVar.g;
        eieuVarH = eiiy.h("ConversationSearcherImpl#findConversationBestMatch");
        try {
            if (ekgbVar3.isEmpty()) {
                ((eksl) this.m.j()).q("Unable to findConversationBestMatch: Empty recipient list.");
                eiju eijuVarD2 = eijx.d(new IllegalArgumentException("Unable to findConversationBestMatch: Empty recipient list."));
                eijuVarD2.getClass();
                fczl.a(eieuVarH, null);
                return eijuVarD2;
            }
            ArrayList arrayList5 = new ArrayList(fcva.p(ekgbVar3, 10));
            Iterator<E> it5 = ekgbVar3.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((Recipient) it5.next()).g());
            }
            List listAb = fcva.ab(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : listAb) {
                ((alqm) obj).o();
                arrayList6.add(obj);
            }
            eiju eijuVarC2 = auvw.c(this.h, fcyi.a, fdjz.a, new akoh(((avpc) this.i.b()).k(ekfv.a(arrayList6)), z4, this, null));
            fczl.a(eieuVarH, null);
            return eijuVarC2;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r6 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.akok
            if (r0 == 0) goto L13
            r0 = r6
            akok r0 = (defpackage.akok) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akok r0 = new akok
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L9a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L5e
        L36:
            defpackage.fctl.b(r6)
            cczv r6 = defpackage.akol.e
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L8b
            fcsu r6 = r5.l
            java.lang.Object r6 = r6.b()
            awfd r6 = (defpackage.awfd) r6
            eiju r6 = r6.a()
            r6.getClass()
            r0.c = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L9e
        L5e:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r6.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 6
            if (r0 < r1) goto L81
            java.lang.Object r6 = r6.get()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L85
        L81:
            int r6 = defpackage.awcn.a()
        L85:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        L8b:
            eiju r6 = defpackage.awcn.b()
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L9e
        L9a:
            r6.getClass()
            return r6
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akol.b(fcxy):java.lang.Object");
    }

    public final boolean c(boolean z, ConversationIdType conversationIdType) {
        return z && !((akbs) this.c.b()).f(conversationIdType);
    }

    public final boolean d(ekhx ekhxVar, String str, int i) throws IOException {
        eieu eieuVarH = eiiy.h("ConversationSearcherImpl#isParticipantsIncluding");
        try {
            ekqg ekqgVarListIterator = ekhxVar.listIterator();
            ekqgVarListIterator.getClass();
            while (ekqgVarListIterator.hasNext()) {
                if (((awcn) this.k.b()).f((String) ekqgVarListIterator.next(), str, i, ((crnb) this.j.b()).b()) != 4) {
                    fczl.a(eieuVarH, null);
                    return true;
                }
            }
            fczl.a(eieuVarH, null);
            return false;
        } finally {
        }
    }
}
