package com.google.android.libraries.onegoogle.accountmenu.cards.db;

import defpackage.dyhn;
import defpackage.dyho;
import defpackage.dyhp;
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
public final class CardsDatabase_Impl extends CardsDatabase {
    @Override // defpackage.pex
    protected final pdz a() {
        return new pdz(this, new HashMap(0), new HashMap(0), "StorageCardDecorationState", "BackupSyncCardDecorationState");
    }

    @Override // defpackage.pex
    protected final /* synthetic */ pfb c() {
        return new dyho(this);
    }

    @Override // defpackage.pex
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(dyhp.class, Collections.EMPTY_LIST);
        map.put(dyhn.class, Collections.EMPTY_LIST);
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
