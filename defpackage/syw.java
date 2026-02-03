package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Row;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syw extends clu {
    public static final ekrg d = ekrg.c("com/google/android/apps/messaging/auto/MessagingTemplateScreen");
    static final dzfh e = new dzfh("Auto.LoadConversationScreenLatency");
    public final Context f;
    public cquc g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final eosc m;
    public final AtomicReference n;
    public final AtomicBoolean o;
    public final syv p;
    public final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final anpj t;

    public syw(Context context, fcsu fcsuVar, eosc eoscVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, clg clgVar) {
        super(clgVar);
        this.n = new AtomicReference(Optional.empty());
        this.o = new AtomicBoolean(false);
        this.f = context;
        this.h = fcsuVar;
        this.m = eoscVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.r = fcsuVar4;
        this.i = fcsuVar5;
        this.q = fcsuVar6;
        this.j = fcsuVar7;
        this.s = fcsuVar8;
        ekrw ekrwVarE = d.e();
        ekrwVarE.X(eksq.a, "BugleAppOnAuto");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "<init>", 155, "MessagingTemplateScreen.java")).q("Creating a MessagingTemplateScreen and getting top convos");
        anpj anpjVarH = ((ajln) fcsuVar2.b()).H(10);
        this.t = anpjVarH;
        syv syvVar = new syv(this);
        this.p = syvVar;
        this.g = anpjVarH.a(syvVar);
    }

    private final void f() {
        eiju eijuVarB = this.t.b();
        eooz eoozVar = new eooz() { // from class: syf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgb ekgbVar = (ekgb) obj;
                final ArrayList arrayList = new ArrayList();
                Stream stream = Collection.EL.stream(ekgbVar);
                final syw sywVar = this.a;
                stream.forEach(new Consumer() { // from class: syl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ajlp ajlpVar = (ajlp) obj2;
                        final ConversationId conversationIdC = ajlpVar.c();
                        final syw sywVar2 = sywVar;
                        Conversation conversationA = ((ajln) sywVar2.k.b()).a(conversationIdC, ajlm.MINIMAL);
                        List list = arrayList;
                        try {
                            final syt sytVar = new syt(sywVar2, conversationA);
                            final String strE = ajlpVar.e();
                            final Uri uriB = ajlpVar.b();
                            eiju eijuVarB2 = conversationA.h().b();
                            ejvr ejvrVar = new ejvr() { // from class: syn
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    ajlk ajlkVar = (ajlk) obj3;
                                    ajlj ajljVarC = ajlkVar.c();
                                    ajlj ajljVar = ajlj.GROUP;
                                    aoer aoerVarH = ajlkVar.h();
                                    kwz kwzVar = new kwz();
                                    if (aoerVarH == null) {
                                        ekrw ekrwVarJ = syw.d.j();
                                        ekrwVarJ.X(eksq.a, "BugleAppOnAuto");
                                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "convertPropertiesToPropertiesMetadata", 491, "MessagingTemplateScreen.java")).q("Unable to retrieve selfId from ConversationProperties, using fallback");
                                        kwzVar.d = "-1";
                                    } else {
                                        kwzVar.d = aoerVarH.h().b();
                                    }
                                    syw sywVar3 = sywVar2;
                                    boolean z = ajljVarC == ajljVar;
                                    kwzVar.a = sywVar3.e(aoerVarH);
                                    return new syu(z, new kxa(kwzVar), aoerVarH);
                                }
                            };
                            eosc eoscVar = sywVar2.m;
                            final eiju eijuVarH = eijuVarB2.h(ejvrVar, eoscVar);
                            final eiju eijuVarH2 = conversationA.c().P().h(new ejvr() { // from class: syo
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    Stream streamFilter = Collection.EL.stream(((ekgb) obj3).a()).filter(new Predicate() { // from class: syi
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
                                        public final boolean test(Object obj4) {
                                            ajlt ajltVar = (ajlt) obj4;
                                            return (ajltVar.g() instanceof amwf) || (ajltVar.g() instanceof amsv);
                                        }
                                    });
                                    final syw sywVar3 = sywVar2;
                                    return (ekgb) streamFilter.map(new Function() { // from class: syj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            ajlt ajltVar = (ajlt) obj4;
                                            cmz cmzVar = new cmz();
                                            amvr amvrVarG = ajltVar.g();
                                            boolean z = amvrVarG instanceof amsv;
                                            syw sywVar4 = sywVar3;
                                            if (z) {
                                                amsv amsvVar = (amsv) amvrVarG;
                                                String strB = amsvVar.b();
                                                String string = sywVar4.f.getString(csru.a(strB));
                                                cmzVar.c = strB;
                                                cmzVar.d = amsvVar.e();
                                                cmzVar.b = CarText.create(string);
                                            } else if (amvrVarG instanceof amwf) {
                                                cmzVar.b = CarText.create(((amwf) amvrVarG).c());
                                            }
                                            ajmc ajmcVarD = ajltVar.d();
                                            int iD = ajmcVarD.d();
                                            kwz kwzVar = new kwz();
                                            if (iD == 2 && (ajmcVarD instanceof ajmq)) {
                                                aoer aoerVarC = ((ajmq) ajmcVarD).c();
                                                kwzVar.a = sywVar4.e(aoerVarC);
                                                kwzVar.d = aoerVarC.h().b();
                                            } else {
                                                if (!(ajmcVarD instanceof ajlr)) {
                                                    ekrw ekrwVarE = syw.d.e();
                                                    ekrwVarE.X(eksq.a, "BugleAppOnAuto");
                                                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "convertMessageToCarMessage", 546, "MessagingTemplateScreen.java")).q("Skipping system generated message");
                                                    return null;
                                                }
                                                ajlr ajlrVar = (ajlr) ajmcVarD;
                                                kwzVar.a = ajlrVar.a().x(true);
                                                kwzVar.d = ajlrVar.a().F().a;
                                            }
                                            cmzVar.a = new kxa(kwzVar);
                                            cmzVar.e = ajltVar.o().toEpochMilli();
                                            cmzVar.f = ajltVar.y();
                                            String str = cmzVar.c;
                                            if ((cmzVar.d == null) ^ (str == null)) {
                                                throw new IllegalStateException("Incomplete multimedia data detected in CarMessage. Please be sure to provide both MIME type and URI for multimedia messages.");
                                            }
                                            if (cmzVar.b == null && str == null) {
                                                throw new IllegalStateException("Message must have content. Please provide body text, multimedia data (URI + MIME type), or both.");
                                            }
                                            return new CarMessage(cmzVar);
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).filter(new Predicate() { // from class: syk
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
                                        public final boolean test(Object obj4) {
                                            return Objects.nonNull((CarMessage) obj4);
                                        }
                                    }).collect(ekcv.a);
                                }
                            }, eoscVar);
                            list.add(eijx.m(eijuVarH2, eijuVarH).a(new Callable() { // from class: syp
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Uri uri = uriB;
                                    cna cnaVar = sytVar;
                                    ConversationId conversationId = conversationIdC;
                                    eiju eijuVar = eijuVarH2;
                                    eiju eijuVar2 = eijuVarH;
                                    syw sywVar3 = sywVar2;
                                    try {
                                        syu syuVar = (syu) eork.q(eijuVar2);
                                        List list2 = (List) eork.q(eijuVar);
                                        if (list2.isEmpty()) {
                                            return Optional.empty();
                                        }
                                        cnf cnfVar = new cnf();
                                        aoer aoerVar = syuVar.c;
                                        Optional optionalO = aoerVar != null ? aoerVar.o() : Optional.empty();
                                        boolean zIsPresent = optionalO.isPresent();
                                        String str = strE;
                                        if (zIsPresent) {
                                            Bitmap bitmapB = ((cphu) sywVar3.i.b()).b(sywVar3.f, ((cpbn) sywVar3.j.b()).f(uri, str, (alqm) optionalO.get(), null, false, false, false), 224, 224, 0, true);
                                            if (bitmapB != null) {
                                                IconCompat iconCompatG = IconCompat.g(bitmapB);
                                                cpv.a.b(iconCompatG);
                                                cnfVar.d = new CarIcon(iconCompatG, null, 1);
                                            }
                                        }
                                        cnfVar.f = list2;
                                        cnfVar.b = CarText.create(str);
                                        cnfVar.e = syuVar.a;
                                        cnfVar.g = new ConversationCallbackDelegateImpl(cnaVar);
                                        cnfVar.a = conversationId.b();
                                        cnfVar.c = syuVar.b;
                                        return Optional.of(new ConversationItem(cnfVar));
                                    } catch (ExecutionException e2) {
                                        throw new IllegalStateException("Failed to retrieve ConversationPropertiesMetaData or CarMessages", e2);
                                    }
                                }
                            }, eoscVar));
                            conversationA.close();
                        } finally {
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return eijx.l(arrayList).a(new Callable() { // from class: sym
                    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() throws android.content.res.Resources.NotFoundException {
                        /*
                            Method dump skipped, instructions count: 446
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.sym.call():java.lang.Object");
                    }
                }, sywVar.m);
            }
        };
        eosc eoscVar = this.m;
        auvh.h(eijuVarB.i(eoozVar, eoscVar).h(new ejvr() { // from class: syg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                syw sywVar = this.a;
                AtomicReference atomicReference = sywVar.n;
                atomicReference.set((Optional) obj);
                sywVar.c();
                return (Optional) atomicReference.get();
            }
        }, eoscVar));
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [cpp, java.lang.Object] */
    @Override // defpackage.clu
    public final cpp a() throws Resources.NotFoundException {
        boolean z;
        try {
            if (((apnw) this.s.b()).a()) {
                ((ains) this.h.b()).c("Bugle.Auto.App.TemplateRetrieval");
            }
            coc cocVarD = d();
            cocVarD.a = true;
            Optional optionalOf = Optional.of(cocVarD.a());
            AtomicReference atomicReference = this.n;
            Optional optionalEmpty = Optional.empty();
            while (true) {
                if (atomicReference.compareAndSet(optionalEmpty, optionalOf)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != optionalEmpty) {
                    z = false;
                    break;
                }
            }
            ekrw ekrwVarE = d.e();
            ekrwVarE.X(eksq.a, "BugleAppOnAuto");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "getTemplateInternal", 209, "MessagingTemplateScreen.java");
            AtomicBoolean atomicBoolean = this.o;
            ekrdVar.H("Retrieving a car template isRefresh: %b isLoading %b", atomicBoolean.get(), z);
            if (z) {
                ((dzuc) this.r.b()).e(e);
                f();
                return optionalOf.get();
            }
            if (atomicBoolean.compareAndSet(true, false)) {
                f();
            }
            dzuc dzucVar = (dzuc) this.r.b();
            dzfh dzfhVar = e;
            dzucVar.g(dzfhVar, dzfhVar, null, dzua.SUCCESS);
            return (cpp) ((Optional) atomicReference.get()).get();
        } catch (Exception e2) {
            ekrw ekrwVarJ = d.j();
            ekrwVarJ.X(eksq.a, "BugleAppOnAuto");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "onGetTemplate", (char) 189, "MessagingTemplateScreen.java")).q("Failed to load conversations for Auto");
            ((ains) this.h.b()).c("Bugle.Auto.App.ErrorScreen");
            coc cocVarD2 = d();
            cocVarD2.a = false;
            cnz cnzVar = new cnz();
            coy coyVar = new coy();
            String string = this.f.getString(R.string.error_screen);
            string.getClass();
            CarText carTextCreate = CarText.create(string);
            if (carTextCreate.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be null or empty");
            }
            cpw.e.a(carTextCreate);
            coyVar.b = carTextCreate;
            if (coyVar.b == null) {
                throw new IllegalStateException("A title must be set on the row");
            }
            cnzVar.b(new Row(coyVar));
            cocVarD2.b(cnzVar.a());
            return cocVarD2.a();
        }
    }

    public final coc d() throws Resources.NotFoundException {
        coc cocVar = new coc();
        Action action = Action.APP_ICON;
        cpt cptVar = cpt.a;
        action.getClass();
        cptVar.a(Collections.singletonList(action));
        cocVar.e = action;
        String string = this.f.getResources().getString(R.string.app_name);
        string.getClass();
        cocVar.d = CarText.create(string);
        cpw.d.a(cocVar.d);
        return cocVar;
    }

    public final String e(aoer aoerVar) {
        if (aoerVar == null || aoerVar.s() == null) {
            return this.f.getString(R.string.self_name_fallback);
        }
        String strS = aoerVar.s();
        strS.getClass();
        return strS;
    }
}
