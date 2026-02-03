package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cvjm extends cpav {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter");
    protected final Context e;

    public cvjm(Context context, eidm eidmVar) {
        super(eidmVar);
        this.e = context;
    }

    public abstract wv F(Context context, ViewGroup viewGroup);

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return F(this.e, viewGroup);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = ekgb.d;
        z(wvVar, i, ekoe.a);
    }

    public abstract void l(wv wvVar, Cursor cursor);

    @Override // defpackage.vo
    public final void z(wv wvVar, int i, List list) {
        bcut bcutVar;
        if (!this.a || (bcutVar = this.d) == null) {
            ekrw ekrwVarJ = f.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter", "onBindViewHolder", 57, "CursorRecyclerAdapter.java")).q("Cursor is not available when binding the view");
        } else {
            if (!bcutVar.moveToPosition(i)) {
                throw new IllegalStateException(a.g(i, "couldn't move cursor to position "));
            }
            l(wvVar, this.d.a());
        }
    }
}
