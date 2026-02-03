package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfy extends WindowInsetsAnimation$Callback {
    private final lfs a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public lfy(lfs lfsVar) {
        super(lfsVar.c);
        this.d = new HashMap();
        this.a = lfsVar;
    }

    private final lgb a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        lgb lgbVar = (lgb) map.get(windowInsetsAnimation);
        if (lgbVar != null) {
            return lgbVar;
        }
        lgb lgbVar2 = new lgb(windowInsetsAnimation);
        map.put(windowInsetsAnimation, lgbVar2);
        return lgbVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.e();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.a.c(lgt.o(windowInsets), this.b).e();
            }
            WindowInsetsAnimation windowInsetsAnimationM = jzi$$ExternalSyntheticApiModelOutline5.m(list.get(size));
            lgb lgbVarA = a(windowInsetsAnimationM);
            lgbVarA.e(windowInsetsAnimationM.getFraction());
            this.c.add(lgbVarA);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        lfr lfrVarB = this.a.b(a(windowInsetsAnimation), new lfr(bounds));
        return new WindowInsetsAnimation.Bounds(lfrVarB.a.a(), lfrVarB.b.a());
    }
}
