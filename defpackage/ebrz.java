package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebrz {
    public static final /* synthetic */ int d = 0;
    private static final ExecutorService e = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ebrl
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = ebrz.d;
            return new Thread(runnable, "ObservableStateMachineNotifierThread");
        }
    });
    public final ebrt a;
    public final ebrv b;
    public final Set c;
    private final Set f;

    private ebrz(ebrv ebrvVar) {
        ebrvVar.getClass();
        this.b = ebrvVar;
        this.a = new ebrt();
        this.c = new HashSet();
        this.f = new HashSet();
    }

    public static ebrz a(ebrv ebrvVar) {
        ebrz ebrzVar = new ebrz(ebrvVar);
        ebrt ebrtVar = ebrzVar.a;
        ejwl.m(ebrtVar.b(), "already entered the initial state");
        ebrtVar.c(new ebrs(ebrzVar.b.c, null));
        return ebrzVar;
    }

    public static void i(Set set, final ebro ebroVar) {
        Collection.EL.stream(set).forEach(new Consumer() { // from class: ebrj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ebru ebruVar = (ebru) obj;
                int i = ebrz.d;
                try {
                    ebruVar.a(ebroVar);
                } catch (Exception e2) {
                    dhja.i(e2, "exception in ObservableStateMachine.onStateTransition observer", new Object[0]);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final void j(ebrs ebrsVar) {
        ebrt ebrtVar = this.a;
        Set set = this.f;
        final ebro ebroVarC = ebrtVar.c(ebrsVar);
        i(set, ebroVarC);
        e.execute(new Runnable() { // from class: ebrk
            @Override // java.lang.Runnable
            public final void run() {
                ebrz.i(this.a.c, ebroVarC);
            }
        });
    }

    public final Object b(ebsa ebsaVar) {
        return d(null, ebsaVar, null);
    }

    public final Object c(ebrw ebrwVar, ebsa ebsaVar) {
        return d(ebrwVar, ebsaVar, null);
    }

    public final Object d(ebrw ebrwVar, ebsa ebsaVar, ebrw ebrwVar2) {
        h(ebrwVar);
        try {
            Object objB = ebsaVar.b();
            h(ebrwVar2);
            return objB;
        } catch (Exception e2) {
            g(e2);
            if (ebsaVar.a().isInstance(e2)) {
                throw ((Throwable) ebsaVar.a().cast(e2));
            }
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            throw new IllegalStateException("unexpected exception", e2);
        }
    }

    public final void e(ebrr ebrrVar, Map map) {
        ebrrVar.e(new ebrn(this, map));
    }

    public final void f(ebru ebruVar) {
        if (ebruVar instanceof ebrp) {
            this.f.add(ebruVar);
        } else {
            this.c.add(ebruVar);
        }
    }

    public final void g(Throwable th) throws ebrq {
        ebrt ebrtVar = this.a;
        ebrv ebrvVar = this.b;
        ekgp ekgpVar = ebrvVar.b;
        ebrw ebrwVarA = ebrtVar.a();
        Optional optionalEmpty = !ekgpVar.containsKey(ebrwVarA) ? Optional.empty() : Optional.ofNullable((ebrw) ((ebrx) ekgpVar.get(ebrwVarA)).a.get(th.getClass()));
        if (optionalEmpty.isPresent()) {
            h((ebrw) optionalEmpty.get());
        } else {
            j(ebrs.a(ebrvVar.d, th));
        }
    }

    public final void h(ebrw ebrwVar) throws ebrq {
        if (ebrwVar == null) {
            return;
        }
        try {
            ebrv ebrvVar = this.b;
            ebrw ebrwVarA = this.a.a();
            if (!ebrvVar.a(ebrwVar)) {
                ekib ekibVar = ebrvVar.a;
                if (!ekibVar.s(ebrwVarA)) {
                    throw new ebrq(String.format(Locale.US, "unknown transition from[%s] to[%s]", ebrwVarA, ebrwVar));
                }
                if (!ekibVar.y(ebrwVarA, ebrwVar)) {
                    throw new ebrq(String.format(Locale.US, "invalid transition from[%s] -> to[%s]", ebrwVarA, ebrwVar));
                }
            }
            j(new ebrs(ebrwVar, null));
        } catch (ebrq e2) {
            j(ebrs.a(ebrwVar, e2));
        }
    }
}
