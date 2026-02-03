package defpackage;

import defpackage.egac;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egag {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(fr frVar) {
        try {
            frVar.aq(null);
            List<ea> listO = frVar.o();
            listO.getClass();
            if (listO.isEmpty()) {
                return;
            }
            cg cgVar = new cg(frVar);
            for (ea eaVar : listO) {
                if (eaVar instanceof eyhx) {
                    Object objBb = ((eyhx) eaVar).bb();
                    objBb.getClass();
                    if (objBb instanceof egac.a) {
                        cgVar.o(eaVar);
                    }
                }
                fr frVarI = eaVar.I();
                frVarI.getClass();
                frVarI.al();
                a(frVarI);
            }
            if (cgVar.i()) {
                return;
            }
            cgVar.A();
            cgVar.c();
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            frVar.K("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((ekrd) ((ekrd) egah.b.i()).g(e).h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked$Companion", "clearFragments", 327, "ActivityAccountStateViewModelBacked.kt")).t("popBackStackImmediate failure, fragment state %s", new esvh(esvg.NO_USER_DATA, stringWriter.toString()));
            throw e;
        }
    }
}
