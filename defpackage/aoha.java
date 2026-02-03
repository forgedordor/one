package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoha implements aogn {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/profile/ProfileUpdateExtensionImpl");
    public final fcyh a;
    public final fcsu b;
    public final anur c;
    private final Context e;
    private final fdjx f;
    private final fdjx g;
    private final aoho h;

    public aoha(Context context, anur anurVar, fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2, fcsu fcsuVar, aoho aohoVar) {
        context.getClass();
        anurVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        aohoVar.getClass();
        this.e = context;
        this.c = anurVar;
        this.f = fdjxVar;
        this.a = fcyhVar;
        this.g = fdjxVar2;
        this.b = fcsuVar;
        this.h = aohoVar;
    }

    @Override // defpackage.aogn
    public final eiju a(aoer aoerVar, Optional optional) {
        optional.getClass();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.g, eicg.a(fcyiVar), fdjzVar, new aogx(null, this, aoerVar, optional)));
    }

    @Override // defpackage.aogn
    public final eiju b(aofc aofcVar, Optional optional) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.g, eicg.a(fcyiVar), fdjzVar, new aogz(null, this, aofcVar, optional)));
    }

    @Override // defpackage.aogn
    public final Optional c(final aoer aoerVar, final Optional optional) {
        final fdap fdapVar = new fdap() { // from class: aogr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                aohi aohiVar = (aohi) this.a.b.b();
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) optional.get();
                fcsu fcsuVar = aohiVar.a;
                fcsu fcsuVar2 = aohiVar.b;
                fcsu fcsuVar3 = aohiVar.c;
                SelfIdentityId selfIdentityIdH = aoerVar.h();
                cogw cogwVar = (cogw) fcsuVar3.b();
                cogwVar.getClass();
                fdjx fdjxVar = (fdjx) aohiVar.d.b();
                fdjxVar.getClass();
                Optional optionalA = aohc.a(bindData.v());
                Optional optionalA2 = aohc.a(bindData.q());
                boolean z = bindData.q() != null ? !cqmz.v(bindData.q()) : true;
                boolean zD = bindData.D();
                boolean z2 = !fdbq.f(aohc.a(bindData.v()), Optional.empty());
                boolean zF = bindData.F();
                evvp evvpVar = evvp.a;
                evvpVar.getClass();
                return Optional.of(new aohh(optionalA, optionalA2, z, zD, z2, 4, selfIdentityIdH, zF, evvpVar, bindData, fcsuVar, fcsuVar2, cogwVar, fdjxVar));
            }
        };
        Object objOrElseGet = optional.map(new Function() { // from class: aogs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aogt
            @Override // java.util.function.Supplier
            public final Object get() {
                return Optional.empty();
            }
        });
        objOrElseGet.getClass();
        return (Optional) objOrElseGet;
    }

    @Override // defpackage.aogn
    public final Optional d(final aoer aoerVar, final Optional optional) {
        final fdap fdapVar = new fdap() { // from class: aogo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                aohi aohiVar = (aohi) this.a.b.b();
                btzd btzdVar = (btzd) optional.get();
                fcsu fcsuVar = aohiVar.a;
                fcsu fcsuVar2 = aohiVar.b;
                fcsu fcsuVar3 = aohiVar.c;
                SelfIdentityId selfIdentityIdH = aoerVar.h();
                cogw cogwVar = (cogw) fcsuVar3.b();
                cogwVar.getClass();
                fdjx fdjxVar = (fdjx) aohiVar.d.b();
                fdjxVar.getClass();
                Optional optionalA = aohc.a(btzdVar.p());
                Optional optionalA2 = aohc.a(btzdVar.n());
                boolean z = btzdVar.n() != null ? !cqmz.v(btzdVar.n()) : true;
                boolean zQ = btzdVar.q();
                boolean z2 = !fdbq.f(aohc.a(btzdVar.p()), Optional.empty());
                boolean zR = btzdVar.r();
                evvp evvpVar = evvp.a;
                evvpVar.getClass();
                return Optional.of(new aohh(optionalA, optionalA2, z, zQ, z2, 4, selfIdentityIdH, zR, evvpVar, null, fcsuVar, fcsuVar2, cogwVar, fdjxVar));
            }
        };
        Object objOrElseGet = optional.map(new Function() { // from class: aogp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aogq
            @Override // java.util.function.Supplier
            public final Object get() {
                return Optional.empty();
            }
        });
        objOrElseGet.getClass();
        return (Optional) objOrElseGet;
    }

    @Override // defpackage.aogn
    public final Object e(ParticipantsTable.BindData bindData, fcxy fcxyVar) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return fdin.b(this.f, eicg.a(fcyiVar), fdjzVar, new aogv(null, this, bindData)).c(fcxyVar);
    }

    @Override // defpackage.aogn
    public final Object f(axcm axcmVar, fcxy fcxyVar) {
        return this.h.a(axcmVar, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aoha] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:24:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aofc r6, j$.util.Optional r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aogu
            if (r0 == 0) goto L13
            r0 = r8
            aogu r0 = (defpackage.aogu) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            aogu r0 = new aogu
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.c
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            j$.util.Optional r4 = r0.g
            defpackage.fctl.b(r8)
            goto L8e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            j$.util.Optional r7 = r0.g
            defpackage.fctl.b(r8)
            goto L58
        L40:
            defpackage.fctl.b(r8)
            anpj r6 = r6.d()
            eiju r6 = r6.b()
            r6.getClass()
            r0.g = r7
            r0.f = r4
            java.lang.Object r8 = defpackage.fdxs.c(r6, r0)
            if (r8 == r1) goto Lb7
        L58:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r8, r2)
            r6.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r7 = r8
        L6e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L95
            java.lang.Object r8 = r7.next()
            aoer r8 = (defpackage.aoer) r8
            r8.getClass()
            r0.g = r4
            r0.a = r6
            r0.b = r7
            r0.c = r6
            r0.f = r3
            java.lang.Object r8 = r5.h(r8, r4, r0)
            if (r8 == r1) goto Lb7
            r2 = r6
        L8e:
            j$.util.Optional r8 = (j$.util.Optional) r8
            r6.add(r8)
            r6 = r2
            goto L6e
        L95:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r6.next()
            j$.util.Optional r8 = (j$.util.Optional) r8
            java.lang.Object r8 = defpackage.fdct.b(r8)
            aofd r8 = (defpackage.aofd) r8
            if (r8 == 0) goto L9e
            r7.add(r8)
            goto L9e
        Lb6:
            return r7
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoha.g(aofc, j$.util.Optional, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:13:0x0038, B:40:0x00cb, B:42:0x011c, B:44:0x012a, B:46:0x0148, B:48:0x0159, B:47:0x0154, B:18:0x004b, B:33:0x00b2, B:35:0x00b6, B:37:0x00bb, B:30:0x008a), top: B:55:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:13:0x0038, B:40:0x00cb, B:42:0x011c, B:44:0x012a, B:46:0x0148, B:48:0x0159, B:47:0x0154, B:18:0x004b, B:33:0x00b2, B:35:0x00b6, B:37:0x00bb, B:30:0x008a), top: B:55:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:13:0x0038, B:40:0x00cb, B:42:0x011c, B:44:0x012a, B:46:0x0148, B:48:0x0159, B:47:0x0154, B:18:0x004b, B:33:0x00b2, B:35:0x00b6, B:37:0x00bb, B:30:0x008a), top: B:55:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.aoer r28, j$.util.Optional r29, defpackage.fcxy r30) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoha.h(aoer, j$.util.Optional, fcxy):java.lang.Object");
    }
}
