package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audm {
    public final audj a;

    public audm(audj audjVar) {
        this.a = audjVar;
    }

    public final /* synthetic */ audk a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (audk) evsnVarBuild;
    }

    public final void b(String str) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.c |= 1;
        audkVar.d = str;
    }

    public final void c(aubq aubqVar) {
        aubqVar.getClass();
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.m = aubqVar;
        audkVar.c |= 256;
    }

    public final void d(aubq aubqVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.f = aubqVar;
        audkVar.c |= 8;
    }

    public final void e(aueb auebVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.n = auebVar;
        audkVar.c |= 512;
    }

    public final void f(awso awsoVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.e = awsoVar;
        audkVar.c |= 4;
    }

    public final void g(audo audoVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.j = audoVar;
        audkVar.c |= 32;
    }

    public final void h(audw audwVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.k = audwVar;
        audkVar.c |= 64;
    }

    public final void i(auet auetVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.i = auetVar;
        audkVar.c |= 16;
    }

    public final void j(auid auidVar) {
        audj audjVar = this.a;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        evsy evsyVar = audk.a;
        audkVar.o = auidVar;
        audkVar.c |= 1024;
    }

    public final /* synthetic */ void k(Iterable iterable) {
        this.a.a(iterable);
    }

    public final /* synthetic */ void l(Iterable iterable) {
        this.a.b(iterable);
    }

    public final /* synthetic */ void m() {
        new evsz(((audk) this.a.instance).g, audk.a);
    }

    public final /* synthetic */ void n() {
        DesugarCollections.unmodifiableList(((audk) this.a.instance).h).getClass();
    }
}
