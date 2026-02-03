package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.czxl;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxl implements czxe {
    public static final cqce a = cqce.g("Bugle", "ReminderDateTimePickerMixinImpl");
    public final egpr b;
    public final eygg c;
    public final egps d;
    public final egps e;
    public final egps f;
    private final Context g;
    private final cogw h;
    private final fcsu i;
    private final ea j;
    private final fcsu k;
    private boolean l = false;

    /* compiled from: PG */
    public final class a implements einb {
        public final czxo a;

        public a(czxo czxoVar) {
            this.a = czxoVar;
        }
    }

    /* compiled from: PG */
    public final class b implements einb {
        public final czxo a;

        public b(czxo czxoVar) {
            this.a = czxoVar;
        }
    }

    /* compiled from: PG */
    public final class c implements einb {
    }

    /* compiled from: PG */
    public final class d implements einb {
    }

    /* compiled from: PG */
    public final class e implements einb {
    }

    /* compiled from: PG */
    public final class f implements einb {
    }

    public czxl(Context context, cogw cogwVar, fcsu fcsuVar, egpr egprVar, final ea eaVar, eygg eyggVar, fcsu fcsuVar2, final fcsu fcsuVar3) {
        this.g = context;
        this.h = cogwVar;
        this.i = fcsuVar;
        this.j = eaVar;
        this.b = egprVar;
        this.c = eyggVar;
        this.k = fcsuVar2;
        egps<evwl<czxo>, Boolean> egpsVar = new egps<evwl<czxo>, Boolean>() { // from class: czxl.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                evwl evwlVar = (evwl) obj;
                Boolean bool = (Boolean) obj2;
                if (bool == null || !bool.booleanValue()) {
                    czxl.a.n("The reminder was not set successfully.");
                    return;
                }
                final czxo czxoVar = (czxo) evwlVar.a(czxo.a, evrr.a());
                final czxv czxvVar = (czxv) fcsuVar3.b();
                einf.f(new ctex(czxvVar.c.b(czxoVar.c, czxoVar.f), czxvVar.b.getResources().getString(R.string.reminder_snackbar_action_text), new Runnable() { // from class: czxr
                    @Override // java.lang.Runnable
                    public final void run() {
                        czxo czxoVar2 = czxoVar;
                        MessageIdType messageIdTypeB = bary.b(czxoVar2.d);
                        ConversationIdType conversationIdTypeB = barn.b(czxoVar2.e);
                        czxv czxvVar2 = czxvVar;
                        czxvVar2.d.g(messageIdTypeB, conversationIdTypeB).k(auwc.a(new czxt()), czxvVar2.e);
                    }
                }), eaVar);
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                czxl.a.o("Failed to set reminder.", th);
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.d = egpsVar;
        egps<evwl<czxo>, Boolean> egpsVar2 = new egps<evwl<czxo>, Boolean>() { // from class: czxl.2
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                evwl evwlVar = (evwl) obj;
                Boolean bool = (Boolean) obj2;
                if (bool == null || !bool.booleanValue()) {
                    czxl.a.n("The reminder was not updated successfully.");
                    return;
                }
                final czxo czxoVar = (czxo) evwlVar.a(czxo.a, evrr.a());
                final czxv czxvVar = (czxv) fcsuVar3.b();
                einf.f(new ctex(czxvVar.c.b(czxoVar.c, czxoVar.f), czxvVar.b.getResources().getString(R.string.reminder_snackbar_action_text), new Runnable() { // from class: czxq
                    @Override // java.lang.Runnable
                    public final void run() {
                        czxo czxoVar2 = czxoVar;
                        MessageIdType messageIdTypeB = bary.b(czxoVar2.d);
                        ConversationIdType conversationIdTypeB = barn.b(czxoVar2.e);
                        long j = czxoVar2.g;
                        czxv czxvVar2 = czxvVar;
                        czxvVar2.d.p(messageIdTypeB, conversationIdTypeB, j, 6).k(auwc.a(new czxu()), czxvVar2.e);
                    }
                }), eaVar);
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                czxl.a.o("Failed to update reminder.", th);
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.e = egpsVar2;
        egps<evwl<czxo>, Boolean> egpsVar3 = new egps<evwl<czxo>, Boolean>() { // from class: czxl.3
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                evwl evwlVar = (evwl) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    czxl.a.n("Failed to remove reminder: No reminder is on message");
                    return;
                }
                final czxo czxoVar = (czxo) evwlVar.a(czxo.a, evrr.a());
                final czxv czxvVar = (czxv) fcsuVar3.b();
                Context context2 = czxvVar.b;
                einf.f(new ctex(context2.getResources().getString(R.string.reminder_snackbar_delete_reminder_title_text), context2.getResources().getString(R.string.reminder_snackbar_action_text), new Runnable() { // from class: czxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        czxo czxoVar2 = czxoVar;
                        MessageIdType messageIdTypeB = bary.b(czxoVar2.d);
                        ConversationIdType conversationIdTypeB = barn.b(czxoVar2.e);
                        long j = czxoVar2.g;
                        czxv czxvVar2 = czxvVar;
                        eiju.g(czxvVar2.d.q(messageIdTypeB, conversationIdTypeB, j, 6)).k(auwc.a(new czxs()), czxvVar2.e);
                    }
                }), eaVar);
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                czxl.a.o("Failed to remove reminder", th);
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.f = egpsVar3;
        egprVar.j(egpsVar);
        egprVar.j(egpsVar2);
        egprVar.j(egpsVar3);
    }

    @Override // defpackage.czxe
    public final void a(czxo czxoVar) throws Resources.NotFoundException {
        if (!this.l) {
            ea eaVar = this.j;
            einf.c(eaVar, b.class, new eind() { // from class: czxf
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    czxo czxoVar2 = ((czxl.b) einbVar).a;
                    egpo egpoVarA = egpo.a(czxoVar2);
                    boolean z = czxoVar2.f;
                    czxl czxlVar = this.a;
                    if (z) {
                        egpr egprVar = czxlVar.b;
                        clfb clfbVar = (clfb) czxlVar.c.b();
                        MessageIdType messageIdTypeB = bary.b(czxoVar2.d);
                        ConversationIdType conversationIdTypeB = barn.b(czxoVar2.e);
                        long j = czxoVar2.c;
                        int iA = emgd.a(czxoVar2.h);
                        egprVar.h(new egpq(clfbVar.p(messageIdTypeB, conversationIdTypeB, j, iA == 0 ? 1 : iA)), egpoVarA, czxlVar.e);
                    } else {
                        egpr egprVar2 = czxlVar.b;
                        clfb clfbVar2 = (clfb) czxlVar.c.b();
                        MessageIdType messageIdTypeB2 = bary.b(czxoVar2.d);
                        ConversationIdType conversationIdTypeB2 = barn.b(czxoVar2.e);
                        long j2 = czxoVar2.c;
                        int iA2 = emgd.a(czxoVar2.h);
                        egprVar2.h(new egpq(clfbVar2.q(messageIdTypeB2, conversationIdTypeB2, j2, iA2 == 0 ? 1 : iA2)), egpoVarA, czxlVar.d);
                    }
                    return eine.a;
                }
            });
            einf.c(eaVar, a.class, new eind() { // from class: czxg
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    czxo czxoVar2 = ((czxl.a) einbVar).a;
                    czxl czxlVar = this.a;
                    czxlVar.b.h(new egpq(((clfb) czxlVar.c.b()).g(bary.b(czxoVar2.d), barn.b(czxoVar2.e))), egpo.a(czxoVar2), czxlVar.f);
                    return eine.a;
                }
            });
            einf.c(eaVar, e.class, new eind() { // from class: czxh
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    ((clfb) this.a.c.b()).r(2);
                    return eine.a;
                }
            });
            einf.c(eaVar, d.class, new eind() { // from class: czxi
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    ((clfb) this.a.c.b()).r(3);
                    return eine.a;
                }
            });
            einf.c(eaVar, f.class, new eind() { // from class: czxj
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    ((clfb) this.a.c.b()).r(4);
                    return eine.a;
                }
            });
            einf.c(eaVar, c.class, new eind() { // from class: czxk
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    ((clfb) this.a.c.b()).r(5);
                    return eine.a;
                }
            });
            this.l = true;
        }
        boolean z = czxoVar.f;
        aawb aawbVar = (aawb) aawc.a.createBuilder();
        ZonedDateTime zonedDateTimeWithSecond = this.h.f().atZone(ZoneId.systemDefault()).withSecond(0);
        ZonedDateTime zonedDateTimePlusHours = zonedDateTimeWithSecond.plusHours(1L);
        aawe aaweVar = aawe.a;
        aawd aawdVar = (aawd) aaweVar.createBuilder();
        aawh aawhVar = aawh.a;
        int i = aawhVar.h;
        aawdVar.copyOnWrite();
        ((aawe) aawdVar.instance).c = i;
        int i2 = aawhVar.g;
        aawdVar.copyOnWrite();
        ((aawe) aawdVar.instance).b = i2;
        long epochMilli = zonedDateTimePlusHours.toInstant().toEpochMilli();
        aawdVar.copyOnWrite();
        ((aawe) aawdVar.instance).d = epochMilli;
        aawe aaweVar2 = (aawe) aawdVar.build();
        ZonedDateTime zonedDateTimeWithMinute = zonedDateTimeWithSecond.withMinute(0);
        ZonedDateTime zonedDateTimeWithHour = zonedDateTimeWithMinute.withHour(12);
        aawd aawdVar2 = (aawd) aaweVar.createBuilder();
        aawh aawhVar2 = aawh.b;
        int i3 = aawhVar2.h;
        aawdVar2.copyOnWrite();
        ((aawe) aawdVar2.instance).c = i3;
        int i4 = aawhVar2.g;
        aawdVar2.copyOnWrite();
        ((aawe) aawdVar2.instance).b = i4;
        long epochMilli2 = zonedDateTimeWithHour.toInstant().toEpochMilli();
        aawdVar2.copyOnWrite();
        ((aawe) aawdVar2.instance).d = epochMilli2;
        aawe aaweVar3 = (aawe) aawdVar2.build();
        ZonedDateTime zonedDateTimeWithHour2 = zonedDateTimeWithMinute.withHour(20);
        aawd aawdVar3 = (aawd) aaweVar.createBuilder();
        aawh aawhVar3 = aawh.c;
        int i5 = aawhVar3.h;
        aawdVar3.copyOnWrite();
        ((aawe) aawdVar3.instance).c = i5;
        int i6 = aawhVar3.g;
        aawdVar3.copyOnWrite();
        ((aawe) aawdVar3.instance).b = i6;
        long epochMilli3 = zonedDateTimeWithHour2.toInstant().toEpochMilli();
        aawdVar3.copyOnWrite();
        ((aawe) aawdVar3.instance).d = epochMilli3;
        aawe aaweVar4 = (aawe) aawdVar3.build();
        ZonedDateTime zonedDateTimePlusDays = zonedDateTimeWithMinute.plusDays(1L);
        ZonedDateTime zonedDateTimeWithHour3 = zonedDateTimePlusDays.withHour(8);
        aawd aawdVar4 = (aawd) aaweVar.createBuilder();
        aawh aawhVar4 = aawh.d;
        int i7 = aawhVar4.h;
        aawdVar4.copyOnWrite();
        ((aawe) aawdVar4.instance).c = i7;
        int i8 = aawhVar4.g;
        aawdVar4.copyOnWrite();
        ((aawe) aawdVar4.instance).b = i8;
        long epochMilli4 = zonedDateTimeWithHour3.toInstant().toEpochMilli();
        aawdVar4.copyOnWrite();
        ((aawe) aawdVar4.instance).d = epochMilli4;
        aawe aaweVar5 = (aawe) aawdVar4.build();
        ZonedDateTime zonedDateTimeWithHour4 = zonedDateTimePlusDays.withHour(12);
        aawd aawdVar5 = (aawd) aaweVar.createBuilder();
        aawh aawhVar5 = aawh.e;
        int i9 = aawhVar5.h;
        aawdVar5.copyOnWrite();
        ((aawe) aawdVar5.instance).c = i9;
        int i10 = aawhVar5.g;
        aawdVar5.copyOnWrite();
        ((aawe) aawdVar5.instance).b = i10;
        long epochMilli5 = zonedDateTimeWithHour4.toInstant().toEpochMilli();
        aawdVar5.copyOnWrite();
        ((aawe) aawdVar5.instance).d = epochMilli5;
        aawe aaweVar6 = (aawe) aawdVar5.build();
        ZonedDateTime zonedDateTimeWithHour5 = zonedDateTimePlusDays.withHour(20);
        aawd aawdVar6 = (aawd) aaweVar.createBuilder();
        aawh aawhVar6 = aawh.f;
        int i11 = aawhVar6.h;
        aawdVar6.copyOnWrite();
        ((aawe) aawdVar6.instance).c = i11;
        int i12 = aawhVar6.g;
        aawdVar6.copyOnWrite();
        ((aawe) aawdVar6.instance).b = i12;
        long epochMilli6 = zonedDateTimeWithHour5.toInstant().toEpochMilli();
        aawdVar6.copyOnWrite();
        ((aawe) aawdVar6.instance).d = epochMilli6;
        aawe aaweVar7 = (aawe) aawdVar6.build();
        int hour = zonedDateTimeWithMinute.getHour();
        ekgb ekgbVarU = (hour < 0 || hour >= 8) ? (hour < 8 || hour >= 18) ? ekgb.u(aaweVar2, aaweVar5, aaweVar6, aaweVar7) : ekgb.u(aaweVar2, aaweVar4, aaweVar5, aaweVar6) : ekgb.u(aaweVar2, aaweVar3, aaweVar4, aaweVar5);
        aawbVar.copyOnWrite();
        aawc aawcVar = (aawc) aawbVar.instance;
        evtg evtgVar = aawcVar.b;
        if (!evtgVar.c()) {
            aawcVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(ekgbVarU, aawcVar.b);
        long j = czxoVar.g;
        aawbVar.copyOnWrite();
        ((aawc) aawbVar.instance).f = j;
        Context context = this.g;
        String string = context.getResources().getString(z ? R.string.reminder_datetime_picker_dialog_menu_title_update : R.string.reminder_datetime_picker_dialog_menu_title_add);
        aawbVar.copyOnWrite();
        aawc aawcVar2 = (aawc) aawbVar.instance;
        string.getClass();
        aawcVar2.c = string;
        if (z) {
            String string2 = context.getResources().getString(R.string.reminder_datetime_picker_dialog_delete_button);
            aawbVar.copyOnWrite();
            aawc aawcVar3 = (aawc) aawbVar.instance;
            string2.getClass();
            aawcVar3.e = string2;
            czxw czxwVar = (czxw) this.k.b();
            String string3 = czxwVar.a.getResources().getString(R.string.reminder_datetime_picker_dialog_sub_title, czxwVar.a(czxoVar.g));
            aawbVar.copyOnWrite();
            aawc aawcVar4 = (aawc) aawbVar.instance;
            string3.getClass();
            aawcVar4.d = string3;
        }
        czxm czxmVar = new czxm(czxoVar);
        final aayl aaylVar = (aayl) this.i.b();
        aawc aawcVar5 = (aawc) aawbVar.build();
        aaylVar.b = aawcVar5;
        aaylVar.e = czxmVar;
        aaylVar.c = Instant.ofEpochMilli(aawcVar5.f);
        if (!aaylVar.d) {
            ea eaVar2 = aaylVar.a;
            einf.c(eaVar2, aaxj.class, new eind() { // from class: aayg
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    aaylVar.a();
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxl.class, new eind() { // from class: aayh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    aayl aaylVar2 = aaylVar;
                    czxm czxmVar2 = aaylVar2.e;
                    czxmVar2.getClass();
                    aawe aaweVar8 = (aawe) aaylVar2.b.b.get(((aaxl) einbVar).a);
                    czxn builder = czxmVar2.a.toBuilder();
                    long j2 = aaweVar8.d;
                    builder.copyOnWrite();
                    czxo czxoVar2 = (czxo) builder.instance;
                    czxoVar2.b |= 1;
                    czxoVar2.c = j2;
                    einf.f(new czxl.b(builder.build()), aaylVar2.a);
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxk.class, new eind() { // from class: aayi
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    Instant instant = ((aaxk) einbVar).a.toInstant();
                    aayl aaylVar2 = aaylVar;
                    aaylVar2.c = instant;
                    aaylVar2.d();
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxm.class, new eind() { // from class: aayj
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    Instant instant = ((aaxm) einbVar).a.toInstant();
                    final aayl aaylVar2 = aaylVar;
                    aaylVar2.c = instant;
                    aavt aavtVar = (aavt) aavu.a.createBuilder();
                    long epochMilli7 = aaylVar2.c.toEpochMilli();
                    aavtVar.copyOnWrite();
                    ((aavu) aavtVar.instance).b = epochMilli7;
                    aavu aavuVar = (aavu) aavtVar.build();
                    aavn aavnVar = new aavn();
                    eyhj.e(aavnVar);
                    ehog.a(aavnVar, aavuVar);
                    aavnVar.aP(aaylVar2.a);
                    aaylVar2.b(aavnVar, "CONFIRMATION");
                    aaylVar2.e.getClass();
                    Optional.of(new czxl.c()).ifPresent(new Consumer() { // from class: aayc
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            einf.f((einb) obj, aaylVar2.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxh.class, new eind() { // from class: aayk
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    aaylVar.c();
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxg.class, new eind() { // from class: aaxy
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    aaylVar.a();
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxi.class, new eind() { // from class: aaxz
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    aaylVar.d();
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxe.class, new eind() { // from class: aaya
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    aayl aaylVar2 = aaylVar;
                    czxm czxmVar2 = aaylVar2.e;
                    czxmVar2.getClass();
                    czxo czxoVar2 = czxmVar2.a;
                    Instant instant = aaylVar2.c;
                    czxn builder = czxoVar2.toBuilder();
                    long epochMilli7 = instant.toEpochMilli();
                    builder.copyOnWrite();
                    czxo czxoVar3 = (czxo) builder.instance;
                    czxoVar3.b |= 1;
                    czxoVar3.c = epochMilli7;
                    einf.f(new czxl.b(builder.build()), aaylVar2.a);
                    return eine.a;
                }
            });
            einf.c(eaVar2, aaxf.class, new eind() { // from class: aayb
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    final aayl aaylVar2 = aaylVar;
                    czxm czxmVar2 = aaylVar2.e;
                    czxmVar2.getClass();
                    Optional.of(new czxl.a(czxmVar2.a)).ifPresent(new Consumer() { // from class: aayf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            einf.f((einb) obj, aaylVar2.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return eine.a;
                }
            });
            aaylVar.d = true;
        }
        aaylVar.c();
    }
}
