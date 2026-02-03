package com.google.android.rcs.client.messaging.data;

import defpackage.ekgb;
import defpackage.ekjz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupEvent extends GroupEvent {
    private final ekgb a;

    public AutoValue_GroupEvent(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupEvent
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupEvent) {
            return ekjz.h(this.a, ((GroupEvent) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
