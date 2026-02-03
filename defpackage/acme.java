package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.textfield.TextInputLayout;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acme {
    private final einm A;
    public final Context a;
    public final acjz b;
    public final acio c;
    public final aclj d;
    public final ehac e;
    public final acjh f;
    public acjy g;
    public AutoCompleteTextView h;
    public TextInputLayout i;
    public LinearLayout j;
    public final crma m;
    public final fcsu n;
    public final acit o;
    public final fcsu p;
    public final fcsu q;
    public final acjc s;
    public final fcsu t;
    public final fcsu u;
    public AdvancedFeedbackActivity x;
    private final achu z;
    public final List k = new ArrayList();
    public final eksp l = eksp.c("Bugle");
    public elie r = elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_UNKNOWN;
    public Optional v = Optional.empty();
    public int w = 0;
    public final egzv y = new egzv<Optional<Bitmap>>() { // from class: acme.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            ((eksl) ((eksl) ((eksl) acme.this.l.j()).g(th)).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$1", "onError", (char) 132, "AdvancedFeedbackFragmentPeer.java")).q("Failed to fetch screenshot");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            acme.this.v = (Optional) obj;
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    };

    public acme(Context context, achu achuVar, aclj acljVar, acjz acjzVar, acio acioVar, einm einmVar, acjc acjcVar, ehac ehacVar, acjh acjhVar, crma crmaVar, fcsu fcsuVar, acit acitVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = context;
        this.z = achuVar;
        this.d = acljVar;
        this.b = acjzVar;
        this.c = acioVar;
        this.A = einmVar;
        this.s = acjcVar;
        this.e = ehacVar;
        this.f = acjhVar;
        this.m = crmaVar;
        this.n = fcsuVar;
        this.o = acitVar;
        this.p = fcsuVar2;
        this.q = fcsuVar3;
        this.t = fcsuVar4;
        this.u = fcsuVar5;
    }

    public final Intent a() {
        eg egVarG;
        aclj acljVar = this.d;
        if (acljVar == null || (egVarG = acljVar.G()) == null) {
            return null;
        }
        return egVarG.getIntent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        ArrayList arrayList;
        final achp achpVar = new achp();
        acjc acjcVar = this.s;
        if (acjcVar == null) {
            throw new NullPointerException("Null consentData");
        }
        achpVar.d = acjcVar;
        List list = this.k;
        Stream map = Collection.EL.stream(list).filter(new Predicate() { // from class: aclx
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
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                return advancedFeedbackDataView.f().isPresent() && advancedFeedbackDataView.g();
            }
        }).map(new Function() { // from class: acma
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [acin, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AdvancedFeedbackDataView) obj).f().get().e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        final ekgb ekgbVar = (ekgb) map.collect(collector);
        ((acim) this.t.b()).a(4, Optional.of(this.r), Optional.of(this.g.b()), Optional.of(ekgbVar), Optional.of(acjcVar.a));
        this.v.ifPresent(new Consumer() { // from class: acmb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((achp) achpVar).e = (Bitmap) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Collection.EL.stream(list).filter(new Predicate() { // from class: acmc
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
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                return advancedFeedbackDataView.f().isPresent() && advancedFeedbackDataView.g();
            }
        }).forEach(new Consumer() { // from class: acmd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Object obj2 = ((AdvancedFeedbackDataView) obj).f().get();
                achp achpVar2 = (achp) achpVar;
                if (achpVar2.a == null) {
                    int i2 = ekgb.d;
                    achpVar2.a = new ekfw();
                }
                achpVar2.a.h(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        int i2 = this.w;
        emgm emgmVarB = emgm.b(i2);
        String strName = (i2 == 0 || emgmVarB == null) ? this.g.b().name() : emgmVarB.name();
        if (achpVar.f == null) {
            achpVar.f = new ekgi();
        }
        achpVar.f.i("IssueTypeName", strName);
        String strF = f();
        if (strF != null) {
            achpVar.h = Optional.of(strF);
            ((eksl) ((eksl) this.l.h()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "launchFeedback", 414, "AdvancedFeedbackFragmentPeer.java")).t("Messages automatically detected an error. Advanced feedback complete, launching normal feedback: %s", strF);
        }
        if (e()) {
            ea eaVarG = this.x.H().a.a().g(R.id.message_selector_fragment);
            if (eaVarG instanceof acmr) {
                acmt acmtVarF = ((acmr) eaVarG).H();
                arrayList = new ArrayList();
                for (acna acnaVar : acmtVarF.f) {
                    final acji acjiVar = new acji();
                    acjiVar.c(acnaVar.e);
                    acjiVar.d(acnaVar.f);
                    Collection.EL.stream(acnaVar.d).filter(new Predicate() { // from class: acmv
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
                            return ((acnh) obj).a();
                        }
                    }).forEach(new Consumer() { // from class: acmw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            acjiVar.e(((acnh) obj).f);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Optional optionalOf = Optional.of(acjiVar.a());
                    optionalOf.isPresent();
                    arrayList.add(optionalOf.get());
                }
            } else {
                arrayList = new ArrayList();
            }
            acix acixVar = (acix) ((AdvancedFeedbackDataView) ((ekgb) Collection.EL.stream(list).filter(new Predicate() { // from class: acll
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
                    AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                    return advancedFeedbackDataView.f().isPresent() && advancedFeedbackDataView.g() && (advancedFeedbackDataView.f().get() instanceof acix);
                }
            }).collect(collector)).get(0)).f().get();
            ekgb ekgbVar2 = (ekgb) Collection.EL.stream(arrayList).map(new Function() { // from class: aclm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((acjp) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(collector);
            final ArrayList arrayList2 = new ArrayList();
            Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: acln
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Stream stream = Collection.EL.stream(((acjp) obj).c());
                    final List list2 = arrayList2;
                    stream.forEach(new Consumer() { // from class: aclu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            list2.add(((acjo) obj2).c());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            acixVar.j = ekgbVar2;
            acixVar.i = arrayList2;
        }
        achu achuVar = this.z;
        ekfw ekfwVar = achpVar.a;
        if (ekfwVar != null) {
            achpVar.b = ekfwVar.g();
        } else if (achpVar.b == null) {
            achpVar.b = ekoe.a;
        }
        if (achpVar.c == null) {
            achpVar.c = ekoe.a;
        }
        ekgi ekgiVar = achpVar.f;
        if (ekgiVar != null) {
            achpVar.g = ekgiVar.c();
        } else if (achpVar.g == null) {
            achpVar.g = ekoj.a;
        }
        acjc acjcVar2 = achpVar.d;
        if (acjcVar2 == null) {
            throw new IllegalStateException("Missing required properties: consentData");
        }
        defn defnVarA = achuVar.a(new achq(achpVar.b, achpVar.c, acjcVar2, achpVar.e, achpVar.g, achpVar.h));
        final Runnable runnableK = eiid.k(new Runnable() { // from class: aclo
            @Override // java.lang.Runnable
            public final void run() {
                acme acmeVar = this.a;
                ((acim) acmeVar.t.b()).a(5, Optional.of(acmeVar.r), Optional.of(acmeVar.g.b()), Optional.of(ekgbVar), Optional.of(acmeVar.s.a));
            }
        });
        final Runnable runnableK2 = eiid.k(new Runnable() { // from class: aclp
            @Override // java.lang.Runnable
            public final void run() {
                acme acmeVar = this.a;
                ((acim) acmeVar.t.b()).a(6, Optional.of(acmeVar.r), Optional.of(acmeVar.g.b()), Optional.of(ekgbVar), Optional.of(acmeVar.s.a));
            }
        });
        defnVarA.a(new defh() { // from class: acly
            @Override // defpackage.defh
            public final void e(Object obj) {
                runnableK.run();
            }
        });
        defnVarA.t(new defe() { // from class: aclz
            @Override // defpackage.defe
            public final void d(Exception exc) {
                runnableK2.run();
            }
        });
        AdvancedFeedbackActivity advancedFeedbackActivity = this.x;
        if (advancedFeedbackActivity != null) {
            advancedFeedbackActivity.finish();
        }
    }

    final void c(acjy acjyVar) {
        this.i.j(null);
        this.g = acjyVar;
        for (AdvancedFeedbackDataView advancedFeedbackDataView : this.k) {
            ekgb ekgbVarA = acjyVar.a();
            int size = ekgbVarA.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < size) {
                    Class<?> cls = ((acin) ekgbVarA.get(i)).getClass();
                    i++;
                    if (cls == advancedFeedbackDataView.j.getClass()) {
                        z = true;
                        break;
                    }
                }
            }
            advancedFeedbackDataView.g.setChecked(z);
        }
    }

    final void d() {
        im imVarK = this.x.k();
        if (imVarK != null) {
            imVarK.setDisplayHomeAsUpEnabled(true);
            imVarK.setDisplayShowCustomEnabled(true);
            imVarK.setDisplayShowTitleEnabled(false);
            imVarK.setCustomView(R.layout.advanced_feedback_toolbar);
            this.A.a((Button) imVarK.getCustomView().findViewById(R.id.advanced_feedback_fragment_next_button), new View.OnClickListener() { // from class: aclq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    acme acmeVar = this.a;
                    if (acmeVar.g == null) {
                        acmeVar.i.j(" ");
                        return;
                    }
                    if (((Boolean) ackx.b.e()).booleanValue()) {
                        Stream streamFilter = Collection.EL.stream(acmeVar.k).filter(new Predicate() { // from class: aclw
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
                                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                                return advancedFeedbackDataView.f().isPresent() && advancedFeedbackDataView.g() && (advancedFeedbackDataView.f().get() instanceof acit);
                            }
                        });
                        int i = ekgb.d;
                        if (!((ekgb) streamFilter.collect(ekcv.a)).isEmpty()) {
                            crma crmaVar = acmeVar.m;
                            if (!crmaVar.i() && acmeVar.x.H().d == 1) {
                                if (crmaVar.i()) {
                                    return;
                                }
                                ((eksl) acmeVar.l.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "requestLocationPermissionAndLaunchFeedback", 585, "AdvancedFeedbackFragmentPeer.java")).q("Request location permission");
                                ((crmg) acmeVar.n.b()).e(new acmf(acmeVar));
                                return;
                            }
                        }
                    }
                    if (((Boolean) ackx.c.e()).booleanValue() && acmeVar.e() && acmeVar.x.H().d == 1) {
                        einf.f(new acmi(), acmeVar.d);
                    } else {
                        acmeVar.b();
                    }
                }
            });
        }
        Toolbar toolbarFb = this.x.fb();
        if (toolbarFb != null) {
            toolbarFb.t(new View.OnClickListener() { // from class: aclr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    acme acmeVar = this.a;
                    ((acim) acmeVar.t.b()).a(3, Optional.of(acmeVar.r), Optional.empty(), Optional.empty(), Optional.empty());
                    acmeVar.x.c().d();
                }
            });
        }
    }

    final boolean e() {
        Stream streamFilter = Collection.EL.stream(this.k).filter(new Predicate() { // from class: aclt
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
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                return advancedFeedbackDataView.f().isPresent() && advancedFeedbackDataView.g() && (advancedFeedbackDataView.f().get() instanceof acix);
            }
        });
        int i = ekgb.d;
        return !((ekgb) streamFilter.collect(ekcv.a)).isEmpty();
    }

    public final String f() {
        Intent intentA = a();
        if (intentA == null) {
            return null;
        }
        return intentA.getStringExtra("advanced_feedback_throwable_string_key");
    }
}
