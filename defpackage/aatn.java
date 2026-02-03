package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eyhq;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatn extends aaup implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    private aatv a;
    private boolean ah;
    private Context d;
    private final lvn e = new lvn(this);
    private final eino ag = new eino();

    @Deprecated
    public aatn() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return aatv.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final aatv aatvVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.data_donation_fragment, viewGroup, false);
            viewInflate.setSystemUiVisibility(1280);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(android.R.id.list);
            recyclerView.getClass();
            aatvVarH.o = recyclerView;
            RecyclerView recyclerView2 = aatvVarH.o;
            ((aatn) aatvVarH.b.b()).z();
            recyclerView2.ao(new LinearLayoutManager());
            aatvVarH.o.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: aats
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws Resources.NotFoundException {
                    aatv aatvVar = aatvVarH;
                    eg egVar = (eg) aatvVar.c.b();
                    egVar.getClass();
                    int iC = dakl.c(egVar);
                    fcsu fcsuVar = aatvVar.b;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), iC + ((aatn) fcsuVar.b()).B().getDimensionPixelSize(R.dimen.action_bar_height), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom() + ((aatn) fcsuVar.b()).B().getDimensionPixelOffset(R.dimen.confirm_button_container_height));
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            te teVar = new te();
            teVar.u();
            aatvVarH.o.am(teVar);
            Button button = (Button) viewInflate.findViewById(R.id.confirm_button);
            button.getClass();
            aatvVarH.s = button;
            aatvVarH.s.setOnClickListener(new View.OnClickListener() { // from class: aatr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Resources.NotFoundException {
                    final aatv aatvVar = aatvVarH;
                    aauj aaujVar = aatvVar.p;
                    if (aaujVar == null) {
                        return;
                    }
                    int iL = aaujVar.l();
                    int iSum = Collection.EL.stream(aatvVar.p.a).mapToInt(new ToIntFunction() { // from class: aaug
                        @Override // java.util.function.ToIntFunction
                        public final int applyAsInt(Object obj) {
                            return ((aauu) obj).d == 0 ? 0 : 1;
                        }
                    }).sum();
                    if (iL == 0 || iSum == 0) {
                        return;
                    }
                    fcsu fcsuVar = aatvVar.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((aatn) fcsuVar.b()).Z(R.string.donation_donate_dialog_body_text, ((aatn) fcsuVar.b()).B().getQuantityString(R.plurals.donation_donate_dialog_body_text_messages, iL, Integer.valueOf(iL)), ((aatn) fcsuVar.b()).B().getQuantityString(R.plurals.donation_donate_dialog_body_text_conversations, iSum, Integer.valueOf(iSum))));
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(((aatn) fcsuVar.b()).B().getDimensionPixelSize(R.dimen.body_text_size)), 0, spannableStringBuilder.length(), 17);
                    eeji eejiVar = new eeji((Context) aatvVar.c.b());
                    eejiVar.u(R.string.donation_donate_dialog_title);
                    eejiVar.l(spannableStringBuilder);
                    eejiVar.r(R.string.donation_donate_dialog_positive_button_label, new eigf((eigp) aatvVar.l.b(), "com/google/android/apps/messaging/datadonation/ui/DataDonationFragmentPeer", "getDonatePositiveButton", 339, "DataDonationFragmentPeer#getDonatePositiveButton", new DialogInterface.OnClickListener() { // from class: aato
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            aatv aatvVar2 = aatvVar;
                            egpr egprVar = (egpr) aatvVar2.i.b();
                            aaux aauxVar = (aaux) aatvVar2.h.b();
                            aauj aaujVar2 = aatvVar2.p;
                            aaujVar2.getClass();
                            final ekgb ekgbVar = aaujVar2.a;
                            ejwl.a(!ekgbVar.isEmpty());
                            eieu eieuVarK = eiiy.k("ParticipantMessageListDonator#donate");
                            try {
                                eiju eijuVarG = eijx.g(new Callable() { // from class: aauv
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ekgb ekgbVar2;
                                        int i2;
                                        ekgb ekgbVar3;
                                        int i3;
                                        int i4;
                                        ewsj ewsjVar = (ewsj) ewsk.a.createBuilder();
                                        ekgb ekgbVar4 = ekgbVar;
                                        int size = ekgbVar4.size();
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (i6 < size) {
                                            aauu aauuVar = (aauu) ekgbVar4.get(i6);
                                            if (aauuVar.d == 0) {
                                                ekgbVar2 = ekgbVar4;
                                                i2 = size;
                                            } else {
                                                ewsh ewshVar = (ewsh) ewsi.a.createBuilder();
                                                int i7 = i5;
                                                while (i7 < aauuVar.a()) {
                                                    if (aauuVar.e(i7)) {
                                                        Spanned spannedC = aauuVar.c(i7);
                                                        String str = aauuVar.a;
                                                        long jB = aauuVar.b(i7);
                                                        aarx aarxVar = ((aaut) aauuVar.c.get(i7)).d;
                                                        cczv cczvVar = aave.a;
                                                        RedactedSpan[] redactedSpanArr = (RedactedSpan[]) spannedC.getSpans(i5, spannedC.length(), RedactedSpan.class);
                                                        ewsu ewsuVar = (ewsu) ewsv.a.createBuilder();
                                                        String string = spannedC.toString();
                                                        ewsuVar.copyOnWrite();
                                                        ewsv ewsvVar = (ewsv) ewsuVar.instance;
                                                        string.getClass();
                                                        ewsvVar.b = string;
                                                        int length = redactedSpanArr.length;
                                                        ekgbVar3 = ekgbVar4;
                                                        int i8 = 0;
                                                        while (i8 < length) {
                                                            RedactedSpan redactedSpan = redactedSpanArr[i8];
                                                            int i9 = length;
                                                            ewss ewssVar = (ewss) ewst.a.createBuilder();
                                                            int i10 = size;
                                                            aasn aasnVar = redactedSpan.a;
                                                            int iOrdinal = aasnVar.ordinal();
                                                            int i11 = i8;
                                                            if (iOrdinal == 0) {
                                                                i4 = 3;
                                                            } else if (iOrdinal == 1) {
                                                                i4 = 5;
                                                            } else {
                                                                if (iOrdinal != 2) {
                                                                    throw new IllegalArgumentException("Unsupported RedactedSpan.Type: ".concat(String.valueOf(aasnVar.name())));
                                                                }
                                                                i4 = 4;
                                                            }
                                                            ewssVar.copyOnWrite();
                                                            ((ewst) ewssVar.instance).b = i4 - 2;
                                                            int spanStart = spannedC.getSpanStart(redactedSpan);
                                                            ewssVar.copyOnWrite();
                                                            ((ewst) ewssVar.instance).c = spanStart;
                                                            int spanEnd = spannedC.getSpanEnd(redactedSpan);
                                                            ewssVar.copyOnWrite();
                                                            ((ewst) ewssVar.instance).d = spanEnd;
                                                            ewsuVar.copyOnWrite();
                                                            ewsv ewsvVar2 = (ewsv) ewsuVar.instance;
                                                            ewst ewstVar = (ewst) ewssVar.build();
                                                            ewstVar.getClass();
                                                            evtg evtgVar = ewsvVar2.c;
                                                            if (!evtgVar.c()) {
                                                                ewsvVar2.c = evsn.mutableCopy(evtgVar);
                                                            }
                                                            ewsvVar2.c.add(ewstVar);
                                                            i8 = i11 + 1;
                                                            size = i10;
                                                            length = i9;
                                                        }
                                                        i3 = size;
                                                        ewsf ewsfVar = (ewsf) ewsg.a.createBuilder();
                                                        ewsfVar.copyOnWrite();
                                                        ((ewsg) ewsfVar.instance).e = 1;
                                                        ewsfVar.copyOnWrite();
                                                        ewsg ewsgVar = (ewsg) ewsfVar.instance;
                                                        ewsv ewsvVar3 = (ewsv) ewsuVar.build();
                                                        ewsvVar3.getClass();
                                                        ewsgVar.d = ewsvVar3;
                                                        ewsgVar.c = 2;
                                                        if (aarxVar != null) {
                                                            ewsl ewslVar = (ewsl) ewsm.a.createBuilder();
                                                            ewslVar.copyOnWrite();
                                                            aarw aarwVar = (aarw) aarxVar;
                                                            ((ewsm) ewslVar.instance).b = aarwVar.a;
                                                            ewslVar.copyOnWrite();
                                                            ((ewsm) ewslVar.instance).d = aarwVar.b;
                                                            ewslVar.copyOnWrite();
                                                            ((ewsm) ewslVar.instance).c = aarwVar.c;
                                                            ewsfVar.copyOnWrite();
                                                            ewsg ewsgVar2 = (ewsg) ewsfVar.instance;
                                                            ewsm ewsmVar = (ewsm) ewslVar.build();
                                                            ewsmVar.getClass();
                                                            ewsgVar2.f = ewsmVar;
                                                            ewsgVar2.b |= 1;
                                                        }
                                                        ewsn ewsnVar = (ewsn) ewsp.a.createBuilder();
                                                        ewsnVar.copyOnWrite();
                                                        ((ewsp) ewsnVar.instance).b = str;
                                                        ewsnVar.copyOnWrite();
                                                        ewsp ewspVar = (ewsp) ewsnVar.instance;
                                                        ewsg ewsgVar3 = (ewsg) ewsfVar.build();
                                                        ewsgVar3.getClass();
                                                        evtg evtgVar2 = ewspVar.c;
                                                        if (!evtgVar2.c()) {
                                                            ewspVar.c = evsn.mutableCopy(evtgVar2);
                                                        }
                                                        ewspVar.c.add(ewsgVar3);
                                                        int iIntValue = ((Integer) aave.a.e()).intValue();
                                                        if (iIntValue > 0) {
                                                            jB = (iIntValue * Math.round(jB / iIntValue)) + i7;
                                                        }
                                                        ewsnVar.copyOnWrite();
                                                        ((ewsp) ewsnVar.instance).d = jB;
                                                        ewsnVar.copyOnWrite();
                                                        ((ewsp) ewsnVar.instance).e = 1;
                                                        ewshVar.copyOnWrite();
                                                        ewsi ewsiVar = (ewsi) ewshVar.instance;
                                                        ewsp ewspVar2 = (ewsp) ewsnVar.build();
                                                        ewspVar2.getClass();
                                                        evtg evtgVar3 = ewsiVar.b;
                                                        if (!evtgVar3.c()) {
                                                            ewsiVar.b = evsn.mutableCopy(evtgVar3);
                                                        }
                                                        ewsiVar.b.add(ewspVar2);
                                                    } else {
                                                        ekgbVar3 = ekgbVar4;
                                                        i3 = size;
                                                    }
                                                    i7++;
                                                    ekgbVar4 = ekgbVar3;
                                                    size = i3;
                                                    i5 = 0;
                                                }
                                                ekgbVar2 = ekgbVar4;
                                                i2 = size;
                                                ewsi ewsiVar2 = (ewsi) ewshVar.build();
                                                ewsjVar.copyOnWrite();
                                                ewsk ewskVar = (ewsk) ewsjVar.instance;
                                                ewsiVar2.getClass();
                                                ewskVar.a();
                                                ewskVar.c.add(ewsiVar2);
                                            }
                                            i6++;
                                            ekgbVar4 = ekgbVar2;
                                            size = i2;
                                            i5 = 0;
                                        }
                                        return (ewsk) ewsjVar.build();
                                    }
                                }, aauxVar.a);
                                final aasx aasxVar = aauxVar.b;
                                aasxVar.getClass();
                                eiju eijuVarI = eijuVarG.i(new eooz() { // from class: aauw
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj) {
                                        final aasx aasxVar2 = aasxVar;
                                        final aasw aaswVar = new aasw(aasxVar2, (ewsk) obj);
                                        eieu eieuVarK2 = eiiy.k("Donator#donate");
                                        try {
                                            eiju eijuVarI2 = eijx.g(new Callable() { // from class: aasu
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    aasw aaswVar2 = aaswVar;
                                                    ewsk ewskVar = aaswVar2.b;
                                                    ewskVar.getSerializedSize();
                                                    int iIntValue = ((Integer) aasx.a.e()).intValue() - ((int) (((Integer) r2.e()).intValue() * ((Double) aasx.b.e()).doubleValue()));
                                                    int i2 = 0;
                                                    ejwl.l(iIntValue > 0);
                                                    int i3 = ekgb.d;
                                                    ekfw ekfwVar = new ekfw();
                                                    ekfw ekfwVar2 = new ekfw();
                                                    ekfwVar.h(ekfwVar2);
                                                    int serializedSize = 0;
                                                    for (int i4 = 0; i4 < ewskVar.c.size(); i4++) {
                                                        ewsi ewsiVar = (ewsi) ewskVar.c.get(i4);
                                                        if (ewsiVar.getSerializedSize() + serializedSize >= iIntValue) {
                                                            ekfwVar2 = new ekfw();
                                                            ekfwVar.h(ekfwVar2);
                                                            serializedSize = 0;
                                                        }
                                                        serializedSize += ewsiVar.getSerializedSize();
                                                        ekfwVar2.h(ewsiVar);
                                                    }
                                                    ekgb ekgbVarG = ekfwVar.g();
                                                    ekfw ekfwVar3 = new ekfw();
                                                    String string = UUID.randomUUID().toString();
                                                    while (true) {
                                                        int i5 = ((ekoe) ekgbVarG).c;
                                                        if (i2 >= i5) {
                                                            return ekfwVar3.g();
                                                        }
                                                        aasx aasxVar3 = aaswVar2.a;
                                                        ekfw ekfwVar4 = (ekfw) ekgbVarG.get(i2);
                                                        ewsj ewsjVar = (ewsj) ewsk.a.createBuilder();
                                                        String strR = aasxVar3.h.r();
                                                        ewsjVar.copyOnWrite();
                                                        ewsk ewskVar2 = (ewsk) ewsjVar.instance;
                                                        strR.getClass();
                                                        ewskVar2.e = strR;
                                                        String languageTag = craf.c(aasxVar3.g).toLanguageTag();
                                                        ewsjVar.copyOnWrite();
                                                        ewsk ewskVar3 = (ewsk) ewsjVar.instance;
                                                        languageTag.getClass();
                                                        ewskVar3.d = languageTag;
                                                        ewsq ewsqVar = (ewsq) ewsr.a.createBuilder();
                                                        ewsqVar.copyOnWrite();
                                                        ewsr ewsrVar = (ewsr) ewsqVar.instance;
                                                        string.getClass();
                                                        ewsrVar.b = string;
                                                        ewsqVar.copyOnWrite();
                                                        ((ewsr) ewsqVar.instance).d = i2;
                                                        ewsqVar.copyOnWrite();
                                                        ((ewsr) ewsqVar.instance).c = i5;
                                                        ewsjVar.copyOnWrite();
                                                        ewsk ewskVar4 = (ewsk) ewsjVar.instance;
                                                        ewsr ewsrVar2 = (ewsr) ewsqVar.build();
                                                        ewsrVar2.getClass();
                                                        ewskVar4.f = ewsrVar2;
                                                        ewskVar4.b |= 1;
                                                        ekgb ekgbVarG2 = ekfwVar4.g();
                                                        ewsjVar.copyOnWrite();
                                                        ewsk ewskVar5 = (ewsk) ewsjVar.instance;
                                                        ewskVar5.a();
                                                        evpz.addAll(ekgbVarG2, ewskVar5.c);
                                                        ekfwVar3.h((ewsk) ewsjVar.build());
                                                        i2++;
                                                    }
                                                }
                                            }, aasxVar2.f).i(new eooz() { // from class: aasv
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj2) {
                                                    final ekgb ekgbVar2 = (ekgb) obj2;
                                                    ekgbVar2.getClass();
                                                    final aasx aasxVar3 = aasxVar2;
                                                    Optional optional = aasxVar3.d;
                                                    ejwl.l(optional.isPresent());
                                                    return ((cfzf) optional.get()).d().i(new eooz() { // from class: aasr
                                                        @Override // defpackage.eooz
                                                        public final ListenableFuture a(Object obj3) {
                                                            final aasx aasxVar4 = aasxVar3;
                                                            eoss eossVar = new eoss(aasxVar4.e);
                                                            ekfw ekfwVar = new ekfw();
                                                            for (final ewsk ewskVar : ekgbVar2) {
                                                                ekfwVar.h(eijx.h(new eooy() { // from class: aass
                                                                    @Override // defpackage.eooy
                                                                    public final ListenableFuture a() {
                                                                        return ((cema) aasxVar4.c.b()).a(new aasq(ewskVar));
                                                                    }
                                                                }, eossVar));
                                                            }
                                                            return eijx.l(ekfwVar.g()).a(new Callable() { // from class: aast
                                                                @Override // java.util.concurrent.Callable
                                                                public final Object call() {
                                                                    int i2 = aasx.i;
                                                                    return null;
                                                                }
                                                            }, eoqg.a);
                                                        }
                                                    }, aasxVar3.e);
                                                }
                                            }, aasxVar2.e);
                                            eieuVarK2.b(eijuVarI2);
                                            eieuVarK2.close();
                                            return eijuVarI2;
                                        } catch (Throwable th) {
                                            try {
                                                eieuVarK2.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                }, eoqg.a);
                                eieuVarK.b(eijuVarI);
                                eieuVarK.close();
                                egprVar.g(egpq.b(eijuVarI), aatvVar2.n);
                            } catch (Throwable th) {
                                try {
                                    eieuVarK.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }));
                    eejiVar.m(android.R.string.cancel, null);
                    eejiVar.a();
                }
            });
            ehac ehacVar = (ehac) aatvVarH.g.b();
            aarn aarnVar = (aarn) aatvVarH.f.b();
            Bundle extras = ((eg) aatvVarH.c.b()).getIntent().getExtras();
            extras.getClass();
            eosc eoscVar = (eosc) aarnVar.a.b();
            eoscVar.getClass();
            eosc eoscVar2 = (eosc) aarnVar.b.b();
            eoscVar2.getClass();
            cogw cogwVar = (cogw) aarnVar.c.b();
            cogwVar.getClass();
            ehacVar.a(new aarm(eoscVar, eoscVar2, cogwVar, (Map) aarnVar.d.b(), extras), aatvVarH.m);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.progress);
            circularProgressIndicator.getClass();
            aatvVarH.q = circularProgressIndicator;
            FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.progress_background);
            frameLayout.getClass();
            aatvVarH.r = frameLayout;
            if (viewInflate == null) {
                aatz.a(this, H());
            }
            eidc.q();
            return viewInflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aatv H() {
        aatv aatvVar = this.a;
        if (aatvVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aatvVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.aaup, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            einc.b(this).b = view;
            H();
            aatz.a(this, H());
            bn(view, bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aaup
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.aaup, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/datadonation/ui/DataDonationFragment", 95, aatn.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/datadonation/ui/DataDonationFragment", 100, aatn.class, "CreatePeer");
                        try {
                            eyik eyikVar = ((ahib) objBb).Q;
                            eyik eyikVar2 = ((ahib) objBb).c.g;
                            eyik eyikVar3 = ((ahib) objBb).R;
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.a = new aatv(eyikVar, eyikVar2, eyikVar3, ahknVar.a.BK, ((ahib) objBb).T, ((ahib) objBb).k, ((ahib) objBb).U, ((ahib) objBb).l, ahknVar.b.jL, eyii.a, ahknVar.aI);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            aatv aatvVarH = H();
            ((egpr) aatvVarH.i.b()).j(aatvVarH.n);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            if (this.Q == null) {
                this.ag.c();
            }
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.aaup, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
