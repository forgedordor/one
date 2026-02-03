package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akic extends cayv {
    public final fcsu a;
    private final dqsn b;

    public akic(dqsn dqsnVar, fcsu fcsuVar) {
        this.b = dqsnVar;
        this.a = fcsuVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CreateOrUpdateLighterConversationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return akhv.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final akhv akhvVar = (akhv) evuhVar;
        if (((Boolean) this.a.b()).booleanValue()) {
            int i = akhvVar.b;
            if ((i & 2) == 0 || (i & 1) == 0 || (i & 1024) == 0) {
                throw new IllegalStateException("Cannot create or update a conversation without LighterConversationId, BusinessId, SyncTimestamp.");
            }
        }
        this.b.d("LighterConversationManager#createConversation", new Runnable() { // from class: akhy
            @Override // java.lang.Runnable
            public final void run() {
                cqce cqceVar = akic.E;
                final akhv akhvVar2 = akhvVar;
                cqceVar.m("Updating Lighter conversation with business_id:".concat(String.valueOf(akhvVar2.c)));
                final String str = akhvVar2.c;
                bptj bptjVarA = bpto.a();
                bptjVarA.A("CreateOrUpdateLighterConversationHandler#getExistingConversation");
                bptjVarA.c(new Function() { // from class: akhw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bptn bptnVar = (bptn) obj;
                        bptnVar.b(str);
                        return bptnVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Function function = new Function() { // from class: akhx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bpsr) obj).b;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                bpsr bpsrVar = bpto.c;
                bpss[] bpssVarArr = {(bpss) function.apply(bpsrVar)};
                int iIntValue = bpto.c().intValue();
                if (((Integer) bpto.b.getOrDefault(bpssVarArr[0].toString(), -1)).intValue() > iIntValue) {
                    dqru.x("columnReference.toString()", iIntValue);
                }
                bptjVarA.m(bpssVarArr);
                bpst bpstVar = (bpst) bptjVarA.b().q(bpsrVar.b);
                try {
                    ekgb ekgbVarC = bpstVar.c();
                    akic akicVar = this.a;
                    bpstVar.close();
                    final ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(ekgbVarC).findFirst().orElse(barn.a);
                    if (conversationIdType.b()) {
                        fcsu fcsuVar = akicVar.a;
                        if (!((Boolean) fcsuVar.b()).booleanValue()) {
                            int i2 = akhvVar2.b;
                            if ((i2 & 2) == 0 || (i2 & 1) == 0) {
                                throw new IllegalStateException("Cannot create a conversation without LighterConversationId or BusinessId.");
                            }
                        }
                        String[] strArr = botm.a;
                        bojm bojmVar = new bojm();
                        bojmVar.as(new cnqj());
                        bojmVar.Y(1);
                        bojmVar.av(4);
                        bvdk bvdkVar = bvdk.UNARCHIVED;
                        bojmVar.c(bvdkVar);
                        bojmVar.i(0);
                        if ((4 & akhvVar2.b) != 0) {
                            bojmVar.M(akhvVar2.e);
                        }
                        if ((akhvVar2.b & 8) != 0) {
                            bojmVar.at(akhvVar2.f);
                        }
                        if ((akhvVar2.b & 16) != 0) {
                            bojmVar.A(ejwk.a(akhvVar2.g));
                        }
                        int i3 = akhvVar2.b;
                        if ((i3 & 32) != 0) {
                            bojmVar.au(akhvVar2.h);
                        } else if ((i3 & 512) != 0) {
                            bojmVar.au(akhvVar2.l);
                        }
                        if ((akhvVar2.b & 256) != 0) {
                            if (akhvVar2.k) {
                                bvdkVar = bvdk.BLOCKED_FOLDER;
                            }
                            bojmVar.c(bvdkVar);
                        }
                        ConversationIdType conversationIdTypeD = bojmVar.a().D();
                        bprx bprxVar = new bprx();
                        bprxVar.c(conversationIdTypeD);
                        if (((Boolean) fcsuVar.b()).booleanValue()) {
                            bprxVar.b(akhvVar2.c);
                            bprxVar.e(akhvVar2.d);
                            bprxVar.g(akhvVar2.m);
                        } else {
                            if ((akhvVar2.b & 1) != 0) {
                                bprxVar.b(akhvVar2.c);
                            }
                            if ((akhvVar2.b & 2) != 0) {
                                bprxVar.e(akhvVar2.d);
                            }
                        }
                        if ((akhvVar2.b & 64) != 0) {
                            bprxVar.f(akhvVar2.i);
                        }
                        if ((akhvVar2.b & 128) != 0) {
                            bprxVar.d(akhvVar2.j);
                        }
                        final bpru bpruVarA = bprxVar.a();
                        final dqsy dqsyVarB = bpto.b();
                        dqru.b(bpto.b(), "lighter_conversations_table", bpruVarA, new Function() { // from class: bprr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVarB.P("lighter_conversations_table", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        }, new Consumer() { // from class: bprs
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                Long l = (Long) obj;
                                if (l.longValue() >= 0) {
                                    bpru bpruVar = bpruVarA;
                                    bpruVar.a = l.longValue();
                                    bpruVar.fN(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return;
                    }
                    fcsu fcsuVar2 = akicVar.a;
                    if (((Boolean) fcsuVar2.b()).booleanValue()) {
                        bptl bptlVar = new bptl();
                        bptlVar.al();
                        bptlVar.ap("CreateOrUpdateLighterConversationHandler#updateConversation1");
                        bptlVar.f(new Function() { // from class: akhz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                akhv akhvVar3 = akhvVar2;
                                bptn bptnVar = (bptn) obj;
                                bptnVar.b(akhvVar3.c);
                                long j = akhvVar3.m;
                                int iIntValue2 = bpto.c().intValue();
                                if (iIntValue2 < 59100) {
                                    dqru.x("sync_timestamp_ms", iIntValue2);
                                }
                                bptnVar.ap(new dqty("lighter_conversations_table.sync_timestamp_ms", 10, Long.valueOf(j)));
                                return bptnVar;
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        });
                        long j = akhvVar2.m;
                        int iIntValue2 = bpto.c().intValue();
                        int iIntValue3 = bpto.c().intValue();
                        if (iIntValue3 < 59100) {
                            dqru.x("sync_timestamp_ms", iIntValue3);
                        }
                        if (iIntValue2 >= 59100) {
                            bptlVar.a.put("sync_timestamp_ms", Long.valueOf(j));
                        }
                        bptlVar.d(akhvVar2.d);
                        if ((akhvVar2.b & 64) != 0) {
                            bptlVar.e(akhvVar2.i);
                        }
                        if ((akhvVar2.b & 128) != 0) {
                            bptlVar.c(akhvVar2.j);
                        }
                        if (bptlVar.a().e() <= 0) {
                            return;
                        }
                    }
                    String[] strArr2 = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("CreateOrUpdateLighterConversationHandler#updateConversation2");
                    boteVar.e.d(true);
                    boteVar.ad(new Function() { // from class: akia
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.r(conversationIdType);
                            botlVar.l();
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    });
                    if ((akhvVar2.b & 4) != 0) {
                        boteVar.C(akhvVar2.e);
                    }
                    if ((akhvVar2.b & 8) != 0) {
                        boteVar.Y(akhvVar2.f);
                    }
                    if ((akhvVar2.b & 16) != 0) {
                        boteVar.z(ejwk.a(akhvVar2.g));
                    }
                    if ((akhvVar2.b & 32) != 0) {
                        boteVar.Z(akhvVar2.h);
                    }
                    if ((akhvVar2.b & 256) != 0) {
                        boteVar.h(akhvVar2.k ? bvdk.BLOCKED_FOLDER : bvdk.UNARCHIVED);
                    }
                    boteVar.b().e();
                    if (((Boolean) fcsuVar2.b()).booleanValue()) {
                        return;
                    }
                    bptl bptlVar2 = new bptl();
                    bptlVar2.ap("CreateOrUpdateLighterConversationHandler#updateConversation3");
                    bptlVar2.f(new Function() { // from class: akib
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bptn bptnVar = (bptn) obj;
                            bptnVar.b(akhvVar2.c);
                            return bptnVar;
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    });
                    int i4 = akhvVar2.b;
                    if ((i4 & 64) != 0) {
                        bptlVar2.e(akhvVar2.i);
                    } else if ((i4 & 2) == 0 && (i4 & 128) == 0) {
                        return;
                    }
                    if ((akhvVar2.b & 2) != 0) {
                        bptlVar2.d(akhvVar2.d);
                    }
                    if ((akhvVar2.b & 128) != 0) {
                        bptlVar2.c(akhvVar2.j);
                    }
                    bptlVar2.a().e();
                } catch (Throwable th) {
                    try {
                        bpstVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        return eijx.e(cbcw.i());
    }
}
