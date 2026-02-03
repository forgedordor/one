package com.google.android.libraries.notifications.internal.storage.impl.room;

import defpackage.dxfj;
import defpackage.dxfk;
import defpackage.dxfl;
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
public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase {
    @Override // defpackage.pex
    protected final pdz a() {
        return new pdz(this, new HashMap(0), new HashMap(0), "chime_thread_states");
    }

    @Override // defpackage.pex
    protected final /* synthetic */ pfb c() {
        return new dxfk(this);
    }

    @Override // defpackage.pex
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(dxfl.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.pex
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.pex
    public final List v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dxfj());
        return arrayList;
    }
}
