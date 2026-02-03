package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgtk {
    public static ckiz a() {
        return ckja.i(ewrp.RCS_PROVISIONING_UNKNOWN_STATE, Optional.empty());
    }

    public static String b(String str) throws MalformedURLException {
        URL url = new URL(str);
        if (!url.getProtocol().equals("https")) {
            if (!url.getProtocol().equals("http")) {
                dhja.g("Error converting [%s] to secure link", str);
                throw new MalformedURLException(a.a(str, "Only HTTPS or HTTP protocols are allowed in the URL [", "]"));
            }
            if (!((Boolean) dfbw.e.a()).booleanValue()) {
                return str.replace("http:", "https:");
            }
        }
        return str;
    }

    static final void c(Uri.Builder builder, ckiz ckizVar, String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Parameter name must not be empty");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Max length must be positive");
        }
        if (str2 == null) {
            str2 = "";
        } else if (str2.length() > i) {
            str2 = str2.substring(0, i);
        }
        builder.appendQueryParameter(str, str2);
        ckizVar.l(str, str2);
    }

    static final void d(Uri.Builder builder, ckiz ckizVar, String str) {
        if (TextUtils.isEmpty(null)) {
            return;
        }
        c(builder, ckizVar, str, null, 15);
    }

    public static final Uri.Builder f(String str, dgiq dgiqVar, dgti dgtiVar, dgtj dgtjVar, ckiz ckizVar) {
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Optional optionalD = ckizVar.d();
        builderBuildUpon.getClass();
        optionalD.ifPresent(new Consumer() { // from class: dgth
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                builderBuildUpon.path((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ewlg ewlgVarB = ckizVar.b();
        ewlgVarB.copyOnWrite();
        ewlp ewlpVar = (ewlp) ewlgVarB.instance;
        ewlp ewlpVar2 = ewlp.a;
        str.getClass();
        ewlpVar.b |= 2;
        ewlpVar.d = str;
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ewlp) ckizVar.b().instance).e)).entrySet()) {
            Iterator<E> it = ((ewln) entry.getValue()).b.iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) it.next());
            }
        }
        builderBuildUpon.appendQueryParameter("vers", Integer.toString(dgiqVar.e()));
        ckizVar.l("vers", Integer.toString(dgiqVar.e()));
        if (dfpi.W()) {
            int iB = dgiqVar.b();
            builderBuildUpon.appendQueryParameter("rcs_state", Integer.toString(iB));
            ckizVar.l("rcs_state", Integer.toString(iB));
        }
        if (!TextUtils.isEmpty(dgtiVar.e)) {
            builderBuildUpon.appendQueryParameter("instance_id_token", dgtiVar.e);
            ckizVar.l("instance_id_token", dgtiVar.e);
        }
        if (!TextUtils.isEmpty(dgtiVar.f)) {
            builderBuildUpon.appendQueryParameter("IMSI", dgtiVar.f);
            ckizVar.l("IMSI", dgtiVar.f);
        }
        if (!TextUtils.isEmpty(dgtiVar.g)) {
            builderBuildUpon.appendQueryParameter("IMEI", dgtiVar.g);
            ckizVar.l("IMEI", dgtiVar.g);
        }
        if (!TextUtils.isEmpty(dgtiVar.h)) {
            builderBuildUpon.appendQueryParameter("device_type", dgtiVar.h);
            ckizVar.l("device_type", dgtiVar.h);
        }
        c(builderBuildUpon, ckizVar, "terminal_model", g(dgtjVar.b), ((Integer) dfpi.t().a.ax.a()).intValue());
        c(builderBuildUpon, ckizVar, "terminal_vendor", g(dgtjVar.a), 4);
        c(builderBuildUpon, ckizVar, "terminal_sw_version", g(dgtjVar.c), 10);
        c(builderBuildUpon, ckizVar, "client_vendor", dgtiVar.d, 4);
        c(builderBuildUpon, ckizVar, "client_version", dgtiVar.c, 15);
        d(builderBuildUpon, ckizVar, "bugle_version");
        d(builderBuildUpon, ckizVar, "cs_version");
        c(builderBuildUpon, ckizVar, "rcs_profile", dgtiVar.a, 15);
        c(builderBuildUpon, ckizVar, "rcs_version", dgtiVar.b, 4);
        String str2 = (String) dhhb.e.d();
        if (!TextUtils.isEmpty(str2)) {
            builderBuildUpon.appendQueryParameter("provision_id", str2);
            ckizVar.l("provision_id", str2);
        }
        return builderBuildUpon;
    }

    private static final String g(String str) {
        return str.replaceAll("[:/?#\\[\\]@=;&$+!*'(),]", "");
    }

    public final void e(String str, dgiq dgiqVar, String str2, String str3, int i, dgti dgtiVar, Optional optional) {
        if (str3 == null) {
            throw new IllegalArgumentException("Token must not be null!");
        }
        ckiz ckizVar = (ckiz) optional.orElse(a());
        Uri.Builder builderF = f(str, dgiqVar, dgtiVar, new dgtj(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), ckizVar);
        if (!TextUtils.isEmpty(str2)) {
            builderF.appendQueryParameter("msisdn", str2);
            ckizVar.l("msisdn", str2);
        }
        builderF.appendQueryParameter("token", str3);
        ckizVar.l("token", str3);
        builderF.appendQueryParameter("SMS_port", String.valueOf(i));
        ckizVar.l("SMS_port", String.valueOf(i));
        ckizVar.f(b(builderF.build().toString()));
    }
}
