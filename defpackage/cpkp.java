package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpkp {
    public final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fdjx f;

    public cpkp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.a = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fdjxVar;
    }

    private final ParticipantsTable.BindData e(MessageCoreData messageCoreData, List list, Map map) {
        Object objQ;
        if (messageCoreData == null) {
            return null;
        }
        if (map.containsKey(messageCoreData.aB())) {
            return (ParticipantsTable.BindData) map.get(messageCoreData.aB());
        }
        if (messageCoreData.ah().isPresent()) {
            objQ = messageCoreData.ah().get();
        } else {
            ParticipantsTable.BindData bindDataB = ((bbca) this.b.b()).b(messageCoreData.aB());
            if (bindDataB == null) {
                return null;
            }
            objQ = ((alrj) this.e.b()).q(bindDataB);
        }
        if (list.contains(objQ)) {
            return null;
        }
        return ((bbca) this.b.b()).b(messageCoreData.aB());
    }

    private final List f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (!list2.contains(((alrj) this.e.b()).q(bindData))) {
                arrayList.add(bindData);
            }
        }
        return arrayList;
    }

    public final eiju a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new cpkm(this, conversationIdType, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, defpackage.fcxy r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpkp.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cpkn
            if (r0 == 0) goto L13
            r0 = r5
            cpkn r0 = (defpackage.cpkn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpkn r0 = new cpkn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.d
            java.lang.Object r5 = r5.b()
            aofc r5 = (defpackage.aofc) r5
            anpj r5 = r5.d()
            eiju r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L78
        L4d:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r5.next()
            aoer r1 = (defpackage.aoer) r1
            j$.util.Optional r1 = r1.o()
            java.lang.Object r1 = defpackage.fdct.b(r1)
            alqm r1 = (defpackage.alqm) r1
            if (r1 == 0) goto L5b
            r0.add(r1)
            goto L5b
        L77:
            return r0
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpkp.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cpko
            if (r0 == 0) goto L13
            r0 = r9
            cpko r0 = (defpackage.cpko) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cpko r0 = new cpko
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.a
            cpkp r0 = r0.e
            defpackage.fctl.b(r9)
            goto L43
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r9)
            r0.e = r7
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r7.c(r0)
            if (r9 == r1) goto Lc3
            r0 = r7
        L43:
            java.util.List r9 = (java.util.List) r9
            java.util.List r8 = r0.f(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r8.size()
            java.util.Iterator r8 = r8.iterator()
        L60:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r8.next()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4
            boolean r5 = r4.X()
            if (r5 == 0) goto L75
            r9.add(r4)
        L75:
            boolean r5 = r4.aa()
            if (r5 == 0) goto L60
            int r5 = r4.o()
            csdn r5 = defpackage.csdm.a(r5)
            boolean r6 = r5.e()
            if (r6 == 0) goto L8d
            r0.add(r4)
            goto L60
        L8d:
            boolean r5 = r5.f()
            if (r5 == 0) goto L60
            r1.add(r4)
            goto L60
        L97:
            r8 = 0
            if (r2 != r3) goto La7
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto La7
            java.lang.Object r8 = r9.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r8
            return r8
        La7:
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto Lb4
            java.lang.Object r8 = r0.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r8
            return r8
        Lb4:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto Lbc
            r8 = 0
            return r8
        Lbc:
            java.lang.Object r8 = r1.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r8
            return r8
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpkp.d(java.util.List, fcxy):java.lang.Object");
    }
}
