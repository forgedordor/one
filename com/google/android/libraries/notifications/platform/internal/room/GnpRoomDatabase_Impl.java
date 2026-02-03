package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.dxpx;
import defpackage.dxpy;
import defpackage.dxpz;
import defpackage.dxqa;
import defpackage.dxqb;
import defpackage.dxqc;
import defpackage.dxqd;
import defpackage.dxqe;
import defpackage.dxrn;
import defpackage.dxrv;
import defpackage.pdz;
import defpackage.pfb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GnpRoomDatabase_Impl extends GnpRoomDatabase {
    private volatile dxrn m;

    @Override // defpackage.pex
    protected final pdz a() {
        return new pdz(this, new HashMap(0), new HashMap(0), "gnp_accounts");
    }

    @Override // defpackage.pex
    protected final /* synthetic */ pfb c() {
        return new dxqe(this);
    }

    @Override // defpackage.pex
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(dxrn.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.pex
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.pex
    public final List v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dxpx());
        arrayList.add(new dxpy());
        arrayList.add(new dxpz());
        arrayList.add(new dxqa());
        arrayList.add(new dxqb());
        arrayList.add(new dxqc());
        arrayList.add(new dxqd());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase
    public final dxrn x() {
        dxrn dxrnVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new dxrv(this);
            }
            dxrnVar = this.m;
        }
        return dxrnVar;
    }
}
