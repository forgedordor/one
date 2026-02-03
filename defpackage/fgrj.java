package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrj extends fgrw {
    public fgrj(String str) {
        this.a = str;
    }

    @Override // defpackage.fgry
    public final String a() {
        return "#comment";
    }

    @Override // defpackage.fgry
    public final fgrj d() {
        return (fgrj) super.d();
    }

    @Override // defpackage.fgry
    public final void e(Appendable appendable, int i, fgrl fgrlVar) throws IOException {
        boolean z = fgrlVar.c;
        if (this.l == 0) {
            fgry fgryVar = this.k;
            if ((fgryVar instanceof fgrs) && ((fgrs) fgryVar).e.e) {
                Y(appendable, i, fgrlVar);
            }
        }
        appendable.append("<!--").append(m()).append("-->");
    }

    @Override // defpackage.fgrw, defpackage.fgry
    public final /* bridge */ /* synthetic */ int hP() {
        return 0;
    }

    @Override // defpackage.fgry
    public final String toString() {
        return hQ();
    }

    @Override // defpackage.fgrw, defpackage.fgry
    public final /* bridge */ /* synthetic */ void g() {
    }

    @Override // defpackage.fgry
    public final void f(Appendable appendable, int i, fgrl fgrlVar) {
    }
}
