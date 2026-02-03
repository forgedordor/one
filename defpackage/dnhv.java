package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhv implements dnib {
    private static final ekrg a = ekrg.c("com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController");
    private final Activity b;
    private final dnho c;
    private final fctc d;

    public dnhv(Activity activity, dnho dnhoVar, final eygg eyggVar) {
        this.b = activity;
        this.c = dnhoVar;
        this.d = fctd.a(new fdae() { // from class: dnhs
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((dnhw) eyggVar).a;
            }
        });
    }

    private final boolean g(dltd dltdVar) {
        List listA = this.c.a();
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return false;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (dlth.a((dltd) it.next(), dltdVar)) {
                return true;
            }
        }
        return false;
    }

    private final affi i(dltd dltdVar) {
        fdap fdapVar = new fdap() { // from class: dnht
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Class cls = (Class) obj;
                cls.getClass();
                Object obj2 = this.a.a().get(cls);
                if (obj2 instanceof affi) {
                    return (affi) obj2;
                }
                return null;
            }
        };
        dltdVar.getClass();
        return (affi) fdey.f(fdey.k(new fdez(new dltg(dltdVar.getClass(), null)), fdapVar));
    }

    public final Map a() {
        return (Map) this.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dnhq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dltd r5, defpackage.dnhn r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r6 = r7 instanceof defpackage.dnhu
            if (r6 == 0) goto L13
            r6 = r7
            dnhu r6 = (defpackage.dnhu) r6
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.d = r0
            goto L18
        L13:
            dnhu r6 = new dnhu
            r6.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r6.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            java.lang.Object r5 = r6.a
            defpackage.fctl.b(r7)
            goto L99
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.fctl.b(r7)
            boolean r7 = r4.g(r5)
            if (r7 == 0) goto L82
            android.app.Activity r6 = r4.b
            r7 = 2132084007(0x7f150527, float:1.9808172E38)
            defpackage.dphh.b(r6, r7)
            ekrg r6 = defpackage.dnhv.a
            ekrw r6 = r6.j()
            r7 = 56
            java.lang.String r0 = "ManagedDraftAttachmentsController.kt"
            java.lang.String r1 = "com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController"
            java.lang.String r2 = "addAttachment"
            ekrw r6 = r6.h(r1, r2, r7, r0)
            ekrd r6 = (defpackage.ekrd) r6
            dnho r7 = r4.c
            java.util.List r7 = r7.a()
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r7.next()
            r1 = r0
            dltd r1 = (defpackage.dltd) r1
            boolean r1 = defpackage.dlth.a(r1, r5)
            if (r1 == 0) goto L61
            java.lang.String r7 = "Skipping addition of %s, already present as %s"
            r6.D(r7, r5, r0)
            goto Lc4
        L7a:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        L82:
            affi r7 = r4.i(r5)
            if (r7 == 0) goto Lac
            r6.a = r5
            r6.d = r3
            r6 = r5
            dohq r6 = (defpackage.dohq) r6
            fdap r7 = r7.a
            r7.invoke(r6)
            dnic r7 = defpackage.dnic.a
            if (r7 != r0) goto L99
            return r0
        L99:
            if (r7 == 0) goto Lac
            boolean r6 = r7 instanceof defpackage.dnid
            if (r6 != 0) goto La1
            r2 = r7
            goto Lac
        La1:
            ekrg r5 = defpackage.dnhv.a
            ekrw r5 = r5.h()
            ekrd r5 = (defpackage.ekrd) r5
            dnid r7 = (defpackage.dnid) r7
            throw r2
        Lac:
            boolean r6 = r2 instanceof defpackage.dnid
            r3 = r6 ^ 1
            if (r6 != 0) goto Lc4
            dnho r6 = r4.c
            r5.getClass()
            java.util.List r7 = r6.a()
            java.util.List r5 = defpackage.fcva.ai(r7, r5)
            fduf r6 = r6.a
            r6.h(r5)
        Lc4:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnhv.b(dltd, dnhn, fcxy):java.lang.Object");
    }

    @Override // defpackage.dnib
    public final fdvc c() {
        return this.c.b;
    }

    @Override // defpackage.dnhq
    public final void d() {
        for (affi affiVar : a().values()) {
        }
        this.c.a.h(fcvo.a);
    }

    @Override // defpackage.dnhq
    public final void e(dltd dltdVar) {
        Object obj;
        dltdVar.getClass();
        if (!g(dltdVar)) {
            ((ekrd) a.i().h("com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController", "removeAttachment", 82, "ManagedDraftAttachmentsController.kt")).t("Skipping removal of %s, which wasn't added", dltdVar);
            return;
        }
        affi affiVarI = i(dltdVar);
        if (affiVarI != null) {
            dohq dohqVar = (dohq) dltdVar;
            Iterator it = affiVarI.b.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                dwsv dwsvVar = (dwsv) dwsp.a(((dwqd) next).a()).f();
                if (fdbq.f(dwsvVar != null ? dwsvVar.g() : null, dohqVar.f())) {
                    obj = next;
                    break;
                }
            }
            dwqd dwqdVar = (dwqd) obj;
            if (dwqdVar != null) {
                affiVarI.c.invoke(dwqdVar);
            }
        }
        dnho dnhoVar = this.c;
        List listA = dnhoVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listA) {
            if (!dlth.a((dltd) obj2, dltdVar)) {
                arrayList.add(obj2);
            }
        }
        dnhoVar.a.h(arrayList);
    }

    @Override // defpackage.dnhq
    public final /* bridge */ /* synthetic */ void f(dltd dltdVar) {
        throw new UnsupportedOperationException("send() should be implemented by client DraftAttachmentsController and is unsupported in ManagedDraftAttachmentsController");
    }

    @Override // defpackage.dnhq
    public final /* synthetic */ boolean h() {
        throw new UnsupportedOperationException("Not used");
    }
}
