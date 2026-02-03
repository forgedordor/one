package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aude {
    public final audb a;

    public aude(audb audbVar) {
        this.a = audbVar;
    }

    public final /* synthetic */ audc a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (audc) evsnVarBuild;
    }

    public final void b(String str) {
        str.getClass();
        audb audbVar = this.a;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        evsy evsyVar = audc.a;
        audcVar.d |= 1;
        audcVar.e = str;
    }

    public final void c(aubq aubqVar) {
        aubqVar.getClass();
        audb audbVar = this.a;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        evsy evsyVar = audc.a;
        audcVar.t = aubqVar;
        audcVar.d |= 4096;
    }

    public final void d(aucv aucvVar) {
        audb audbVar = this.a;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        evsy evsyVar = audc.a;
        audcVar.s = aucvVar;
        audcVar.d |= 2048;
    }

    public final void e(awso awsoVar) {
        audb audbVar = this.a;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        evsy evsyVar = audc.a;
        audcVar.f = awsoVar;
        audcVar.d |= 4;
    }

    public final void f(String str) {
        audb audbVar = this.a;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        evsy evsyVar = audc.a;
        audcVar.d |= 256;
        audcVar.p = str;
    }

    public final /* synthetic */ void g(aubq aubqVar) {
        aubqVar.getClass();
        this.a.f(aubqVar);
    }

    public final void h() {
        audb audbVar = this.a;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        evsy evsyVar = audc.a;
        audcVar.d |= 128;
        audcVar.o = true;
    }

    public final /* synthetic */ void i() {
        DesugarCollections.unmodifiableList(((audc) this.a.instance).h).getClass();
    }
}
