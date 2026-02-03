package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgoz {
    public final Context a;
    public final cgqm b;
    public final alrj c;
    public final cpbn d;
    public final baik e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    private final cgph l;
    private final cssf m;
    private final crlw n;

    public cgoz(Context context, cgph cgphVar, cgqm cgqmVar, alrj alrjVar, cpbn cpbnVar, baik baikVar, fcsu fcsuVar, cssf cssfVar, crlw crlwVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.a = context;
        this.l = cgphVar;
        this.b = cgqmVar;
        this.c = alrjVar;
        this.d = cpbnVar;
        this.e = baikVar;
        this.f = fcsuVar;
        this.m = cssfVar;
        this.n = crlwVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
    }

    public final bajg a(bajf bajfVar) {
        return new bajg(Integer.valueOf(bajfVar.Q() ? this.n.g().a : this.n.b()), bajfVar.o(), (String) bajfVar.k().map(new Function() { // from class: cgow
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczv cczvVar = alvx.a;
                return ((alqm) obj).p(((Boolean) new alvp().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null));
    }

    public final cgko b(CharSequence charSequence, bajf bajfVar, baea baeaVar) throws Resources.NotFoundException {
        cglt cgltVarE;
        String strZ;
        if (!baeaVar.Z()) {
            CharSequence charSequence2 = (CharSequence) Objects.requireNonNullElse(charSequence, "");
            long jI = baeaVar.i();
            cggv cggvVar = new cggv();
            cggvVar.a = Optional.empty();
            cggvVar.b(charSequence2);
            cggvVar.c(jI);
            cggvVar.b = Optional.empty();
            cggvVar.c = Optional.empty();
            return cggvVar;
        }
        boolean zQ = bajfVar.Q();
        ejwl.l(baeaVar.Z());
        cssf cssfVar = this.m;
        String strD = cssfVar.d(baeaVar.C());
        if (baeaVar.u() == bvdz.VERIFICATION_IN_PROGRESS) {
            cgltVarE = cglt.e(this.a.getString(R.string.im_notification_verifying_sender_suffix, strD), baeaVar.m(), baeaVar.n());
        } else {
            if (TextUtils.isEmpty(strD)) {
                cczv cczvVar = alvx.a;
                if (((Boolean) new alvb().get()).booleanValue()) {
                    strZ = baeaVar.as().a;
                    strZ.getClass();
                } else {
                    strZ = baeaVar.z();
                }
                strD = cssfVar.d(strZ);
                if (TextUtils.isEmpty(strD)) {
                    strD = this.a.getString(R.string.unknown_sender);
                }
            }
            String strG = null;
            if (TextUtils.isEmpty(baeaVar.C()) && TextUtils.isEmpty(baeaVar.B())) {
                bdxm bdxmVar = baeaVar.b;
                strG = bdxmVar != null ? bdxmVar.g() : baeaVar.a.g();
            }
            if (!TextUtils.isEmpty(strG)) {
                if (zQ) {
                    strD = strD + " " + chsk.a(strG);
                } else {
                    strD = cssfVar.d(chsk.a(strG));
                }
            }
            if (!zQ) {
                strD = cssfVar.d(strD);
            }
            cgltVarE = cglt.e(strD, baeaVar.m(), baeaVar.n());
        }
        return cgkp.f(cgltVarE, (CharSequence) Objects.requireNonNullElse(charSequence, ""), baeaVar.h());
    }

    public final CharSequence c(bajf bajfVar, baea baeaVar) {
        Context context = this.a;
        String strG = baeaVar.G(context);
        CharSequence charSequence = ((cglx) this.l.a(context, baeaVar, bajfVar.Q(), bajfVar.Q() ? bajfVar.o() : null)).b;
        return charSequence != null ? charSequence : strG;
    }

    public final String d(bajf bajfVar, ekgb ekgbVar) {
        String strO = bajfVar.o();
        if (bajfVar.Q() || ekgbVar.isEmpty()) {
            return this.m.d(ejwk.b(strO));
        }
        baea baeaVar = (baea) Collection.EL.stream(ekgbVar.a()).filter(new Predicate() { // from class: cgox
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
            public final boolean test(Object obj) {
                return ((baea) obj).Z();
            }
        }).findFirst().orElse(null);
        if (baeaVar == null) {
            return this.m.d(ejwk.b(strO));
        }
        String strC = baeaVar.C();
        if (TextUtils.isEmpty(strC) && baeaVar.Z()) {
            cczv cczvVar = alvx.a;
            if (((Boolean) new alvb().get()).booleanValue()) {
                strC = baeaVar.as().a;
                strC.getClass();
            } else {
                strC = baeaVar.z();
            }
        }
        return this.m.d(ejwk.b((String) Objects.requireNonNullElse(strC, strO)));
    }
}
