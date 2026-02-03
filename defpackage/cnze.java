package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnze {
    public final cnyl a;

    public cnze(cnyl cnylVar) {
        this.a = cnylVar;
    }

    public final /* synthetic */ cnza a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (cnza) evsnVarBuild;
    }

    public final void b(cnyk cnykVar) {
        cnyl cnylVar = this.a;
        cnylVar.copyOnWrite();
        cnza cnzaVar = (cnza) cnylVar.instance;
        cnza cnzaVar2 = cnza.a;
        cnzaVar.d = cnykVar;
        cnzaVar.b |= 1;
    }

    public final /* synthetic */ void c(Iterable iterable) {
        iterable.getClass();
        cnyl cnylVar = this.a;
        cnylVar.copyOnWrite();
        cnza cnzaVar = (cnza) cnylVar.instance;
        cnza cnzaVar2 = cnza.a;
        cnzaVar.a();
        evpz.addAll(iterable, cnzaVar.c);
    }

    public final /* synthetic */ void d() {
        cnyl cnylVar = this.a;
        cnylVar.copyOnWrite();
        cnza cnzaVar = (cnza) cnylVar.instance;
        cnza cnzaVar2 = cnza.a;
        cnzaVar.c = cnza.emptyProtobufList();
    }

    public final /* synthetic */ void e() {
        DesugarCollections.unmodifiableList(((cnza) this.a.instance).c).getClass();
    }
}
