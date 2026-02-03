package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdd {
    private static final cczv d;
    private static final cczv e;
    public final fcsu b;
    private final fcsu f;
    private final fcsu g;
    private final fdjx h;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionChecker");
    public static final ejxr a = cdag.x("enable_screen_detection_checker_2");

    static {
        dzzf dzzfVar = cdag.b;
        ewtn ewtnVar = (ewtn) ewto.a.createBuilder();
        ewtnVar.a(fcva.i("com.google.android.projection.gearhead", "com.google.android.marvin.talkback"));
        d = cdag.t(dzzfVar, "screen_detection_checker_allowed_packages", ewtnVar.build(), new dzze() { // from class: cmda
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewto) evsn.parseFrom(ewto.a, bArr);
            }
        });
        e = cdag.t(cdag.b, "screen_detection_checker_denied_packages", ((ewtn) ewto.a.createBuilder()).build(), new dzze() { // from class: cmda
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewto) evsn.parseFrom(ewto.a, bArr);
            }
        });
    }

    public cmdd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.b = fcsuVar3;
        this.h = fdjxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cmdb a() throws IOException {
        cmdb cmdbVar;
        String strInvoke;
        eieu eieuVarA = eiiy.a("ScreenDetectionChecker.isScreenCaptureProbablyActiveWithPackageName");
        try {
            if (!((Boolean) ((cczi) a.get()).e()).booleanValue()) {
                cmdb cmdbVar2 = new cmdb();
                fczl.a(eieuVarA, null);
                return cmdbVar2;
            }
            eieu eieuVarA2 = eiiy.a("ScreenDetectionChecker#isScreenCaptureProbablyActiveWithoutLogging");
            try {
                DisplayManager displayManager = (DisplayManager) ((Context) this.g.b()).getSystemService("display");
                if (displayManager != null) {
                    Display[] displays = displayManager.getDisplays();
                    if (displays.length > 1) {
                        Iterator itA = fdbd.a(displays);
                        while (true) {
                            if (!itA.hasNext()) {
                                cmdbVar = new cmdb();
                                fczl.a(eieuVarA2, null);
                                break;
                            }
                            final Display display = (Display) itA.next();
                            try {
                                final Method declaredMethod = display.getClass().getDeclaredMethod("getOwnerPackageName", null);
                                declaredMethod.getClass();
                                strInvoke = new fdae() { // from class: cmcz
                                    @Override // defpackage.fdae
                                    public final Object invoke() {
                                        ejxr ejxrVar = cmdd.a;
                                        return (String) declaredMethod.invoke(display, null);
                                    }
                                }.invoke();
                            } catch (Throwable th) {
                                ((ekrd) ((ekrd) c.i()).g(th).h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionChecker", "isScreenCaptureProbablyActiveWithoutLogging", 120, "ScreenDetectionChecker.kt")).q("ScreenDetectionChecker: failed to call getOwnerPackageName");
                                strInvoke = null;
                            }
                            if (strInvoke != null && strInvoke.length() != 0) {
                                if (((ewto) d.e()).b.contains(strInvoke)) {
                                    continue;
                                } else if (((ewto) e.e()).b.contains(strInvoke)) {
                                    cmdbVar = new cmdb(true, strInvoke);
                                    fczl.a(eieuVarA2, null);
                                    break;
                                }
                            }
                            int flags = display.getFlags();
                            if ((flags & 1) == 0 && (flags & 2) == 0 && display.getDisplayId() != 0) {
                                cmdbVar = new cmdb(true, strInvoke);
                                fczl.a(eieuVarA2, null);
                                break;
                            }
                        }
                    } else {
                        cmdbVar = new cmdb();
                        fczl.a(eieuVarA2, null);
                    }
                } else {
                    cmdbVar = new cmdb();
                    fczl.a(eieuVarA2, null);
                }
                if (cmdbVar.a) {
                    auvw.k(this.h, null, null, new cmdc(this, null), 3);
                }
                fczl.a(eieuVarA, null);
                return cmdbVar;
            } finally {
            }
        } finally {
        }
    }

    public final boolean b() throws IOException {
        eieu eieuVarA = eiiy.a("ScreenDetectionChecker.isScreenCaptureProbablyActive");
        try {
            if (craf.i) {
                fczl.a(eieuVarA, null);
                return false;
            }
            if (!((Boolean) ((cczi) a.get()).e()).booleanValue()) {
                fczl.a(eieuVarA, null);
                return false;
            }
            boolean z = a().a;
            fczl.a(eieuVarA, null);
            return z;
        } finally {
        }
    }
}
