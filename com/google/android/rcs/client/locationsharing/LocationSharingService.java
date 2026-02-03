package com.google.android.rcs.client.locationsharing;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efao;
import defpackage.efaq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationSharingService extends efaj<ILocationSharing> {
    public static final dfny h = dfnv.b("location_sharing_service_connection_deprecated");

    public LocationSharingService(Context context, efaq efaqVar) {
        super(ILocationSharing.class, context, efaqVar, 1, Optional.empty());
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "LocationSharingServiceVersions";
    }

    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) throws efao {
        b();
        try {
            return ((ILocationSharing) a()).pushLocation(str, locationInformation, str2);
        } catch (RemoteException | IllegalStateException e) {
            throw new efao("Error while pushing location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) throws efao {
        b();
        try {
            return ((ILocationSharing) a()).pushLocationToGroup(j, locationInformation, str);
        } catch (RemoteException | IllegalStateException e) {
            throw new efao("Error while pushing location to group: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
