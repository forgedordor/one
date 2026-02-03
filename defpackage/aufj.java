package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aufj {
    public final aufe a;

    public aufj(aufe aufeVar) {
        this.a = aufeVar;
    }

    public final /* synthetic */ aufh a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (aufh) evsnVarBuild;
    }

    public final /* synthetic */ evwn b() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aufh) this.a.instance).m);
        listUnmodifiableList.getClass();
        return new evwn(listUnmodifiableList);
    }

    public final void c(eyga eygaVar) {
        aufe aufeVar = this.a;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aufhVar.l = eygaVar;
        aufhVar.c |= 1024;
    }

    public final void d(awso awsoVar) {
        aufe aufeVar = this.a;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aufhVar.g = awsoVar;
        aufhVar.c |= 32;
    }

    public final void e(axfx axfxVar) {
        aufe aufeVar = this.a;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aufhVar.i = axfxVar;
        aufhVar.c |= 128;
    }

    public final void f(awky awkyVar) {
        aufe aufeVar = this.a;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aufhVar.e = awkyVar;
        aufhVar.c |= 4;
    }

    public final /* synthetic */ void g(aubt aubtVar) {
        this.a.c(aubtVar);
    }

    public final /* synthetic */ void h() {
        aufe aufeVar = this.a;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aufhVar.m = aufh.emptyProtobufList();
    }
}
