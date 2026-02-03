package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugx implements cugg, cqci {
    public static final cqce a = cqce.g("Bugle", "TextClassifierLibManagerImpl");
    public static final cqbr b = new cqbr(3600000);
    static final cczv c = cdag.h(cdag.b, "disable_logging_tc_lib_latency", true);
    public final Context d;
    public final eosc e;
    public final eosc f;
    public final aipo g;
    public final fcsu h;
    private final cdte i;
    private final eosc j;
    private final ejxr k;
    private final Object l = new Object();
    private eiju m;

    public cugx(cdte cdteVar, Context context, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, final ecev ecevVar, aipo aipoVar, fcsu fcsuVar) {
        this.i = cdteVar;
        this.d = context;
        this.j = eoscVar;
        this.e = eoscVar2;
        this.f = eoscVar3;
        this.g = aipoVar;
        this.k = ejxx.a(new ejxr() { // from class: cugk
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = cugx.a;
                return ecevVar;
            }
        });
        this.h = fcsuVar;
    }

    @Override // defpackage.cugg
    public final eiju a() {
        final eiju eijuVarE;
        final eiju eijuVarG;
        synchronized (this.l) {
            if (this.m == null) {
                eieu eieuVarK = eiiy.k("TextClassifierLibManagerImpl createTextClassifierLibAsync");
                try {
                    cdte cdteVar = this.i;
                    ejxr ejxrVar = this.k;
                    final ecev ecevVar = (ecev) ejxrVar.get();
                    eosc eoscVar = this.j;
                    final eiju eijuVarH = ((Boolean) crbf.V.e()).booleanValue() ? cdteVar.h("text_classifier").h(new ejvr() { // from class: cugl
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            cqce cqceVar = cugx.a;
                            boolean zIsPresent = optional.isPresent();
                            ecev ecevVar2 = ecevVar;
                            if (zIsPresent) {
                                try {
                                    return eujv.b(eujj.a.a("tc_model", (dtma) optional.get(), ecevVar2));
                                } catch (eujk | IOException e) {
                                    cugx.a.s("Failed to open the TextClassifier core model", e);
                                }
                            }
                            return new eujv(null);
                        }
                    }, eoscVar) : eijx.e(new eujv(null));
                    final ecev ecevVar2 = (ecev) ejxrVar.get();
                    final eiju eijuVarH2 = ((Boolean) crbf.W.e()).booleanValue() ? cdteVar.h("text_classifier_actions").h(new ejvr() { // from class: cugh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            cqce cqceVar = cugx.a;
                            boolean zIsPresent = optional.isPresent();
                            ecev ecevVar3 = ecevVar2;
                            if (zIsPresent) {
                                try {
                                    return eujv.b(eujj.a.a("tc_actions_model", (dtma) optional.get(), ecevVar3));
                                } catch (eujk | IOException e) {
                                    cugx.a.s("Failed to open the TextClassifier actions model", e);
                                }
                            }
                            return new eujv(null);
                        }
                    }, eoscVar) : eijx.e(new eujv(null));
                    final ecev ecevVar3 = (ecev) ejxrVar.get();
                    if (((Boolean) crbf.X.e()).booleanValue()) {
                        cczi ccziVar = crbf.M;
                        if (!TextUtils.isEmpty((CharSequence) ccziVar.e())) {
                            eijuVarE = cdteVar.h((String) ccziVar.e()).h(new ejvr() { // from class: cugi
                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
                                /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
                                @Override // defpackage.ejvr
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object apply(java.lang.Object r17) throws java.io.IOException, defpackage.eujk {
                                    /*
                                        Method dump skipped, instructions count: 450
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cugi.apply(java.lang.Object):java.lang.Object");
                                }
                            }, eoscVar);
                        }
                        eiju eijuVarA = eijx.k(eijuVarH, eijuVarH2, eijuVarE).a(new Callable() { // from class: cugj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Optional optionalEmpty;
                                eugy eugyVar;
                                Context context;
                                euha euhaVar;
                                eujv eujvVar;
                                eujv eujvVar2;
                                eujv eujvVar3;
                                eujv eujvVar4;
                                eujv eujvVar5;
                                eujv eujvVar6;
                                eujv eujvVar7;
                                eujv eujvVar8;
                                euja eujaVar;
                                ekgb ekgbVar;
                                eule euleVar;
                                ekgb ekgbVar2;
                                eujv eujvVar9;
                                eujv eujvVar10 = (eujv) eork.q(eijuVarH);
                                eujv eujvVar11 = (eujv) eork.q(eijuVarH2);
                                eujv eujvVar12 = (eujv) eork.q(eijuVarE);
                                final cugx cugxVar = this.a;
                                try {
                                    if (((Boolean) crao.d.e()).booleanValue()) {
                                        eugx eugxVar = new eugx();
                                        eugxVar.b(false);
                                        eugxVar.a(false);
                                        eugxVar.e = (byte) (eugxVar.e | 4);
                                        eugxVar.c(false);
                                        eugxVar.e = (byte) (eugxVar.e | 112);
                                        int i = ekgb.d;
                                        ekgb ekgbVar3 = ekoe.a;
                                        if (ekgbVar3 == null) {
                                            throw new NullPointerException("Null shortcutContactNames");
                                        }
                                        eugxVar.d = ekgbVar3;
                                        eugxVar.f = new eujv(null);
                                        eugxVar.b(true);
                                        eugxVar.a(true);
                                        eugxVar.c(true);
                                        if (eugxVar.e == 127 && (ekgbVar2 = eugxVar.d) != null && (eujvVar9 = eugxVar.f) != null) {
                                            eugyVar = new eugy(eugxVar.a, eugxVar.b, eugxVar.c, ekgbVar2, eujvVar9);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if ((eugxVar.e & 1) == 0) {
                                            sb.append(" annotateName");
                                        }
                                        if ((eugxVar.e & 2) == 0) {
                                            sb.append(" annotateGivenName");
                                        }
                                        if ((eugxVar.e & 4) == 0) {
                                            sb.append(" annotateFamilyName");
                                        }
                                        if ((eugxVar.e & 8) == 0) {
                                            sb.append(" annotateNickname");
                                        }
                                        if ((eugxVar.e & 16) == 0) {
                                            sb.append(" enableChangeMonitoring");
                                        }
                                        if ((eugxVar.e & 32) == 0) {
                                            sb.append(" enableDeclension");
                                        }
                                        if ((eugxVar.e & 64) == 0) {
                                            sb.append(" enableShortcutContacts");
                                        }
                                        if (eugxVar.d == null) {
                                            sb.append(" shortcutContactNames");
                                        }
                                        if (eugxVar.f == null) {
                                            sb.append(" lightweightTokensProvider");
                                        }
                                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                    }
                                    eugyVar = null;
                                    context = cugxVar.d;
                                    euhaVar = new euha();
                                    euhaVar.c(new eujv(null));
                                    euhaVar.h = new eujv(null);
                                    euhaVar.b(new eujv(null));
                                    euhaVar.e(new eujv(null));
                                    euhaVar.k = new eujv(null);
                                    euhaVar.n = new eujv(null);
                                    euhaVar.l = new eujv(null);
                                    euhaVar.m = new eujv(null);
                                    euhaVar.d(false);
                                    euhaVar.f = (byte) (euhaVar.f | 6);
                                    euhaVar.c = euja.a;
                                    int i2 = ekgb.d;
                                    ekgb ekgbVarR = ekoe.a;
                                    euhaVar.a(ekgbVarR);
                                    euhaVar.e = new euhc();
                                    euhaVar.c(eujvVar10);
                                    euhaVar.b(eujvVar11);
                                    if (((Boolean) crbf.W.e()).booleanValue()) {
                                        ekgbVarR = ekgb.r(Locale.ENGLISH);
                                    }
                                    euhaVar.a(ekgbVarR);
                                    euhaVar.e(eujvVar12);
                                    euhaVar.b = eugyVar;
                                    euhaVar.d(true);
                                } catch (Throwable th) {
                                    cugx.a.s("TextClassifierLib creation failed", th);
                                    auvh.h(((cden) cugxVar.h.b()).b(th));
                                    optionalEmpty = Optional.empty();
                                }
                                if (euhaVar.f == 7 && (eujvVar = euhaVar.g) != null && (eujvVar2 = euhaVar.h) != null && (eujvVar3 = euhaVar.i) != null && (eujvVar4 = euhaVar.j) != null && (eujvVar5 = euhaVar.k) != null && (eujvVar6 = euhaVar.l) != null && (eujvVar7 = euhaVar.m) != null && (eujvVar8 = euhaVar.n) != null && (eujaVar = euhaVar.c) != null && (ekgbVar = euhaVar.d) != null && (euleVar = euhaVar.e) != null) {
                                    euhb euhbVar = new euhb(eujvVar, eujvVar2, eujvVar3, eujvVar4, eujvVar5, eujvVar6, eujvVar7, eujvVar8, euhaVar.a, euhaVar.b, eujaVar, ekgbVar, euleVar);
                                    ekgb ekgbVar4 = TextClassifierLibImpl.a;
                                    optionalEmpty = Optional.of(new TextClassifierLibImpl(context, euhbVar, new eujm(context)));
                                    optionalEmpty.ifPresent(new Consumer() { // from class: cugp
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj) {
                                            final TextClassifierLibImpl textClassifierLibImpl = (TextClassifierLibImpl) obj;
                                            boolean zBooleanValue = ((Boolean) cugx.c.e()).booleanValue();
                                            cugx cugxVar2 = cugxVar;
                                            final ainv ainvVarC = !zBooleanValue ? cugxVar2.g.c("Bugle.TCLib.Async.Initialization.Latency", UUID.randomUUID().toString()) : null;
                                            eosc eoscVar2 = cugxVar2.f;
                                            eika.l(eiju.g(textClassifierLibImpl.c).e(Throwable.class, new ejvr() { // from class: cugm
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj2) {
                                                    Throwable th2 = (Throwable) obj2;
                                                    cqce cqceVar = cugx.a;
                                                    if (th2 instanceof CancellationException) {
                                                        cqbd cqbdVarA = cugx.a.a();
                                                        cqbdVarA.I("TextClassifierLib initialization was canceled during measurement.");
                                                        cqbdVarA.s(th2);
                                                    } else {
                                                        cqbd cqbdVarE = cugx.a.e();
                                                        cqbdVarE.K(cugx.b, "TCLibFallback");
                                                        cqbdVarE.I("TextClassifierLib initialization failed during measurement.");
                                                        cqbdVarE.s(th2);
                                                    }
                                                    return textClassifierLibImpl;
                                                }
                                            }, eoscVar2), auvh.c(new Consumer() { // from class: cugn
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj2) {
                                                    cqce cqceVar = cugx.a;
                                                    ainv ainvVar = ainvVarC;
                                                    if (ainvVar == null || ((Boolean) cugx.c.e()).booleanValue()) {
                                                        return;
                                                    }
                                                    ainvVar.c();
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            }), eoscVar2);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return optionalEmpty.map(new Function() { // from class: cugq
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            TextClassifierLibImpl textClassifierLibImpl = (TextClassifierLibImpl) obj;
                                            cqce cqceVar = cugx.a;
                                            return textClassifierLibImpl;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                }
                                StringBuilder sb2 = new StringBuilder();
                                if (euhaVar.g == null) {
                                    sb2.append(" coreModelProvider");
                                }
                                if (euhaVar.h == null) {
                                    sb2.append(" langIdModelProvider");
                                }
                                if (euhaVar.i == null) {
                                    sb2.append(" actionsSuggestionsModelProvider");
                                }
                                if (euhaVar.j == null) {
                                    sb2.append(" webrefModelProvider");
                                }
                                if (euhaVar.k == null) {
                                    sb2.append(" personNameModelProvider");
                                }
                                if (euhaVar.l == null) {
                                    sb2.append(" alternateContactModelProvider");
                                }
                                if (euhaVar.m == null) {
                                    sb2.append(" neuralMatchingEncoderProvider");
                                }
                                if (euhaVar.n == null) {
                                    sb2.append(" deepCluModelProvider");
                                }
                                if ((euhaVar.f & 1) == 0) {
                                    sb2.append(" enableFallback");
                                }
                                if ((euhaVar.f & 2) == 0) {
                                    sb2.append(" enableInstalledApps");
                                }
                                if ((euhaVar.f & 4) == 0) {
                                    sb2.append(" enableTranslationInClassifier");
                                }
                                if (euhaVar.c == null) {
                                    sb2.append(" eventLogger");
                                }
                                if (euhaVar.d == null) {
                                    sb2.append(" actionsSuggestionsLocales");
                                }
                                if (euhaVar.e == null) {
                                    sb2.append(" intentGenerationOptions");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                            }
                        }, this.e);
                        eieuVarK.b(eijuVarA);
                        eieuVarK.close();
                        this.m = eijuVarA;
                    }
                    eijuVarE = eijx.e(new eujv(null));
                    eiju eijuVarA2 = eijx.k(eijuVarH, eijuVarH2, eijuVarE).a(new Callable() { // from class: cugj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Optional optionalEmpty;
                            eugy eugyVar;
                            Context context;
                            euha euhaVar;
                            eujv eujvVar;
                            eujv eujvVar2;
                            eujv eujvVar3;
                            eujv eujvVar4;
                            eujv eujvVar5;
                            eujv eujvVar6;
                            eujv eujvVar7;
                            eujv eujvVar8;
                            euja eujaVar;
                            ekgb ekgbVar;
                            eule euleVar;
                            ekgb ekgbVar2;
                            eujv eujvVar9;
                            eujv eujvVar10 = (eujv) eork.q(eijuVarH);
                            eujv eujvVar11 = (eujv) eork.q(eijuVarH2);
                            eujv eujvVar12 = (eujv) eork.q(eijuVarE);
                            final cugx cugxVar = this.a;
                            try {
                                if (((Boolean) crao.d.e()).booleanValue()) {
                                    eugx eugxVar = new eugx();
                                    eugxVar.b(false);
                                    eugxVar.a(false);
                                    eugxVar.e = (byte) (eugxVar.e | 4);
                                    eugxVar.c(false);
                                    eugxVar.e = (byte) (eugxVar.e | 112);
                                    int i = ekgb.d;
                                    ekgb ekgbVar3 = ekoe.a;
                                    if (ekgbVar3 == null) {
                                        throw new NullPointerException("Null shortcutContactNames");
                                    }
                                    eugxVar.d = ekgbVar3;
                                    eugxVar.f = new eujv(null);
                                    eugxVar.b(true);
                                    eugxVar.a(true);
                                    eugxVar.c(true);
                                    if (eugxVar.e == 127 && (ekgbVar2 = eugxVar.d) != null && (eujvVar9 = eugxVar.f) != null) {
                                        eugyVar = new eugy(eugxVar.a, eugxVar.b, eugxVar.c, ekgbVar2, eujvVar9);
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    if ((eugxVar.e & 1) == 0) {
                                        sb.append(" annotateName");
                                    }
                                    if ((eugxVar.e & 2) == 0) {
                                        sb.append(" annotateGivenName");
                                    }
                                    if ((eugxVar.e & 4) == 0) {
                                        sb.append(" annotateFamilyName");
                                    }
                                    if ((eugxVar.e & 8) == 0) {
                                        sb.append(" annotateNickname");
                                    }
                                    if ((eugxVar.e & 16) == 0) {
                                        sb.append(" enableChangeMonitoring");
                                    }
                                    if ((eugxVar.e & 32) == 0) {
                                        sb.append(" enableDeclension");
                                    }
                                    if ((eugxVar.e & 64) == 0) {
                                        sb.append(" enableShortcutContacts");
                                    }
                                    if (eugxVar.d == null) {
                                        sb.append(" shortcutContactNames");
                                    }
                                    if (eugxVar.f == null) {
                                        sb.append(" lightweightTokensProvider");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                                eugyVar = null;
                                context = cugxVar.d;
                                euhaVar = new euha();
                                euhaVar.c(new eujv(null));
                                euhaVar.h = new eujv(null);
                                euhaVar.b(new eujv(null));
                                euhaVar.e(new eujv(null));
                                euhaVar.k = new eujv(null);
                                euhaVar.n = new eujv(null);
                                euhaVar.l = new eujv(null);
                                euhaVar.m = new eujv(null);
                                euhaVar.d(false);
                                euhaVar.f = (byte) (euhaVar.f | 6);
                                euhaVar.c = euja.a;
                                int i2 = ekgb.d;
                                ekgb ekgbVarR = ekoe.a;
                                euhaVar.a(ekgbVarR);
                                euhaVar.e = new euhc();
                                euhaVar.c(eujvVar10);
                                euhaVar.b(eujvVar11);
                                if (((Boolean) crbf.W.e()).booleanValue()) {
                                    ekgbVarR = ekgb.r(Locale.ENGLISH);
                                }
                                euhaVar.a(ekgbVarR);
                                euhaVar.e(eujvVar12);
                                euhaVar.b = eugyVar;
                                euhaVar.d(true);
                            } catch (Throwable th) {
                                cugx.a.s("TextClassifierLib creation failed", th);
                                auvh.h(((cden) cugxVar.h.b()).b(th));
                                optionalEmpty = Optional.empty();
                            }
                            if (euhaVar.f == 7 && (eujvVar = euhaVar.g) != null && (eujvVar2 = euhaVar.h) != null && (eujvVar3 = euhaVar.i) != null && (eujvVar4 = euhaVar.j) != null && (eujvVar5 = euhaVar.k) != null && (eujvVar6 = euhaVar.l) != null && (eujvVar7 = euhaVar.m) != null && (eujvVar8 = euhaVar.n) != null && (eujaVar = euhaVar.c) != null && (ekgbVar = euhaVar.d) != null && (euleVar = euhaVar.e) != null) {
                                euhb euhbVar = new euhb(eujvVar, eujvVar2, eujvVar3, eujvVar4, eujvVar5, eujvVar6, eujvVar7, eujvVar8, euhaVar.a, euhaVar.b, eujaVar, ekgbVar, euleVar);
                                ekgb ekgbVar4 = TextClassifierLibImpl.a;
                                optionalEmpty = Optional.of(new TextClassifierLibImpl(context, euhbVar, new eujm(context)));
                                optionalEmpty.ifPresent(new Consumer() { // from class: cugp
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        final TextClassifierLibImpl textClassifierLibImpl = (TextClassifierLibImpl) obj;
                                        boolean zBooleanValue = ((Boolean) cugx.c.e()).booleanValue();
                                        cugx cugxVar2 = cugxVar;
                                        final ainv ainvVarC = !zBooleanValue ? cugxVar2.g.c("Bugle.TCLib.Async.Initialization.Latency", UUID.randomUUID().toString()) : null;
                                        eosc eoscVar2 = cugxVar2.f;
                                        eika.l(eiju.g(textClassifierLibImpl.c).e(Throwable.class, new ejvr() { // from class: cugm
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj2) {
                                                Throwable th2 = (Throwable) obj2;
                                                cqce cqceVar = cugx.a;
                                                if (th2 instanceof CancellationException) {
                                                    cqbd cqbdVarA = cugx.a.a();
                                                    cqbdVarA.I("TextClassifierLib initialization was canceled during measurement.");
                                                    cqbdVarA.s(th2);
                                                } else {
                                                    cqbd cqbdVarE = cugx.a.e();
                                                    cqbdVarE.K(cugx.b, "TCLibFallback");
                                                    cqbdVarE.I("TextClassifierLib initialization failed during measurement.");
                                                    cqbdVarE.s(th2);
                                                }
                                                return textClassifierLibImpl;
                                            }
                                        }, eoscVar2), auvh.c(new Consumer() { // from class: cugn
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                                cqce cqceVar = cugx.a;
                                                ainv ainvVar = ainvVarC;
                                                if (ainvVar == null || ((Boolean) cugx.c.e()).booleanValue()) {
                                                    return;
                                                }
                                                ainvVar.c();
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        }), eoscVar2);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                return optionalEmpty.map(new Function() { // from class: cugq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        TextClassifierLibImpl textClassifierLibImpl = (TextClassifierLibImpl) obj;
                                        cqce cqceVar = cugx.a;
                                        return textClassifierLibImpl;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            }
                            StringBuilder sb2 = new StringBuilder();
                            if (euhaVar.g == null) {
                                sb2.append(" coreModelProvider");
                            }
                            if (euhaVar.h == null) {
                                sb2.append(" langIdModelProvider");
                            }
                            if (euhaVar.i == null) {
                                sb2.append(" actionsSuggestionsModelProvider");
                            }
                            if (euhaVar.j == null) {
                                sb2.append(" webrefModelProvider");
                            }
                            if (euhaVar.k == null) {
                                sb2.append(" personNameModelProvider");
                            }
                            if (euhaVar.l == null) {
                                sb2.append(" alternateContactModelProvider");
                            }
                            if (euhaVar.m == null) {
                                sb2.append(" neuralMatchingEncoderProvider");
                            }
                            if (euhaVar.n == null) {
                                sb2.append(" deepCluModelProvider");
                            }
                            if ((euhaVar.f & 1) == 0) {
                                sb2.append(" enableFallback");
                            }
                            if ((euhaVar.f & 2) == 0) {
                                sb2.append(" enableInstalledApps");
                            }
                            if ((euhaVar.f & 4) == 0) {
                                sb2.append(" enableTranslationInClassifier");
                            }
                            if (euhaVar.c == null) {
                                sb2.append(" eventLogger");
                            }
                            if (euhaVar.d == null) {
                                sb2.append(" actionsSuggestionsLocales");
                            }
                            if (euhaVar.e == null) {
                                sb2.append(" intentGenerationOptions");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                    }, this.e);
                    eieuVarK.b(eijuVarA2);
                    eieuVarK.close();
                    this.m = eijuVarA2;
                } finally {
                }
            }
            eijuVarG = eiju.g(eork.j(this.m));
        }
        eooz eoozVar = new eooz() { // from class: cugs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return eijx.e(Optional.empty());
                }
                return eiju.g(eork.j(((TextClassifierLib) optional.get()).e())).h(new ejvr() { // from class: cugr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Optional.of((TextClassifierLib) obj2);
                    }
                }, this.a.f);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarF = eijuVarG.i(eoozVar, eoqgVar).f(Throwable.class, new eooz() { // from class: cugt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                cqce cqceVar = cugx.a;
                if (th instanceof CancellationException) {
                    cqbd cqbdVarA = cugx.a.a();
                    cqbdVarA.I("Cancelled TextClassifierLib future.");
                    cqbdVarA.s(th);
                } else {
                    cqbd cqbdVarE = cugx.a.e();
                    cqbdVarE.K(cugx.b, "TCLibFallback");
                    cqbdVarE.I("Failed to initialize TextClassifierLib. Falling back to system TextClassifier.");
                    cqbdVarE.s(th);
                }
                return eijuVarG;
            }
        }, eoqgVar);
        if (((Boolean) c.e()).booleanValue()) {
            return eijuVarF;
        }
        final ainv ainvVarC = this.g.c("Bugle.TCLib.Async.Get.Latency", UUID.randomUUID().toString());
        return eijuVarF.h(new ejvr() { // from class: cugu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cqce cqceVar = cugx.a;
                ainvVarC.c();
                return optional;
            }
        }, this.f);
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        eiju eijuVar;
        if (i >= 40) {
            a.r(a.g(i, "Reclaiming memory at level: "));
            synchronized (this.l) {
                eijuVar = this.m;
                this.m = null;
            }
            if (eijuVar != null) {
                eijuVar.i(new eooz() { // from class: cugo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        cqce cqceVar = cugx.a;
                        return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: cugv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((TextClassifierLib) obj2).d();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElseGet(new Supplier() { // from class: cugw
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                cqce cqceVar2 = cugx.a;
                                return eijx.e(null);
                            }
                        });
                    }
                }, this.f).k(auvh.b(), this.j);
            }
        }
    }
}
