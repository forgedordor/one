package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwys extends LinearLayoutManager {
    private int a = 0;

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final void p(ws wsVar) {
        super.p(wsVar);
        int iA = wsVar.a();
        if (iA != this.a) {
            this.a = iA;
        }
    }
}
