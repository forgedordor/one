package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkd {
    public ActionMode a;
    private final View c;
    private final jqd d = new jqd(new jkc(this), 126);
    public int b = 2;

    public jkd(View view) {
        this.c = view;
    }

    public final void a() {
        this.b = 2;
        ActionMode actionMode = this.a;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.a = null;
    }

    public final void b(ihu ihuVar, fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3, fdae fdaeVar4, fdae fdaeVar5) {
        jqd jqdVar = this.d;
        jqdVar.b = ihuVar;
        jqdVar.c = fdaeVar;
        jqdVar.e = fdaeVar3;
        jqdVar.d = fdaeVar2;
        jqdVar.f = fdaeVar4;
        jqdVar.g = fdaeVar5;
        ActionMode actionMode = this.a;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.b = 1;
            this.a = this.c.startActionMode(new jqb(jqdVar), 1);
        }
    }
}
