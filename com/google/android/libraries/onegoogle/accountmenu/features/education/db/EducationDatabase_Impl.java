package com.google.android.libraries.onegoogle.accountmenu.features.education.db;

import defpackage.dyln;
import defpackage.dylq;
import defpackage.dymd;
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
public final class EducationDatabase_Impl extends EducationDatabase {
    private volatile dylq l;

    @Override // defpackage.pex
    protected final pdz a() {
        return new pdz(this, new HashMap(0), new HashMap(0), "EducationState", "HighlightState");
    }

    @Override // defpackage.pex
    protected final /* synthetic */ pfb c() {
        return new dyln(this);
    }

    @Override // defpackage.pex
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(dylq.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase
    public final dylq y() {
        dylq dylqVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new dymd(this);
            }
            dylqVar = this.l;
        }
        return dylqVar;
    }
}
