package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjei extends cjcr {
    private final cjdr a;
    private final cjmi b;
    private final cejp c;
    private final fcsu d;

    public cjei(cjmi cjmiVar, cjdr cjdrVar, cejp cejpVar, fcsu fcsuVar) {
        this.b = cjmiVar;
        this.a = cjdrVar;
        this.c = cejpVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cjcr
    public final void b(cjjl cjjlVar, aufe aufeVar) {
        cjib cjibVar = cjjlVar.e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        for (cjij cjijVar : cjibVar.g) {
            aubs aubsVar = (aubs) aubt.a.createBuilder();
            aubv aubvVar = (aubv) aubx.a.createBuilder();
            cjgl cjglVar = cjijVar.c;
            if (cjglVar == null) {
                cjglVar = cjgl.a;
            }
            String str = cjglVar.c;
            aubvVar.copyOnWrite();
            aubx aubxVar = (aubx) aubvVar.instance;
            str.getClass();
            aubxVar.b |= 1;
            aubxVar.c = str;
            cjgl cjglVar2 = cjijVar.c;
            if (cjglVar2 == null) {
                cjglVar2 = cjgl.a;
            }
            String str2 = cjglVar2.d;
            aubvVar.copyOnWrite();
            aubx aubxVar2 = (aubx) aubvVar.instance;
            str2.getClass();
            aubxVar2.b |= 2;
            aubxVar2.d = str2;
            aubx aubxVar3 = (aubx) aubvVar.build();
            aubsVar.copyOnWrite();
            aubt aubtVar = (aubt) aubsVar.instance;
            aubxVar3.getClass();
            aubtVar.c = aubxVar3;
            aubtVar.b |= 1;
            evqs evqsVar = cjijVar.d;
            aubsVar.copyOnWrite();
            aubt aubtVar2 = (aubt) aubsVar.instance;
            evqsVar.getClass();
            aubtVar2.b |= 2;
            aubtVar2.d = evqsVar;
            aufeVar.c((aubt) aubsVar.build());
        }
    }

    @Override // defpackage.cjcr
    public final void c(cjjl cjjlVar, aufe aufeVar) {
        cjgr cjgrVar = cjjlVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        str.getClass();
        aufhVar.c |= 512;
        aufhVar.k = str;
    }

    @Override // defpackage.cjcr
    public final void d(cjjl cjjlVar, aufe aufeVar) {
        cjib cjibVar = cjjlVar.e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        if ((cjibVar.c & 16) != 0) {
            cjib cjibVar2 = cjjlVar.e;
            if (cjibVar2 == null) {
                cjibVar2 = cjib.b;
            }
            eyga eygaVar = cjibVar2.i;
            if (eygaVar == null) {
                eygaVar = eyga.a;
            }
            aufeVar.copyOnWrite();
            aufh aufhVar = (aufh) aufeVar.instance;
            evsy evsyVar = aufh.a;
            eygaVar.getClass();
            aufhVar.l = eygaVar;
            aufhVar.c |= 1024;
        }
    }

    @Override // defpackage.cjcr
    public final void e(cjjl cjjlVar, aufe aufeVar) {
        cjib cjibVar = cjjlVar.e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        cjjw cjjwVar = cjibVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        String str = cjjwVar.c;
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        str.getClass();
        aufhVar.c |= 256;
        aufhVar.j = str;
    }

    @Override // defpackage.cjcr
    public final void f(cjjl cjjlVar, aufe aufeVar) {
        cjgr cjgrVar = cjjlVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjgr cjgrVar2 = cjjlVar.d;
        if (cjgrVar2 == null) {
            cjgrVar2 = cjgr.a;
        }
        cjju cjjuVar = cjgrVar2.d;
        if (cjjuVar == null) {
            cjjuVar = cjju.a;
        }
        aubq aubqVarA = this.b.a(cjgrVar, cjjuVar);
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aubqVarA.getClass();
        aufhVar.f = aubqVarA;
        aufhVar.c |= 8;
    }

    @Override // defpackage.cjcr
    public final void g(cjjl cjjlVar, aufe aufeVar) {
        cjib cjibVar = cjjlVar.e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        Stream stream = Collection.EL.stream(new evsz(cjibVar.k, cjib.a));
        final cjdr cjdrVar = this.a;
        Stream map = stream.map(new Function() { // from class: cjef
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aufg) cjdrVar.fM((cjhb) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        aufeVar.a((Iterable) map.collect(ekcv.a));
    }

    @Override // defpackage.cjcr
    public final void h(cjjl cjjlVar, aufe aufeVar) {
        cjgr cjgrVar = cjjlVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjib cjibVar = cjjlVar.e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        cjju cjjuVar = cjibVar.e;
        if (cjjuVar == null) {
            cjjuVar = cjju.a;
        }
        aubq aubqVarA = this.b.a(cjgrVar, cjjuVar);
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        aubqVarA.getClass();
        aufhVar.d = aubqVarA;
        aufhVar.c |= 1;
    }

    @Override // defpackage.cjcr
    public final void i(cjjl cjjlVar, aufe aufeVar) {
        cjib cjibVar = cjjlVar.e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        evvp evvpVar = cjibVar.h;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        evvpVar.getClass();
        aufhVar.n = evvpVar;
        aufhVar.c |= 2048;
    }

    @Override // defpackage.cjcr
    public final void j(cjjl cjjlVar, aufe aufeVar) {
        auia auiaVar = (auia) auib.a.createBuilder();
        cjlm cjlmVar = cjjlVar.c;
        if (cjlmVar == null) {
            cjlmVar = cjlm.a;
        }
        String str = cjlmVar.c;
        auiaVar.copyOnWrite();
        auib auibVar = (auib) auiaVar.instance;
        str.getClass();
        auibVar.b |= 1;
        auibVar.c = str;
        auib auibVar2 = (auib) auiaVar.build();
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        auibVar2.getClass();
        aufhVar.p = auibVar2;
        aufhVar.c |= 8192;
    }

    @Override // defpackage.cjcr
    public final void k(final aufe aufeVar) {
        if (((aqtb) this.d.b()).a()) {
            return;
        }
        Optional optionalB = this.c.b();
        aufeVar.getClass();
        optionalB.ifPresentOrElse(new Consumer() { // from class: cjeg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                aufe aufeVar2 = aufeVar;
                aubq aubqVar = (aubq) obj;
                aufeVar2.copyOnWrite();
                aufh aufhVar = (aufh) aufeVar2.instance;
                evsy evsyVar = aufh.a;
                aubqVar.getClass();
                aufhVar.h = aubqVar;
                aufhVar.c |= 64;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: cjeh
            @Override // java.lang.Runnable
            public final void run() {
                throw new IllegalArgumentException("RCS self identity is not present.");
            }
        });
    }

    @Override // defpackage.cjcr
    public final void l(aufe aufeVar) {
        elof elofVar = (elof) elpg.b.createBuilder();
        enyw enywVar = enyw.RCS_SMAPI;
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVar.h;
        elpgVar.d |= 2097152;
        elpg elpgVar2 = (elpg) elofVar.build();
        aufeVar.copyOnWrite();
        aufh aufhVar = (aufh) aufeVar.instance;
        evsy evsyVar = aufh.a;
        elpgVar2.getClass();
        aufhVar.o = elpgVar2;
        aufhVar.c |= 4096;
    }
}
