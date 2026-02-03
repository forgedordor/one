package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionHelper");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fdjx f;

    public cmdi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.b = fcsuVar2;
        this.e = fcsuVar3;
        this.c = fcsuVar4;
        this.f = fdjxVar;
    }

    private final DisplayManager e() {
        return (DisplayManager) ((Context) this.b.b()).getSystemService("display");
    }

    public final DisplayManager.DisplayListener a(fdae fdaeVar) throws IOException {
        eieu eieuVarH = eiiy.h("ScreenDetectionHelper.registerDisplayListener");
        try {
            DisplayManager displayManagerE = e();
            if (displayManagerE == null) {
                fczl.a(eieuVarH, null);
                return null;
            }
            cmdh cmdhVar = new cmdh(fdaeVar);
            displayManagerE.registerDisplayListener(cmdhVar, (Handler) this.e.b());
            fczl.a(eieuVarH, null);
            return cmdhVar;
        } finally {
        }
    }

    public final cmdb b(cmdb cmdbVar) throws IOException {
        eieu eieuVarH = eiiy.h("ScreenDetectionHelper.handleDisplayChange");
        try {
            cmdb cmdbVarA = ((cmdd) this.d.b()).a();
            if (cmdbVar == null || cmdbVar.a != cmdbVarA.a) {
                eieuVarH = eiiy.h("ScreenDetectionHelper.refreshNotifications");
                try {
                    auvw.k(this.f, null, null, new cmdg(this, null), 3);
                    fczl.a(eieuVarH, null);
                } finally {
                }
            }
            fczl.a(eieuVarH, null);
            return cmdbVarA;
        } finally {
        }
    }

    public final cmdf c(cmdb cmdbVar) {
        cmdbVar.getClass();
        String str = cmdbVar.b;
        if (str == null || str.length() == 0) {
            String string = ((Context) this.b.b()).getString(R.string.screen_detection_dialog_body_no_package_name);
            string.getClass();
            return new cmdf(string, null, null);
        }
        String string2 = ((Context) this.b.b()).getString(R.string.screen_detection_dialog_body_with_package_name, str);
        string2.getClass();
        int iO = fdgn.O(string2, str, 0, false, 6);
        return new cmdf(string2, Integer.valueOf(iO), Integer.valueOf(iO + str.length()));
    }

    public final void d(DisplayManager.DisplayListener displayListener) throws IOException {
        eieu eieuVarH = eiiy.h("ScreenDetectionHelper.unregisterDisplayListener");
        try {
            DisplayManager displayManagerE = e();
            if (displayManagerE != null) {
                displayManagerE.unregisterDisplayListener(displayListener);
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
