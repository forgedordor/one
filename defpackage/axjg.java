package defpackage;

import android.util.SparseArray;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjg implements cqci {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ParticipantIdCache");
    private final cvw b = new cvw();
    private final SparseArray c = new SparseArray();
    private boolean d = true;

    public final synchronized String a(String str) {
        return (String) this.b.get(str);
    }

    public final synchronized void b() {
        this.b.clear();
        this.c.clear();
    }

    public final synchronized void c(String str, String str2) {
        if (this.d) {
            this.b.put(str, str2);
        }
    }

    public final synchronized void d(ParticipantsTable.BindData bindData) {
        String strR = bindData.R();
        if (bbdl.k(bindData)) {
            e(bindData.r(), strR);
            return;
        }
        String strT = bindData.T();
        if (strT != null) {
            c(strT, strR);
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/ParticipantIdCache", "putParticipant", 70, "ParticipantIdCache.java")).q("Problem caching participant ID: normalizationDestination was null");
    }

    public final synchronized void e(int i, String str) {
        if (this.d) {
            this.c.put(i, str);
        }
    }

    public final synchronized void f(brvp brvpVar) {
        if (bbdl.l(brvpVar)) {
            this.c.remove(brvpVar.d);
        }
        this.b.remove(brvpVar.f);
    }

    public final synchronized void g() {
        this.d = true;
    }

    public final synchronized void h() {
        b();
        this.d = false;
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        b();
    }
}
