package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pna implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final pmx a;
    final ViewGroup b;

    public pna(pmx pmxVar, ViewGroup viewGroup) {
        this.a = pmxVar;
        this.b = viewGroup;
    }

    private final void a() {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ca A[EDGE_INSN: B:158:0x01ca->B:87:0x01ca BREAK  A[LOOP:1: B:18:0x007b->B:86:0x01c1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295 A[EDGE_INSN: B:200:0x0295->B:134:0x0295 BREAK  A[LOOP:8: B:103:0x021d->B:214:0x021d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pna.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ArrayList arrayList = pnb.a;
        ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) pnb.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((pmx) arrayList2.get(i)).w(viewGroup);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
