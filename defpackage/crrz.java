package defpackage;

import android.content.Context;
import android.telephony.ims.ImsException;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class crrz extends crrp {
    public static final cqce d = cqce.g("BugleRcs", "CsLibPhenotypeHelper");
    public static final ekgb e = ekgb.s("com.google.android.ims.library#com.google.android.apps.messaging", "com.google.android.ims.library#com.google.android.ims");
    private static final ejya j = ejsz.a;
    public final fcsu f;
    public final ains g;
    public final fcsu h;
    public final fcsu i;
    private final crsr k;
    private final AtomicReference l;
    private final crsj m;
    private final fcsu n;

    protected crrz(fcsu fcsuVar, cczn ccznVar, cqbm cqbmVar, Executor executor, crsr crsrVar, crsj crsjVar, ains ainsVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        super(ccznVar, cqbmVar, executor);
        this.l = new AtomicReference();
        this.f = fcsuVar;
        this.k = crsrVar;
        this.m = crsjVar;
        this.g = ainsVar;
        this.n = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
    }

    public final cmmh b() {
        return (cmmh) ((cmlb) this.n.b()).h(cmla.a).orElseGet(new Supplier() { // from class: crrx
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrd ekrdVarK = crrz.d.k();
                ekrdVarK.Z(eksk.FULL);
                ((ekrd) ekrdVarK.h("com/google/android/apps/messaging/shared/util/rcs/CsLibPhenotypeHelper", "getDefaultCallSimInfo", 330, "CsLibPhenotypeHelper.java")).q("Attempting to register phenotype with sub_id = -1");
                return cmmh.a;
            }
        });
    }

    public final synchronized void c(Context context, final ddzs ddzsVar, final crsd crsdVar) {
        String strM;
        String strI;
        boolean zT;
        final int iB;
        final ewhx ewhxVar;
        Optional optionalEmpty;
        int i = 1;
        if (!((aqbb) this.i.b()).a()) {
            this.g.e("CsLibPhenotypeHelper.PhenotypeRegistration", 1);
        }
        fcsu fcsuVar = this.h;
        if (((aqsv) fcsuVar.b()).a()) {
            cmmh cmmhVarB = b();
            strM = cmmhVarB.s;
            strI = cmmhVarB.t;
            zT = cmmhVarB.o;
            iB = cmmhVarB.d;
        } else {
            fcsu fcsuVar2 = this.f;
            strM = ((dhes) fcsuVar2.b()).m();
            strI = ((dhes) fcsuVar2.b()).i();
            zT = ((dhes) fcsuVar2.b()).t();
            iB = ((dhes) fcsuVar2.b()).b();
        }
        dfoc.m();
        dfaq.I(context);
        final int iB2 = ((aqsv) fcsuVar.b()).a() ? b().d : ((dhes) this.f.b()).b();
        final crsr crsrVar = this.k;
        if (craf.e) {
            eosc eoscVar = crsrVar.d;
            try {
                ewhxVar = crsrVar.c.a(iB2).isRcsVolteSingleRegistrationCapable() ? ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_ENABLED : ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_DISABLED;
                auvh.h(eijx.f(new Runnable() { // from class: crsq
                    @Override // java.lang.Runnable
                    public final void run() {
                        Predicate predicate = dggg.a;
                        ewhx ewhxVar2 = ewhxVar;
                        ejwl.l(predicate.test(ewhxVar2));
                        ewig ewigVar = (ewig) ewih.a.createBuilder();
                        ewigVar.copyOnWrite();
                        ewih ewihVar = (ewih) ewigVar.instance;
                        ewihVar.f = 9;
                        ewihVar.b |= 2;
                        ewigVar.copyOnWrite();
                        ewih ewihVar2 = (ewih) ewigVar.instance;
                        ewihVar2.g = 2;
                        ewihVar2.b |= 4;
                        ewhy ewhyVar = (ewhy) ewic.a.createBuilder();
                        ewhyVar.copyOnWrite();
                        ewic ewicVar = (ewic) ewhyVar.instance;
                        ewicVar.c = 1;
                        ewicVar.b = 1 | ewicVar.b;
                        ewhyVar.copyOnWrite();
                        ewic ewicVar2 = (ewic) ewhyVar.instance;
                        ewicVar2.h = ewhxVar2.f;
                        ewicVar2.b |= 32;
                        ewhyVar.copyOnWrite();
                        ewic ewicVar3 = (ewic) ewhyVar.instance;
                        ewicVar3.b |= 2;
                        ewicVar3.d = iB2;
                        ewic ewicVar4 = (ewic) ewhyVar.build();
                        ewigVar.copyOnWrite();
                        ewih ewihVar3 = (ewih) ewigVar.instance;
                        ewicVar4.getClass();
                        ewihVar3.d = ewicVar4;
                        ewihVar3.c = 12;
                        ((dggg) crsrVar.b).h((ewih) ewigVar.build());
                    }
                }, eoscVar));
            } catch (Exception e2) {
                ekrw ekrwVarJ = crsr.a.j();
                ekrwVarJ.X(eksq.a, "BugleRcsEngine");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/util/rcs/RcsVolteSingleRegistrationCapabilityProvider", "getRcsVolteSingleRegistrationCapability", 77, "RcsVolteSingleRegistrationCapabilityProvider.java")).r("Failed to fetch rcsVolteSingleRegistrationCapability for subId: %d", iB2);
                auvh.h(eijx.f(new Runnable() { // from class: crsp
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = iB2;
                        dgfz dgfzVar = crsrVar.b;
                        Exception exc = e2;
                        if (aee$$ExternalSyntheticApiModelOutline0.m71m((Object) exc)) {
                            ImsException imsExceptionM58m = aee$$ExternalSyntheticApiModelOutline0.m58m((Object) exc);
                            ewig ewigVar = (ewig) ewih.a.createBuilder();
                            ewigVar.copyOnWrite();
                            ewih ewihVar = (ewih) ewigVar.instance;
                            ewihVar.f = 9;
                            ewihVar.b |= 2;
                            ewigVar.copyOnWrite();
                            ewih ewihVar2 = (ewih) ewigVar.instance;
                            ewihVar2.g = 3;
                            ewihVar2.b |= 4;
                            ewhy ewhyVar = (ewhy) ewic.a.createBuilder();
                            ewhyVar.copyOnWrite();
                            ewic ewicVar = (ewic) ewhyVar.instance;
                            ewicVar.c = 1;
                            ewicVar.b |= 1;
                            ewhx ewhxVar2 = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN;
                            ewhyVar.copyOnWrite();
                            ewic ewicVar2 = (ewic) ewhyVar.instance;
                            ewicVar2.h = ewhxVar2.f;
                            ewicVar2.b |= 32;
                            ewhyVar.copyOnWrite();
                            ewic ewicVar3 = (ewic) ewhyVar.instance;
                            ewicVar3.e = 1;
                            ewicVar3.b |= 4;
                            ewgx ewgxVar = (ewgx) Optional.ofNullable(ewgx.b(imsExceptionM58m.getCode())).orElse(ewgx.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
                            ewhyVar.copyOnWrite();
                            ewic ewicVar4 = (ewic) ewhyVar.instance;
                            ewicVar4.g = ewgxVar.e;
                            ewicVar4.b |= 16;
                            ewhyVar.copyOnWrite();
                            ewic ewicVar5 = (ewic) ewhyVar.instance;
                            ewicVar5.b |= 2;
                            ewicVar5.d = i2;
                            ewic ewicVar6 = (ewic) ewhyVar.build();
                            ewigVar.copyOnWrite();
                            ewih ewihVar3 = (ewih) ewigVar.instance;
                            ewicVar6.getClass();
                            ewihVar3.d = ewicVar6;
                            ewihVar3.c = 12;
                            ((dggg) dgfzVar).h((ewih) ewigVar.build());
                            return;
                        }
                        ewig ewigVar2 = (ewig) ewih.a.createBuilder();
                        ewigVar2.copyOnWrite();
                        ewih ewihVar4 = (ewih) ewigVar2.instance;
                        ewihVar4.f = 9;
                        ewihVar4.b |= 2;
                        ewigVar2.copyOnWrite();
                        ewih ewihVar5 = (ewih) ewigVar2.instance;
                        ewihVar5.g = 3;
                        ewihVar5.b |= 4;
                        ewhy ewhyVar2 = (ewhy) ewic.a.createBuilder();
                        ewhyVar2.copyOnWrite();
                        ewic ewicVar7 = (ewic) ewhyVar2.instance;
                        ewicVar7.c = 1;
                        ewicVar7.b = 1 | ewicVar7.b;
                        ewhx ewhxVar3 = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN;
                        ewhyVar2.copyOnWrite();
                        ewic ewicVar8 = (ewic) ewhyVar2.instance;
                        ewicVar8.h = ewhxVar3.f;
                        ewicVar8.b |= 32;
                        ewhyVar2.copyOnWrite();
                        ewic ewicVar9 = (ewic) ewhyVar2.instance;
                        ewicVar9.e = 2;
                        ewicVar9.b |= 4;
                        Class<?> cls = exc.getClass();
                        int i3 = cls.equals(IllegalArgumentException.class) ? 3 : cls.equals(SecurityException.class) ? 2 : cls.equals(RuntimeException.class) ? 4 : 5;
                        ewhyVar2.copyOnWrite();
                        ewic ewicVar10 = (ewic) ewhyVar2.instance;
                        ewicVar10.f = i3 - 1;
                        ewicVar10.b |= 8;
                        ewhyVar2.copyOnWrite();
                        ewic ewicVar11 = (ewic) ewhyVar2.instance;
                        ewicVar11.b |= 2;
                        ewicVar11.d = i2;
                        ewic ewicVar12 = (ewic) ewhyVar2.build();
                        ewigVar2.copyOnWrite();
                        ewih ewihVar6 = (ewih) ewigVar2.instance;
                        ewicVar12.getClass();
                        ewihVar6.d = ewicVar12;
                        ewihVar6.c = 12;
                        ((dggg) dgfzVar).h((ewih) ewigVar2.build());
                    }
                }, eoscVar));
                ewhxVar = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN;
            }
        } else {
            ewhxVar = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_API_NOT_SUPPORTED;
        }
        dfmv dfmvVar = dfmv.a;
        dfmu dfmuVar = (dfmu) dfmvVar.createBuilder();
        String strB = ejwk.b(strM);
        dfmuVar.copyOnWrite();
        dfmv dfmvVar2 = (dfmv) dfmuVar.instance;
        dfmvVar2.b |= 1;
        dfmvVar2.c = strB;
        String lowerCase = ejwk.b(strI).toLowerCase(Locale.US);
        dfmuVar.copyOnWrite();
        dfmv dfmvVar3 = (dfmv) dfmuVar.instance;
        lowerCase.getClass();
        dfmvVar3.b |= 2;
        dfmvVar3.d = lowerCase;
        dfmuVar.copyOnWrite();
        dfmv dfmvVar4 = (dfmv) dfmuVar.instance;
        dfmvVar4.b |= 4;
        dfmvVar4.e = zT;
        dfmuVar.copyOnWrite();
        dfmv dfmvVar5 = (dfmv) dfmuVar.instance;
        dfmvVar5.f = ewhxVar.f;
        dfmvVar5.b |= 8;
        dfmt dfmtVar = (dfmt) dfmw.a.createBuilder();
        elvg elvgVar = cqbe.a;
        dfmtVar.copyOnWrite();
        dfmw dfmwVar = (dfmw) dfmtVar.instance;
        dfmwVar.d = elvgVar.x;
        dfmwVar.b |= 2;
        dfmtVar.copyOnWrite();
        dfmw dfmwVar2 = (dfmw) dfmtVar.instance;
        dfmv dfmvVar6 = (dfmv) dfmuVar.build();
        dfmvVar6.getClass();
        dfmwVar2.c = dfmvVar6;
        dfmwVar2.b |= 1;
        final dfmw dfmwVar3 = (dfmw) dfmtVar.build();
        AtomicReference atomicReference = this.l;
        crry crryVar = (crry) atomicReference.get();
        dfmv dfmvVar7 = dfmwVar3.c;
        if (dfmvVar7 == null) {
            dfmvVar7 = dfmvVar;
        }
        ewhx ewhxVarB = ewhx.b(dfmvVar7.f);
        if (ewhxVarB == null) {
            ewhxVarB = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNSET;
        }
        ewhx ewhxVar2 = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN;
        boolean zEquals = ewhxVar2.equals(ewhxVarB);
        if (crryVar != null && crryVar.a() == iB) {
            if (!crryVar.c().isPresent()) {
                optionalEmpty = Optional.empty();
            } else if (zEquals) {
                optionalEmpty = crryVar.c();
            } else {
                Object obj = crryVar.c().get();
                ejwl.b(!ewhxVar2.equals(ewhxVarB), "Calling stopTimerAndLogDuration with RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN argument is forbidden.");
                ejxm ejxmVar = ((crsi) obj).b;
                ejxmVar.g();
                long millis = ejxmVar.d().toMillis();
                aill aillVar = (aill) ((crsi) obj).a.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.PHENOTYPE_FIRST_REREGISTRATION_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                emer emerVar = (emer) emes.a.createBuilder();
                emerVar.copyOnWrite();
                emes emesVar = (emes) emerVar.instance;
                emesVar.d = ewhxVarB.f;
                emesVar.b |= 2;
                emerVar.copyOnWrite();
                emes emesVar2 = (emes) emerVar.instance;
                emesVar2.b |= 1;
                emesVar2.c = millis;
                emes emesVar3 = (emes) emerVar.build();
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                emesVar3.getClass();
                ellhVar2.bq = emesVar3;
                ellhVar2.f |= 1073741824;
                aillVar.k(ellgVar, emxt.PHENOTYPE_FIRST_REREGISTRATION_EVENT);
                optionalEmpty = Optional.empty();
            }
        }
        if (zEquals) {
            crsj crsjVar = this.m;
            ejya ejyaVar = j;
            ejyaVar.getClass();
            crsi crsiVar = new crsi(crsjVar.a, ejyaVar);
            crsiVar.b.f();
            optionalEmpty = Optional.of(crsiVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        crrk crrkVar = new crrk(optionalEmpty, iB, dfmwVar3);
        if (crsd.PHENOTYPE_REGISTRATION_TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE.equals(crsdVar)) {
            crry crryVar2 = (crry) atomicReference.get();
            if (crryVar2 == null || crrkVar.a != crryVar2.a()) {
                cqbd cqbdVarA = d.a();
                cqbdVarA.I("Skipping Phenotype registration, since the SIM was not loaded yet.");
                cqbdVarA.r();
            } else {
                dfmv dfmvVar8 = crryVar2.b().c;
                if (dfmvVar8 != null) {
                    dfmvVar = dfmvVar8;
                }
                ewhx ewhxVarB2 = ewhx.b(dfmvVar.f);
                if (ewhxVarB2 == null) {
                    ewhxVarB2 = ewhx.RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNSET;
                }
                if (!ewhxVar2.equals(ewhxVarB2)) {
                }
            }
            d.m("Phenotype registration skipped.");
            if (((aqbb) this.i.b()).a()) {
                return;
            }
            this.g.e("CsLibPhenotypeHelper.PhenotypeRegistration", 2);
            return;
        }
        atomicReference.set(crrkVar);
        d.m("Registering CSLib phenotype flags");
        byte[] byteArray = dfmwVar3.toByteArray();
        final ewhx ewhxVar3 = ewhxVar;
        final ddzs ddzsVar2 = new ddzs() { // from class: crrw
            @Override // defpackage.ddzs
            public final void a(boolean z) {
                cqbd cqbdVarA2 = crrz.d.a();
                cqbdVarA2.I((true != z ? "Unsuccessful" : "Successful").concat("registering properties for"));
                cqbdVarA2.A("mendel-package", "com.google.android.ims.library");
                cqbdVarA2.m(iB);
                cqbdVarA2.A("phenotypeRegistrationTrigger", crsdVar);
                crrz crrzVar = this.a;
                dhiz dhizVar = dhiz.SIM_ID;
                String strL = ((aqsv) crrzVar.h.b()).a() ? crrzVar.b().c : ((dhes) crrzVar.f.b()).l();
                dfmw dfmwVar4 = dfmwVar3;
                cqbdVarA2.A("simProperties.simId", dhizVar.c(strL));
                dfmv dfmvVar9 = dfmwVar4.c;
                if (dfmvVar9 == null) {
                    dfmvVar9 = dfmv.a;
                }
                cqbdVarA2.A("appProperties.simProperties.mccMnc", dfmvVar9.c);
                dfmv dfmvVar10 = dfmwVar4.c;
                if (dfmvVar10 == null) {
                    dfmvVar10 = dfmv.a;
                }
                cqbdVarA2.A("appProperties.simProperties.gid1", dfmvVar10.d);
                dfmv dfmvVar11 = dfmwVar4.c;
                if (dfmvVar11 == null) {
                    dfmvVar11 = dfmv.a;
                }
                ewhx ewhxVar4 = ewhxVar3;
                cqbdVarA2.B("appProperties.simProperties.isFiDevice", dfmvVar11.e);
                cqbdVarA2.A("appProperties.simProperties.rcsVolteSingleRegistrationCapability", ewhxVar4.name());
                cqbdVarA2.r();
                if (!((aqbb) crrzVar.i.b()).a()) {
                    crrzVar.g.e("CsLibPhenotypeHelper.PhenotypeRegistration", 3);
                }
                ddzsVar.a(z);
            }
        };
        cqbd cqbdVarA2 = crrp.a.a();
        cqbdVarA2.A("Registering for package", "com.google.android.ims.library");
        cqbdVarA2.r();
        ddzn ddznVar = (ddzn) this.c.a();
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            crrp.a.n("Failed to get app version for phenotype register call, using default");
        }
        ddznVar.c("com.google.android.ims.library", i, crrp.b, byteArray).s(new defb() { // from class: crrn
            public final /* synthetic */ String b = "com.google.android.ims.library";

            @Override // defpackage.defb
            public final void a(defn defnVar) {
                cqce cqceVar = crrp.a;
                String str = true != defnVar.m() ? "Unsuccessful" : "Successful";
                String str2 = this.b;
                cqceVar.m(String.format("%s registration for %s", str, str2));
                this.a(str2, ddzsVar2);
            }
        });
    }
}
