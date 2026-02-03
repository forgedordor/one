package defpackage;

import j$.util.Optional;
import java.security.InvalidParameterException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajoe implements ajox {
    public static final cqce a = cqce.g("BugleContacts", "BugleContactPager");
    public final ajoy b;
    final AtomicReference c = new AtomicReference(Optional.empty());
    private final eosc d;

    public ajoe(eosc eoscVar, ajoy ajoyVar) {
        this.d = eoscVar;
        this.b = ajoyVar;
    }

    @Override // defpackage.ajox
    public final ajow a(Integer num) {
        return new ajob(num.intValue());
    }

    public final eiju b(final eiju eijuVar, final eiju eijuVar2, final int i) {
        return eiju.g(eika.d(eijuVar, eijuVar2).a(new Callable() { // from class: ajoc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ajpp((ekgb) eork.q(eijuVar), Math.min(((Integer) eork.q(eijuVar2)).intValue(), i), Math.max((r0 - r1) - r2.size(), 0));
            }
        }, this.d));
    }

    @Override // defpackage.ajox
    public final eiju c(ajow ajowVar, int i) {
        eieu eieuVarK = eiiy.k("BugleContactPager#loadAppend");
        try {
            f();
            if (i <= 0) {
                throw new InvalidParameterException(String.format("paging limit must be positive, found %d", Integer.valueOf(i)));
            }
            if (!(ajowVar instanceof ajpo)) {
                throw new InvalidParameterException("wrong PagingKey type, expecting OffsetPagingKey");
            }
            int iA = ((ajpo) ajowVar).a();
            if (iA < 0) {
                throw new InvalidParameterException(String.format("offset of paging key can't be negative, found %d", Integer.valueOf(iA)));
            }
            ajoy ajoyVar = this.b;
            eiju eijuVarB = b(ajoyVar.d(iA, i), ajoyVar.f(), iA);
            eieuVarK.b(eijuVarB);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajox
    public final eiju d(ajow ajowVar, int i) {
        eiju eijuVarB;
        eieu eieuVarK = eiiy.k("BugleContactPager#loadInitial");
        try {
            Optional optional = (Optional) this.c.getAndSet(Optional.empty());
            if (i <= 0) {
                throw new InvalidParameterException(String.format("paging limit must be positive, found %d", Integer.valueOf(i)));
            }
            if (ajowVar == null) {
                if (optional.isPresent() && ((ajod) optional.get()).a == i) {
                    a.p("returning existing preload contacts state and skipping the query");
                    eijuVarB = ((ajod) optional.get()).b;
                    eieuVarK.b(eijuVarB);
                } else {
                    ajoy ajoyVar = this.b;
                    eijuVarB = b(ajoyVar.d(0, i), ajoyVar.f(), 0);
                    eieuVarK.b(eijuVarB);
                }
            } else {
                if (!(ajowVar instanceof ajpo)) {
                    throw new InvalidParameterException("wrong PagingKey type, expecting OffsetPagingKey");
                }
                int iA = ((ajpo) ajowVar).a();
                if (iA < 0) {
                    throw new InvalidParameterException(String.format("offset of paging key can't be negative, found %d", Integer.valueOf(iA)));
                }
                int iMax = Math.max(iA - (i >> 1), 0);
                ajoy ajoyVar2 = this.b;
                eijuVarB = b(ajoyVar2.d(iMax, i), ajoyVar2.f(), iMax);
                eieuVarK.b(eijuVarB);
            }
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajox
    public final eiju e(ajow ajowVar, int i) {
        eieu eieuVarK = eiiy.k("BugleContactPager#loadPrepend");
        try {
            f();
            int i2 = 0;
            if (i <= 0) {
                throw new InvalidParameterException(String.format("paging limit must be positive, found %d", Integer.valueOf(i)));
            }
            if (!(ajowVar instanceof ajpo)) {
                throw new InvalidParameterException("wrong PagingKey type, expecting OffsetPagingKey");
            }
            int iA = ((ajpo) ajowVar).a();
            if (iA < 0) {
                throw new InvalidParameterException(String.format("offset of paging key can't be negative, found %d", Integer.valueOf(iA)));
            }
            int i3 = (iA - i) + 1;
            if (i3 < 0) {
                i = iA + 1;
            } else {
                i2 = i3;
            }
            ajoy ajoyVar = this.b;
            eiju eijuVarB = b(ajoyVar.d(i2, i), ajoyVar.f(), i2);
            eieuVarK.b(eijuVarB);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        a.p("cleaning up contacts preloaded state");
        this.c.set(Optional.empty());
    }
}
