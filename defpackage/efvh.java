package defpackage;

import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvh {
    public wj a;
    public ws b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ SpannedGridLayoutManager i;

    public efvh(SpannedGridLayoutManager spannedGridLayoutManager) {
        this.i = spannedGridLayoutManager;
    }

    public final boolean a() {
        int iC;
        if (this.f) {
            iC = this.i.a.c(this.c);
            this.c = iC;
        } else {
            efvi efviVar = this.i.a;
            int i = this.c;
            int iA = efviVar.a(i);
            while (i > 0 && efviVar.a(i) == iA) {
                i--;
            }
            iC = efviVar.a(i) == iA ? -1 : i;
            this.c = iC;
        }
        return this.i.a.f(iC);
    }
}
