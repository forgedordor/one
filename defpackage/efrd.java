package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.search.verification.api.ISearchActionVerificationService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efrd implements ServiceConnection {
    public ISearchActionVerificationService a;
    final /* synthetic */ efre b;

    public efrd(efre efreVar) {
        this.b = efreVar;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.b.b) {
            ekrw ekrwVarE = efre.a.e();
            ekrwVarE.X(eksq.a, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/search/verification/client/SearchActionVerificationClientService$SearchActionVerificationServiceConnection", "onServiceConnected", 124, "SearchActionVerificationClientService.java")).q("onServiceConnected");
        }
        this.a = ISearchActionVerificationService.Stub.asInterface(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.b) {
            ekrw ekrwVarE = efre.a.e();
            ekrwVarE.X(eksq.a, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/search/verification/client/SearchActionVerificationClientService$SearchActionVerificationServiceConnection", "onServiceDisconnected", 134, "SearchActionVerificationClientService.java")).q("onServiceDisconnected");
        }
    }
}
