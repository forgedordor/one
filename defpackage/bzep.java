package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzep implements bzba {
    public static final eksp a = eksp.c("BugleCms");
    public final aurx b;
    public final cpuk c;
    public final bzrq d;
    private final fdjx e;
    private final fcyh f;
    private final fdjx g;
    private final fcsu h;

    public bzep(fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2, fcsu fcsuVar, aurx aurxVar, cpuk cpukVar, bzrq bzrqVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        aurxVar.getClass();
        bzrqVar.getClass();
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.g = fdjxVar2;
        this.h = fcsuVar;
        this.b = aurxVar;
        this.c = cpukVar;
        this.d = bzrqVar;
    }

    @Override // defpackage.bzba
    public final /* synthetic */ Object a(Map map, bzbz bzbzVar, fcxy fcxyVar) {
        return bzat.a(map);
    }

    @Override // defpackage.bzba
    public final void b(avbk avbkVar, String str, Optional optional, String str2, bzbz bzbzVar) throws IOException {
        avbkVar.getClass();
        eieu eieuVarH = eiiy.h("CmsParticipantsBackupDelegate.onSuccess");
        try {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(bzmz.c, str);
            ekrz ekrzVar = bzmz.d;
            bzch bzchVar = bzbzVar.b;
            ekrwVarO.X(ekrzVar, bzchVar.a);
            ekrwVarO.X(bzmz.p, Integer.valueOf(bzchVar.b));
            ekrwVarO.X(cqnc.p, str2);
            ekrwVarO.q("Processed CMS participant backup");
            auvw.k(this.e, this.f, null, new bzeo(this, str, str2, bzbzVar, null), 2);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.bzba
    public final Object c(String str, String str2) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.c, str);
        ekslVar.q("Recovering from ALREADY_EXISTS error for participant");
        return bzau.a;
    }

    @Override // defpackage.bzba
    public final Object d(Map map) {
        Object value;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = ((eqnl) entry.getValue()).c;
            str.getClass();
            if (linkedHashSet.contains(str)) {
                eksl ekslVar = (eksl) a.j();
                ekslVar.X(bzmz.c, str);
                ekslVar.q("Invalid participantId contained in batch create request.");
                value = fctl.a(new bzav((String) entry.getKey()));
            } else {
                linkedHashSet.add(str);
                value = entry.getValue();
            }
            linkedHashMap.put(key, new fctk(value));
        }
        return linkedHashMap;
    }

    @Override // defpackage.bzba
    public final void e(avbk avbkVar, String str, bzbz bzbzVar) {
        avbkVar.getClass();
        eksl ekslVar = (eksl) a.j();
        bzch bzchVar = bzbzVar.b;
        ekslVar.X(bzmz.d, bzchVar.a);
        ekslVar.X(bzmz.c, str);
        ekslVar.X(bzmz.p, Integer.valueOf(bzchVar.b));
        ekslVar.q("Failure while processing CmsParticipant.");
    }

    @Override // defpackage.bzba
    public final void f(List list, bzbz bzbzVar) {
        if (cpyl.a() && ((apow) this.h.b()).a() && cpxz.b(bzbzVar.c)) {
            auvw.k(this.g, null, null, new bzen(this, list, null), 3);
        }
    }
}
