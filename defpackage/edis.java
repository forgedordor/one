package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edis {
    public final edgi a;
    public final lvy b = new lvy();
    public final lvy c = new lvy();
    private final edgc d;
    private final eosc e;
    private final etul f;
    private final edhj g;
    private final ettv h;

    public edis(edgc edgcVar, eosc eoscVar, etul etulVar, edgi edgiVar, edhj edhjVar, ettv ettvVar) {
        this.d = edgcVar;
        this.e = eoscVar;
        this.f = etulVar;
        this.a = edgiVar;
        this.g = edhjVar;
        this.h = ettvVar;
    }

    public final void a() {
        etwb etwbVar = (etwb) etwc.a.createBuilder();
        etwbVar.copyOnWrite();
        etwc etwcVar = (etwc) etwbVar.instance;
        etul etulVar = this.f;
        etulVar.getClass();
        etwcVar.c = etulVar;
        etwcVar.b |= 1;
        ettv ettvVar = this.h;
        if (!ettvVar.equals(ettv.a)) {
            etwbVar.copyOnWrite();
            etwc etwcVar2 = (etwc) etwbVar.instance;
            ettvVar.getClass();
            etwcVar2.d = ettvVar;
            etwcVar2.b |= 2;
        }
        ListenableFuture listenableFutureG = this.d.g((etwc) etwbVar.build());
        edhi edhiVarA = this.g.a(exwf.OBAKE_ART_HOME_CATEGORIES);
        edhiVarA.d();
        eork.r(listenableFutureG, new ediq(this, edhiVarA), this.e);
    }

    public final void b() {
        etvb etvbVar = (etvb) etvc.a.createBuilder();
        etvbVar.copyOnWrite();
        etvc etvcVar = (etvc) etvbVar.instance;
        etul etulVar = this.f;
        etulVar.getClass();
        etvcVar.c = etulVar;
        etvcVar.b |= 1;
        etvbVar.copyOnWrite();
        etvc etvcVar2 = (etvc) etvbVar.instance;
        etvcVar2.b |= 2;
        etvcVar2.d = 48;
        etvbVar.copyOnWrite();
        etvc etvcVar3 = (etvc) etvbVar.instance;
        etvcVar3.b |= 4;
        etvcVar3.e = 9;
        ettv ettvVar = this.h;
        if (!ettvVar.equals(ettv.a)) {
            etvbVar.copyOnWrite();
            etvc etvcVar4 = (etvc) etvbVar.instance;
            ettvVar.getClass();
            etvcVar4.f = ettvVar;
            etvcVar4.b |= 8;
        }
        ListenableFuture listenableFutureD = this.d.d((etvc) etvbVar.build());
        edhi edhiVarA = this.g.a(exwf.OBAKE_ART_HOME_SUGGESTIONS);
        edhiVarA.d();
        eork.r(listenableFutureD, new edir(this, edhiVarA), this.e);
    }
}
