package defpackage;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cife implements cdfg {
    public static final esyd a = new esyd();
    public final Context b;
    public final eygg c;
    public final fcsu d;
    private final eosc e;
    private final eosc f;
    private final eosc g;

    public cife(Context context, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, eygg eyggVar, fcsu fcsuVar) {
        this.b = context;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.g = eoscVar3;
        this.c = eyggVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        return d().h(new ejvr() { // from class: ciew
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                esyd esydVar = cife.a;
                final StringBuilder sb = new StringBuilder("Section: rcs_psd\n");
                Collection.EL.stream((List) obj).sorted(Comparator.CC.comparing(new Function() { // from class: ciex
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cdff) obj2).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, String.CASE_INSENSITIVE_ORDER)).forEach(new Consumer() { // from class: ciey
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        cdff cdffVar = (cdff) obj2;
                        esyd esydVar2 = cife.a;
                        String strA = cdffVar.a();
                        StringBuilder sb2 = sb;
                        sb2.append(strA);
                        sb2.append(": ");
                        sb2.append(cdffVar.b());
                        sb2.append("\n");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return sb.toString();
            }
        }, this.g);
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: cifa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                esyd esydVar = cife.a;
                ArrayList arrayList = new ArrayList();
                List<dfap> listG = dfaq.E().G();
                StringBuilder sb = new StringBuilder();
                for (dfap dfapVar : listG) {
                    sb.append(System.lineSeparator());
                    sb.append(dfapVar.b());
                    sb.append("=");
                    sb.append(dfapVar.a());
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "RcsFlags"));
                return arrayList;
            }
        }, this.f).h(new ejvr() { // from class: cifb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                esyd esydVar = cife.a;
                list.add(new FileTeleporter(dfog.o().j().getBytes(), "CsLibSettings"));
                list.add(new FileTeleporter(dfos.a().j().getBytes(), "MultiSimSettings"));
                list.add(new FileTeleporter(dfpm.a().j().getBytes(), "SimStateTrackerSettings"));
                list.add(new FileTeleporter(dfnv.a().j().getBytes(), "CsLibAllowSwitchFlags"));
                return list;
            }
        }, this.e);
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        final eiju eijuVarG = eijx.g(new Callable() { // from class: ciez
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<crof> listM;
                String string;
                ActivityManager activityManager;
                UsageStatsManager usageStatsManager;
                int i;
                String str;
                coze cozeVarC;
                ArrayList arrayList = new ArrayList();
                esyd esydVar = cife.a;
                cife cifeVar = this.a;
                cifg cifgVar = (cifg) cifeVar.d.b();
                fcsu fcsuVar = cifgVar.f;
                if (((crma) fcsuVar.b()).j() && ((crma) fcsuVar.b()).k()) {
                    listM = ((crny) cifgVar.g.b()).m();
                } else {
                    ekrw ekrwVarJ = cifg.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/rcs/feedbackdata/RcsFeedbackSimInfoProvider", "getAllActiveSims", 42, "RcsFeedbackSimInfoProvider.kt")).q("Can not fetch rcs sim info for listnr bug report due to missing permissions.");
                    listM = fcvo.a;
                }
                int i2 = 10;
                ArrayList arrayList2 = new ArrayList(fcva.p(listM, 10));
                for (crof crofVar : listM) {
                    int iA = crofVar.a();
                    cmmh cmmhVar = (cmmh) fdct.b(((cmlb) cifgVar.b.b()).i(iA));
                    if (cmmhVar == null) {
                        ekrw ekrwVarJ2 = cifg.a.j();
                        i = i2;
                        ekrwVarJ2.X(eksq.a, "Bugle");
                        ekrd ekrdVar = (ekrd) ekrwVarJ2;
                        ekrdVar.X(cqnc.w, Integer.valueOf(iA));
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/feedbackdata/RcsFeedbackSimInfoProvider", "toSimInfo", 81, "RcsFeedbackSimInfoProvider.kt")).q("No sim info to log PSD RCS data for.");
                    } else {
                        i = i2;
                    }
                    aubq aubqVarA = ((chtk) cifgVar.e.b()).a(iA);
                    if (aubqVarA == null || (cozeVarC = ((cozg) cifgVar.d.b()).c(aubqVarA)) == null || (str = cozeVarC.g) == null) {
                        str = "[unavailable]";
                    }
                    String str2 = str;
                    enwr enwrVar = cmmhVar != null ? ((dggw) cifgVar.c.b()).b(cmmhVar.c).a : null;
                    Boolean boolValueOf = null;
                    String strU = crofVar.u();
                    String strQ = crofVar.q();
                    String str3 = cmmhVar != null ? cmmhVar.k : null;
                    String str4 = cmmhVar != null ? cmmhVar.l : null;
                    if (cmmhVar != null) {
                        boolValueOf = Boolean.valueOf(cmmhVar.o);
                    }
                    arrayList2.add(new ciff(strU, strQ, iA, enwrVar, str2, str3, str4, boolValueOf, null));
                    i2 = i;
                }
                int i3 = i2;
                String strK = esydVar.k(arrayList2);
                cdew cdewVar = new cdew();
                cdewVar.b("RcsSimInfos");
                cdewVar.c(strK);
                arrayList.add(cdewVar.a());
                Context context = cifeVar.b;
                boolean zI = dhka.i(context);
                cdew cdewVar2 = new cdew();
                cdewVar2.b("RcsHostApk");
                cdewVar2.c(true != zI ? "cs.apk" : "Bugle");
                arrayList.add(cdewVar2.a());
                cdew cdewVar3 = new cdew();
                cdewVar3.b("SystemBinding");
                cdewVar3.c(true != dhka.e(context) ? "Disabled" : "Enabled");
                arrayList.add(cdewVar3.a());
                cdew cdewVar4 = new cdew();
                cdewVar4.b("RcsBOE");
                cdewVar4.c(true != dhky.c(context) ? "Optimized" : "Exempted");
                arrayList.add(cdewVar4.a());
                String string2 = "[Unavailable]";
                if (Build.VERSION.SDK_INT < 28 || (usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats")) == null) {
                    string = "[Unavailable]";
                } else {
                    int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    string = (String) ekgp.o(Integer.valueOf(i3), "Active", 30, "Frequent", 40, "Rare", 20, "WorkingSet").getOrDefault(Integer.valueOf(appStandbyBucket), null);
                    if (string == null) {
                        string = Integer.toString(appStandbyBucket);
                    }
                }
                cdew cdewVar5 = new cdew();
                cdewVar5.b("RcsStandbyBucket");
                cdewVar5.c(string);
                arrayList.add(cdewVar5.a());
                cdew cdewVar6 = new cdew();
                cdewVar6.b("RcsBackgroundRestricted");
                if (Build.VERSION.SDK_INT >= 28 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    string2 = Boolean.toString(activityManager.isBackgroundRestricted());
                }
                cdewVar6.c(string2);
                arrayList.add(cdewVar6.a());
                return arrayList;
            }
        }, this.f);
        final eiju eijuVarF = ((ajhd) this.c.b()).f();
        return eijx.k(eijuVarG, eijuVarF).a(new Callable() { // from class: cifd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final List list = (List) eork.q(eijuVarG);
                ((Optional) eork.q(eijuVarF)).ifPresent(new Consumer() { // from class: cifc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        esyd esydVar = cife.a;
                        cdew cdewVar = new cdew();
                        cdewVar.b("CsApkVersion");
                        cdewVar.c((String) obj);
                        list.add(cdewVar.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                int iD = ((ajhd) this.a.c.b()).d();
                if (iD >= 0) {
                    cdew cdewVar = new cdew();
                    cdewVar.b("CsApkVersionCode");
                    cdewVar.c(String.valueOf(iD));
                    list.add(cdewVar.a());
                }
                return list;
            }
        }, this.g);
    }
}
