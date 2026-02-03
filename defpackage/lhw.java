package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lhw extends InputConnectionWrapper {
    final /* synthetic */ lhx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhw(InputConnection inputConnection, lhx lhxVar) {
        super(inputConnection, false);
        this.a = lhxVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.a(inputContentInfo == null ? null : new lia(new lhz(inputContentInfo)), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
