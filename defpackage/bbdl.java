package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bbdl {
    private final fcsu a;
    private final fcsu b;

    public bbdl(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Deprecated
    public static boolean k(ParticipantsTable.BindData bindData) {
        return bindData.r() != -2;
    }

    @Deprecated
    public static boolean l(brvp brvpVar) {
        return brvpVar.d != -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b A[Catch: Exception -> 0x018f, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:30:0x012e, B:48:0x018b, B:46:0x0188, B:45:0x0185, B:42:0x0180, B:32:0x0140, B:34:0x0146, B:38:0x0171, B:37:0x016d), top: B:55:0x012e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v17, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [alqm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.brvp r12) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbdl.a(brvp):int");
    }

    @Deprecated
    public final axcy b() {
        axfu axfuVar = (axfu) this.a.b();
        eieu eieuVarK = eiiy.k("getDefaultSubscription");
        try {
            axcy axcyVarD = axfuVar.d(axfuVar.b());
            eieuVarK.close();
            return axcyVarD;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final axcy c(SelfIdentityId selfIdentityId) {
        return ((axfu) this.a.b()).c(selfIdentityId);
    }

    @Deprecated
    public final axcy d() {
        return ((axfu) this.a.b()).e();
    }

    public final axcy e(SelfIdentityId selfIdentityId) {
        return ((axfu) this.a.b()).f(selfIdentityId);
    }

    public final axcy f(int i) {
        return ((axfu) this.a.b()).g(i);
    }

    public final ekgb g() {
        return ekgb.n(h());
    }

    public final List h() {
        return ((axfu) this.a.b()).i();
    }

    public final void i() {
        ((axfu) this.a.b()).o();
    }

    public final boolean j(final alqm alqmVar) {
        return Collection.EL.stream(g()).map(new Function() { // from class: bbdi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((axcy) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: bbdj
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
                return ((Optional) obj).isPresent();
            }
        }).anyMatch(new Predicate() { // from class: bbdk
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
                return ((alqm) ((Optional) obj).get()).equals(alqmVar);
            }
        });
    }
}
