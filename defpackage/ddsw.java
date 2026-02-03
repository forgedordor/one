package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.IMdiSyncService;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsw extends dcfm implements ddsq {
    public static final /* synthetic */ int a = 0;
    private static final dcfd b;
    private static final dceu m;
    private static final dcfe n;

    static {
        dcfd dcfdVar = new dcfd();
        b = dcfdVar;
        ddsu ddsuVar = new ddsu();
        m = ddsuVar;
        n = new dcfe("MdiSync.API", ddsuVar, dcfdVar);
    }

    public ddsw(Context context, ddsr ddsrVar) {
        super(context, n, ddsrVar, dcfl.a);
    }

    @Override // defpackage.ddsq
    public final defn a(int i, byte[] bArr, SyncOptions syncOptions, CallerInfo callerInfo) {
        return b(i, bArr, syncOptions, callerInfo, false, 15902);
    }

    public final defn b(int i, byte[] bArr, SyncOptions syncOptions, final CallerInfo callerInfo, final boolean z, int i2) {
        ((ddsr) this.g).b();
        final SyncRequest syncRequest = new SyncRequest(i, bArr, syncOptions, Instant.now().toEpochMilli());
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddst
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddsx ddsxVar = (ddsx) obj;
                int i3 = ddsw.a;
                ddsv ddsvVar = new ddsv((defr) obj2);
                IMdiSyncService iMdiSyncService = (IMdiSyncService) ddsxVar.w();
                SyncRequest syncRequest2 = syncRequest;
                CallerInfo callerInfo2 = callerInfo;
                if (!z) {
                    Context context = ddsxVar.c;
                    iMdiSyncService.sync(ddsvVar, syncRequest2, callerInfo2, ddlh.a());
                } else {
                    TeleportingSyncRequest teleportingSyncRequest = new TeleportingSyncRequest(syncRequest2);
                    Context context2 = ddsxVar.c;
                    iMdiSyncService.syncWithTeleportation(ddsvVar, teleportingSyncRequest, callerInfo2, ddlh.a());
                }
            }
        };
        int i3 = syncRequest.d - 1;
        dcizVar.b = (i3 == 1 || i3 == 2 || i3 == 3) ? new Feature[]{ddsp.b} : i3 != 4 ? new Feature[0] : new Feature[]{ddsp.a};
        dcizVar.c = i2;
        dcizVar.b();
        return j(dcizVar.a());
    }
}
