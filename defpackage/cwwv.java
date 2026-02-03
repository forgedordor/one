package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwv implements acth {
    public final cjqw a;
    public final cwwx b;
    public final egzh c;
    public final Context d;
    private final cjrp e;
    private final eosc f;

    public cwwv(cjqw cjqwVar, cjrp cjrpVar, cwwx cwwxVar, egzh egzhVar, eosc eoscVar, Context context) {
        this.a = cjqwVar;
        this.e = cjrpVar;
        this.b = cwwxVar;
        this.f = eoscVar;
        this.c = egzhVar;
        this.d = context;
    }

    @Override // defpackage.acth
    public final eiju a() {
        return this.e.c(cjqt.BANNER).h(new ejvr() { // from class: cwwr
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 376
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwwr.apply(java.lang.Object):java.lang.Object");
            }
        }, this.f);
    }

    @Override // defpackage.acth
    public final eiju b() {
        final cjrp cjrpVar = this.e;
        return cjrpVar.d().i(new eooz() { // from class: cjrf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    cjrp.a.m("shouldShowBanner: decided false, no ui was requested");
                    return eijx.e(false);
                }
                if (((cjqt) optional.get()).equals(cjqt.BANNER)) {
                    cjrp.a.m("shouldShowBanner: decided true");
                    return eijx.e(true);
                }
                if (((cjqt) optional.get()).equals(cjqt.BOTTOMSHEET)) {
                    cjrp cjrpVar2 = cjrpVar;
                    return cjrpVar2.c.c().h(new ejvr() { // from class: cjre
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            int iA;
                            cqce cqceVar = cjrp.a;
                            cjqt cjqtVar = cjqt.BANNER;
                            Optional optionalMax = Collection.EL.stream((ekgb) obj2).filter(new cjrl()).max(cjrp.b);
                            if (!optionalMax.isEmpty()) {
                                cjqt cjqtVarB = cjqt.b(((cjqu) optionalMax.get()).d);
                                if (cjqtVarB == null) {
                                    cjqtVarB = cjqt.UNRECOGNIZED;
                                }
                                if (cjqtVar.equals(cjqtVarB) && (iA = cjqr.a(((cjqu) optionalMax.get()).e)) != 0 && iA == 5) {
                                    cjrp.a.m("shouldShowBanner: decided true, user just accepted banner");
                                    return true;
                                }
                            }
                            cjrp.a.m("shouldShowBanner: decided false, bottomsheet was requested");
                            return false;
                        }
                    }, cjrpVar2.e);
                }
                cjrp.a.m("shouldShowBanner: decided false");
                return eijx.e(false);
            }
        }, cjrpVar.d);
    }

    @Override // defpackage.acth
    public final /* synthetic */ Set c() {
        return new ekph(cdpg.HOME);
    }

    @Override // defpackage.acth
    public final int d() {
        return 2;
    }
}
