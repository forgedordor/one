package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.navigation.NavigationManager;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clg extends ContextWrapper {
    public final ace a;
    public final clk b;
    public int c;
    private final cmp d;

    protected clg(final lvc lvcVar, final clk clkVar) {
        super(null);
        cmp cmpVar = new cmp();
        this.d = cmpVar;
        this.c = 0;
        this.b = clkVar;
        cmpVar.a(AppManager.class, "app", new cmq() { // from class: ckv
            @Override // defpackage.cmq
            public final cmo a() {
                lvc lvcVar2 = lvcVar;
                lvcVar2.getClass();
                return new AppManager(this.a, clkVar, lvcVar2);
            }
        });
        cmpVar.a(NavigationManager.class, "navigation", new cmq() { // from class: ckw
            @Override // defpackage.cmq
            public final cmo a() {
                lvc lvcVar2 = lvcVar;
                lvcVar2.getClass();
                return new NavigationManager(lvcVar2);
            }
        });
        cmpVar.a(clw.class, "screen", new cmq() { // from class: ckx
            @Override // defpackage.cmq
            public final cmo a() {
                return new clw(this.a, lvcVar);
            }
        });
        cmpVar.a(cmc.class, "constraints", new cmq() { // from class: cky
            @Override // defpackage.cmq
            public final cmo a() {
                return new cmc();
            }
        });
        cmpVar.a(cme.class, "hardware", new cmq() { // from class: ckz
            @Override // defpackage.cmq
            public final cmo a() {
                return cmd.a(this.a, clkVar);
            }
        });
        cmpVar.a(cms.class, null, new cmq() { // from class: cla
            @Override // defpackage.cmq
            public final cmo a() {
                return cmr.a(this.a);
            }
        });
        cmpVar.a(cri.class, "suggestion", new cmq() { // from class: clb
            @Override // defpackage.cmq
            public final cmo a() {
                lvc lvcVar2 = lvcVar;
                lvcVar2.getClass();
                return new cri(lvcVar2);
            }
        });
        cmpVar.a(cmv.class, "media_playback", new cmq() { // from class: clc
            @Override // defpackage.cmq
            public final cmo a() {
                lvc lvcVar2 = lvcVar;
                lvcVar2.getClass();
                return new cmv(lvcVar2);
            }
        });
        this.a = new ace(new Runnable() { // from class: cld
            @Override // java.lang.Runnable
            public final void run() {
                clw clwVar = (clw) this.a.a(clw.class);
                csb.a();
                lvn lvnVar = (lvn) clwVar.c;
                if (lvnVar.c.equals(lvb.a)) {
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                        return;
                    }
                    return;
                }
                Deque deque = clwVar.a;
                if (deque.size() > 1) {
                    List<clu> listSingletonList = Collections.singletonList((clu) deque.pop());
                    clu cluVarA = clwVar.a();
                    cluVarA.c = true;
                    ((AppManager) clwVar.b.a(AppManager.class)).a();
                    if (lvnVar.c.a(lvb.d)) {
                        cluVarA.b(lva.ON_START);
                    }
                    for (clu cluVar : listSingletonList) {
                        if (Log.isLoggable("CarApp", 3)) {
                            Log.d("CarApp", a.h(cluVar, "Popping screen ", " off the screen stack"));
                        }
                        clw.c(cluVar, true);
                    }
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", a.h(cluVarA, "Screen ", " is at the top of the screen stack"));
                    }
                    if (lvnVar.c.a(lvb.e) && deque.contains(cluVarA)) {
                        cluVarA.b(lva.ON_RESUME);
                    }
                }
            }
        });
        lvcVar.c(new clf(clkVar));
    }

    public final Object a(Class cls) {
        cmp cmpVar = this.d;
        RuntimeException runtimeException = (RuntimeException) cmpVar.b.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        Map map = cmpVar.a;
        cmo cmoVar = (cmo) map.get(cls);
        if (cmoVar != null) {
            return cmoVar;
        }
        cmq cmqVar = (cmq) cmpVar.c.get(cls);
        if (cmqVar == null) {
            throw new IllegalArgumentException(a.h(cls, "The class '", "' does not correspond to a car service"));
        }
        try {
            cmo cmoVarA = cmqVar.a();
            map.put(cls, cmoVarA);
            return cmoVarA;
        } catch (RuntimeException e) {
            cmpVar.b.put(cls, e);
            throw e;
        }
    }

    public final void b(Context context, Configuration configuration) {
        csb.a();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            systemService.getClass();
            attachBaseContext(context.createDisplayContext(((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8).getDisplay()).createConfigurationContext(configuration));
        }
        c(configuration);
    }

    public final void c(Configuration configuration) {
        csb.a();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        configuration.getClass();
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
