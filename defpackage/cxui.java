package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadRepliesReceiver;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxui extends fcyz implements fdat {
    final /* synthetic */ LoadRepliesReceiver a;
    final /* synthetic */ Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxui(LoadRepliesReceiver loadRepliesReceiver, Iterator it, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = loadRepliesReceiver;
        this.b = it;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxui) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        LoadRepliesReceiver loadRepliesReceiver = this.a;
        eygg eyggVar = loadRepliesReceiver.d;
        fcsu fcsuVar = null;
        if (eyggVar == null) {
            fdbq.c("syncManager");
            eyggVar = null;
        }
        ((cmqf) eyggVar.b()).q(false);
        fcsu fcsuVar2 = loadRepliesReceiver.e;
        if (fcsuVar2 == null) {
            fdbq.c("transactionManager");
        } else {
            fcsuVar = fcsuVar2;
        }
        dqsn dqsnVar = (dqsn) fcsuVar.b();
        final Iterator it = this.b;
        dqsnVar.d("LoadRepliesReceiver#transaction", new Runnable() { // from class: cxug
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                String[] strArr = bqmc.a;
                bqlr bqlrVar = new bqlr();
                bqlrVar.f("LoadRepliesReceiver#processBroadcast.delete");
                bqlrVar.e();
                bqlrVar.d();
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("LoadRepliesReceiver.processBroadcast");
                brdrVarD.e(new Function() { // from class: cxuh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new brao[]{((bran) obj2).a};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = 0;
                brdrVarD.d(new brdo(MessagesTable.c.i, false));
                dqqj dqqjVarP = brdrVarD.b().p();
                Iterator it2 = it;
                try {
                    brap brapVar = (brap) dqqjVarP;
                    while (brapVar.moveToNext() && it2.hasNext()) {
                        MessagesTable.BindData bindData = (MessagesTable.BindData) brapVar.cQ();
                        List<String> listS = fdgn.S((CharSequence) it2.next(), new String[]{", "}, 4, 2);
                        ArrayList arrayList = new ArrayList(fcva.p(listS, 10));
                        for (String str : listS) {
                            if (true == fdbq.f(str, "null")) {
                                str = null;
                            }
                            arrayList.add(str);
                        }
                        CharSequence charSequence = (CharSequence) arrayList.get(i);
                        if (charSequence == null || fdgn.H(charSequence)) {
                            LoadRepliesReceiver.a.p("Skipping: the message " + arrayList.get(1) + " is not indicated a reply");
                        } else {
                            cqce cqceVar = LoadRepliesReceiver.a;
                            cqceVar.p("Processing reply data " + arrayList.get(i) + " " + arrayList.get(1) + ", " + arrayList.get(2) + ", " + arrayList.get(3) + " for message " + bindData.E());
                            bqkx bqkxVar = new bqkx();
                            bqkxVar.d(bary.b((String) arrayList.get(1)));
                            bqkxVar.e(bary.b((String) arrayList.get(2)));
                            bqkxVar.f(fdbq.f(arrayList.get(3), "0") ? ahqp.UNSPECIFIED : ahqp.REPLIED_TO_MESSAGE_NOT_FOUND);
                            bqks bqksVarC = bqkxVar.c();
                            cqceVar.p("Inserted reply " + bqksVarC.m() + " to message " + bqksVarC.n());
                        }
                        i = 0;
                    }
                    LoadRepliesReceiver.a.p("Done inserting replies");
                    fczl.a(dqqjVarP, null);
                } finally {
                }
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxui(this.a, this.b, fcxyVar);
    }
}
