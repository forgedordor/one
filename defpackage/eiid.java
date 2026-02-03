package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiid {
    public static long a = Math.abs(new Random().nextInt()) << 30;
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public static eifp d;

    public static final ejvr a(ejvr ejvrVar) {
        ejvrVar.getClass();
        return new eiia(eidc.e(), ejvrVar);
    }

    public static final ejxr b(final ejxr ejxrVar) {
        final eifn eifnVarE = eidc.e();
        return new ejxr() { // from class: eihk
            @Override // defpackage.ejxr
            public final Object get() {
                long j = eiid.a;
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    return ejxrVar.get();
                } finally {
                }
            }
        };
    }

    public static final eooy c(eooy eooyVar) {
        return new eiht(eidc.e(), eooyVar);
    }

    public static final eooz d(eooz eoozVar) {
        return new eihu(eidc.e(), eoozVar);
    }

    public static final eopl e(final eopl eoplVar) {
        final eifn eifnVarE = eidc.e();
        return new eopl() { // from class: eiho
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                long j = eiid.a;
                eoptVar.getClass();
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    return eoplVar.a(eoptVar, obj);
                } finally {
                }
            }
        };
    }

    public static final eopn f(final eopn eopnVar) {
        final eifn eifnVarE = eidc.e();
        return new eopn() { // from class: eihi
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                long j = eiid.a;
                eoptVar.getClass();
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    return eopnVar.a(eoptVar);
                } finally {
                }
            }
        };
    }

    public static final eopo g(final eopo eopoVar) {
        final eifn eifnVarE = eidc.e();
        return new eopo() { // from class: eihn
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                long j = eiid.a;
                eoptVar.getClass();
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    return eopoVar.a(eoptVar, obj);
                } finally {
                }
            }
        };
    }

    public static final eora h(eora eoraVar) {
        eoraVar.getClass();
        return new eiib(eidc.e(), eoraVar);
    }

    public static final Closeable i(final Closeable closeable) {
        final eifn eifnVarE = eidc.e();
        return new Closeable() { // from class: eihp
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                long j = eiid.a;
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    closeable.close();
                } finally {
                }
            }
        };
    }

    public static final Runnable j(Runnable runnable) {
        return new eihw(v(), runnable);
    }

    public static final Runnable k(Runnable runnable) {
        runnable.getClass();
        eifn eifnVarE = eidc.e();
        fdci fdciVar = new fdci();
        if (eicm.a == 1) {
            int i = eijh.a;
        }
        return new eiic(fdciVar, eifnVarE, runnable);
    }

    public static final Callable l(Callable callable) {
        return new eihv(eidc.e(), callable);
    }

    public static final Callable m(Callable callable) {
        return new eihx(v(), callable);
    }

    public static final void n(Intent intent) {
        intent.getClass();
        if (eifb.a != 1 && !intent.hasExtra("tracing_intent_id")) {
            throw new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        }
    }

    public static final void o(Context context, Intent intent) throws IOException {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        eihr eihrVarT = t(intent2);
        try {
            context.startActivity(intent2);
            fczl.a(eihrVarT, null);
        } finally {
        }
    }

    public static final void p(Context context, Intent intent, Bundle bundle) throws IOException {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        eihr eihrVarT = t(intent2);
        try {
            context.startActivity(intent2, bundle);
            fczl.a(eihrVarT, null);
        } finally {
        }
    }

    public static final boolean q() {
        eifi eifiVarB = eidc.b();
        eifn eifnVar = eifiVarB.c;
        return ((eifnVar == null || fdbq.f(eifnVar, eieo.a)) && eifiVarB.d == null) ? false : true;
    }

    public static final eifn r(Intent intent) {
        return u(intent, false);
    }

    public static final eifn s(Intent intent) {
        return u(intent, true);
    }

    public static final eihr t(Intent intent) {
        long j;
        eifn eifnVarE = eidc.e();
        eifn eifnVarC = eidc.c();
        if (eifnVarC != null) {
            eiez eiezVar = eicf.a;
            eiew eiewVar = eicf.b;
            if (!eifnVarC.j(eiewVar).b()) {
                synchronized (eifnVarC) {
                    if (!eifnVarC.j(eiewVar).b()) {
                        eifnVarC.p(eiewVar, true);
                    }
                }
            }
        }
        HashMap map = b;
        synchronized (map) {
            j = a;
            a = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new eihr(j);
    }

    private static final eifn u(Intent intent, boolean z) {
        eifn eifnVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
            HashMap map = b;
            synchronized (map) {
                eifnVar = (eifn) (z ? map.remove(Long.valueOf(longExtra)) : map.get(Long.valueOf(longExtra)));
            }
            return eifnVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    private static final eifn v() {
        eifi eifiVarB = eidc.b();
        eifn eifnVar = eifiVarB.c;
        if (eifnVar != null && !fdbq.f(eifnVar, eieo.a)) {
            eifn eifnVar2 = eifiVarB.c;
            eifnVar2.getClass();
            return eifnVar2;
        }
        eifn eifnVar3 = eifiVarB.d;
        if (eifnVar3 != null) {
            return eifnVar3;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }
}
