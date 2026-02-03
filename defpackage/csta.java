package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csta implements cssx {
    private static final cqce c = cqce.g("Bugle", "VerifiedSmsEnabledCheckerImpl");
    private final crqv d;
    private final Context e;
    private final Optional f;
    private final csve g;

    public csta(crqv crqvVar, Context context, Optional optional, csve csveVar) {
        this.d = crqvVar;
        this.e = context;
        this.f = optional;
        this.g = csveVar;
    }

    @Override // defpackage.cssx
    public final eiju a() {
        return byew.a().booleanValue() ? eijx.e(false) : this.g.c().h(new ejvr() { // from class: cssz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                csup csupVar = (csup) obj;
                return Boolean.valueOf(Stream.CC.concat(Collection.EL.stream(DesugarCollections.unmodifiableMap(csupVar.c).values()), Collection.EL.stream(DesugarCollections.unmodifiableMap(csupVar.e).values())).anyMatch(new Predicate() { // from class: cssy
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((csuk) obj2).b.size() > 0;
                    }
                }));
            }
        }, eoqg.a);
    }

    @Override // defpackage.cssx
    public final boolean b() {
        if (!byew.a().booleanValue() && ((Boolean) ccze.R.e()).booleanValue()) {
            crqv crqvVar = this.d;
            Context context = this.e;
            if (crqvVar.q(context.getResources().getString(R.string.vsms_enabled_pref_key), context.getResources().getBoolean(R.bool.vsms_enabled_pref_default))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cssx
    public final boolean c() {
        if (byew.a().booleanValue()) {
            return false;
        }
        if (this.f.isPresent()) {
            c.p("VSMS is not supported on wearable devices.");
            return false;
        }
        if (craf.i(this.e)) {
            c.p("VSMS is not supported for secondary users.");
            return false;
        }
        if (((Boolean) ccze.R.e()).booleanValue()) {
            return true;
        }
        c.p("VSMS is disabled via Phenotype flag.");
        return false;
    }
}
