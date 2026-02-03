package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absd implements abdk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions");
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    public final abse e;
    public final fcsu f;
    public final fcsu g;
    public adj h;
    public adj i;
    public Intent j;
    private final fcsu k;
    private final fcsu l;
    private final egzv n = new egzv<Integer>() { // from class: absd.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            ekrw ekrwVarJ = absd.a.j();
            ekrwVarJ.X(eksq.a, "DittoSatellite");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onError", (char) 136, "SatelliteExtensions.java")).q("Failed to determine the TabletMode");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) throws IOException {
            Intent intent;
            fcsu fcsuVar;
            fcsu fcsuVar2;
            Integer num = (Integer) obj;
            absd absdVar = absd.this;
            abse abseVar = absdVar.e;
            if (abseVar != null && (fcsuVar = absdVar.f) != null && (fcsuVar2 = absdVar.g) != null) {
                if (!abseVar.c()) {
                    ekrw ekrwVarE = absd.a.e();
                    ekrwVarE.X(eksq.a, "DittoSatellite");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "logSmsStatusOnTablet", 322, "SatelliteExtensions.java")).q("No read phone state permission, skip logging");
                } else if (!((crnp) fcsuVar.b()).e()) {
                    ekrw ekrwVarE2 = absd.a.e();
                    ekrwVarE2.X(eksq.a, "DittoSatellite");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "logSmsStatusOnTablet", 326, "SatelliteExtensions.java")).q("This is a WiFi tablet.");
                } else if (abseVar.b()) {
                    ((ains) fcsuVar2.b()).e("Bugle.Satellite.Lte.Sim.Status.Counts", 1);
                } else if (abseVar.d()) {
                    ((ains) fcsuVar2.b()).e("Bugle.Satellite.Lte.Sim.Status.Counts", 2);
                } else {
                    ((ains) fcsuVar2.b()).e("Bugle.Satellite.Lte.Sim.Status.Counts", 3);
                }
            }
            ekrg ekrgVar = absd.a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 72, "SatelliteExtensions.java")).t("onboarding tabletMode: %s", num);
            if (num.intValue() == 2) {
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 74, "SatelliteExtensions.java")).q("Stay in bugle by stored user choice");
                return;
            }
            if (abseVar == null) {
                ekrw ekrwVarJ = ekrgVar.j();
                ekrwVarJ.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 78, "SatelliteExtensions.java")).q("satelliteUtils is null.");
                return;
            }
            if (absdVar.c == null) {
                ekrw ekrwVarJ2 = ekrgVar.j();
                ekrwVarJ2.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 82, "SatelliteExtensions.java")).q("switcherDialogProvider is null.");
                return;
            }
            fcsu fcsuVar3 = absdVar.d;
            if (fcsuVar3 == null || ((Optional) fcsuVar3.b()).isEmpty()) {
                ekrw ekrwVarJ3 = ekrgVar.j();
                ekrwVarJ3.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 87, "SatelliteExtensions.java")).q("satelliteDataServiceProvider is null.");
                return;
            }
            Context context = absdVar.b;
            if (context == null) {
                ekrw ekrwVarJ4 = ekrgVar.j();
                ekrwVarJ4.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 91, "SatelliteExtensions.java")).q("context is null.");
                return;
            }
            if (absdVar.h == null) {
                ekrw ekrwVarJ5 = ekrgVar.j();
                ekrwVarJ5.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarJ5).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 95, "SatelliteExtensions.java")).q("launcher is null.");
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) DittoWebActivity.class);
            intent2.addFlags(65536);
            if (num.intValue() != 0) {
                if (num.intValue() == 1) {
                    ekrw ekrwVarH3 = ekrgVar.h();
                    ekrwVarH3.X(ekrzVar, "DittoSatellite");
                    ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 129, "SatelliteExtensions.java")).q("Launch Ditto by stored user choice");
                }
                absdVar.h.c(intent2);
                return;
            }
            if (!abseVar.c()) {
                ekrw ekrwVarH4 = ekrgVar.h();
                ekrwVarH4.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 122, "SatelliteExtensions.java")).q("Request permission");
                adj adjVar = absdVar.i;
                if (adjVar == null || (intent = absdVar.j) == null) {
                    return;
                }
                adjVar.c(intent);
                return;
            }
            if (abseVar.b()) {
                ekrw ekrwVarH5 = ekrgVar.h();
                ekrwVarH5.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 103, "SatelliteExtensions.java")).q("Hide switcher since there is phone number.");
                if (((Optional) fcsuVar3.b()).isPresent()) {
                    ekrw ekrwVarE3 = ekrgVar.e();
                    ekrwVarE3.X(ekrzVar, "DittoSatellite");
                    ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 105, "SatelliteExtensions.java")).q("set STANDALONE in datastore");
                    ((abgm) ((Optional) fcsuVar3.b()).get()).c(abgx.STANDALONE).k(auvh.b(), eoqg.a);
                    return;
                }
                return;
            }
            ekrw ekrwVarH6 = ekrgVar.h();
            ekrwVarH6.X(ekrzVar, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 114, "SatelliteExtensions.java")).q("No phone number.");
            fcsu fcsuVar4 = absdVar.f;
            if (fcsuVar4 == null || ((crnp) fcsuVar4.b()).e()) {
                return;
            }
            ekrw ekrwVarH7 = ekrgVar.h();
            ekrwVarH7.X(ekrzVar, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH7).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 116, "SatelliteExtensions.java")).q("Launch Satellite on Wifi");
            absd.o(context);
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    };
    private final adi m = new adi() { // from class: absb
        @Override // defpackage.adi
        public final void a(Object obj) throws IOException {
            int i = ((adh) obj).a;
            absd absdVar = this.a;
            if (i != -1) {
                ekrg ekrgVar = absd.a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 376, "SatelliteExtensions.java")).q("User denied to set as default sms.");
                fcsu fcsuVar = absdVar.f;
                if (fcsuVar != null && !((crnp) fcsuVar.b()).e()) {
                    ekrw ekrwVarH2 = ekrgVar.h();
                    ekrwVarH2.X(ekrzVar, "DittoSatellite");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 378, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Launch Satellite on Wifi");
                    absd.o(absdVar.b);
                    return;
                }
                ekrw ekrwVarH3 = ekrgVar.h();
                ekrwVarH3.X(ekrzVar, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 381, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Show switcher on LTE.");
                fcsu fcsuVar2 = absdVar.c;
                if (fcsuVar2 != null) {
                    ((absi) fcsuVar2.b()).b(abgx.STANDALONE, true);
                    return;
                }
                return;
            }
            ekrg ekrgVar2 = absd.a;
            ekrw ekrwVarH4 = ekrgVar2.h();
            ekrz ekrzVar2 = eksq.a;
            ekrwVarH4.X(ekrzVar2, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 350, "SatelliteExtensions.java")).q("successfully set as default sms");
            abse abseVar = absdVar.e;
            if (abseVar != null && abseVar.b()) {
                ekrw ekrwVarH5 = ekrgVar2.h();
                ekrwVarH5.X(ekrzVar2, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 352, "SatelliteExtensions.java")).q("Hide switcher since there is phone number.");
                fcsu fcsuVar3 = absdVar.d;
                if (fcsuVar3 == null || !((Optional) fcsuVar3.b()).isPresent()) {
                    return;
                }
                ekrw ekrwVarH6 = ekrgVar2.h();
                ekrwVarH6.X(ekrzVar2, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 355, "SatelliteExtensions.java")).q("set STANDALONE in datastore");
                ((abgm) ((Optional) fcsuVar3.b()).get()).c(abgx.STANDALONE).k(auvh.b(), eoqg.a);
                return;
            }
            ekrw ekrwVarH7 = ekrgVar2.h();
            ekrwVarH7.X(ekrzVar2, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH7).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 363, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: No phone number.");
            fcsu fcsuVar4 = absdVar.f;
            if (fcsuVar4 != null && !((crnp) fcsuVar4.b()).e()) {
                ekrw ekrwVarH8 = ekrgVar2.h();
                ekrwVarH8.X(ekrzVar2, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH8).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 365, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Launch Satellite on Wifi");
                absd.o(absdVar.b);
                return;
            }
            ekrw ekrwVarH9 = ekrgVar2.h();
            ekrwVarH9.X(ekrzVar2, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH9).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 368, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Show switcher on LTE.");
            fcsu fcsuVar5 = absdVar.c;
            if (fcsuVar5 != null) {
                ((absi) fcsuVar5.b()).b(abgx.STANDALONE, true);
            }
        }
    };

    public absd(Context context, fcsu fcsuVar, fcsu fcsuVar2, abse abseVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = abseVar;
        this.f = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fcsuVar5;
        this.g = fcsuVar6;
    }

    public static void o(Context context) throws IOException {
        if (context == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "launchDitto", 302, "SatelliteExtensions.java")).q("context is null.");
        } else {
            Intent intent = new Intent(context, (Class<?>) DittoWebActivity.class);
            intent.addFlags(65536);
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            eiid.o(context, intent);
        }
    }

    @Override // defpackage.abdk
    public final eiju a() {
        return ((abgm) ((Optional) this.d.b()).get()).b().h(new ejvr() { // from class: absc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fcsu fcsuVar;
                if (((abgx) obj) != abgx.UNKNOWN) {
                    return false;
                }
                absd absdVar = this.a;
                abse abseVar = absdVar.e;
                if (!abseVar.c() || abseVar.b() || ((fcsuVar = absdVar.f) != null && !((crnp) fcsuVar.b()).e())) {
                    return false;
                }
                ekrw ekrwVarH = absd.a.h();
                ekrwVarH.X(eksq.a, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "wantsToShowSwitcher", 181, "SatelliteExtensions.java")).q("wants to show switcher on LTE device.");
                return true;
            }
        }, eoqg.a);
    }

    @Override // defpackage.abdk
    public final Optional b(Activity activity) {
        return Optional.of(((aijh) this.k.b()).l(activity));
    }

    @Override // defpackage.abdk
    public final void c() {
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) DittoWebActivity.class);
        intent.addFlags(65536);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        context.startActivity(intent);
    }

    @Override // defpackage.abdk
    public final void d(final Intent intent) throws IOException {
        Optional optionalEmpty;
        ekgb ekgbVarR;
        final abni abniVar = (abni) this.l.b();
        if (intent == null || !("android.intent.action.SENDTO".equals(intent.getAction()) || "android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction()))) {
            cqce cqceVar = abni.a;
            cqceVar.r("Invalid or unsupported intent");
            if (intent != null && intent.getAction() != null) {
                cqceVar.r("unsupported intent action: ".concat(String.valueOf(intent.getAction())));
            }
            optionalEmpty = Optional.empty();
        } else {
            Optional optionalA = cqti.a(intent);
            Optional optionalB = ((cqti) abniVar.b.b()).b(intent);
            final Intent intent2 = new Intent("ForwardDraftIntentToDittoAction");
            optionalB.ifPresent(new Consumer() { // from class: abmz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    intent2.putExtra("DittoDraftIntentRecipients", (String[]) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optionalA.ifPresent(new Consumer() { // from class: abna
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    intent2.putExtra("DittoDraftIntentBody", (String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SENDTO".equals(intent.getAction()) || "android.intent.action.VIEW".equals(intent.getAction())) {
                Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri != null) {
                    ekgbVarR = ekgb.r(uri);
                    intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(ekgbVarR).map(new Function() { // from class: abnb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Optional.ofNullable(((cqmr) abniVar.c.b()).b((Uri) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: abnc
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: abnd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Uri) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: abne
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            Uri uri2 = (Uri) obj;
                            String path = uri2.getPath();
                            if (path == null || !cqmz.o(uri2)) {
                                return true;
                            }
                            abni abniVar2 = abniVar;
                            if (!((cqmr) abniVar2.c.b()).f(new File(path))) {
                                return true;
                            }
                            ((ains) abniVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                            return false;
                        }
                    }).map(new Function() { // from class: abnf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Optional optionalOfNullable;
                            String strE;
                            final Uri uri2 = (Uri) obj;
                            String type = intent.getType();
                            cqti cqtiVar = (cqti) abniVar.b.b();
                            if (le.w(type)) {
                                optionalOfNullable = Optional.ofNullable(le.b(type));
                            } else if (uri2 == null || !((cqmz) cqtiVar.e.b()).l(type)) {
                                optionalOfNullable = Optional.ofNullable(type);
                            } else {
                                String type2 = cqtiVar.c.getContentResolver().getType(uri2);
                                if (type2 != null) {
                                    optionalOfNullable = Optional.of(type2);
                                } else {
                                    cqwg cqwgVar = (cqwg) cqtiVar.d.b();
                                    try {
                                        try {
                                            cqwgVar.c(uri2);
                                            strE = cqwgVar.e();
                                        } catch (IOException e) {
                                            ekrw ekrwVarH = cqti.a.h();
                                            ekrwVarH.X(eksq.a, "Bugle");
                                            ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 227, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                        }
                                        if (strE != null) {
                                            optionalOfNullable = Optional.of(strE);
                                        } else {
                                            cqwgVar.b();
                                            optionalOfNullable = Optional.ofNullable(type);
                                        }
                                    } finally {
                                        cqwgVar.b();
                                    }
                                }
                            }
                            return optionalOfNullable.map(new Function() { // from class: abmy
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return new abmx(uri2, (String) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: abnc
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: abng
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (DittoAttachment) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: abnh
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    })));
                    optionalEmpty = Optional.of(intent2);
                } else {
                    cqti.b.r("SEND or SENDTO actions do not have Uri");
                    int i = ekgb.d;
                    ekgbVarR = ekoe.a;
                    intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(ekgbVarR).map(new Function() { // from class: abnb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Optional.ofNullable(((cqmr) abniVar.c.b()).b((Uri) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: abnc
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: abnd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Uri) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: abne
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            Uri uri2 = (Uri) obj;
                            String path = uri2.getPath();
                            if (path == null || !cqmz.o(uri2)) {
                                return true;
                            }
                            abni abniVar2 = abniVar;
                            if (!((cqmr) abniVar2.c.b()).f(new File(path))) {
                                return true;
                            }
                            ((ains) abniVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                            return false;
                        }
                    }).map(new Function() { // from class: abnf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Optional optionalOfNullable;
                            String strE;
                            final Uri uri2 = (Uri) obj;
                            String type = intent.getType();
                            cqti cqtiVar = (cqti) abniVar.b.b();
                            if (le.w(type)) {
                                optionalOfNullable = Optional.ofNullable(le.b(type));
                            } else if (uri2 == null || !((cqmz) cqtiVar.e.b()).l(type)) {
                                optionalOfNullable = Optional.ofNullable(type);
                            } else {
                                String type2 = cqtiVar.c.getContentResolver().getType(uri2);
                                if (type2 != null) {
                                    optionalOfNullable = Optional.of(type2);
                                } else {
                                    cqwg cqwgVar = (cqwg) cqtiVar.d.b();
                                    try {
                                        try {
                                            cqwgVar.c(uri2);
                                            strE = cqwgVar.e();
                                        } catch (IOException e) {
                                            ekrw ekrwVarH = cqti.a.h();
                                            ekrwVarH.X(eksq.a, "Bugle");
                                            ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 227, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                        }
                                        if (strE != null) {
                                            optionalOfNullable = Optional.of(strE);
                                        } else {
                                            cqwgVar.b();
                                            optionalOfNullable = Optional.ofNullable(type);
                                        }
                                    } finally {
                                        cqwgVar.b();
                                    }
                                }
                            }
                            return optionalOfNullable.map(new Function() { // from class: abmy
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return new abmx(uri2, (String) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: abnc
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: abng
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (DittoAttachment) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: abnh
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    })));
                    optionalEmpty = Optional.of(intent2);
                }
            } else {
                if ("android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (parcelableArrayListExtra != null) {
                        Stream streamFilter = Collection.EL.stream(parcelableArrayListExtra).filter(new Predicate() { // from class: cqtg
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return Objects.nonNull((Uri) obj);
                            }
                        });
                        int i2 = ekgb.d;
                        ekgbVarR = (ekgb) streamFilter.collect(ekcv.a);
                        intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(ekgbVarR).map(new Function() { // from class: abnb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Optional.ofNullable(((cqmr) abniVar.c.b()).b((Uri) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: abnc
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ((Optional) obj).isPresent();
                            }
                        }).map(new Function() { // from class: abnd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return (Uri) ((Optional) obj).get();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: abne
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                Uri uri2 = (Uri) obj;
                                String path = uri2.getPath();
                                if (path == null || !cqmz.o(uri2)) {
                                    return true;
                                }
                                abni abniVar2 = abniVar;
                                if (!((cqmr) abniVar2.c.b()).f(new File(path))) {
                                    return true;
                                }
                                ((ains) abniVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                                return false;
                            }
                        }).map(new Function() { // from class: abnf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Optional optionalOfNullable;
                                String strE;
                                final Uri uri2 = (Uri) obj;
                                String type = intent.getType();
                                cqti cqtiVar = (cqti) abniVar.b.b();
                                if (le.w(type)) {
                                    optionalOfNullable = Optional.ofNullable(le.b(type));
                                } else if (uri2 == null || !((cqmz) cqtiVar.e.b()).l(type)) {
                                    optionalOfNullable = Optional.ofNullable(type);
                                } else {
                                    String type2 = cqtiVar.c.getContentResolver().getType(uri2);
                                    if (type2 != null) {
                                        optionalOfNullable = Optional.of(type2);
                                    } else {
                                        cqwg cqwgVar = (cqwg) cqtiVar.d.b();
                                        try {
                                            try {
                                                cqwgVar.c(uri2);
                                                strE = cqwgVar.e();
                                            } catch (IOException e) {
                                                ekrw ekrwVarH = cqti.a.h();
                                                ekrwVarH.X(eksq.a, "Bugle");
                                                ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 227, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                            }
                                            if (strE != null) {
                                                optionalOfNullable = Optional.of(strE);
                                            } else {
                                                cqwgVar.b();
                                                optionalOfNullable = Optional.ofNullable(type);
                                            }
                                        } finally {
                                            cqwgVar.b();
                                        }
                                    }
                                }
                                return optionalOfNullable.map(new Function() { // from class: abmy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return new abmx(uri2, (String) obj2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: abnc
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ((Optional) obj).isPresent();
                            }
                        }).map(new Function() { // from class: abng
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return (DittoAttachment) ((Optional) obj).get();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: abnh
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                        optionalEmpty = Optional.of(intent2);
                    } else {
                        cqti.b.r("SEND_MULTIPLE action does not have Uris");
                    }
                } else {
                    cqti.b.r("Unsupported action type for extracting attachment uri: ".concat(String.valueOf(intent.getAction())));
                }
                int i3 = ekgb.d;
                ekgbVarR = ekoe.a;
                intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(ekgbVarR).map(new Function() { // from class: abnb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Optional.ofNullable(((cqmr) abniVar.c.b()).b((Uri) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: abnc
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Optional) obj).isPresent();
                    }
                }).map(new Function() { // from class: abnd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (Uri) ((Optional) obj).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: abne
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        Uri uri2 = (Uri) obj;
                        String path = uri2.getPath();
                        if (path == null || !cqmz.o(uri2)) {
                            return true;
                        }
                        abni abniVar2 = abniVar;
                        if (!((cqmr) abniVar2.c.b()).f(new File(path))) {
                            return true;
                        }
                        ((ains) abniVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                        return false;
                    }
                }).map(new Function() { // from class: abnf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Optional optionalOfNullable;
                        String strE;
                        final Uri uri2 = (Uri) obj;
                        String type = intent.getType();
                        cqti cqtiVar = (cqti) abniVar.b.b();
                        if (le.w(type)) {
                            optionalOfNullable = Optional.ofNullable(le.b(type));
                        } else if (uri2 == null || !((cqmz) cqtiVar.e.b()).l(type)) {
                            optionalOfNullable = Optional.ofNullable(type);
                        } else {
                            String type2 = cqtiVar.c.getContentResolver().getType(uri2);
                            if (type2 != null) {
                                optionalOfNullable = Optional.of(type2);
                            } else {
                                cqwg cqwgVar = (cqwg) cqtiVar.d.b();
                                try {
                                    try {
                                        cqwgVar.c(uri2);
                                        strE = cqwgVar.e();
                                    } catch (IOException e) {
                                        ekrw ekrwVarH = cqti.a.h();
                                        ekrwVarH.X(eksq.a, "Bugle");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 227, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                    }
                                    if (strE != null) {
                                        optionalOfNullable = Optional.of(strE);
                                    } else {
                                        cqwgVar.b();
                                        optionalOfNullable = Optional.ofNullable(type);
                                    }
                                } finally {
                                    cqwgVar.b();
                                }
                            }
                        }
                        return optionalOfNullable.map(new Function() { // from class: abmy
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new abmx(uri2, (String) obj2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: abnc
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Optional) obj).isPresent();
                    }
                }).map(new Function() { // from class: abng
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (DittoAttachment) ((Optional) obj).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: abnh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                optionalEmpty = Optional.of(intent2);
            }
        }
        if (!optionalEmpty.isPresent()) {
            c();
            return;
        }
        Object obj = optionalEmpty.get();
        Context context = this.b;
        ((Intent) obj).setClass(context, DittoWebActivity.class);
        ((Intent) optionalEmpty.get()).addFlags(65536);
        ((Intent) optionalEmpty.get()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eiid.o(context, (Intent) optionalEmpty.get());
    }

    @Override // defpackage.abdk
    public final void e(Intent intent, ea eaVar) {
        this.i = eaVar.O(new aeo(), this.m);
        this.j = intent;
    }

    @Override // defpackage.abdk
    public final void f(ehac ehacVar, adj adjVar) {
        this.h = adjVar;
        fcsu fcsuVar = this.d;
        if (((Optional) fcsuVar.b()).isPresent()) {
            ehacVar.a(((abgm) ((Optional) fcsuVar.b()).get()).a(), this.n);
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "DittoSatellite");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "registerSubscriptionMixin", 230, "SatelliteExtensions.java")).q("SatelliteDataService is empty, cannot get shouldLaunchSwitcher.");
    }

    @Override // defpackage.abdk
    public final void g(abgx abgxVar) {
        ((absi) this.c.b()).a(abgxVar);
    }

    @Override // defpackage.abdk
    public final void h(boolean z) {
        if (z) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "DittoSatellite");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "showSwitcherOnDittoSatelliteIfNeeded", 256, "SatelliteExtensions.java")).q("show switcher on DittoSatellite");
            ((absi) this.c.b()).b(abgx.REMOTE, true);
        }
    }

    @Override // defpackage.abdk
    public final void i() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "DittoSatellite");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "showSwitcherOnHome", 248, "SatelliteExtensions.java")).q("show switcher on Bugle HomeActivity");
        ((absi) this.c.b()).b(abgx.STANDALONE, true);
    }

    @Override // defpackage.abdk
    public final void j(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.ditto_home_menu, menu);
    }

    @Override // defpackage.abdk
    public final void k(Toolbar toolbar) {
        toolbar.o(R.menu.ditto_home_menu);
    }

    @Override // defpackage.abdk
    public final boolean l() {
        return this.e.b();
    }

    @Override // defpackage.abdk
    public final boolean m() {
        return true;
    }

    @Override // defpackage.abdk
    public final boolean n(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_choose_texting_mode) {
            return false;
        }
        ((absi) this.c.b()).a(abgx.STANDALONE);
        return true;
    }
}
