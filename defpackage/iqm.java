package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqm extends icr implements iql {
    public fdap a;
    public fdap b;

    public iqm(fdap fdapVar, fdap fdapVar2) {
        this.a = fdapVar;
        this.b = fdapVar2;
    }

    @Override // defpackage.iql
    public final boolean w(KeyEvent keyEvent) {
        fdap fdapVar = this.a;
        if (fdapVar != null) {
            return ((Boolean) fdapVar.invoke(new iqh(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.iql
    public final boolean x(KeyEvent keyEvent) {
        fdap fdapVar = this.b;
        if (fdapVar != null) {
            return ((Boolean) fdapVar.invoke(new iqh(keyEvent))).booleanValue();
        }
        return false;
    }
}
