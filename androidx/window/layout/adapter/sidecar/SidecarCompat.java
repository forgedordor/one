package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.fcvo;
import defpackage.kxy;
import defpackage.lbz;
import defpackage.pxc;
import defpackage.pxt;
import defpackage.pxz;
import defpackage.pyb;
import defpackage.pyc;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SidecarCompat implements pxt {
    public final SidecarInterface a;
    public final pxz b;
    public final Map c;
    public final Map d;
    public pyc e;

    /* compiled from: PG */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecarInterface;
            sidecarDeviceState.getClass();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : sidecarCompat.c.values()) {
                IBinder iBinderA = pyb.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterface = sidecarCompat.a) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinderA);
                }
                pyc pycVar = sidecarCompat.e;
                if (pycVar != null) {
                    pxz pxzVar = sidecarCompat.b;
                    pycVar.a(activity, pxz.a(windowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SidecarDeviceState sidecarDeviceState;
            iBinder.getClass();
            sidecarWindowLayoutInfo.getClass();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            Activity activity = (Activity) sidecarCompat.c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            pxz pxzVar = sidecarCompat.b;
            SidecarInterface sidecarInterface = sidecarCompat.a;
            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            pxc pxcVarA = pxz.a(sidecarWindowLayoutInfo, sidecarDeviceState);
            pyc pycVar = sidecarCompat.e;
            if (pycVar != null) {
                pycVar.a(activity, pxcVarA);
            }
        }
    }

    public SidecarCompat(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        pxz pxzVar = new pxz();
        this.a = sidecarImpl;
        this.b = pxzVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final pxc a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderA = pyb.a(activity);
        if (iBinderA == null) {
            return new pxc(fcvo.a);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return pxz.a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(IBinder iBinder, final Activity activity) {
        Map map = this.c;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        pyc pycVar = this.e;
        if (pycVar != null) {
            pycVar.a(activity, a(activity));
        }
        Map map2 = this.d;
        if (map2.get(activity) == null && (activity instanceof kxy)) {
            lbz lbzVar = new lbz() { // from class: pya
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    SidecarCompat sidecarCompat = this.a;
                    pyc pycVar2 = sidecarCompat.e;
                    if (pycVar2 != null) {
                        Activity activity2 = activity;
                        pycVar2.a(activity2, sidecarCompat.a(activity2));
                    }
                }
            };
            map2.put(activity, lbzVar);
            ((kxy) activity).hg(lbzVar);
        }
    }
}
