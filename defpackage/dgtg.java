package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.net.MalformedURLException;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgtg {
    private static final dhip a = new dhip("ProvisioningServerUtil");
    private static final ekrg b = ekrg.c("com/google/android/ims/provisioning/util/ProvisioningServerUtil");
    private final fcsu c;
    private final fcsu d;
    private final cebq e;
    private final cmlb f;
    private final fcsu g;

    public dgtg(fcsu fcsuVar, fcsu fcsuVar2, cebq cebqVar, cmlb cmlbVar, fcsu fcsuVar3) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = cebqVar;
        this.f = cmlbVar;
        this.g = fcsuVar3;
    }

    private final Optional j(Optional optional) {
        String strK;
        if (optional.isPresent()) {
            dhja.l(a, "getConfigServerUrl with simId: %s", dhiz.SIM_ID.c(optional.get()));
        } else {
            dhja.l(a, "getConfigServerUrl without simId", new Object[0]);
        }
        if (q()) {
            dhja.l(a, "Using overridden config server URL", new Object[0]);
            strK = ((dhgz) this.c.b()).i();
        } else {
            String str = "";
            if (o(optional)) {
                dhja.l(a, "Using config server URL from %s", optional.isPresent() ? this.e.getClass().getName() : dfaq.E().getClass().getName());
                if (optional.isPresent()) {
                    etsz etszVarC = this.e.c((String) optional.get());
                    strK = etszVarC.e == 2 ? (String) etszVarC.f : "";
                } else {
                    strK = (String) dfaq.E().a().a();
                }
            } else if (p(optional)) {
                dhip dhipVar = a;
                dhja.l(dhipVar, "Using MCC based URL", new Object[0]);
                if (optional.isPresent()) {
                    etsz etszVarC2 = this.e.c((String) optional.get());
                    if (etszVarC2.e == 3) {
                        str = (String) etszVarC2.f;
                    }
                } else {
                    str = (String) dfaq.E().m().a();
                }
                String strM = ((dfma) this.g.b()).a() ? m(optional) : l(optional);
                if (TextUtils.isEmpty(strM)) {
                    dhja.l(dhipVar, "Not using MCC URL. Failed to get MCC", new Object[0]);
                    strK = null;
                } else {
                    strK = String.format(str, strM);
                }
            } else if (g(optional)) {
                dhja.l(a, "Using RCS compliant config URL", new Object[0]);
                strK = k(optional);
            } else {
                dhja.l(a, "No config URL. RCS not configured for dual-registration.", new Object[0]);
                strK = null;
            }
        }
        if (strK == null) {
            return Optional.empty();
        }
        if (TextUtils.isEmpty(strK)) {
            return Optional.empty();
        }
        if (!strK.endsWith("/")) {
            strK = strK.concat("/");
        }
        if (strK.startsWith("http")) {
            return Optional.of(strK);
        }
        dhja.p(a, "Prepending \"http\" to URL %s", dhiz.URI.c(strK));
        return Optional.of("http://".concat(strK));
    }

    private final String k(Optional optional) {
        String strM;
        if (optional.isPresent()) {
            Optional optionalJ = this.f.j(new dggp((String) optional.get()));
            if (optionalJ.isEmpty()) {
                return null;
            }
            strM = ((cmmh) optionalJ.get()).s;
        } else {
            strM = ((dhes) this.d.b()).m();
        }
        if (!TextUtils.isEmpty(strM) && strM.length() > 4) {
            try {
                return String.format("http://config.rcs.mnc%s.mcc%s.pub.3gppnetwork.org", String.format(Locale.US, "%03d", Integer.valueOf(Integer.parseInt(strM.substring(3)))), ((dfma) this.g.b()).a() ? m(optional) : l(optional));
            } catch (NumberFormatException | IllegalFormatException unused) {
            }
        }
        if (optional.isPresent()) {
            dhja.h(a, "Cannot create compliant config server url, invalid MCC-MNC. sim ID: %s", dhiz.SIM_ID.c(optional));
        } else {
            dhja.h(a, "Cannot create compliant config server url, invalid MCC-MNC.", new Object[0]);
        }
        return null;
    }

    @Deprecated
    private final String l(Optional optional) {
        String strM;
        if (optional.isPresent()) {
            Optional optionalJ = this.f.j(new dggp((String) optional.get()));
            if (optionalJ.isEmpty()) {
                ((ekrd) ((ekrd) b.j()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 292, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimSubscriptionInfo is empty.");
                return "";
            }
            ((ekrd) ((ekrd) b.h()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 296, "ProvisioningServerUtil.java")).q("Getting mccmnc from SimSubscriptionInfo.");
            strM = ((cmmh) optionalJ.get()).s;
        } else {
            ((ekrd) ((ekrd) b.h()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 300, "ProvisioningServerUtil.java")).q("Getting mccmnc from SimPreferences.");
            strM = ((dhes) this.d.b()).m();
        }
        if (!TextUtils.isEmpty(strM)) {
            return strM.substring(0, 3);
        }
        ((ekrd) ((ekrd) b.j()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 306, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimOperator is empty.");
        return "";
    }

    private final String m(Optional optional) {
        if (optional.isPresent()) {
            Optional optionalJ = this.f.j(new dggp((String) optional.get()));
            if (optionalJ.isEmpty()) {
                ((ekrd) ((ekrd) b.j()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMccV2", 262, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimSubscriptionInfo is empty.");
                return "";
            }
            ((ekrd) ((ekrd) b.h()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMccV2", 266, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Getting mcc from SimSubscriptionInfo.");
            String str = ((cmmh) optionalJ.get()).k;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            ((ekrd) ((ekrd) b.h()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMccV2", 272, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Getting mccmnc from SimPreferences.");
            String strM = ((dhes) this.d.b()).m();
            if (!TextUtils.isEmpty(strM)) {
                return strM.substring(0, 3);
            }
        }
        ((ekrd) ((ekrd) b.j()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMccV2", 278, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC.");
        return "";
    }

    private final String n(final Optional optional) {
        return (String) j(optional).filter(new Predicate() { // from class: dgtd
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
                return !TextUtils.isEmpty((String) obj);
            }
        }).orElseThrow(new Supplier() { // from class: dgte
            @Override // java.util.function.Supplier
            public final Object get() {
                Optional optional2 = optional;
                return optional2.isPresent() ? new MalformedURLException("Config server url should be valid when making request. simId: ".concat(String.valueOf(dhiz.SIM_ID.c(optional2)))) : new MalformedURLException("Config server url should be valid when making request.");
            }
        });
    }

    private final boolean o(Optional optional) {
        String str;
        if (optional.isPresent()) {
            etsz etszVarC = this.e.c((String) optional.get());
            str = etszVarC.e == 2 ? (String) etszVarC.f : "";
        } else {
            str = (String) dfaq.E().a().a();
        }
        return !TextUtils.isEmpty(str);
    }

    private final boolean p(Optional optional) {
        if (!optional.isPresent()) {
            return !TextUtils.isEmpty((CharSequence) dfaq.E().m().a());
        }
        etsz etszVarC = this.e.c((String) optional.get());
        return !(etszVarC.e == 3 ? (String) etszVarC.f : "").isEmpty();
    }

    private final boolean q() {
        return ((Boolean) dfaq.E().c().a()).booleanValue() && ((dhgz) this.c.b()).u();
    }

    @Deprecated
    public final int a() {
        fcsu fcsuVar = this.c;
        if (((dhgz) fcsuVar.b()).v()) {
            return ((dhgz) fcsuVar.b()).a();
        }
        int iIntValue = ((Integer) dfaq.E().C().a()).intValue();
        return iIntValue >= 0 ? iIntValue : g(Optional.empty()) ? 37273 : 0;
    }

    @Deprecated
    public final int b(String str) {
        fcsu fcsuVar = this.c;
        return ((dhgz) fcsuVar.b()).v() ? ((dhgz) fcsuVar.b()).a() : this.e.c(str).k;
    }

    @Deprecated
    public final Optional c() {
        return j(Optional.empty());
    }

    public final Optional d(String str) {
        return j(Optional.of(str));
    }

    @Deprecated
    public final String e() {
        return n(Optional.empty());
    }

    public final String f(String str) {
        return n(Optional.of(str));
    }

    final boolean g(Optional optional) {
        String strM;
        if (optional.isPresent()) {
            Optional optionalJ = this.f.j(new dggp((String) optional.get()));
            if (optionalJ.isEmpty()) {
                return false;
            }
            strM = ((cmmh) optionalJ.get()).s;
        } else {
            strM = ((dhes) this.d.b()).m();
        }
        if (!optional.isPresent()) {
            return !TextUtils.isEmpty(strM) && TextUtils.equals((String) dfaq.E().t().a(), strM);
        }
        int iA = etsv.a(this.e.c((String) optional.get()).g);
        if (iA == 0) {
            iA = 1;
        }
        return !TextUtils.isEmpty(strM) && iA == 3;
    }

    @Deprecated
    public final boolean h() {
        return c().filter(new Predicate() { // from class: dgtf
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
                return !TextUtils.isEmpty((String) obj);
            }
        }).isPresent();
    }

    public final int i(Optional optional) {
        if (q()) {
            return 3;
        }
        if (o(optional)) {
            return 4;
        }
        if (p(optional)) {
            return 5;
        }
        if (g(optional)) {
            return 6;
        }
        dhja.r(a, "No config URL source available.", new Object[0]);
        return 2;
    }
}
