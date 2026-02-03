package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqt implements zqm {
    public final fduf a;
    private final apwf b;
    private final fdjx c;
    private final efwo d;
    private final fcsu e;
    private Boolean f;

    public zqt(apwf apwfVar, fdjx fdjxVar, fcyh fcyhVar, efwo efwoVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        efwoVar.getClass();
        fcsuVar.getClass();
        this.b = apwfVar;
        this.c = fdjxVar;
        this.d = efwoVar;
        this.e = fcsuVar;
        this.a = fdvf.a(new zqw(fcvo.a, 14));
    }

    private static final ekgb g(List list, List list2, boolean z) {
        List listAq = fcva.aq(list);
        final ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ajlt) it.next()).b());
        }
        boolean zX = fcva.x(listAq, new fdap() { // from class: zqp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ajlt ajltVar = (ajlt) obj;
                ajltVar.getClass();
                return Boolean.valueOf(arrayList.contains(ajltVar.b()));
            }
        });
        boolean z2 = true;
        if ((!z || listAq.isEmpty()) && zX) {
            z2 = false;
        }
        if (z) {
            listAq.clear();
        }
        if (z2) {
            listAq.addAll(list2);
        }
        return ekfv.a(listAq);
    }

    @Override // defpackage.zqm
    public final /* synthetic */ fdpl a() {
        return this.a;
    }

    @Override // defpackage.zqm
    public final void b() {
        this.a.f(new zqw(fcvo.a, 14));
    }

    @Override // defpackage.zqm
    public final void c(List list) {
        List list2 = ((zqw) this.a.c()).a;
        auvw.k(this.c, null, null, new zqr(this, g(list2, list, false), list2.isEmpty(), null), 3);
    }

    @Override // defpackage.zqm
    public final void d(final ajlt ajltVar, boolean z, zqy zqyVar) {
        ekgb ekgbVarA;
        ajltVar.getClass();
        List list = ((zqw) this.a.c()).a;
        boolean z2 = z || list.isEmpty();
        if (this.b.a()) {
            ekgbVarA = g(list, ajltVar instanceof ytm ? ((ytm) ajltVar).a : fcva.b(ajltVar), z);
        } else {
            List listAq = fcva.aq(list);
            final fdap fdapVar = new fdap() { // from class: zqn
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ajlt ajltVar2 = (ajlt) obj;
                    ajltVar2.getClass();
                    return Boolean.valueOf(fdbq.f(ajltVar2.b(), ajltVar.b()));
                }
            };
            boolean z3 = (z && !listAq.isEmpty()) || !Collection.EL.removeIf(listAq, new Predicate() { // from class: zqo
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
                    return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                }
            });
            if (z) {
                listAq.clear();
            }
            if (z3) {
                listAq.add(ajltVar);
            }
            ekgbVarA = ekfv.a(listAq);
        }
        auvw.k(this.c, null, null, new zqs(this, ekgbVarA, z, zqyVar, z2, null), 3);
    }

    @Override // defpackage.zqm
    public final boolean e() {
        return !((zqw) this.a.c()).a.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zqq
            if (r0 == 0) goto L13
            r0 = r5
            zqq r0 = (defpackage.zqq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zqq r0 = new zqq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zqt r0 = r0.d
            defpackage.fctl.b(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            java.lang.Boolean r5 = r4.f
            if (r5 != 0) goto L59
            fcsu r5 = r4.e
            java.lang.Object r5 = r5.b()
            csmf r5 = (defpackage.csmf) r5
            efwo r2 = r4.d
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 == r1) goto L58
            r0 = r4
        L4d:
            csmb r5 = (defpackage.csmb) r5
            boolean r5 = r5.a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.f = r5
            goto L59
        L58:
            return r1
        L59:
            java.lang.Boolean r5 = r4.f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqt.f(fcxy):java.lang.Object");
    }
}
