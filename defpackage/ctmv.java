package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmv implements ctmq {
    public static final fdae a = new fdae() { // from class: ctmr
        @Override // defpackage.fdae
        public final Object invoke() {
            return fctx.a;
        }
    };
    public final Context b;
    public final ctjm c;
    public final udn d;
    public final fcsu e;
    public final asgz f;
    public final ardr g;

    public ctmv(Context context, ctjm ctjmVar, udn udnVar, fcsu fcsuVar, asgz asgzVar, ardr ardrVar) {
        context.getClass();
        ctjmVar.getClass();
        fcsuVar.getClass();
        ardrVar.getClass();
        this.b = context;
        this.c = ctjmVar;
        this.d = udnVar;
        this.e = fcsuVar;
        this.f = asgzVar;
        this.g = ardrVar;
    }

    @Override // defpackage.ctmq
    public final ctmp a(final ctnv ctnvVar, final cudx cudxVar, final fdap fdapVar) {
        ctnvVar.getClass();
        cudxVar.getClass();
        return new ctnb(ctnvVar.a.c().toString(), new fdae() { // from class: ctms
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
            /* JADX WARN: Type inference failed for: r8v7 */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws android.content.res.Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 629
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ctms.invoke():java.lang.Object");
            }
        });
    }

    public final djwf b(String str, int i) {
        if (!this.g.a() && i > 1) {
            str = fdgn.U(str);
        }
        return new djwf(3, 2, 0, str.length());
    }
}
