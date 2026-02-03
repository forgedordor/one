package com.google.android.libraries.jibe.service.locationsharing;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.deyw;
import defpackage.dfhq;
import defpackage.dhff;
import defpackage.dhgz;
import defpackage.dstu;
import defpackage.ewdz;
import defpackage.eweb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocationSharingEngine extends ILocationSharing.Stub {
    private final Context a;
    private final dhgz b;
    private final deyw c;
    private dstu d;

    public LocationSharingEngine(Context context, dhgz dhgzVar, deyw deywVar) {
        this.a = context;
        this.b = dhgzVar;
        this.c = deywVar;
    }

    private final long a() {
        return this.b.c();
    }

    private final void b(Optional optional, String str) {
        ewdz ewdzVar = (ewdz) eweb.a.createBuilder();
        ewdzVar.copyOnWrite();
        eweb ewebVar = (eweb) ewdzVar.instance;
        ewebVar.e = 3;
        ewebVar.b |= 1;
        ewdzVar.copyOnWrite();
        eweb ewebVar2 = (eweb) ewdzVar.instance;
        str.getClass();
        ewebVar2.b |= 4;
        ewebVar2.g = str;
        if (optional.isPresent()) {
            String string = optional.get().toString();
            ewdzVar.copyOnWrite();
            eweb ewebVar3 = (eweb) ewdzVar.instance;
            ewebVar3.b |= 2;
            ewebVar3.f = string;
        }
        this.c.e(this.a, (eweb) ewdzVar.build());
    }

    public long[] getActiveSessions() {
        dstu dstuVar = this.d;
        return dstuVar == null ? new long[0] : dstuVar.c();
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) throws RemoteException {
        b(Optional.empty(), str2);
        dhff.d(this.a, Binder.getCallingUid());
        if (this.b.s()) {
            return new LocationSharingResult(-1L, str, 4, null);
        }
        dstu dstuVar = this.d;
        return dstuVar == null ? new LocationSharingResult(-1L, str, 2, "Provider must not be null!") : dstuVar.a(a(), str, locationInformation, str2);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) throws RemoteException {
        b(Optional.of(Long.valueOf(j)), str);
        dhff.d(this.a, Binder.getCallingUid());
        dstu dstuVar = this.d;
        return dstuVar == null ? dfhq.j(2, "Provider must not be null!") : dstuVar.d(j, locationInformation, str);
    }

    public void registerProvider(dstu dstuVar) {
        this.d = dstuVar;
    }

    public long registerSession(dstu dstuVar) {
        return a();
    }

    public void unregisterProvider(dstu dstuVar) {
        this.d = null;
    }

    public void unregisterSession(long j) {
    }
}
