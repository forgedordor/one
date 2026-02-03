package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evga {
    public final evfv a;

    public evga(evfv evfvVar) {
        this.a = evfvVar;
    }

    public final /* synthetic */ evfy a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (evfy) evsnVarBuild;
    }

    public final /* synthetic */ evwn b() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((evfy) this.a.instance).f);
        listUnmodifiableList.getClass();
        return new evwn(listUnmodifiableList);
    }

    public final /* synthetic */ void c(Iterable iterable) {
        iterable.getClass();
        evfv evfvVar = this.a;
        evfvVar.copyOnWrite();
        evfy evfyVar = (evfy) evfvVar.instance;
        evfy evfyVar2 = evfy.a;
        evfyVar.a();
        evpz.addAll(iterable, evfyVar.f);
    }

    public final /* synthetic */ void d() {
        evfv evfvVar = this.a;
        evfvVar.copyOnWrite();
        evfy evfyVar = (evfy) evfvVar.instance;
        evfy evfyVar2 = evfy.a;
        evfyVar.f = evfy.emptyProtobufList();
    }
}
