package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadLinkPreviewsReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtk extends fcyz implements fdat {
    final /* synthetic */ LoadLinkPreviewsReceiver a;
    final /* synthetic */ Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtk(LoadLinkPreviewsReceiver loadLinkPreviewsReceiver, Iterator it, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = loadLinkPreviewsReceiver;
        this.b = it;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxtk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        LoadLinkPreviewsReceiver loadLinkPreviewsReceiver;
        eygg eyggVar;
        fcsu fcsuVar;
        fctl.b(obj);
        do {
            loadLinkPreviewsReceiver = this.a;
            eyggVar = loadLinkPreviewsReceiver.d;
            fcsuVar = null;
            if (eyggVar == null) {
                fdbq.c("syncManager");
                eyggVar = null;
            }
        } while (((cmqf) eyggVar.b()).v());
        fcsu fcsuVar2 = loadLinkPreviewsReceiver.e;
        if (fcsuVar2 == null) {
            fdbq.c("transactionManager");
        } else {
            fcsuVar = fcsuVar2;
        }
        dqsn dqsnVar = (dqsn) fcsuVar.b();
        final Iterator it = this.b;
        dqsnVar.d("LoadLinkPreviewsReceiver#transaction", new Runnable() { // from class: cxtj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bpxj.a;
                bpwz bpwzVar = new bpwz();
                bpwzVar.f("LoadLinkPreviewReceiver#processBroadcast.delete");
                bpwzVar.e();
                bpwzVar.d();
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("LoadLinkPreviewsReceiver.processBroadcast");
                brdrVarD.d(new brdo(MessagesTable.c.i, false));
                ekqh it2 = brdrVarD.b().g().iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Iterator it3 = it;
                    MessageIdType messageIdType = (MessageIdType) it2.next();
                    if (!it3.hasNext()) {
                        break;
                    }
                    List<String> listS = fdgn.S((String) it3.next(), new String[]{","}, 5, 2);
                    ArrayList arrayList = new ArrayList(fcva.p(listS, 10));
                    for (String str : listS) {
                        if (true == fdbq.f(str, "null")) {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                    cqce cqceVar = LoadLinkPreviewsReceiver.a;
                    cqceVar.p("Trying to insert preview " + messageIdType + " " + arrayList.get(2) + " " + arrayList.size());
                    CharSequence charSequence = (CharSequence) arrayList.get(4);
                    if (charSequence == null || fdgn.H(charSequence)) {
                        cqceVar.p("Skipping inserting preview: link preview has no target url");
                    } else {
                        bpvi bpviVar = new bpvi();
                        bpviVar.m((String) arrayList.get(0));
                        bpviVar.h((String) arrayList.get(1));
                        bpviVar.j((String) arrayList.get(2));
                        bpviVar.g((String) arrayList.get(2));
                        bpviVar.i((String) arrayList.get(3));
                        bpviVar.n(messageIdType);
                        bpviVar.f(2000L);
                        bpviVar.o((String) arrayList.get(4));
                        bpviVar.k(false);
                        bpviVar.k(false);
                        bpviVar.l(false);
                        bpviVar.d();
                    }
                }
                LoadLinkPreviewsReceiver.a.p("Done inserting preview");
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxtk(this.a, this.b, fcxyVar);
    }
}
