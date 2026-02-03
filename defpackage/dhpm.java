package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpm implements dhpl {
    private final Optional a;
    private final Map b;

    public dhpm(Optional optional, Map map) {
        this.a = optional;
        this.b = map;
    }

    private final dhuy d(String str) {
        dhuy dhuyVar = (dhuy) this.b.get(str);
        if (dhuyVar != null) {
            return dhuyVar;
        }
        fcsu fcsuVar = (fcsu) fdct.b(this.a);
        dhuy dhuyVar2 = fcsuVar != null ? (dhuy) fcsuVar.b() : null;
        return dhuyVar2 == null ? dhuy.a : dhuyVar2;
    }

    @Override // defpackage.dhpl
    public final sfj a(String str) {
        dhuy dhuyVarD = d(str);
        sfi sfiVar = (sfi) sfj.a.createBuilder();
        sfiVar.getClass();
        DesugarCollections.unmodifiableList(((sfj) sfiVar.instance).b).getClass();
        Set set = dhuyVarD.b;
        sfiVar.copyOnWrite();
        sfj sfjVar = (sfj) sfiVar.instance;
        evtg evtgVar = sfjVar.b;
        if (!evtgVar.c()) {
            sfjVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(set, sfjVar.b);
        evsn evsnVarBuild = sfiVar.build();
        evsnVarBuild.getClass();
        return (sfj) evsnVarBuild;
    }

    @Override // defpackage.dhpl
    public final dhvj b(String str) {
        return d(str).c;
    }

    @Override // defpackage.dhpl
    public final boolean c(String str) {
        return d(str).e;
    }
}
