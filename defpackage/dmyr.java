package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyr implements dmyn {
    final /* synthetic */ dmys a;

    public dmyr(dmys dmysVar) {
        this.a = dmysVar;
    }

    @Override // defpackage.dmyn
    public final Size a(int i) {
        dmyq dmyqVar = this.a.f;
        if (dmyqVar == null) {
            fdbq.c("gridState");
            dmyqVar = null;
        }
        dmyp dmypVar = dmyqVar instanceof dmyp ? (dmyp) dmyqVar : null;
        if (dmypVar == null) {
            return null;
        }
        dmyg dmygVar = dmypVar.a;
        if (i == 2) {
            return new Size(dmygVar.c, dmygVar.d);
        }
        if (i == 3) {
            return new Size(dmygVar.c, fdcu.a(dmygVar.d * 0.25d));
        }
        if (i == 4) {
            return new Size(dmygVar.c, fdcu.a(dmygVar.d * 0.75d));
        }
        Size size = dmygVar.b;
        if (size != null) {
            return size;
        }
        fdbq.c("doubleSpanSize");
        return null;
    }

    @Override // defpackage.dmyn
    public final boolean b() {
        dmyq dmyqVar = this.a.f;
        return dmyqVar != null && (dmyqVar instanceof dmyp);
    }
}
