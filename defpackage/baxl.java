package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baxl {
    private static final eksp a = eksp.c("Bugle");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public baxl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgb a(final MessageIdType messageIdType) {
        ekgb ekgbVarG;
        String[] strArr = bqoo.a;
        bqol bqolVar = new bqol(bqoo.a);
        bqolVar.A("getMessageSendReceiveAttemptForMessage");
        bqolVar.d(new Function() { // from class: baxm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqon bqonVar = (bqon) obj;
                bqonVar.b(messageIdType);
                return bqonVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqolVar.c(new bqoi(bqoo.b.c));
        ekgb ekgbVarZ = bqolVar.b().z();
        if (ekgbVarZ.isEmpty()) {
            ekgbVarG = ekoe.a;
        } else {
            ekfw ekfwVar = new ekfw();
            int size = ekgbVarZ.size();
            for (int i = 0; i < size; i++) {
                bqmh bqmhVar = (bqmh) ekgbVarZ.get(i);
                bqmhVar.aA(4, "message_protocol");
                bvea bveaVar = bqmhVar.e;
                bqmhVar.aA(5, "current_sim_network_country");
                String str = bqmhVar.f;
                bqmhVar.aA(6, "current_sim_country");
                String str2 = bqmhVar.g;
                bqmhVar.aA(8, "settings_country");
                String str3 = bqmhVar.i;
                bqmhVar.aA(9, "default_sms_sim_country");
                String str4 = bqmhVar.j;
                bqmhVar.aA(10, "locale_country");
                String str5 = bqmhVar.k;
                bqmhVar.aA(11, "default_sms_sim_network_country");
                ekfwVar.h(new baty(bveaVar, str, str2, str3, str4, str5, bqmhVar.l));
            }
            ekgbVarG = ekfwVar.g();
        }
        if (ekgbVarG.isEmpty()) {
            return ekoe.a;
        }
        ekfw ekfwVar2 = new ekfw();
        int i2 = ((ekoe) ekgbVarG).c;
        for (int i3 = 0; i3 < i2; i3++) {
            baxq baxqVar = (baxq) ekgbVarG.get(i3);
            ekgi ekgiVar = new ekgi();
            ekgiVar.i("CURRENT_SIM_NETWORK_COUNTRY", ejwk.b(baxqVar.c()));
            ekgiVar.i("CURRENT_SIM_COUNTRY", ejwk.b(baxqVar.b()));
            ekgiVar.i("SETTINGS_COUNTRY", ejwk.b(baxqVar.g()));
            ekgiVar.i("DEFAULT_SMS_SIM_COUNTRY", ejwk.b(baxqVar.d()));
            ekgiVar.i("LOCALE_COUNTRY", ejwk.b(baxqVar.f()));
            ekgiVar.i("DEFAULT_SMS_SIM_NETWORK_COUNTRY", ejwk.b(baxqVar.e()));
            ekfwVar2.h(new batv(baxqVar.a(), ekgiVar.c()));
        }
        return ekfwVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b(final MessageIdType messageIdType) {
        ekgb ekgbVarG;
        HashMap map = new HashMap();
        String[] strArr = bqoo.a;
        bqol bqolVar = new bqol(bqoo.a);
        bqolVar.A("getAllDestinationsForMessage-messageSendReceiveAttempt");
        bqolVar.d(new Function() { // from class: baxn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqon bqonVar = (bqon) obj;
                bqonVar.b(messageIdType);
                return bqonVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqno bqnoVar = bqoo.b;
        bqolVar.c(new bqoi(bqnoVar.c));
        bqolVar.y(1);
        bqnq bqnqVar = (bqnq) bqolVar.b().q(bqnoVar.a);
        try {
            ekgb ekgbVarC = bqnqVar.c();
            bqnqVar.close();
            if (ekgbVarC.isEmpty()) {
                ekgbVarG = ekoe.a;
            } else {
                ekfw ekfwVar = new ekfw();
                final UUID uuid = (UUID) ekgbVarC.get(0);
                String[] strArr2 = bqdw.a;
                bqdt bqdtVar = new bqdt(bqdw.a);
                bqdtVar.A("getAllDestinationsForMessage-messageDestinations");
                bqdtVar.k(new bqdu((bqdv) new Function() { // from class: baxo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqdv bqdvVar = (bqdv) obj;
                        bqdvVar.ap(new dqpj("message_destinations.message_send_receive_attempt_id", 1, base.a(uuid)));
                        return bqdvVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bqdv())));
                ekgb ekgbVarZ = bqdtVar.b().z();
                int size = ekgbVarZ.size();
                for (int i = 0; i < size; i++) {
                    bqcs bqcsVar = (bqcs) ekgbVarZ.get(i);
                    bqcsVar.aA(2, "message_destination_type");
                    bvds bvdsVar = bqcsVar.c;
                    bqcsVar.aA(3, "message_destination_raw");
                    ekfwVar.h(new batx(bvdsVar, bqcsVar.d));
                }
                ekgbVarG = ekfwVar.g();
            }
            for (int i2 = 0; i2 < ((ekoe) ekgbVarG).c; i2++) {
                baxp baxpVar = (baxp) ekgbVarG.get(i2);
                bvds bvdsVarA = baxpVar.a();
                Map.EL.putIfAbsent(map, bvdsVarA, new ArrayList());
                List list = (List) map.get(bvdsVarA);
                list.add(baxpVar.b());
                map.put(bvdsVarA, list);
            }
            return map;
        } catch (Throwable th) {
            try {
                bqnqVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(final UUID uuid, final MessageIdType messageIdType, final long j, final ekgb ekgbVar, final bvea bveaVar, int i) {
        if (messageIdType.a == -1) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(cqnc.a, messageIdType.toString());
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageRecipientAuditor", "saveMessageRecipients", 164, "MessageRecipientAuditor.java")).q("Could not save receiving attempt - messageId was invalid");
            return;
        }
        fcsu fcsuVar = this.d;
        final String strS = ((crny) fcsuVar.b()).g().s();
        fcsu fcsuVar2 = ((crny) fcsuVar.b()).g().b;
        fcsuVar2.getClass();
        final Optional optionalOfNullable = Optional.ofNullable(ejwk.a(((crmu) fcsuVar2.b()).b()));
        final crof crofVarJ = ((crny) fcsuVar.b()).j();
        final crof crofVarH = ((crny) fcsuVar.b()).h(i);
        ((dqsn) this.b.b()).d("ReceiveSmsMessageHelper#storeMessageSendingDetailsInBugle", new Runnable() { // from class: baxi
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(uuid, messageIdType, j, bveaVar, crofVarH, optionalOfNullable, crofVarJ, strS, ekgbVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void d(UUID uuid, MessageIdType messageIdType, long j, bvea bveaVar, crof crofVar, Optional optional, crof crofVar2, String str, ekgb ekgbVar) {
        try {
            fcsu fcsuVar = this.c;
            String strP = crofVar.p();
            String strS = crofVar.s();
            String str2 = (String) optional.orElse("");
            String strS2 = crofVar2.s();
            String strB = ejwk.b(str);
            String strP2 = crofVar2.p();
            String[] strArr = bqoo.a;
            bqmm bqmmVar = new bqmm();
            bqmmVar.h(uuid);
            bqmmVar.j(messageIdType);
            bqmmVar.m(j);
            bqmmVar.k(1L);
            bqmmVar.n(bveaVar);
            bqmmVar.d(strP);
            bqmmVar.c(strS);
            bqmmVar.b("");
            bqmmVar.l(str2);
            bqmmVar.f(strS2);
            bqmmVar.i(strB);
            bqmmVar.g(strP2);
            bqmmVar.e("");
            bqmh bqmhVarA = bqmmVar.a(new Supplier() { // from class: bqmk
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bqmi();
                }
            });
            final dqsy dqsyVarA = bqoo.a();
            dqru.b(bqoo.a(), "message_send_receive_attempt", bqmhVarA, new Function() { // from class: bqme
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.P("message_send_receive_attempt", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bqmf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ekqh it = ekgbVar.iterator();
            while (it.hasNext()) {
                baxk baxkVar = (baxk) it.next();
                bvds bvdsVarA = baxkVar.a();
                String strB2 = baxkVar.b();
                String[] strArr2 = bqdw.a;
                bqcx bqcxVar = new bqcx();
                bqcxVar.d(uuid);
                bqcxVar.c(bvdsVarA);
                bqcxVar.b(strB2);
                final bqcs bqcsVarA = bqcxVar.a(new Supplier() { // from class: bqcv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bqct();
                    }
                });
                final dqsy dqsyVarA2 = bqdw.a();
                dqru.b(bqdw.a(), "message_destinations", bqcsVarA, new Function() { // from class: bqcp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVarA2.P("message_destinations", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bqcq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            bqcs bqcsVar = bqcsVarA;
                            bqcsVar.a = l.longValue();
                            bqcsVar.fN(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                bqcsVarA.aA(0, "_id");
                long j2 = bqcsVarA.a;
            }
        } catch (SQLiteConstraintException unused) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(cqnc.a, messageIdType.toString());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageRecipientAuditor", "saveMessageRecipients", 211, "MessageRecipientAuditor.java")).q("Could not save receiving attempt - SQLiteConstraintException was thrown");
        }
    }
}
