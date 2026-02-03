package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter");
    public final fcsu b;
    public final fcsu c;
    private final arul d;

    public axjq(fcsu fcsuVar, fcsu fcsuVar2, arul arulVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = arulVar;
    }

    public static long a(final btxd btxdVar) {
        final dqsy dqsyVarB = btyx.b();
        long jB = dqru.b(btyx.b(), "self_participants", btxdVar, new Function() { // from class: btxa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("self_participants", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btxb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    btxd btxdVar2 = btxdVar;
                    btxdVar2.a = String.valueOf(l);
                    btxdVar2.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Long.valueOf(jB).getClass();
        return jB;
    }

    public static long b(ParticipantsTable.BindData bindData) {
        ejwl.a(bindData.r() >= -1);
        return bindData.J().longValue();
    }

    public static void c() {
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("resetIsValidPhoneNumberData");
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 55010) {
            dqru.x("is_valid_phone_number_data", iIntValue2);
        }
        if (iIntValue >= 55010) {
            bsbsVarF.a.put("is_valid_phone_number_data", (Boolean) false);
        }
        bsbsVarF.U(new Function() { // from class: axjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.b(new Function() { // from class: axjk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        bsbxVar2.ap(new dqpn("participants.normalized_destination", 5));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: axjl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        bsbxVar2.r("");
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: axjm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        bsbxVar2.ap(new dqpn("participants.send_destination", 5));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: axjn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        bsbxVar2.ap(new dqpj("participants.send_destination", 1, ""));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: axjo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        bsbxVar2.ap(new dqpn("participants.display_destination", 5));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: axjp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        bsbxVar2.ap(new dqpj("participants.display_destination", 1, ""));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.b().e();
    }

    public final void d(brvp brvpVar, Optional optional) {
        int i = brvpVar.d;
        Optional map = optional.map(new Function() { // from class: axjj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((ejxr) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ejwl.a(i >= -1);
        axcm axcmVarI = ((awyr) this.c.b()).i(i, (String) map.orElse(null), null);
        if (this.d.a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.w, Integer.valueOf(i));
            ekrdVar.X(cqnc.x, map.isPresent() ? dhiz.SIM_ICCID.c(map.get()) : "null");
            ekrdVar.X(cqnc.z, axcmVarI);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "supplementFieldsForSelfBeforeBuild", 220, "ParticipantsColumnSetter.java")).q("set token for new self participant");
        } else {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(cqnc.w, Integer.valueOf(i));
            ekrdVar2.X(cqnc.x, (String) map.orElse(null));
            ekrdVar2.X(cqnc.z, axcmVarI);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "supplementFieldsForSelfBeforeBuild", 227, "ParticipantsColumnSetter.java")).q("set token for new self participant");
        }
        brvpVar.E(axcmVarI);
    }

    public final void e(brvp brvpVar) {
        d(brvpVar, Optional.empty());
    }
}
