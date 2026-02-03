package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyxp {
    public final dyau a;
    private final dyyb b;
    private final dxxk c;
    private final dyyd d;

    public dyxp(dyyb dyybVar, dyyd dyydVar, dxxk dxxkVar, dyau dyauVar) {
        this.b = dyybVar;
        this.d = dyydVar;
        this.c = dxxkVar;
        this.a = dyauVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(dyyb dyybVar, View view) {
        if (view instanceof dyyh) {
            ((dyyh) view).b(dyybVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(dyybVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(dyyb dyybVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c(dyybVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof dyyh) {
            ((dyyh) view).gW(dyybVar);
        }
    }

    private static void d(View view, dyxj dyxjVar) {
        view.setTag(R.id.view_bound_account_tag, dyxjVar);
    }

    public final void b(View view, int i, Object obj) {
        dyxj dyxjVarD = dyxj.d(this.c, obj);
        dyxj dyxjVar = (dyxj) view.getTag(R.id.view_bound_account_tag);
        if (dyxjVarD.equals(dyxjVar)) {
            return;
        }
        if (dyxjVar == null) {
            this.d.a(view, i, dyxjVarD);
            d(view, dyxjVarD);
            return;
        }
        int[] iArr = ley.a;
        if (view.isAttachedToWindow()) {
            dyyb dyybVar = this.b;
            c(dyybVar, view);
            dyyd dyydVar = this.d;
            dyydVar.b.e(view);
            dyydVar.a(view, i, dyxjVarD);
            a(dyybVar, view);
            d(view, dyxjVarD);
        }
    }
}
