package defpackage;

import android.util.Log;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuj implements dcia {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ IRpcResponseCallback b;

    public deuj(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        this.a = messageEventParcelable;
        this.b = iRpcResponseCallback;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MessageEventParcelable messageEventParcelable = this.a;
        defn defnVarD = ((deod) obj).d(messageEventParcelable.d, messageEventParcelable.b, messageEventParcelable.c);
        final IRpcResponseCallback iRpcResponseCallback = this.b;
        defnVarD.s(new defb() { // from class: deui
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                IRpcResponseCallback iRpcResponseCallback2 = iRpcResponseCallback;
                if (defnVar.m()) {
                    WearableListenerStubImpl.b(iRpcResponseCallback2, true, (byte[]) defnVar.i());
                } else {
                    Log.e("WearableListenerStub", "Failed to resolve future, sending null response", defnVar.h());
                    WearableListenerStubImpl.b(iRpcResponseCallback2, false, null);
                }
            }
        });
    }

    @Override // defpackage.dcia
    public final void b() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        WearableListenerStubImpl.b(this.b, false, null);
    }
}
