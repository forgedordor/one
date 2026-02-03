package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;
import com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvt extends dcfm implements DeviceContactsSyncClient {
    public static final /* synthetic */ int a = 0;
    private static final dcfd b;
    private static final dceu m;
    private static final dcfe n;

    static {
        dcfd dcfdVar = new dcfd();
        b = dcfdVar;
        ddvn ddvnVar = new ddvn();
        m = ddvnVar;
        n = new dcfe("People.API", ddvnVar, dcfdVar);
    }

    public ddvt(Activity activity) {
        super(activity, activity, n, dcfa.q, dcfl.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final defn<DeviceContactsSyncSetting> getDeviceContactsSyncSetting() {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dduk.v};
        dcizVar.a = new dcir() { // from class: ddvm
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddvi ddviVar = (ddvi) obj;
                int i = ddvt.a;
                try {
                    IContactsSyncThirdPartyService iContactsSyncThirdPartyService = (IContactsSyncThirdPartyService) ddviVar.w();
                    ddvo ddvoVar = new ddvo((defr) obj2);
                    Context context = ddviVar.c;
                    iContactsSyncThirdPartyService.getBackupAndSyncOptInState(ddvoVar, ddlh.a());
                } catch (RemoteException e) {
                    ((defr) obj2).c(e);
                }
            }
        };
        dcizVar.c = 2731;
        return j(dcizVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final defn<Void> launchDeviceContactsSyncSettingActivity(final Context context) {
        dclh.n(context, "Please provide a non-null context");
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dduk.v};
        dcizVar.a = new dcir() { // from class: ddvj
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddvi ddviVar = (ddvi) obj;
                int i = ddvt.a;
                Context context2 = context;
                try {
                    IContactsSyncThirdPartyService iContactsSyncThirdPartyService = (IContactsSyncThirdPartyService) ddviVar.w();
                    ddvs ddvsVar = new ddvs(context2, (defr) obj2);
                    Context context3 = ddviVar.c;
                    iContactsSyncThirdPartyService.getDeviceContactsSyncSettingAction(ddvsVar, ddlh.a());
                } catch (RemoteException e) {
                    ((defr) obj2).c(e);
                }
            }
        };
        dcizVar.c = 2733;
        return j(dcizVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final defn<Void> registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        final dcib dcibVarG = g(syncSettingUpdatedListener, "dataChangedListenerKey");
        dcir dcirVar = new dcir() { // from class: ddvk
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddvi ddviVar = (ddvi) obj;
                int i = ddvt.a;
                IContactsSyncThirdPartyService iContactsSyncThirdPartyService = (IContactsSyncThirdPartyService) ddviVar.w();
                ddvq ddvqVar = new ddvq(dcibVarG);
                Context context = ddviVar.c;
                iContactsSyncThirdPartyService.addDeviceContactsSyncSettingChangedListener(ddvqVar, ddlh.a());
            }
        };
        dcir dcirVar2 = new dcir() { // from class: ddvl
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddvi ddviVar = (ddvi) obj;
                int i = ddvt.a;
                IContactsSyncThirdPartyService iContactsSyncThirdPartyService = (IContactsSyncThirdPartyService) ddviVar.w();
                ddvr ddvrVar = new ddvr((defr) obj2);
                Context context = ddviVar.c;
                iContactsSyncThirdPartyService.removeDeviceContactsSyncSettingChangedListener(ddvrVar, ddlh.a());
            }
        };
        dcip dcipVar = new dcip();
        dcipVar.c = dcibVarG;
        dcipVar.a = dcirVar;
        dcipVar.b = dcirVar2;
        dcipVar.d = new Feature[]{dduk.u};
        dcipVar.e = 2729;
        return k(dcipVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final defn<Boolean> unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return l(dcic.a(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public ddvt(Context context) {
        super(context, n, dcfa.q, dcfl.a);
    }
}
