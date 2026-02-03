package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctat {
    private final ctau a;

    public ctat(ctau ctauVar) {
        this.a = ctauVar;
    }

    public final /* synthetic */ ctav a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (ctav) evsnVarBuild;
    }

    public final /* synthetic */ evwn b() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((ctav) this.a.instance).b);
        listUnmodifiableList.getClass();
        return new evwn(listUnmodifiableList);
    }

    public final /* synthetic */ void c(evwn evwnVar, Iterable iterable) {
        evwnVar.getClass();
        iterable.getClass();
        ctau ctauVar = this.a;
        ctauVar.copyOnWrite();
        ctav ctavVar = (ctav) ctauVar.instance;
        ctav ctavVar2 = ctav.a;
        evtg evtgVar = ctavVar.b;
        if (!evtgVar.c()) {
            ctavVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, ctavVar.b);
    }
}
