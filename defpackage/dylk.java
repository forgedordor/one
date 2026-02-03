package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dylk extends lvy {
    public dylk(Executor executor, final EducationDatabase educationDatabase) {
        executor.execute(new Runnable() { // from class: dylj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j((List) phx.b(((dymd) educationDatabase.y()).a, true, false, new fdap() { // from class: dyls
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        int i;
                        dylo dyloVar;
                        ArrayList arrayList;
                        int i2;
                        dylp dylpVar;
                        phi phiVarA = ((pgz) obj).a("SELECT * FROM educationstate LEFT JOIN highlightstate ON  name = educationName   WHERE    name = (SELECT name FROM educationstate                WHERE enabled = 1 AND               educationCompleted = 0               LIMIT 1)");
                        try {
                            int iB = pid.b(phiVarA, "name");
                            int iB2 = pid.b(phiVarA, "enabled");
                            int iB3 = pid.b(phiVarA, "numEducationImpressions");
                            int iB4 = pid.b(phiVarA, "numEducationInteractions");
                            int iB5 = pid.b(phiVarA, "activatedTimestampMs");
                            int iB6 = pid.b(phiVarA, "lastImpressionTimestampMs");
                            int iB7 = pid.b(phiVarA, "lastInteractionTimestampMs");
                            int iB8 = pid.b(phiVarA, "educationCompleted");
                            int iB9 = pid.b(phiVarA, "educationName");
                            int iB10 = pid.b(phiVarA, "highlightId");
                            int iB11 = pid.b(phiVarA, "numHighlightImpressions");
                            int iB12 = pid.b(phiVarA, "numHighlightInteractions");
                            int iB13 = pid.b(phiVarA, "highlightCompleted");
                            ArrayList arrayList2 = new ArrayList();
                            while (phiVarA.j()) {
                                if (phiVarA.i(iB) && phiVarA.i(iB2) && phiVarA.i(iB3) && phiVarA.i(iB4) && phiVarA.i(iB5) && phiVarA.i(iB6) && phiVarA.i(iB7) && phiVarA.i(iB8)) {
                                    i = iB;
                                    arrayList = arrayList2;
                                    dyloVar = null;
                                } else {
                                    i = iB;
                                    dyloVar = new dylo(phiVarA.i(iB) ? null : phiVarA.d(iB));
                                    arrayList = arrayList2;
                                    dyloVar.b = ((int) phiVarA.b(iB2)) != 0;
                                    dyloVar.c = (int) phiVarA.b(iB3);
                                    dyloVar.d = (int) phiVarA.b(iB4);
                                    dyloVar.e = phiVarA.b(iB5);
                                    dyloVar.f = phiVarA.b(iB6);
                                    dyloVar.g = phiVarA.b(iB7);
                                    dyloVar.h = ((int) phiVarA.b(iB8)) != 0;
                                }
                                if (phiVarA.i(iB9) && phiVarA.i(iB10) && phiVarA.i(iB11) && phiVarA.i(iB12) && phiVarA.i(iB13)) {
                                    i2 = iB2;
                                    dylpVar = null;
                                } else {
                                    i2 = iB2;
                                    dylpVar = new dylp(phiVarA.i(iB9) ? null : phiVarA.d(iB9), phiVarA.i(iB10) ? null : phiVarA.d(iB10));
                                    dylpVar.c = (int) phiVarA.b(iB11);
                                    dylpVar.d = (int) phiVarA.b(iB12);
                                    dylpVar.e = ((int) phiVarA.b(iB13)) != 0;
                                }
                                dyme dymeVar = new dyme(dyloVar, dylpVar);
                                ArrayList arrayList3 = arrayList;
                                arrayList3.add(dymeVar);
                                arrayList2 = arrayList3;
                                iB2 = i2;
                                iB = i;
                            }
                            return arrayList2;
                        } finally {
                            phiVarA.close();
                        }
                    }
                }));
            }
        });
    }
}
