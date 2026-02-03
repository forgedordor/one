package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dhes {
    private static final ekrg r = ekrg.c("com/google/android/ims/receiver/sim/SimPreferences");
    public final dbhq a;
    public final dbho b;
    public final dbho c;
    public final dbho d;
    public final dbho e;
    public final dbho f;
    public final dbho g;
    public final dbho h;
    public final dbho i;
    public final dbho j;
    public final dbho k;
    public final dbho l;
    public final dbho m;
    public final dbho n;
    public final dbho o;
    public final dbho p;
    public final dbho q;

    @Deprecated
    public dhes() {
        dbhq dbhqVar = new dbhq("sim_state_tracker");
        this.a = dbhqVar;
        this.b = new dbhk(dbhqVar, "sim_id", "");
        this.c = new dbhk(dbhqVar, "sim_serial_number", "");
        this.d = new dbhk(dbhqVar, "imsi", "");
        this.e = new dbhk(dbhqVar, "raw_msisdn", "");
        this.f = new dbhk(dbhqVar, "formatted_msisdn", "");
        this.g = new dbhk(dbhqVar, "sim_operator", "");
        this.h = new dbhk(dbhqVar, "sim_operator_name", "");
        this.i = new dbhk(dbhqVar, "network_operator_name", "");
        this.j = new dbhl(dbhqVar, "is_fi_device", false);
        this.k = new dbhm(dbhqVar, "sub_id", -1);
        this.l = new dbhm(dbhqVar, "slot_index", -1);
        this.m = new dbhk(dbhqVar, "group_id_level1", "");
        this.n = new dbhk(dbhqVar, "default_sim_subscription_info", "");
        this.o = new dbhk(dbhqVar, "default_sms_sim_subscription_info", "");
        this.p = new dbhk(dbhqVar, "default_data_sim_subscription_info", "");
        this.q = new dbhn(dbhqVar, ekon.a);
    }

    public static final cmmh u(String str) {
        if (ejwk.c(str)) {
            return null;
        }
        try {
            return (cmmh) evsn.parseFrom(cmmh.a, Base64.decode(str, 0), evrr.a());
        } catch (evtj unused) {
            return null;
        } catch (IllegalArgumentException e) {
            ((ekrd) ((ekrd) ((ekrd) r.j()).g(e)).h("com/google/android/ims/receiver/sim/SimPreferences", "deserializeSimSubscriptionInfo", (char) 586, "SimPreferences.java")).q("Failed to deserialize SimSubscriptionInfo.");
            return null;
        }
    }

    public static final String v(cmmh cmmhVar) {
        return cmmhVar == null ? "" : Base64.encodeToString(cmmhVar.toByteArray(), 0);
    }

    @Deprecated
    public final int a() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? ((Integer) this.l.d()).intValue() : cmmhVarD.e;
    }

    @Deprecated
    public final int b() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? ((Integer) this.k.d()).intValue() : cmmhVarD.d;
    }

    public final cmmh c() {
        return u((String) this.p.d());
    }

    public final cmmh d() {
        return u((String) this.n.d());
    }

    public final cmmh e() {
        return u((String) this.o.d());
    }

    public final cmmh f(String str) {
        return u(o("sim_subscription_info_sim_id_".concat(String.valueOf(str))));
    }

    public final dggp g() {
        return new dggp((String) this.b.d());
    }

    @Deprecated
    public final String h() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? (String) this.f.d() : cmmhVarD.q;
    }

    @Deprecated
    public final String i() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? (String) this.m.d() : cmmhVarD.t;
    }

    @Deprecated
    public final String j() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? (String) this.d.d() : cmmhVarD.f;
    }

    @Deprecated
    public final String k() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? (String) this.e.d() : cmmhVarD.g;
    }

    @Deprecated
    public final String l() {
        eieu eieuVarK = eiiy.k("SimPreferences::getSimId");
        try {
            cmmh cmmhVarD = d();
            String str = cmmhVarD == null ? (String) this.b.d() : cmmhVarD.c;
            eieuVarK.close();
            return str;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final String m() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? (String) this.g.d() : cmmhVarD.s;
    }

    @Deprecated
    public final String n() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? (String) this.h.d() : cmmhVarD.r;
    }

    @Deprecated
    public final String o(String str) {
        return (String) new dbhk(this.a, str, "").d();
    }

    @Deprecated
    public final void p(String str) {
        dbhq dbhqVar = this.a;
        dbhs[] dbhsVarArr = {new dbhk(dbhqVar, str, "")};
        SharedPreferences.Editor editorEdit = dbhqVar.a().edit();
        editorEdit.remove(dbhsVarArr[0].a());
        dbhq.b(editorEdit);
    }

    public final void q(Set set) {
        this.q.e(set);
    }

    public final void r(cmmh cmmhVar) {
        String strV = v(cmmhVar);
        s("sim_subscription_info_sim_id_".concat(String.valueOf(cmmhVar.c)), strV);
        s("sim_subscription_info_sub_id_" + cmmhVar.d, strV);
    }

    @Deprecated
    public final void s(String str, String str2) {
        new dbhk(this.a, str, "").e(str2);
    }

    @Deprecated
    public final boolean t() {
        cmmh cmmhVarD = d();
        return cmmhVarD == null ? ((Boolean) this.j.d()).booleanValue() : cmmhVarD.o;
    }

    public dhes(fcsu fcsuVar) {
        dbhq dbhqVar = new dbhq("sim_state_tracker");
        this.a = dbhqVar;
        this.b = new dbhk(dbhqVar, "sim_id", "");
        this.c = new dbhk(dbhqVar, "sim_serial_number", "");
        this.d = new dbhk(dbhqVar, "imsi", "");
        this.e = new dbhk(dbhqVar, "raw_msisdn", "");
        this.f = new dbhk(dbhqVar, "formatted_msisdn", "");
        this.g = new dbhk(dbhqVar, "sim_operator", "");
        this.h = new dbhk(dbhqVar, "sim_operator_name", "");
        this.i = new dbhk(dbhqVar, "network_operator_name", "");
        this.j = new dbhl(dbhqVar, "is_fi_device", false);
        this.k = new dbhm(dbhqVar, "sub_id", -1);
        this.l = new dbhm(dbhqVar, "slot_index", -1);
        this.m = new dbhk(dbhqVar, "group_id_level1", "");
        this.n = new dbhk(dbhqVar, "default_sim_subscription_info", "");
        this.o = new dbhk(dbhqVar, "default_sms_sim_subscription_info", "");
        this.p = new dbhk(dbhqVar, "default_data_sim_subscription_info", "");
        this.q = new dbhn(dbhqVar, ekon.a);
        fcsuVar.b();
    }
}
