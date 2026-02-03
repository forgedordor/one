package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadReactionsReceiver;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxue extends fcyz implements fdat {
    final /* synthetic */ LoadReactionsReceiver a;
    final /* synthetic */ Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxue(LoadReactionsReceiver loadReactionsReceiver, Iterator it, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = loadReactionsReceiver;
        this.b = it;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxue) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        LoadReactionsReceiver loadReactionsReceiver;
        eygg eyggVar;
        fcsu fcsuVar;
        fctl.b(obj);
        do {
            loadReactionsReceiver = this.a;
            eyggVar = loadReactionsReceiver.d;
            fcsuVar = null;
            if (eyggVar == null) {
                fdbq.c("syncManager");
                eyggVar = null;
            }
        } while (((cmqf) eyggVar.b()).v());
        fcsu fcsuVar2 = loadReactionsReceiver.e;
        if (fcsuVar2 == null) {
            fdbq.c("transactionManager");
        } else {
            fcsuVar = fcsuVar2;
        }
        dqsn dqsnVar = (dqsn) fcsuVar.b();
        final Iterator it = this.b;
        dqsnVar.d("LoadReactionsReceiver#transaction", new Runnable() { // from class: cxud
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                String[] strArr = bqkl.a;
                bqkb bqkbVar = new bqkb();
                bqkbVar.f("LoadReactionsReceiver#processBroadcast.delete");
                bqkbVar.e();
                bqkbVar.d();
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("LoadReactionsReceiver.processBroadcast");
                brdrVarD.e(new Function() { // from class: cxuc
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
                brdrVarD.d(new brdo(MessagesTable.c.i, false));
                dqqj dqqjVarP = brdrVarD.b().p();
                Iterator it2 = it;
                try {
                    brap brapVar = (brap) dqqjVarP;
                    while (brapVar.moveToNext() && it2.hasNext()) {
                        List<String> listS = fdgn.S((String) it2.next(), new String[]{","}, 50, 2);
                        if (!listS.isEmpty() && ((CharSequence) listS.get(0)).length() != 0) {
                            MessageIdType messageIdTypeE = ((MessagesTable.BindData) brapVar.cQ()).E();
                            messageIdTypeE.getClass();
                            LoadReactionsReceiver.a.p("Trying to insert reactions to message id " + messageIdTypeE + ", size: " + listS.size());
                            bqiy bqiyVar = new bqiy();
                            bqiyVar.e(messageIdTypeE);
                            ckml ckmlVar = ckml.CUSTOM;
                            bqiyVar.g(ckmlVar);
                            cklu ckluVar = (cklu) cklv.a.createBuilder();
                            ckluVar.getClass();
                            for (String str : listS) {
                                ckmd ckmdVar = (ckmd) ckme.a.createBuilder();
                                ckma ckmaVar = (ckma) ckmb.a.createBuilder();
                                ckmaVar.copyOnWrite();
                                ((ckmb) ckmaVar.instance).e = ckmlVar.a();
                                ckmaVar.copyOnWrite();
                                ckmb ckmbVar = (ckmb) ckmaVar.instance;
                                str.getClass();
                                ckmbVar.d = str;
                                ckmb ckmbVar2 = (ckmb) ckmaVar.build();
                                ckmdVar.copyOnWrite();
                                ckme ckmeVar = (ckme) ckmdVar.instance;
                                ckmbVar2.getClass();
                                ckmeVar.c = ckmbVar2;
                                ckmeVar.b |= 1;
                                ckmh ckmhVar = (ckmh) ckmi.a.createBuilder();
                                ckmhVar.copyOnWrite();
                                ckmi ckmiVar = (ckmi) ckmhVar.instance;
                                ckmiVar.b |= 2;
                                ckmiVar.d = false;
                                cklx cklxVar = (cklx) ckly.a.createBuilder();
                                cklxVar.copyOnWrite();
                                ((ckly) cklxVar.instance).c = true;
                                ckmhVar.copyOnWrite();
                                ckmi ckmiVar2 = (ckmi) ckmhVar.instance;
                                ckly cklyVar = (ckly) cklxVar.build();
                                cklyVar.getClass();
                                ckmiVar2.c = cklyVar;
                                ckmiVar2.b |= 1;
                                ckmdVar.a((ckmi) ckmhVar.build());
                                ckluVar.b((ckme) ckmdVar.build());
                            }
                            bqiyVar.h((cklv) ckluVar.build());
                            bqiyVar.b(new Supplier() { // from class: bqiw
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new bqiu();
                                }
                            }).s();
                        }
                    }
                    LoadReactionsReceiver.a.p("Done inserting reactions to messages");
                    fczl.a(dqqjVarP, null);
                } finally {
                }
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxue(this.a, this.b, fcxyVar);
    }
}
