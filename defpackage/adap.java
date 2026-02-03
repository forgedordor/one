package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adap {
    public final Set a;
    private final Map b;

    public adap(Map map, Set set) {
        this.b = map;
        this.a = set;
    }

    public final adao a(acyx acyxVar, Map map, String str) {
        adan adanVarAk = adao.ak();
        adanVarAk.b(acyxVar);
        adanVarAk.e(acxp.a(acyxVar));
        adanVarAk.l(acxp.c(acyxVar));
        adaj adajVar = (adaj) adanVarAk;
        adajVar.v = (bbew) map.get(((acys) acyxVar).d);
        adanVarAk.c(TextUtils.equals(acyxVar.al("conversation_contains_vsms_participant"), "1"));
        adanVarAk.d(acyxVar.am());
        adajVar.C = str;
        adajVar.I = null;
        Iterator it = b(acyxVar).iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).d(adanVarAk, acyxVar);
        }
        return adanVarAk.a();
    }

    public final Collection b(acyx acyxVar) {
        if (acyxVar.t() != akbl.c) {
            return ((ekgp) this.b).values();
        }
        Map map = this.b;
        adaq adaqVar = (adaq) map.get(adar.SNIPPET);
        adaqVar.getClass();
        adaq adaqVar2 = (adaq) map.get(adar.AVATAR);
        adaqVar2.getClass();
        adaq adaqVar3 = (adaq) map.get(adar.NAME);
        adaqVar3.getClass();
        adaq adaqVar4 = (adaq) map.get(adar.STATUS);
        adaqVar4.getClass();
        adaq adaqVar5 = (adaq) map.get(adar.TIMESTAMP);
        adaqVar5.getClass();
        adaq adaqVar6 = (adaq) map.get(adar.CONTENT_DESCRIPTION);
        adaqVar6.getClass();
        return ekgb.w(adaqVar, adaqVar2, adaqVar3, adaqVar4, adaqVar5, adaqVar6);
    }
}
