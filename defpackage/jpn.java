package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpn implements lvh {
    final /* synthetic */ fdjx a;
    final /* synthetic */ hpn b;
    final /* synthetic */ hqq c;
    final /* synthetic */ fdci d;
    final /* synthetic */ View e;

    public jpn(fdjx fdjxVar, hpn hpnVar, hqq hqqVar, fdci fdciVar, View view) {
        this.a = fdjxVar;
        this.b = hpnVar;
        this.c = hqqVar;
        this.d = fdciVar;
        this.e = view;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        fdis fdisVarV = null;
        switch (lvaVar.ordinal()) {
            case 0:
                fdil.d(this.a, null, fdjz.d, new jpm(this.d, this.c, lvjVar, this, this.e, null), 1);
                return;
            case 1:
                hpn hpnVar = this.b;
                if (hpnVar != null) {
                    hol holVar = hpnVar.a;
                    synchronized (holVar.a) {
                        if (!holVar.a()) {
                            List list = holVar.b;
                            holVar.b = holVar.c;
                            holVar.c = list;
                            holVar.d = true;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ((fcxy) list.get(i)).w(fctx.a);
                            }
                            list.clear();
                        }
                    }
                }
                hqq hqqVar = this.c;
                synchronized (hqqVar.d) {
                    if (hqqVar.p) {
                        hqqVar.p = false;
                        fdisVarV = hqqVar.v();
                    }
                }
                if (fdisVarV != null) {
                    fdisVarV.w(fctx.a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 6:
                return;
            case 4:
                this.c.x();
                return;
            case 5:
                this.c.w();
                return;
            default:
                throw new fctg();
        }
    }
}
