package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cubz extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cucd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cubz(cucd cucdVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = cucdVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cubz cubzVar = new cubz(this.d, (fcxy) obj4);
        cubzVar.a = (cudx) obj;
        cubzVar.b = (ctye) obj2;
        cubzVar.c = (Set) obj3;
        return cubzVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List listAo;
        fctl.b(obj);
        final cudx cudxVar = (cudx) this.a;
        cueh cuehVar = cudxVar.d;
        Object obj2 = this.b;
        ?? r4 = this.c;
        boolean zD = cuehVar.d();
        final cucd cucdVar = this.d;
        if (zD) {
            listAo = fcvo.a;
        } else {
            List<ChipData> list = cudxVar.a;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (final ChipData chipData : list) {
                String str = chipData.b;
                int i = 1;
                boolean z = !chipData.e;
                dkpi dkpiVarA = ((uds) cucdVar.e.b()).a(chipData);
                if (cucdVar.h.a() && r4.contains(chipData.a)) {
                    i = 2;
                }
                arrayList.add(new dizu(str, dkpiVarA, z, i, new fdae() { // from class: cubu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cucdVar.b.c(chipData);
                        return fctx.a;
                    }
                }, new dizv(cucdVar.f.a())));
            }
            listAo = fcva.ao(arrayList);
        }
        cucf cucfVar = cucdVar.a;
        final ctye ctyeVar = (ctye) obj2;
        return new cuce(new djkj(listAo, new cuby(cucfVar), new fdae() { // from class: cubx
            @Override // defpackage.fdae
            public final Object invoke() {
                cucd cucdVar2 = cucdVar;
                if (((String) cucdVar2.a.a().a()).length() == 0) {
                    List list2 = cudxVar.e;
                    if (!list2.isEmpty()) {
                        cucdVar2.b.c((ChipData) fcva.S(list2));
                    }
                }
                return fctx.a;
            }
        }, new fdae() { // from class: cubv
            /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r5 = this;
                    cucd r0 = r2
                    cudx r1 = r1
                    cueh r1 = r1.d
                    cueh r2 = defpackage.cueh.a
                    if (r1 != r2) goto L2d
                    cucf r1 = r0.a
                    hsf r1 = r1.a()
                    java.lang.Object r1 = r1.a()
                    java.lang.String r1 = (java.lang.String) r1
                    fcsu r2 = r0.d
                    java.lang.Object r2 = r2.b()
                    cxum r2 = (defpackage.cxum) r2
                    java.util.Locale r3 = java.util.Locale.ROOT
                    java.lang.String r1 = r1.toLowerCase(r3)
                    r1.getClass()
                    boolean r1 = r2.a(r1)
                    if (r1 != 0) goto Lb7
                L2d:
                    ctye r1 = r3
                    java.util.List r1 = r1.b
                    java.util.Iterator r1 = r1.iterator()
                L35:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L69
                    java.lang.Object r2 = r1.next()
                    r3 = r2
                    cubn r3 = (defpackage.cubn) r3
                    ctzh r4 = r3.a()
                    djyu r4 = r4.a
                    boolean r4 = r4 instanceof defpackage.djyl
                    if (r4 != 0) goto L6a
                    ctzh r4 = r3.a()
                    djyu r4 = r4.a
                    boolean r4 = r4 instanceof defpackage.djys
                    if (r4 != 0) goto L6a
                    ardr r4 = r0.h
                    boolean r4 = r4.a()
                    if (r4 == 0) goto L35
                    ctzh r3 = r3.a()
                    djyu r3 = r3.a
                    boolean r3 = r3 instanceof defpackage.djym
                    if (r3 == 0) goto L35
                    goto L6a
                L69:
                    r2 = 0
                L6a:
                    cubn r2 = (defpackage.cubn) r2
                    if (r2 == 0) goto Lb7
                    ctzh r1 = r2.a()
                    djyu r1 = r1.a
                    boolean r2 = r1 instanceof defpackage.djyl
                    if (r2 == 0) goto L85
                    djyl r1 = (defpackage.djyl) r1
                    fdae r1 = r1.e
                    r1.invoke()
                    ctuu r0 = r0.c
                    r0.e()
                    goto Lb7
                L85:
                    boolean r2 = r1 instanceof defpackage.djys
                    if (r2 == 0) goto L9a
                    djys r1 = (defpackage.djys) r1
                    boolean r2 = r1.d
                    if (r2 != 0) goto L94
                    fdae r1 = r1.f
                    r1.invoke()
                L94:
                    ctuu r0 = r0.c
                    r0.e()
                    goto Lb7
                L9a:
                    boolean r2 = r1 instanceof defpackage.djym
                    if (r2 == 0) goto Laf
                    djym r1 = (defpackage.djym) r1
                    boolean r2 = r1.f
                    if (r2 != 0) goto La9
                    fdae r1 = r1.i
                    r1.invoke()
                La9:
                    ctuu r0 = r0.c
                    r0.e()
                    goto Lb7
                Laf:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Unexpected ListItemUiData when clicking on Done button"
                    r0.<init>(r1)
                    throw r0
                Lb7:
                    fctx r0 = defpackage.fctx.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cubv.invoke():java.lang.Object");
            }
        }, cucfVar.a(), new djki(cucdVar.f.a(), ((aqiu) cucdVar.g.b()).a(), ((asdx) cucdVar.j.b()).a())), ctyeVar);
    }
}
