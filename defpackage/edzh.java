package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzh extends edxs {
    public final Account a;
    public final gun b;
    public final exwb c;
    public final String d;
    public dswt e;
    public dsvh f;
    public edxi g;
    public edvo h;
    public edvs i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edzh(Context context, Account account, gun gunVar, exwb exwbVar, String str) {
        abi abiVar;
        super(context);
        context.getClass();
        exwbVar.getClass();
        this.a = account;
        this.b = gunVar;
        this.c = exwbVar;
        this.d = str;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abiVar = null;
                break;
            } else if (context instanceof abi) {
                abiVar = (abi) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        abiVar.getClass();
        this.g = (edxi) new lxo(abiVar).a(edxi.class);
    }

    @Override // defpackage.jgl
    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1332550515);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hpu[] hpuVarArr = new hpu[3];
            hpuVarArr[0] = ecye.a.c(c());
            hpt hptVar = ecye.b;
            dsvh dsvhVar = this.f;
            if (dsvhVar == null) {
                fdbq.c("interactionLogger");
                dsvhVar = null;
            }
            hpuVarArr[1] = hptVar.c(dsvhVar);
            hpuVarArr[2] = edvu.a.c(k());
            hnj.b(hpuVarArr, hxe.d(827600947, new edzg(this), hmlVarC), hmlVarC, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edze
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.b((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final dswt c() {
        dswt dswtVar = this.e;
        if (dswtVar != null) {
            return dswtVar;
        }
        fdbq.c("composeVisualElements");
        return null;
    }

    public final edvo k() {
        edvo edvoVar = this.h;
        if (edvoVar != null) {
            return edvoVar;
        }
        fdbq.c("flags");
        return null;
    }
}
