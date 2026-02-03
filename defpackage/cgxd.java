package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgxd extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgvu b;
    final /* synthetic */ cgxh c;
    final /* synthetic */ MessageCoreData d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgxd(fcxy fcxyVar, cgvu cgvuVar, cgxh cgxhVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.b = cgvuVar;
        this.c = cgxhVar;
        this.d = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgxd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Exception exc;
        doqi doqiVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
        } catch (Exception e) {
            if (e instanceof dooe) {
                cgxh cgxhVar = this.c;
                dooe dooeVar = (dooe) e;
                Set setEntrySet = dooeVar.a.a.entrySet();
                ArrayList arrayList = new ArrayList(fcva.p(setEntrySet, 10));
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    arrayList.add((eaid) ((Map.Entry) it.next()).getValue());
                }
                cgvb.c(cgxhVar.d, arrayList, dooeVar.a.b, false, 4);
            } else {
                cgvb.c(this.c.d, null, 2, false, 5);
            }
            cgxh cgxhVar2 = this.c;
            final MessageCoreData messageCoreData = this.d;
            this.e = e;
            this.a = 3;
            Runnable runnable = new Runnable() { // from class: cgwj
                @Override // java.lang.Runnable
                public final void run() {
                    bqih bqihVarD = cgwv.d(cgwa.b);
                    MessageCoreData messageCoreData2 = messageCoreData;
                    bqihVarD.c(messageCoreData2.C());
                    brdu brduVarB = cgwv.b();
                    MessageIdType messageIdTypeC = messageCoreData2.C();
                    messageIdTypeC.getClass();
                    cgwv.a(brduVarB, messageIdTypeC);
                }
            };
            cgww cgwwVar = (cgww) cgxhVar2.c;
            cgwwVar.c.d("GooglePhotosSharingStatePersister#updateSharingStateToFailed", runnable);
            cgwwVar.b.l(messageCoreData.A(), messageCoreData.C(), new String[0]);
            if (fctx.a != fcylVar) {
                exc = e;
            }
        }
        if (i == 0) {
            fctl.b(obj);
            String str = this.b.c;
            str.getClass();
            doqiVar = new doqi(str);
            cgvm cgvmVar = this.c.e;
            this.e = doqiVar;
            this.a = 1;
            obj = cgvmVar.a.a(doqiVar, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            if (i == 2) {
                fctl.b(obj);
                cgvb.c(this.c.d, null, 0, false, 7);
                return fctx.a;
            }
            exc = (Exception) this.e;
            fctl.b(obj);
            if (!(exc instanceof dooe) || ((dooe) exc).a.b != 5) {
                auvh.h(this.c.b.b(exc));
            }
            return fctx.a;
        }
        doqiVar = (doqi) this.e;
        fctl.b(obj);
        final String str2 = (String) obj;
        fctc fctcVar = cgxh.a;
        cgxc.a().n().t("Received link for Request ID %s", doqiVar);
        cgwb cgwbVar = this.c.c;
        final MessageCoreData messageCoreData2 = this.d;
        this.e = null;
        this.a = 2;
        final cgww cgwwVar2 = (cgww) cgwbVar;
        ((cgww) cgwbVar).c.d("GooglePhotosSharingStatePersister#updateSharingStateToCompleteByMessage", new Runnable() { // from class: cgwc
            @Override // java.lang.Runnable
            public final void run() {
                cgwa cgwaVar = cgwb.a;
                String str3 = str2;
                bqih bqihVarD = cgwv.d(cgwaVar.a(str3));
                MessageCoreData messageCoreData3 = messageCoreData2;
                bqihVarD.c(messageCoreData3.C());
                if (((Boolean) cgwx.b.e()).booleanValue()) {
                    cgwwVar2.b(fcva.b(messageCoreData3.C()), str3);
                } else {
                    cgww.c(fcva.b(messageCoreData3.C()));
                }
                brdu brduVarE = cgwv.e();
                MessageIdType messageIdTypeC = messageCoreData3.C();
                messageIdTypeC.getClass();
                cgwv.a(brduVarE, messageIdTypeC);
            }
        });
        Object objA = ((cgww) cgwbVar).a(this);
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        if (objA == fcylVar) {
            return fcylVar;
        }
        cgvb.c(this.c.d, null, 0, false, 7);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgxd cgxdVar = new cgxd(fcxyVar, this.b, this.c, this.d);
        cgxdVar.e = obj;
        return cgxdVar;
    }
}
