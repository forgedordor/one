package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwn implements bayb {
    private final fcsu a;
    private cknw b;

    public ckwn(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    private final void a(MessageCoreData messageCoreData) {
        this.b = ((cknx) this.a.b()).a(messageCoreData);
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (crbf.c()) {
            a(messageCoreData);
            cknw cknwVar = this.b;
            if (cknwVar != null) {
                cknwVar.a();
            }
            this.b = null;
        }
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        if (crbf.c()) {
            a(messageCoreData);
            cknw cknwVar = this.b;
            if (cknwVar != null) {
                boolean z = false;
                messageCoreData.bx(messageCoreData.cF() || ((Boolean) ((ckot) cknwVar).e.a()).booleanValue());
                Object obj = null;
                if (messageCoreData.cM()) {
                    z = true;
                } else {
                    final ckot ckotVar = (ckot) cknwVar;
                    if (ckotVar.d() != ckmc.REACTION_ACTION_UNSPECIFIED && !ckotVar.b().c()) {
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("EmotifyReactionsRcsReceiverImpl#shouldNotify");
                        brdrVarD.c(MessagesTable.c.k);
                        brdrVarD.h(new Function() { // from class: ckof
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar = (brec) obj2;
                                brecVar.N(ckotVar.c());
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        dqqj dqqjVarP = brdrVarD.b().p();
                        try {
                            brap brapVar = (brap) dqqjVarP;
                            if (brapVar.moveToFirst()) {
                                boolean zP = baui.p(brapVar.i());
                                fczl.a(dqqjVarP, null);
                                if (!zP) {
                                }
                            } else {
                                fczl.a(dqqjVarP, null);
                            }
                            z = true;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                fczl.a(dqqjVarP, th);
                                throw th2;
                            }
                        }
                    }
                }
                messageCoreData.bz(z);
                ckot ckotVar2 = (ckot) cknwVar;
                List listM = ckotVar2.c.M();
                if (ckotVar2.e() == null) {
                    listM = null;
                }
                if (listM != null) {
                    Iterator it = listM.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (le.m(((MessagePartCoreData) next).R())) {
                            obj = next;
                            break;
                        }
                    }
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                    if (messagePartCoreData != null) {
                        messagePartCoreData.aj(ckotVar2.e());
                    }
                }
            }
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
