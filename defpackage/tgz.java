package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgz {
    public final baif a;
    public final fdpl b;
    private final fcyh c;

    public tgz(fcyh fcyhVar, baif baifVar) {
        fcyhVar.getClass();
        this.c = fcyhVar;
        this.a = baifVar;
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("blockedParticipantsFlow");
        bsboVarE.h(new Function() { // from class: tgt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.c();
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = new tgw(bmgj.a(bsboVarE.b()), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.tgx
            if (r0 == 0) goto L13
            r0 = r7
            tgx r0 = (defpackage.tgx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tgx r0 = new tgx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.c
            fcyh r7 = defpackage.eicg.a(r7)
            tgy r2 = new tgy
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            fctk r7 = (defpackage.fctk) r7
            java.lang.Object r6 = r7.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgz.a(java.lang.Object, fcxy):java.lang.Object");
    }
}
