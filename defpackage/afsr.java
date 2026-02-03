package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afsr implements afsq {
    private final udn a;
    private final afnf b;
    private final fcsu c;
    private final asgv d;

    public afsr(udn udnVar, afnf afnfVar, fcsu fcsuVar, asgv asgvVar) {
        afnfVar.getClass();
        fcsuVar.getClass();
        this.a = udnVar;
        this.b = afnfVar;
        this.c = fcsuVar;
        this.d = asgvVar;
    }

    @Override // defpackage.afsq
    public final afss a(ctnv ctnvVar, afmy afmyVar) throws Resources.NotFoundException {
        ctnvVar.getClass();
        afmyVar.getClass();
        final ajou ajouVar = ctnvVar.a;
        String strD = ajouVar.d();
        ekgb ekgbVarB = ajouVar.b();
        String string = ajouVar.c().toString();
        String strA = this.a.a(ekgbVarB, true);
        dkri dkriVarB = ((uds) this.c.b()).b(ajouVar, false);
        int i = ((ekoe) ekgbVarB).c;
        boolean zD = afmyVar.d(ajouVar);
        int length = i > 1 ? fdgn.U(strA).length() : strA.length();
        final int i2 = ctnvVar.b;
        List listB = fcva.b(new djwf(3, 2, 0, length));
        final afnf afnfVar = this.b;
        return new afss(string, new djys(dkriVarB, strD, strA, zD, listB, new fdae() { // from class: afne
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                afnf afnfVar2 = afnfVar;
                eieh eiehVarA = afnfVar2.b.a("MultiShare#onAllContactClick");
                int i3 = i2;
                ajou ajouVar2 = ajouVar;
                try {
                    if (((ekoe) ajouVar2.b()).c < 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    afxx.d((afxx) afnfVar2.d.b(), 5, i3, 0, 4);
                    if (((ekoe) ajouVar2.b()).c > 1) {
                        afnfVar2.c.b(ajouVar2);
                    } else {
                        afnfVar2.a.c(afmx.b(ajouVar2, ((ajpk) fcva.N(ajouVar2.b())).a));
                    }
                    fczl.a(eiehVarA, null);
                    return fctx.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(eiehVarA, th);
                        throw th2;
                    }
                }
            }
        }, new djyo(this.d.a())), ajouVar.e());
    }
}
