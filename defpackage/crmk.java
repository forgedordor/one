package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crmk implements crmg {
    public final Map a = new EnumMap(crmc.class);
    private final eg b;
    private final cogw c;
    private final crlz d;
    private final crmj e;
    private adj f;
    private long g;

    public crmk(eg egVar, cogw cogwVar, crlz crlzVar) {
        this.b = egVar;
        this.e = new crmj(egVar);
        this.c = cogwVar;
        this.d = crlzVar;
    }

    private final void l(crmc crmcVar, crmf crmfVar) {
        ekgp ekgpVar = crmd.s;
        ejwl.a(ekgpVar.containsKey(crmcVar));
        crmi crmiVar = new crmi(crmfVar);
        String[] strArr = (String[]) ekgpVar.get(crmcVar);
        if (strArr != null) {
            crlz crlzVar = this.d;
            if (crlzVar.a(strArr)) {
                crmiVar.b();
                return;
            }
            this.g = this.c.a();
            this.a.put(crmcVar, crmiVar);
            if (crmcVar != crmc.SCHEDULED_SEND_PERMISSIONS || Build.VERSION.SDK_INT < 31) {
                String[] strArrB = crlzVar.b(strArr);
                crmj crmjVar = this.e;
                crmjVar.a.requestPermissions(strArrB, crmcVar.q);
                return;
            }
            if (this.f == null) {
                eg egVar = this.b;
                this.f = egVar.h.b("PermissionHelperImpl#AlarmsSettingsLauncher", new aeo(), new adi() { // from class: crmh
                    @Override // defpackage.adi
                    public final void a(Object obj) {
                        adh adhVar = (adh) obj;
                        crmi crmiVar2 = (crmi) this.a.a.remove(crmc.SCHEDULED_SEND_PERMISSIONS);
                        if (crmiVar2 == null) {
                            return;
                        }
                        if (adhVar.a == -1) {
                            crmiVar2.b();
                        } else {
                            crmiVar2.a();
                        }
                    }
                });
            }
            this.f.c(aiiw.d("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").a().setData(Uri.parse("package:".concat(String.valueOf(this.b.getPackageName())))));
        }
    }

    @Override // defpackage.crmg
    public final void a(crmf crmfVar) {
        l(crmc.CALL_PHONE_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void b(crmf crmfVar) {
        l(crmc.CAMERA_IMAGE_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void c(crmf crmfVar) {
        l(crmc.CAMERA_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void d(crmf crmfVar) {
        l(crmc.CAMERA_VIDEO_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void e(crmf crmfVar) {
        l(crmc.LOCATION_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void f(crmf crmfVar) {
        l(crmc.MINIMUM_REQUIRED_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void g(crmc crmcVar, crmf crmfVar) {
        l(crmcVar, crmfVar);
    }

    @Override // defpackage.crmg
    public final void h(crmf crmfVar) {
        l(crmc.RECEIVE_WAP_PUSH_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void i(crmf crmfVar) {
        l(crmc.RECORD_AUDIO_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void j(crmf crmfVar) {
        l(crmc.STORAGE_PERMISSIONS, crmfVar);
    }

    @Override // defpackage.crmg
    public final void k(int i) {
        for (crmc crmcVar : crmc.values()) {
            if (crmcVar.q == i) {
                for (crmc crmcVar2 : crmc.values()) {
                    if (crmcVar2.q == i) {
                        crmi crmiVar = (crmi) this.a.remove(crmcVar2);
                        if (crmiVar == null) {
                            return;
                        }
                        String[] strArr = (String[]) crmd.s.get(crmcVar2);
                        if (strArr != null && this.d.a(strArr)) {
                            crmiVar.b();
                            return;
                        } else if (this.c.a() - this.g >= 250) {
                            crmiVar.a();
                            return;
                        } else {
                            if (crmiVar.a.c()) {
                                craf.d(this.e.a);
                                return;
                            }
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException(String.format("Can't find RequestCode for code=%d.", Integer.valueOf(i)));
            }
        }
    }
}
