package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbu implements ywx {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int i = 0;
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fduf g;
    public final fdcz h;
    private final fcsu j;
    private final fctc k;
    private final fctc l;

    static {
        fdbv fdbvVar = new fdbv(zbu.class, "promoSeenForMessage", "getPromoSeenForMessage()Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;", 0);
        int i2 = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public zbu(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.j = fcsuVar4;
        this.f = fcsuVar5;
        this.k = fctd.a(new fdae() { // from class: zbj
            @Override // defpackage.fdae
            public final Object invoke() {
                return (String) ((Optional) this.a.c.b()).get();
            }
        });
        this.g = fdvf.a(null);
        this.h = new zbt(this);
        this.l = fctd.a(new fdae() { // from class: zbk
            @Override // defpackage.fdae
            public final Object invoke() {
                zbu zbuVar = this.a;
                Object objB = zbuVar.d.b();
                objB.getClass();
                return new fdqz(new zbo(null), new fdua(new fdua(new zbr((fdpl) objB), new zaz(((zbe) zbuVar.e.b()).a().e()), new zbl(null)), zbuVar.g, new zbn(zbuVar, null)));
            }
        });
    }

    @Override // defpackage.ywx
    public final auyl a(ymx ymxVar) {
        Object objC;
        if (!b(ymxVar)) {
            return new auxq(new fdae() { // from class: zbi
                @Override // defpackage.fdae
                public final Object invoke() {
                    int i2 = zbu.i;
                    return fcvo.a;
                }
            });
        }
        fduf fdufVar = this.g;
        do {
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, ymxVar.a().b()));
        return auyp.b(new fdua(((zvz) this.j.b()).a(ymxVar.a(), ckmx.a()), (fdpl) this.l.a(), new zbs(null)), fcvo.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // defpackage.ywx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.ymx r6) {
        /*
            r5 = this;
            ajlt r0 = r6.a()
            boolean r0 = defpackage.ykm.q(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            boolean r0 = r6.e()
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            ajlt r6 = r6.a()
            angr r6 = r6.i()
            if (r6 == 0) goto L4c
            ekgb r6 = r6.d()
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L2a
            goto L4c
        L2a:
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r6.next()
            ango r3 = (defpackage.ango) r3
            anhj r3 = r3.a
            java.lang.String r4 = r5.c()
            angl r4 = defpackage.anhp.a(r4)
            boolean r3 = defpackage.fdbq.f(r3, r4)
            if (r3 == 0) goto L2e
            r6 = r1
            goto L4d
        L4c:
            r6 = r2
        L4d:
            if (r0 == 0) goto L52
            if (r6 != 0) goto L52
            return r1
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.b(ymx):boolean");
    }

    public final String c() {
        return (String) this.k.a();
    }
}
