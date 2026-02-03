package defpackage;

import android.app.KeyguardManager$KeyguardDismissCallback;
import android.util.Log;
import com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dica extends KeyguardManager$KeyguardDismissCallback {
    final /* synthetic */ IAppIntegrationSessionCallbackStub a;

    public dica(IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub) {
        this.a = iAppIntegrationSessionCallbackStub;
    }

    public final void onDismissCancelled() {
        Log.v("AIClientCbStub", "KeyguardDismissCallback#onDismissCancelled()");
        IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub = this.a;
        if (iAppIntegrationSessionCallbackStub.b != null) {
            iAppIntegrationSessionCallbackStub.b.a();
        }
    }

    public final void onDismissError() {
        Log.v("AIClientCbStub", "KeyguardDismissCallback#onDismissError()");
        IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub = this.a;
        if (iAppIntegrationSessionCallbackStub.b != null) {
            iAppIntegrationSessionCallbackStub.b.a();
        }
    }

    public final void onDismissSucceeded() {
        Log.v("AIClientCbStub", "KeyguardDismissCallback#onDismissSucceeded()");
        IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub = this.a;
        if (iAppIntegrationSessionCallbackStub.b != null) {
            iAppIntegrationSessionCallbackStub.b.a();
        }
    }
}
