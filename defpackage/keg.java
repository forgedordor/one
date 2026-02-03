package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
class keg extends kef {
    public keg(InputConnection inputConnection, fdap fdapVar) {
        super(inputConnection, fdapVar);
    }

    @Override // defpackage.kef
    protected final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.kef, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.kef, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
