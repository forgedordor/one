package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wko {
    public static final MediaViewerItem a(vvs vvsVar, doht dohtVar) {
        dltd dltdVarB = b(vvsVar);
        dohs dohsVar = dltdVarB instanceof dohs ? (dohs) dltdVarB : null;
        if (dohsVar == null || !c(dohsVar.m())) {
            return null;
        }
        dohq dohqVarC = doij.c(dohsVar, dohtVar, null);
        vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
        Uri uri = vvrVar != null ? vvrVar.b.c : null;
        if (uri == null) {
            uri = Uri.parse(dohqVarC.f());
        }
        cznv cznvVar = new cznv();
        cznvVar.c(uri);
        cznvVar.a = null;
        cznvVar.b(dohqVarC.l().c().a());
        return cznvVar.a();
    }

    public static final dltd b(vvs vvsVar) {
        if (vvsVar instanceof vvr) {
            return ((vvr) vvsVar).a;
        }
        if (vvsVar instanceof vvn) {
            return ((vvn) vvsVar).b;
        }
        if (vvsVar instanceof vvo) {
            return null;
        }
        if (vvsVar instanceof vvm) {
            return ((vvm) vvsVar).b;
        }
        throw new fctg();
    }

    public static final boolean c(doif doifVar) {
        return fdbq.f(doifVar, doid.a) || fdbq.f(doifVar, doie.a);
    }
}
