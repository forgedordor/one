package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfew implements cfrj {
    public final crny a;
    public final crmx b;
    public final cqpz c;
    private final eosc d;
    private final cfgs e;
    private final ceop f;
    private String g = "";
    private long h = 0;

    public cfew(eosc eoscVar, cfgs cfgsVar, ceop ceopVar, crny crnyVar, crmx crmxVar, cqpz cqpzVar) {
        this.d = eoscVar;
        this.e = cfgsVar;
        this.f = ceopVar;
        this.a = crnyVar;
        this.b = crmxVar;
        this.c = cqpzVar;
    }

    public static ezle m(String str) {
        ezld ezldVar = (ezld) ezle.a.createBuilder();
        String upperCase = str.toUpperCase(Locale.US);
        ezldVar.copyOnWrite();
        ezle ezleVar = (ezle) ezldVar.instance;
        upperCase.getClass();
        ezleVar.c = upperCase;
        ezldVar.copyOnWrite();
        ((ezle) ezldVar.instance).b = 2;
        return (ezle) ezldVar.build();
    }

    public static final ListenableFuture n(cezv cezvVar, ezlf ezlfVar) {
        eyzg eyzgVarA = cezvVar.b().a();
        fbnd fbndVar = eyzgVarA.a;
        fbrk fbrkVarA = eyzh.b;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.b;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "RegisterAnonymous");
                    fbrhVarA.b();
                    ezlf ezlfVar2 = ezlf.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezlfVar2);
                    fbrhVarA.b = new fcrh(ezlh.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.b = fbrkVarA;
                }
            }
        }
        return fcrw.a(fbndVar.a(fbrkVarA, eyzgVarA.b), ezlfVar);
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.h;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return cfrh.c;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(final ezpp ezppVar) {
        this.g = ezppVar.c;
        cfgr cfgrVarA = this.e.a();
        cfgrVarA.j();
        final ceop ceopVar = this.f;
        ceopVar.getClass();
        cfgrVarA.m(new Callable() { // from class: cfeu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Callable callable = new Callable() { // from class: ceok
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fgvz.a();
                    }
                };
                final ceop ceopVar2 = ceopVar;
                eosc eoscVar = ceopVar2.c;
                return eijx.g(callable, eoscVar).i(new eooz() { // from class: ceol
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final fgwc fgwcVar = (fgwc) obj;
                        ceuk ceukVar = (ceuk) ceopVar2.b.b();
                        final byte[] bArrA = fgwcVar.a.a();
                        final byte[] bArr = fgwcVar.b.a;
                        eiju eijuVarJ = ceukVar.a.j(new ejvr() { // from class: cetz
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cetb cetbVar = (cetb) ((cetc) obj2).toBuilder();
                                evqs evqsVarX = evqs.x(bArrA);
                                cetbVar.copyOnWrite();
                                ((cetc) cetbVar.instance).e = evqsVarX;
                                evqs evqsVarX2 = evqs.x(bArr);
                                cetbVar.copyOnWrite();
                                ((cetc) cetbVar.instance).f = evqsVarX2;
                                return (cetc) cetbVar.build();
                            }
                        });
                        ejvr ejvrVar = new ejvr() { // from class: ceua
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        return eijuVarJ.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: ceoj
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return Optional.of(fgwcVar);
                            }
                        }, eoqgVar);
                    }
                }, eoscVar);
            }
        });
        return eika.j(cfgrVarA.b(), new ejvr() { // from class: cfev
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezle ezleVarM;
                String strP;
                ezlc ezlcVar = (ezlc) ezlf.a.createBuilder();
                ezlcVar.copyOnWrite();
                ezlf ezlfVar = (ezlf) ezlcVar.instance;
                ezpp ezppVar2 = ezppVar;
                ezppVar2.getClass();
                ezlfVar.c = ezppVar2;
                ezlfVar.b |= 1;
                ezlcVar.copyOnWrite();
                ((ezlf) ezlcVar.instance).d = "Bugle";
                ezlcVar.copyOnWrite();
                ezlf ezlfVar2 = (ezlf) ezlcVar.instance;
                ezlj ezljVar = (ezlj) ((ezli) obj).build();
                ezljVar.getClass();
                ezlfVar2.e = ezljVar;
                ezlfVar2.b |= 2;
                cfew cfewVar = this.a;
                crof crofVarJ = cfewVar.a.j();
                if (cfewVar.b.F() || (strP = crofVarJ.p()) == null) {
                    String strE = cfewVar.c.e("device_country", "unknown");
                    if (strE.length() == 2) {
                        ezleVarM = cfew.m(strE);
                    } else {
                        String strT = crofVarJ.t(Locale.US);
                        ezleVarM = !TextUtils.isEmpty(strT) ? cfew.m(strT) : null;
                    }
                } else {
                    ezleVarM = cfew.m(strP);
                }
                if (ezleVarM != null) {
                    ezlcVar.copyOnWrite();
                    ezlf ezlfVar3 = (ezlf) ezlcVar.instance;
                    ezlfVar3.f = ezleVarM;
                    ezlfVar3.b |= 4;
                }
                return (ezlf) ezlcVar.build();
            }
        }, this.d);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        return n(cezvVar, (ezlf) evuhVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezlh ezlhVar = (ezlh) evuhVar;
        if (ezlhVar != null) {
            ezpr ezprVar = ezlhVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.h = j;
        return eork.i(ezlhVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RegisterAnonymousRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.g;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
