package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxq {
    public static final pxc a(pxd pxdVar, WindowLayoutInfo windowLayoutInfo) {
        pwk pwkVar;
        pwj pwjVar;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            pwl pwlVar = null;
            if (foldingFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature2 = foldingFeature;
                foldingFeature2.getClass();
                int type = foldingFeature2.getType();
                if (type == 1) {
                    pwkVar = pwk.a;
                } else if (type == 2) {
                    pwkVar = pwk.b;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    pwjVar = pwj.a;
                } else if (state == 2) {
                    pwjVar = pwj.b;
                }
                Rect bounds = foldingFeature2.getBounds();
                bounds.getClass();
                prj prjVar = new prj(bounds);
                Rect rectA = pxdVar.a();
                if ((prjVar.a() != 0 || prjVar.b() != 0) && ((prjVar.b() == rectA.width() || prjVar.a() == rectA.height()) && ((prjVar.b() >= rectA.width() || prjVar.a() >= rectA.height()) && (prjVar.b() != rectA.width() || prjVar.a() != rectA.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    bounds2.getClass();
                    pwlVar = new pwl(new prj(bounds2), pwkVar, pwjVar);
                }
            }
            if (pwlVar != null) {
                arrayList.add(pwlVar);
            }
        }
        return new pxc(arrayList);
    }

    public static final pxc b(Context context, WindowLayoutInfo windowLayoutInfo) {
        pxh pxhVar = new pxh(null);
        if (Build.VERSION.SDK_INT >= 30) {
            return a(pyu.a().b(context, pxhVar.b), windowLayoutInfo);
        }
        if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return a(pxhVar.a((Activity) context), windowLayoutInfo);
    }
}
