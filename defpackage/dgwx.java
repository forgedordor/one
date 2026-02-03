package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dgwx {
    static final dfny b;
    private static final Character l;
    private static final ejwc m;
    public boolean c;
    public boolean d;
    public long e;
    protected long f;
    public int g;
    protected final Map h;
    public final List i;
    public Optional j;
    private static final dfny k = dfod.a(207636097);
    public static final long a = TimeUnit.HOURS.toMillis(36);

    static {
        Character ch = ',';
        l = ch;
        ch.charValue();
        m = ejwc.d(',');
        b = dfnv.b("remove_unsupported_iari_tags");
    }

    protected dgwx() {
        this.c = false;
        this.d = false;
        this.e = -1L;
        this.g = 0;
        this.h = new HashMap();
        this.i = new ArrayList();
        this.j = Optional.empty();
    }

    public static String a(List list) {
        if (dhic.a(list)) {
            throw new IllegalArgumentException("List of bot versions can't be null or empty");
        }
        return String.format("+g.gsma.rcs.botversion=\"%s\"", m.b(list));
    }

    public static String d() {
        return a(Arrays.asList("#=0.92", "#=1"));
    }

    public final boolean A() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms");
    }

    public final boolean B() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }

    public final boolean C() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
    }

    public final boolean D() {
        return this.i.contains("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms");
    }

    public final boolean E() {
        if (((Boolean) k.a()).booleanValue()) {
            List list = this.i;
            return (list.contains("+g.gsma.rcs.ipcall") || list.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel")) && list.contains("video");
        }
        List list2 = this.i;
        if (list2.contains("+g.gsma.rcs.ipcall")) {
            return true;
        }
        return list2.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") && list2.contains("video");
    }

    public final boolean F() {
        List list = this.i;
        return (list.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || list.contains("+g.gsma.rcs.ipcall")) && !H();
    }

    public final boolean G() {
        if (((Boolean) b.a()).booleanValue()) {
            return false;
        }
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft");
    }

    public final boolean H() {
        return this.i.contains("+g.gsma.rcs.ipvideocallonly");
    }

    public final boolean I() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered");
    }

    public final boolean J() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
    }

    public final boolean K() {
        return this.i.contains(dhbr.a()) && B();
    }

    public final boolean L() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap");
    }

    public final boolean M() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch");
    }

    public final boolean N() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.e;
        return j > 0 && jCurrentTimeMillis - j < this.f;
    }

    public final void O() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer", true);
    }

    public final void P() {
        m(true);
        t("video", true);
    }

    public final void Q() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered", true);
    }

    public final void R() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap", true);
    }

    public final void S() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch", true);
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        if (y()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
        }
        if (G()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft");
        }
        if (z()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb");
        }
        if (C()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
        }
        List list = this.i;
        if (list.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft")) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft");
        }
        if (!((Boolean) b.a()).booleanValue() && list.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg")) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg");
        }
        if (B()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
        }
        if (A()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms");
        }
        if (D()) {
            arrayList.add("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms");
        }
        if (dfou.d()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
        }
        return TextUtils.join(",", arrayList);
    }

    public final String c(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (y() && z) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
        }
        if (dfpo.u() && K() && z) {
            arrayList.add(dhbr.a());
        }
        if (x()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer");
        }
        if (I()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered");
        }
        if (L()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap");
        }
        if (M()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch");
        }
        if (E() || F()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel");
        }
        return TextUtils.join(",", arrayList);
    }

    public final void e(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im", z);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dgwx)) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final void f(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb", z);
    }

    public final void g(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms", z);
    }

    public final void h(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg", z);
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final void i(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp", z);
    }

    public final void j(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft", z);
    }

    public final void k(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush", z);
    }

    public final void l(boolean z) {
        t("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms", z);
    }

    public final void m(boolean z) {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel", z);
        t("+g.gsma.rcs.ipcall", z);
    }

    public final void n(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft", z);
    }

    public final void o(boolean z) {
        t("+g.gsma.rcs.ipvideocallonly", z);
    }

    public final void p(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot", z);
    }

    public final void q(boolean z) {
        t(dhbr.a(), z);
    }

    public final void r(boolean z) {
        t(d(), z);
    }

    public final void s(boolean z) {
        t("+g.jibe.stickers", z);
    }

    public final void t(String str, boolean z) {
        if (!z) {
            this.i.remove(str);
            return;
        }
        List list = this.i;
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    public final String toString() {
        return "mResponseCode: " + this.g + ", mLastActivityTimestamp: " + this.e + ", mValidityPeriodMillis: " + this.f + ", mIsKnownInNetwork: " + this.d + ", mIsOnline: " + this.c + ", mRbmBot: " + this.j + ", mCaps: " + this.i;
    }

    public final boolean u() {
        return this.i.contains("+g.jibe.stickers");
    }

    public final boolean v() {
        return y() || G() || J() || this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.dp") || B();
    }

    public final boolean w(boolean z) {
        if (x() || I() || M() || L() || E() || F()) {
            return true;
        }
        if (y()) {
            if (z) {
                return true;
            }
            z = false;
        }
        return K() && z;
    }

    public final boolean x() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer");
    }

    public final boolean y() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean z() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb");
    }

    public dgwx(long j) {
        this.c = false;
        this.d = false;
        this.e = -1L;
        this.g = 0;
        this.h = new HashMap();
        this.i = new ArrayList();
        this.j = Optional.empty();
        this.f = j;
    }

    public dgwx(dgwx dgwxVar) {
        this.c = false;
        this.d = false;
        this.e = -1L;
        this.g = 0;
        HashMap map = new HashMap();
        this.h = map;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = Optional.empty();
        arrayList.clear();
        arrayList.addAll(dgwxVar.i);
        map.clear();
        map.putAll(dgwxVar.h);
        this.c = dgwxVar.c;
        this.d = dgwxVar.d;
        this.g = dgwxVar.g;
        this.e = dgwxVar.e;
        this.f = dgwxVar.f;
        this.j = dgwxVar.j;
    }
}
