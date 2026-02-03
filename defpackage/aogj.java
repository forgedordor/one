package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogj implements anpj, cqto {
    public static final eksp a = eksp.c("BugleSelfIdentity");
    public final cqtq b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final int f;
    public final String g;
    private final eygg h;
    private cquc i;

    public aogj(fcsu fcsuVar, cqtp cqtpVar, eosc eoscVar, fcsu fcsuVar2, eygg eyggVar, crof crofVar) {
        this.e = fcsuVar;
        this.b = cqtpVar.a(this);
        this.c = eoscVar;
        this.d = fcsuVar2;
        this.h = eyggVar;
        int iA = crofVar.a();
        this.f = iA;
        dggq.a(iA);
        this.g = crofVar.r();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.b.a(new cqtk() { // from class: aoge
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                eksp ekspVar = aogj.a;
                return anpiVar.a();
            }
        }, "EtouffeeEncryptionStateSupplier::register", "EtouffeeEncryptionStateSupplier::callback", "EtouffeeEncryptionStateSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return eijx.h(new eooy() { // from class: aogc
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final aogj aogjVar = this.a;
                return ((chtk) aogjVar.e.b()).f(aogjVar.f).i(new eooz() { // from class: aogh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        aogj aogjVar2 = aogjVar;
                        aubq aubqVar = (aubq) obj;
                        if (aubqVar != null) {
                            return ((bvut) aogjVar2.d.b()).e(aubqVar.d);
                        }
                        eksl ekslVar = (eksl) aogj.a.j();
                        ekslVar.X(cqnc.w, Integer.valueOf(aogjVar2.f));
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "getEtouffeeEnabled", 110, "EtouffeeEncryptionStateSupplier.java")).q("Can not get e2ee status for convo2, identity is missing");
                        return eijx.e(false);
                    }
                }, aogjVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cqto
    public final void fJ() {
        aogb aogbVar = (aogb) this.h.b();
        this.i = aogbVar.a.a(new cqtk() { // from class: aogi
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                final alqm alqmVar = (alqm) obj;
                final aogj aogjVar = this.a;
                return eijx.f(new Runnable() { // from class: aogg
                    @Override // java.lang.Runnable
                    public final void run() {
                        aogj aogjVar2 = aogjVar;
                        chtk chtkVar = (chtk) aogjVar2.e.b();
                        int i = aogjVar2.f;
                        final aubq aubqVarA = chtkVar.a(i);
                        if (aubqVarA == null) {
                            return;
                        }
                        alqm alqmVar2 = alqmVar;
                        if (((Boolean) alqmVar2.e().map(new Function() { // from class: aogd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eksp ekspVar = aogj.a;
                                return Boolean.valueOf(((aubq) obj2).equals(aubqVarA));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(false)).booleanValue()) {
                            eksl ekslVar = (eksl) aogj.a.h();
                            ekslVar.X(cqnc.w, Integer.valueOf(i));
                            ekslVar.X(cqnc.Q, aogjVar2.g);
                            ekslVar.X(cqnc.I, ((aubq) alqmVar2.e().get()).d);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "notifyUpdate", 139, "EtouffeeEncryptionStateSupplier.java")).q("SelfIdentity encryption state changed.");
                            aogjVar2.b.c(new Supplier() { // from class: aogf
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    eksp ekspVar = aogj.a;
                                    return null;
                                }
                            }, "EtouffeeEncryptionStateSupplier::Notify");
                        }
                    }
                }, aogjVar.c);
            }
        }, "EtouffeeEncryptionStateListener::register", "EtouffeeEncryptionStateListener::callback", "EtouffeeEncryptionStateListener::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        cquc cqucVar = this.i;
        if (cqucVar != null) {
            cqucVar.a();
            this.i = null;
        }
    }
}
