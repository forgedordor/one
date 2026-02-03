package defpackage;

import android.text.TextUtils;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjy {
    private final dcpn a;
    private final dgjt b;

    public dgjy(dcpn dcpnVar, dgjt dgjtVar) {
        this.a = dcpnVar;
        this.b = dgjtVar;
    }

    public final String a(dgjx dgjxVar) {
        HashMap map = new HashMap();
        map.put("APP_NAME", "com.google.android.apps.messaging");
        dgjs dgjsVar = (dgjs) dgjxVar;
        String str = dgjsVar.a;
        if (!str.isEmpty()) {
            map.put("IMSI", dgjx.j(str, dgjsVar.f));
        }
        String str2 = dgjsVar.g;
        if (!str2.isEmpty()) {
            map.put("IMEI", dgjx.j(str2, dgjsVar.f));
        }
        String str3 = dgjsVar.b;
        if (!str3.isEmpty()) {
            map.put("MSISDN", dgjx.j(str3, dgjsVar.f));
        }
        String str4 = dgjsVar.c;
        if (!str4.isEmpty()) {
            map.put("MSISDN_TOKEN", dgjx.j(str4, dgjsVar.f));
        }
        String str5 = dgjsVar.d;
        if (!str5.isEmpty()) {
            map.put("GMSCORE_IID_TOKEN", dgjx.j(str5, dgjsVar.f));
        }
        String str6 = dgjsVar.e;
        if (!str6.isEmpty()) {
            map.put("JIBE_ACS_COOKIE", dgjx.j(str6, dgjsVar.f));
        }
        dcpn dcpnVar = this.a;
        Optional optional = dgjsVar.h;
        map.put("PROVISIONING_SESSION_ID", dgjx.j((String) optional.map(new Function() { // from class: dgjv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ejwk.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("unknown"), dgjsVar.f));
        String strB = dcpnVar.b("rcs_provisioning", map, new DroidGuardResultsRequest());
        dgjt dgjtVar = this.b;
        ewcw ewcwVar = (ewcw) ewcy.a.createBuilder();
        int i = true != TextUtils.isEmpty(strB) ? 3 : 4;
        ewcwVar.copyOnWrite();
        ewcy ewcyVar = (ewcy) ewcwVar.instance;
        ewcyVar.c = i - 1;
        ewcyVar.b |= 1;
        dgjtVar.a((ewcy) ewcwVar.build(), optional);
        return strB;
    }

    public final void b(dgjx dgjxVar, ckiz ckizVar) {
        ckizVar.k("Droid-Guard", a(dgjxVar));
        ckizVar.k("Droid-Guard-Salt", ((dgjs) dgjxVar).f);
    }
}
