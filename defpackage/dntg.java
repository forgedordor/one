package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntg {
    public static final dngr a = new dngr(new fdap() { // from class: dntd
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            Set set = (Set) obj;
            dngr dngrVar = dntg.a;
            set.getClass();
            return fcva.al(set, new dntf());
        }
    });
    public static final List b;

    static {
        fctc fctcVar = dnjz.a;
        b = fcva.ao(dnjy.a());
    }

    public static final dnst a(Context context, int i, fdap fdapVar, fdat fdatVar, int i2, fdap fdapVar2) {
        return new dnua(context, i, fdapVar, new GridLayoutManager(i2), fdatVar, fdapVar2);
    }
}
