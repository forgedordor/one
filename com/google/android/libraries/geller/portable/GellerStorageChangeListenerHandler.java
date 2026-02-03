package com.google.android.libraries.geller.portable;

import defpackage.drem;
import defpackage.ekhx;
import defpackage.ekon;
import defpackage.ekqg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GellerStorageChangeListenerHandler {
    private ekhx a;

    public GellerStorageChangeListenerHandler(ekhx ekhxVar) {
        this.a = ekon.a;
        if (ekhxVar != null) {
            this.a = ekhxVar;
        }
    }

    void notifyOnDeletion(String str, String str2) {
        ekqg ekqgVarListIterator = this.a.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ((drem) ekqgVarListIterator.next()).a();
        }
    }
}
