package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.dxpu;
import defpackage.dxpv;
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
public final class GnpPerAccountRoomDatabase_Impl extends GnpPerAccountRoomDatabase {
    @Override // defpackage.pex
    protected final pdz a() {
        return new pdz(this, new HashMap(0), new HashMap(0), "threads");
    }

    @Override // defpackage.pex
    protected final /* synthetic */ pfb c() {
        return new dxpv(this);
    }

    @Override // defpackage.pex
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(dxpu.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.pex
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.pex
    public final List v() {
        return new ArrayList();
    }
}
