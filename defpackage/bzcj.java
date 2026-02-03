package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcj implements bzba {
    private static final eksp b = eksp.c("BugleCms");
    public final aurx a;
    private final fcsu c;
    private final fcsu d;
    private final fdjx e;

    public bzcj(fcsu fcsuVar, aurx aurxVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        aurxVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.a = aurxVar;
        this.d = fcsuVar2;
        this.e = fdjxVar;
    }

    @Override // defpackage.bzba
    public final /* synthetic */ Object a(Map map, bzbz bzbzVar, fcxy fcxyVar) {
        return bzat.a(map);
    }

    @Override // defpackage.bzba
    public final void b(avbk avbkVar, String str, Optional optional, String str2, bzbz bzbzVar) {
        avbkVar.getClass();
        ekrw ekrwVarO = b.o();
        ekrwVarO.X(bzmz.c, str);
        bzch bzchVar = bzbzVar.b;
        ekrwVarO.X(bzmz.d, bzchVar.a);
        ekrwVarO.X(bzmz.p, Integer.valueOf(bzchVar.b));
        ekrwVarO.X(cqnc.r, str2);
        ekrwVarO.q("Processed CMS conversation backup");
    }

    @Override // defpackage.bzba
    public final Object c(String str, String str2) {
        eksl ekslVar = (eksl) b.h();
        ekslVar.X(bzmz.c, str);
        ekslVar.q("Attempting to recover from ALREADY_EXISTS error for a conversation");
        return bzau.a;
    }

    @Override // defpackage.bzba
    public final Object d(Map map) {
        Object objA;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = ((eqjv) entry.getValue()).c;
            str.getClass();
            if (TextUtils.isEmpty(str) || linkedHashSet.contains(str)) {
                eksl ekslVar = (eksl) b.j();
                ekslVar.X(bzmz.h, str);
                ekslVar.q("Invalid conversationId contained in batch create request.");
                if (TextUtils.isEmpty(str)) {
                    ((ains) this.d.b()).e("Bugle.Cms.Conversations.BatchInsert.InvalidId.Count", 1);
                } else if (linkedHashSet.contains(str)) {
                    ((ains) this.d.b()).e("Bugle.Cms.Conversations.BatchInsert.InvalidId.Count", 2);
                } else {
                    ((ains) this.d.b()).e("Bugle.Cms.Conversations.BatchInsert.InvalidId.Count", 0);
                }
                objA = fctl.a(new bzav((String) entry.getKey()));
            } else {
                linkedHashSet.add(str);
                objA = entry.getValue();
            }
            linkedHashMap.put(key, new fctk(objA));
        }
        return linkedHashMap;
    }

    @Override // defpackage.bzba
    public final void e(avbk avbkVar, String str, bzbz bzbzVar) {
        avbkVar.getClass();
        eksl ekslVar = (eksl) b.j();
        bzch bzchVar = bzbzVar.b;
        ekslVar.X(bzmz.d, bzchVar.a);
        ekslVar.X(bzmz.c, str);
        ekslVar.X(bzmz.p, Integer.valueOf(bzchVar.b));
        ekslVar.q("Failure while processing Cms Conversation.");
    }

    @Override // defpackage.bzba
    public final void f(List list, bzbz bzbzVar) {
        if (cpyl.a() && ((apow) this.c.b()).a() && cpxz.b(bzbzVar.c)) {
            auvw.k(this.e, null, null, new bzci(this, list, null), 3);
        }
    }
}
