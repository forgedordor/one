package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnia implements eyif {
    public static lxq a(Activity activity, ea eaVar, Optional optional) {
        Object next;
        activity.getClass();
        fdev fdevVarE = fdey.e(eaVar, new fdap() { // from class: dnhy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ea eaVar2 = (ea) obj;
                eaVar2.getClass();
                return eaVar2.E;
            }
        });
        optional.isPresent();
        Iterator itA = fdevVarE.a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
            if (!(((ea) next) instanceof dpcg)) {
                break;
            }
        }
        ea eaVar2 = (ea) next;
        return eaVar2 != null ? eaVar2 : (eg) activity;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
