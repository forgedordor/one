package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byik {
    public static final cqce a = cqce.g("BugleCms", "CmsBackupDeadLetterQueueManager");
    public final bzmf b;
    public final eosc c;
    private final eosc d;

    public byik(bzmf bzmfVar, eosc eoscVar, eosc eoscVar2) {
        this.b = bzmfVar;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    public static final bmqz d(int i, int i2) {
        if (i2 == 1) {
            return bzae.b(i);
        }
        if (i2 == 2) {
            return bzae.b(i);
        }
        if (i2 == 3) {
            return bzae.b(i);
        }
        if (i2 == 5) {
            return byxz.c(i);
        }
        if (i2 == 7) {
            return byrx.e(i);
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Unexpected TableType, returning unknown AbandonedAction");
        cqbdVarE.y("flags", i);
        cqbdVarE.r();
        return bmqz.BACKUP_UNKNOWN_OPERATION;
    }

    public final eiju a(final byiv byivVar, final Throwable th, boolean z, final int i) {
        ejwl.a(byivVar.g == z);
        eooy eooyVar = new eooy() { // from class: byhx
            @Override // defpackage.eooy
            public final ListenableFuture a() throws NumberFormatException {
                byik byikVar = this.a;
                byiv byivVar2 = byivVar;
                String strB = byikVar.b(byivVar2);
                byivVar2.getClass();
                Throwable th2 = th;
                th2.getClass();
                int i2 = i;
                bzmf bzmfVar = byikVar.b;
                return auvw.c(bzmfVar.c, fcyi.a, fdjz.a, new bzmb(bzmfVar, byivVar2, th2, i2, strB, null));
            }
        };
        eosc eoscVar = this.d;
        return eijx.h(eooyVar, eoscVar).h(new ejvr() { // from class: byhy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoscVar);
    }

    public final String b(byiv byivVar) throws NumberFormatException {
        if (d(byivVar.f, byivVar.d) == bmqz.BACKUP_DELETE) {
            return byivVar.e;
        }
        int i = byivVar.d;
        if (i != 1) {
            if (i == 2) {
                final ConversationIdType conversationIdTypeB = barn.b(byivVar.e);
                Function function = new Function() { // from class: byid
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bojh) obj).S();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                Supplier supplier = new Supplier() { // from class: byie
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cqbd cqbdVarE = byik.a.e();
                        cqbdVarE.I("Conversation not found, returning null CMS id");
                        cqbdVarE.c(conversationIdTypeB);
                        cqbdVarE.r();
                        return null;
                    }
                };
                bojh bojhVarB = botm.b(conversationIdTypeB);
                return (String) (bojhVarB != null ? function.apply(bojhVarB) : supplier.get());
            }
            if (i == 3) {
                final String str = byivVar.e;
                return (String) ParticipantsTable.l(str, new Function() { // from class: byht
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ParticipantsTable.BindData) obj).L();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Supplier() { // from class: byib
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cqbd cqbdVarE = byik.a.e();
                        cqbdVarE.I("Participant not found, returning null CMS id");
                        cqbdVarE.f(str);
                        cqbdVarE.r();
                        return null;
                    }
                });
            }
            if (i != 5) {
                if (i != 7) {
                    cqbd cqbdVarE = a.e();
                    cqbdVarE.I("Unexpected TableType, returning null CMS id");
                    cqbdVarE.y("TableType", byivVar.d);
                    cqbdVarE.r();
                    return null;
                }
                final int iD = byrx.d(byivVar.f);
                final int i2 = Integer.parseInt(byivVar.e);
                bnbw bnbwVarA = bncb.a();
                bnbwVarA.A("getCmsIdForKeyTypeAndIndex");
                bnbg[] bnbgVarArr = {(bnbg) new Function() { // from class: byig
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bnbf) obj).e;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }.apply(bncb.c)};
                int iIntValue = bncb.c().intValue();
                if (((Integer) bncb.b.getOrDefault(bnbgVarArr[0].toString(), -1)).intValue() > iIntValue) {
                    dqru.x("columnReference.toString()", iIntValue);
                }
                bnbwVarA.m(bnbgVarArr);
                bnbwVarA.e(new Function() { // from class: byih
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bnca bncaVar = (bnca) obj;
                        bncaVar.e(iD);
                        bncaVar.c(i2);
                        return bncaVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                bnbh bnbhVar = (bnbh) bnbwVarA.b().p();
                try {
                    String strE = bnbhVar.moveToFirst() ? bnbhVar.e() : null;
                    bnbhVar.close();
                    return strE;
                } catch (Throwable th) {
                    try {
                        bnbhVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        final MessageIdType messageIdTypeB = bary.b(byivVar.e);
        return (String) MessagesTable.j(messageIdTypeB, new Function() { // from class: byhz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessagesTable.BindData) obj).U();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Supplier() { // from class: byia
            @Override // java.util.function.Supplier
            public final Object get() {
                cqbd cqbdVarE2 = byik.a.e();
                cqbdVarE2.I("Message not found, returning null CMS id");
                cqbdVarE2.d(messageIdTypeB);
                cqbdVarE2.r();
                return null;
            }
        });
    }

    public final eiju c(byiv byivVar, ekgb ekgbVar, boolean z, int i) throws NumberFormatException {
        ejwl.a(byivVar.g == z);
        String strB = b(byivVar);
        ekgbVar.getClass();
        bzmf bzmfVar = this.b;
        return auvw.c(bzmfVar.c, fcyi.a, fdjz.a, new bzme(bzmfVar, byivVar, ekgbVar, i, strB, null)).h(new ejvr() { // from class: byif
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.d);
    }
}
