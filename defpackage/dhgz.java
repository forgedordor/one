package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.time.Instant;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgz {
    public final dhgy a;
    private final Context b;

    public dhgz(Context context) {
        this.a = new dhgy(context, "com.google.android.rcs");
        this.b = context;
    }

    public final synchronized int a() {
        int iIntValue;
        dhgy dhgyVar = this.a;
        synchronized (dhgyVar) {
            dhgyVar.d();
            Integer num = (Integer) dhgyVar.d.get("provisioning_sms_port_override");
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public final synchronized long b() {
        long jA;
        dhgy dhgyVar = this.a;
        jA = dhgyVar.a("requestid", 1L);
        dhgyVar.h("requestid", 1 + jA);
        return jA;
    }

    public final synchronized long c() {
        long jA;
        dhgy dhgyVar = this.a;
        jA = dhgyVar.a("sessionid", 1L);
        if (jA == 1) {
            dhja.c("Session ID is 1 !! This should only be the case after clearing the data or installing for the first time!", new Object[0]);
            jA = 1;
        }
        if (jA < 1500000000) {
            dhja.c("Seeding session ID to current timestamp", new Object[0]);
            jA = Instant.now().getEpochSecond();
        }
        dhgyVar.h("sessionid", 1 + jA);
        return jA;
    }

    public final synchronized String d(String str, int i) {
        String strA;
        dhgy dhgyVar = this.a;
        strA = dhkd.a(this.b, str, i);
        dhgyVar.j("clientid", strA);
        return strA;
    }

    public final synchronized String e() {
        return this.a.c("capabilities_pidf_etag", null);
    }

    public final synchronized String f() {
        return this.a.c("clientid", null);
    }

    public final synchronized String g() {
        return ejwk.a(this.a.c("default_country", null));
    }

    public final synchronized String h() {
        return ejwk.a(this.a.c("msisdn", null));
    }

    public final synchronized String i() {
        return this.a.c("provisioning_acs_url_override", null);
    }

    public final synchronized String j() {
        return this.a.c("sim_serial_number", null);
    }

    public final synchronized void k(long j) {
        dhgy dhgyVar = this.a;
        long jA = dhgyVar.a("sessionid", 1L);
        long j2 = j + jA;
        dhja.c("****** DEBUG ****** Bumping session ID from %s to %s", Long.valueOf(jA), Long.valueOf(j2));
        dhgyVar.h("sessionid", j2);
    }

    public final void l(String str, PrintWriter printWriter) {
        Object obj;
        printWriter.print(' ');
        printWriter.print(str);
        printWriter.print(": ");
        dhgy dhgyVar = this.a;
        synchronized (dhgyVar) {
            dhgyVar.d();
            obj = dhgyVar.d.get(str);
        }
        printWriter.println(obj);
    }

    public final synchronized void m() {
        this.a.f("capabilities_pidf_etag");
    }

    public final synchronized void n(String str) {
        this.a.j("capabilities_pidf_etag", str);
    }

    public final void o(String str) {
        this.a.j("default_country", ejwk.b(str));
    }

    public final synchronized void p(boolean z) {
        this.a.g("send_error_result_from_engine", z);
    }

    public final void q(boolean z) {
        this.a.g("first_time_discovery_finished", z);
    }

    public final synchronized void r(String str) {
        dhgy dhgyVar = this.a;
        String strB = ejwk.b(str);
        dhgyVar.j("msisdn", strB);
        dhja.c("Setting username for Analytics to: %s", dhiz.PHONE_NUMBER.c(strB));
    }

    public final synchronized boolean s() {
        return this.a.l("send_error_result_from_engine");
    }

    public final synchronized boolean t() {
        String strH = h();
        if (TextUtils.isEmpty(strH)) {
            return false;
        }
        return strH.startsWith("+1100");
    }

    public final synchronized boolean u() {
        return this.a.k("provisioning_acs_url_override");
    }

    public final synchronized boolean v() {
        return this.a.k("provisioning_sms_port_override");
    }

    public final synchronized boolean w() {
        return this.a.l("first_time_discovery_finished");
    }

    public final synchronized boolean x() {
        long jA = this.a.a("sessionid", 0L);
        return jA < 1 || jA < 1500000000;
    }

    public final synchronized void y() {
        this.a.h("provisioning_last_attempt", 0L);
    }
}
