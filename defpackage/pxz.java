package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxz {
    public static final /* synthetic */ int a = 0;
    private static final String b = "pxz";

    public static final pxc a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        pwk pwkVar;
        pwj pwjVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new pxc(fcvo.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iA = pxy.a(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = iA;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(iA));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        List<SidecarDisplayFeature> listB = pxy.b(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : listB) {
            sidecarDisplayFeature.getClass();
            String str = b;
            str.getClass();
            SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new prq(sidecarDisplayFeature, str, 3).a("Type must be either TYPE_FOLD or TYPE_HINGE", new fdap() { // from class: pxu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                    int i = pxz.a;
                    sidecarDisplayFeature3.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature3.getType() != 1 && sidecarDisplayFeature3.getType() != 2) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).a("Feature bounds must not be 0", new fdap() { // from class: pxv
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                    int i = pxz.a;
                    sidecarDisplayFeature3.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature3.getRect().width() == 0 && sidecarDisplayFeature3.getRect().height() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).a("TYPE_FOLD must have 0 area", new fdap() { // from class: pxw
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                    int i = pxz.a;
                    sidecarDisplayFeature3.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature3.getType() == 1 && sidecarDisplayFeature3.getRect().width() != 0 && sidecarDisplayFeature3.getRect().height() != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).a("Feature be pinned to either left or top", new fdap() { // from class: pxx
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                    int i = pxz.a;
                    sidecarDisplayFeature3.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature3.getRect().left != 0 && sidecarDisplayFeature3.getRect().top != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).b();
            pwl pwlVar = null;
            if (sidecarDisplayFeature2 != null) {
                int type = sidecarDisplayFeature2.getType();
                if (type == 1) {
                    pwkVar = pwk.a;
                } else if (type == 2) {
                    pwkVar = pwk.b;
                }
                int iA2 = pxy.a(sidecarDeviceState2);
                if (iA2 == 2) {
                    pwjVar = pwj.b;
                } else if (iA2 == 3) {
                    pwjVar = pwj.a;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                pwlVar = new pwl(new prj(rect), pwkVar, pwjVar);
            }
            if (pwlVar != null) {
                arrayList.add(pwlVar);
            }
        }
        return new pxc(arrayList);
    }
}
