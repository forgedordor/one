package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxjg {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;

    public bxjg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final void a(ConversationIdType conversationIdType, final MessageIdType messageIdType, String str, Instant instant) {
        final long j = Long.parseLong(str);
        eieu eieuVarK = eiiy.k("ReportOperations#updateDeliveryReport");
        try {
            btbo btboVarB = btbt.b();
            btboVarB.A("markFailedToDecrypt");
            btboVarB.e(new Function() { // from class: bxjc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btbs btbsVar = (btbs) obj;
                    btbsVar.b(messageIdType);
                    btbsVar.c(j);
                    return btbsVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btai btaiVar = (btai) btboVarB.b().l();
            if (btaiVar == null) {
                btal btalVar = new btal();
                btalVar.d(messageIdType);
                btalVar.e(j);
                btalVar.b(Optional.of(instant));
                final btai btaiVarA = btalVar.a();
                final dqsy dqsyVarC = btbt.c();
                dqru.b(btbt.c(), "read_reports", btaiVarA, new Function() { // from class: btad
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVarC.P("read_reports", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: btae
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        btaiVarA.s((Long) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                btak btakVarP = btaiVar.p();
                btakVarP.b(Optional.of(instant));
                final btai btaiVarA2 = btakVarP.a();
                final btbr btbrVar = new btbr((btbs) new Function() { // from class: bxjd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btbs btbsVar = (btbs) obj;
                        btbsVar.b(messageIdType);
                        btbsVar.c(j);
                        return btbsVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new btbs()));
                final dqsy dqsyVarC2 = btbt.c();
                ((Boolean) dqsyVarC2.o(new ejxr() { // from class: btaf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = btbt.a;
                        btbq btbqVar = new btbq();
                        final btai btaiVar2 = btaiVarA2;
                        Optional optionalQ = btaiVar2.q();
                        int iIntValue = btbt.d().intValue();
                        int iIntValue2 = btbt.d().intValue();
                        if (iIntValue2 < 58880) {
                            dqru.x("ftd_time", iIntValue2);
                        }
                        if (iIntValue >= 58880) {
                            if (optionalQ == null) {
                                btbqVar.a.putNull("ftd_time");
                            } else {
                                btbqVar.a.put("ftd_time", Long.valueOf(basb.a(optionalQ)));
                            }
                        }
                        btbr btbrVar2 = btbrVar;
                        btbqVar.al();
                        btbqVar.af(btbrVar2);
                        btbqVar.an(new dqsb("read_reports", "-updateOrInsert-update"));
                        if (btbqVar.b().e() != 0) {
                            return true;
                        }
                        final dqsy dqsyVar = dqsyVarC2;
                        return Boolean.valueOf(dqru.b(btbt.c(), "read_reports", btaiVar2, new Function() { // from class: btaa
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVar.O("read_reports", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: btac
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                btaiVar2.r((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }) != -1);
                    }
                })).booleanValue();
            }
            if (((bvur) this.c.b()).h()) {
                ((bxlc) this.a.b()).l(conversationIdType, messageIdType, "read_reports");
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
